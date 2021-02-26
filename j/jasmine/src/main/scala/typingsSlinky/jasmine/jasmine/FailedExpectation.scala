package typingsSlinky.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedExpectation extends CustomReportExpectation {
  
  var actual: String = js.native
  
  var expected: String = js.native
}
object FailedExpectation {
  
  @scala.inline
  def apply(
    actual: String,
    expected: String,
    matcherName: String,
    message: String,
    passed: Boolean,
    stack: String
  ): FailedExpectation = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], matcherName = matcherName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedExpectation]
  }
  
  @scala.inline
  implicit class FailedExpectationMutableBuilder[Self <: FailedExpectation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActual(value: String): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
