package typingsSlinky.jestTestResult.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedAssertion extends StObject {
  
  var actual: js.UndefOr[js.Any] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var expected: js.UndefOr[js.Any] = js.native
  
  var isNot: js.UndefOr[Boolean] = js.native
  
  var matcherName: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var pass: js.UndefOr[Boolean] = js.native
  
  var passed: js.UndefOr[Boolean] = js.native
  
  var stack: js.UndefOr[String] = js.native
}
object FailedAssertion {
  
  @scala.inline
  def apply(): FailedAssertion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedAssertion]
  }
  
  @scala.inline
  implicit class FailedAssertionMutableBuilder[Self <: FailedAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
    
    @scala.inline
    def setIsNot(value: Boolean): Self = StObject.set(x, "isNot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNotUndefined: Self = StObject.set(x, "isNot", js.undefined)
    
    @scala.inline
    def setMatcherName(value: String): Self = StObject.set(x, "matcherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcherNameUndefined: Self = StObject.set(x, "matcherName", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
    
    @scala.inline
    def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
