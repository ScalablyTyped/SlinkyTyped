package typingsSlinky.immutable.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seq[K, V]
  extends typingsSlinky.immutable.Immutable.Collection[K, V] {
  
  // Force evaluation
  /**
    * Because Sequences are lazy and designed to be chained together, they do
    * not cache their results. For example, this map function is called a total
    * of 6 times, as each `join` iterates the Seq of three values.
    *
    *     var squares = Seq([ 1, 2, 3 ]).map(x => x * x)
    *     squares.join() + squares.join()
    *
    * If you know a `Seq` will be used multiple times, it may be more
    * efficient to first cache it in memory. Here, the map function is called
    * only 3 times.
    *
    *     var squares = Seq([ 1, 2, 3 ]).map(x => x * x).cacheResult()
    *     squares.join() + squares.join()
    *
    * Use this method judiciously, as it must fully evaluate a Seq which can be
    * a burden on memory and possibly performance.
    *
    * Note: after calling `cacheResult`, a Seq will always have a `size`.
    */
  def cacheResult(): this.type = js.native
  
  /**
    * Returns a new Seq with only the values for which the `predicate`
    * function returns true.
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_F_V_Seq[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): typingsSlinky.immutable.Immutable.Seq[K, F] = js.native
  @JSName("filter")
  def filter_F_V_Seq[F /* <: V */](
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
    context: js.Any
  ): typingsSlinky.immutable.Immutable.Seq[K, F] = js.native
  
  /**
    * Some Seqs can describe their size lazily. When this is the case,
    * size will be an integer. Otherwise it will be undefined.
    *
    * For example, Seqs returned from `map()` or `reverse()`
    * preserve the size of the original `Seq` while `filter()` does not.
    *
    * Note: `Range`, `Repeat` and `Seq`s made from `Array`s and `Object`s will
    * always have a size.
    */
  val size: js.UndefOr[Double] = js.native
}
@JSImport("immutable", "Seq")
@js.native
object Seq extends js.Object {
  
  def apply(): typingsSlinky.immutable.Immutable.Seq[_, _] = js.native
  def apply[T](collection: typingsSlinky.immutable.Immutable.Collection.Indexed[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
  def apply[T](collection: typingsSlinky.immutable.Immutable.Collection.Set[T]): typingsSlinky.immutable.Immutable.Seq.Set[T] = js.native
  def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
  def apply[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.Seq.Keyed[String, V] = js.native
  def apply[S /* <: typingsSlinky.immutable.Immutable.Seq[_, _] */](seq: S): S = js.native
  def apply[K, V](collection: typingsSlinky.immutable.Immutable.Collection.Keyed[K, V]): typingsSlinky.immutable.Immutable.Seq.Keyed[K, V] = js.native
  
  /**
    * True if `maybeSeq` is a Seq, it is not backed by a concrete
    * structure such as Map, List, or Set.
    */
  def isSeq(maybeSeq: js.Any): Boolean = js.native
  
  @js.native
  trait Indexed[T]
    extends typingsSlinky.immutable.Immutable.Seq[Double, T]
       with typingsSlinky.immutable.Immutable.Collection.Indexed[T]
  /**
    * `Seq` which represents an ordered indexed list of values.
    */
  @js.native
  object Indexed extends js.Object {
    
    def apply(): typingsSlinky.immutable.Immutable.Seq.Indexed[_] = js.native
    def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
    
    /**
      * Provides an Seq.Indexed of the values provided.
      */
    def of[T](values: T*): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
  }
  
  @js.native
  trait Keyed[K, V]
    extends typingsSlinky.immutable.Immutable.Seq[K, V]
       with typingsSlinky.immutable.Immutable.Collection.Keyed[K, V]
  @js.native
  object Keyed extends js.Object {
    
    def apply(): typingsSlinky.immutable.Immutable.Seq.Keyed[_, _] = js.native
    def apply[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.Seq.Keyed[String, V] = js.native
    def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): typingsSlinky.immutable.Immutable.Seq.Keyed[K, V] = js.native
  }
  
  @js.native
  trait Set[T]
    extends typingsSlinky.immutable.Immutable.Seq[T, T]
       with typingsSlinky.immutable.Immutable.Collection.Set[T]
  @js.native
  object Set extends js.Object {
    
    def apply(): typingsSlinky.immutable.Immutable.Seq.Set[_] = js.native
    def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Seq.Set[T] = js.native
    
    /**
      * Returns a Seq.Set of the provided values
      */
    def of[T](values: T*): typingsSlinky.immutable.Immutable.Seq.Set[T] = js.native
  }
}
