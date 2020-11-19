package typingsSlinky.immutable.mod

import typingsSlinky.immutable.Immutable.Collection.Indexed
import typingsSlinky.immutable.Immutable.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stack[T] extends Indexed[T] {
  
  /**
    * @see `Map#asImmutable`
    */
  def asImmutable(): this.type = js.native
  
  /**
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Check the documentation for each method to see if it
    * mentions being safe to use in `withMutations`.
    *
    * @see `Map#asMutable`
    */
  def asMutable(): this.type = js.native
  
  // Persistent changes
  /**
    * Returns a new Stack with 0 size and no values.
    *
    * Note: `clear` can be used in `withMutations`.
    */
  def clear(): typingsSlinky.immutable.Immutable.Stack[T] = js.native
  
  /**
    * Returns a new Set with only the values for which the `predicate`
    * function returns true.
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_F_T_Set[F /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean]
  ): Set[F] = js.native
  @JSName("filter")
  def filter_F_T_Set[F /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* iter */ this.type, /* is F */ Boolean],
    context: js.Any
  ): Set[F] = js.native
  
  // Reading values
  /**
    * Alias for `Stack.first()`.
    */
  def peek(): js.UndefOr[T] = js.native
  
  /**
    * Alias for `Stack#shift` and is not equivalent to `List#pop`.
    */
  def pop(): typingsSlinky.immutable.Immutable.Stack[T] = js.native
  
  /**
    * Alias for `Stack#unshift` and is not equivalent to `List#push`.
    */
  def push(values: T*): typingsSlinky.immutable.Immutable.Stack[T] = js.native
  
  /**
    * Alias for `Stack#unshiftAll`.
    */
  def pushAll(iter: js.Iterable[T]): typingsSlinky.immutable.Immutable.Stack[T] = js.native
  
  /**
    * Returns a new Stack with a size ones less than this Stack, excluding
    * the first item in this Stack, shifting all other values to a lower index.
    *
    * Note: this differs from `Array#shift` because it returns a new
    * Stack rather than the removed value. Use `first()` or `peek()` to get the
    * first value in this Stack.
    *
    * Note: `shift` can be used in `withMutations`.
    */
  def shift(): typingsSlinky.immutable.Immutable.Stack[T] = js.native
  
  /**
    * The number of items in this Stack.
    */
  val size: Double = js.native
  
  /**
    * Returns a new Stack with the provided `values` prepended, shifting other
    * values ahead to higher indices.
    *
    * This is very efficient for Stack.
    *
    * Note: `unshift` can be used in `withMutations`.
    */
  def unshift(values: T*): typingsSlinky.immutable.Immutable.Stack[T] = js.native
  
  /**
    * Like `Stack#unshift`, but accepts a collection rather than varargs.
    *
    * Note: `unshiftAll` can be used in `withMutations`.
    */
  def unshiftAll(iter: js.Iterable[T]): typingsSlinky.immutable.Immutable.Stack[T] = js.native
  
  /**
    * @see `Map#wasAltered`
    */
  def wasAltered(): Boolean = js.native
  
  // Transient changes
  /**
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Check the documentation for each method to see if it
    * mentions being safe to use in `withMutations`.
    *
    * @see `Map#withMutations`
    */
  def withMutations(mutator: js.Function1[/* mutable */ this.type, _]): this.type = js.native
}
@JSImport("immutable", "Stack")
@js.native
object Stack extends js.Object {
  
  def apply(): typingsSlinky.immutable.Immutable.Stack[_] = js.native
  def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Stack[T] = js.native
  
  /**
    * True if the provided value is a Stack
    */
  def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
  
  /**
    * Creates a new Stack containing `values`.
    */
  def of[T](values: T*): typingsSlinky.immutable.Immutable.Stack[T] = js.native
}
