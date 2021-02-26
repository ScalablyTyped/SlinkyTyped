package typingsSlinky.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustedAdvisorCheckResultResponse extends StObject {
  
  /**
    * The detailed results of the Trusted Advisor check.
    */
  var result: js.UndefOr[TrustedAdvisorCheckResult] = js.native
}
object DescribeTrustedAdvisorCheckResultResponse {
  
  @scala.inline
  def apply(): DescribeTrustedAdvisorCheckResultResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultResponse]
  }
  
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckResultResponseMutableBuilder[Self <: DescribeTrustedAdvisorCheckResultResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: TrustedAdvisorCheckResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
