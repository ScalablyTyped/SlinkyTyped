package typingsSlinky.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpyAnd extends StObject {
  
  /** By chaining the spy with and.callFake, all calls to the spy will delegate to the supplied function. */
  def callFake(fn: js.Function): Spy = js.native
  
  /** By chaining the spy with and.callThrough, the spy will still track all calls to it but in addition it will delegate to the actual implementation. */
  def callThrough(): Spy = js.native
  
  /** By chaining the spy with and.returnValue, all calls to the function will return a specific value. */
  def returnValue(`val`: js.Any): Spy = js.native
  
  /** By chaining the spy with and.returnValues, all calls to the function will return specific values in order until it reaches the end of the return values list. */
  def returnValues(values: js.Any*): Spy = js.native
  
  /** When a calling strategy is used for a spy, the original stubbing behavior can be returned at any time with and.stub. */
  def stub(): Spy = js.native
  
  /** By chaining the spy with and.throwError, all calls to the spy will throw the specified value. */
  def throwError(msg: String): Spy = js.native
}
object SpyAnd {
  
  @scala.inline
  def apply(
    callFake: js.Function => Spy,
    callThrough: () => Spy,
    returnValue: js.Any => Spy,
    returnValues: /* repeated */ js.Any => Spy,
    stub: () => Spy,
    throwError: String => Spy
  ): SpyAnd = {
    val __obj = js.Dynamic.literal(callFake = js.Any.fromFunction1(callFake), callThrough = js.Any.fromFunction0(callThrough), returnValue = js.Any.fromFunction1(returnValue), returnValues = js.Any.fromFunction1(returnValues), stub = js.Any.fromFunction0(stub), throwError = js.Any.fromFunction1(throwError))
    __obj.asInstanceOf[SpyAnd]
  }
  
  @scala.inline
  implicit class SpyAndMutableBuilder[Self <: SpyAnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFake(value: js.Function => Spy): Self = StObject.set(x, "callFake", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallThrough(value: () => Spy): Self = StObject.set(x, "callThrough", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReturnValue(value: js.Any => Spy): Self = StObject.set(x, "returnValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReturnValues(value: /* repeated */ js.Any => Spy): Self = StObject.set(x, "returnValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStub(value: () => Spy): Self = StObject.set(x, "stub", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThrowError(value: String => Spy): Self = StObject.set(x, "throwError", js.Any.fromFunction1(value))
  }
}
