package typingsSlinky.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustedAdvisorChecksRequest extends StObject {
  
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: String = js.native
}
object DescribeTrustedAdvisorChecksRequest {
  
  @scala.inline
  def apply(language: String): DescribeTrustedAdvisorChecksRequest = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorChecksRequest]
  }
  
  @scala.inline
  implicit class DescribeTrustedAdvisorChecksRequestMutableBuilder[Self <: DescribeTrustedAdvisorChecksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
