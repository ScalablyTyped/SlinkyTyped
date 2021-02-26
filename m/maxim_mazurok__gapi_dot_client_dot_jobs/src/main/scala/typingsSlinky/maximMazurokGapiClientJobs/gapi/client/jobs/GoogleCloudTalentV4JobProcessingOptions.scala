package typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudTalentV4JobProcessingOptions extends StObject {
  
  /** If set to `true`, the service does not attempt to resolve a more precise address for the job. */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  
  /**
    * Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields
    * may be stripped if sanitiazation isn't disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
    */
  var htmlSanitization: js.UndefOr[String] = js.native
}
object GoogleCloudTalentV4JobProcessingOptions {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4JobProcessingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4JobProcessingOptions]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4JobProcessingOptionsMutableBuilder[Self <: GoogleCloudTalentV4JobProcessingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableStreetAddressResolution(value: Boolean): Self = StObject.set(x, "disableStreetAddressResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStreetAddressResolutionUndefined: Self = StObject.set(x, "disableStreetAddressResolution", js.undefined)
    
    @scala.inline
    def setHtmlSanitization(value: String): Self = StObject.set(x, "htmlSanitization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlSanitizationUndefined: Self = StObject.set(x, "htmlSanitization", js.undefined)
  }
}
