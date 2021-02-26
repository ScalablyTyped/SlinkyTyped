package typingsSlinky.jasmine.jasmine

import typingsSlinky.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calls[Fn /* <: Func */] extends StObject {
  
  /** By chaining the spy with calls.all(), will return the context (the this) and arguments passed all calls */
  def all(): js.Array[CallInfo[Fn]] = js.native
  
  /** By chaining the spy with calls.allArgs(), will return the arguments to all calls */
  def allArgs(): js.Array[Parameters[Fn]] = js.native
  
  /** By chaining the spy with calls.any(), will return false if the spy has not been called at all, and then true once at least one call happens. */
  def any(): Boolean = js.native
  
  /** By chaining the spy with calls.argsFor(), will return the arguments passed to call number index */
  def argsFor(index: Double): Parameters[Fn] = js.native
  
  /** By chaining the spy with calls.count(), will return the number of times the spy was called */
  def count(): Double = js.native
  
  /** By chaining the spy with calls.first(), will return the context (the this) and arguments for the first call */
  def first(): CallInfo[Fn] = js.native
  
  /** By chaining the spy with calls.mostRecent(), will return the context (the this) and arguments for the most recent call */
  def mostRecent(): CallInfo[Fn] = js.native
  
  /** By chaining the spy with calls.reset(), will clears all tracking for a spy */
  def reset(): Unit = js.native
  
  /** Set this spy to do a shallow clone of arguments passed to each invocation. */
  def saveArgumentsByValue(): Unit = js.native
}
object Calls {
  
  @scala.inline
  def apply[Fn /* <: Func */](
    all: () => js.Array[CallInfo[Fn]],
    allArgs: () => js.Array[Parameters[Fn]],
    any: () => Boolean,
    argsFor: Double => Parameters[Fn],
    count: () => Double,
    first: () => CallInfo[Fn],
    mostRecent: () => CallInfo[Fn],
    reset: () => Unit,
    saveArgumentsByValue: () => Unit
  ): Calls[Fn] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allArgs = js.Any.fromFunction0(allArgs), any = js.Any.fromFunction0(any), argsFor = js.Any.fromFunction1(argsFor), count = js.Any.fromFunction0(count), first = js.Any.fromFunction0(first), mostRecent = js.Any.fromFunction0(mostRecent), reset = js.Any.fromFunction0(reset), saveArgumentsByValue = js.Any.fromFunction0(saveArgumentsByValue))
    __obj.asInstanceOf[Calls[Fn]]
  }
  
  @scala.inline
  implicit class CallsMutableBuilder[Self <: Calls[_], Fn /* <: Func */] (val x: Self with Calls[Fn]) extends AnyVal {
    
    @scala.inline
    def setAll(value: () => js.Array[CallInfo[Fn]]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllArgs(value: () => js.Array[Parameters[Fn]]): Self = StObject.set(x, "allArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAny(value: () => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArgsFor(value: Double => Parameters[Fn]): Self = StObject.set(x, "argsFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirst(value: () => CallInfo[Fn]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMostRecent(value: () => CallInfo[Fn]): Self = StObject.set(x, "mostRecent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveArgumentsByValue(value: () => Unit): Self = StObject.set(x, "saveArgumentsByValue", js.Any.fromFunction0(value))
  }
}
