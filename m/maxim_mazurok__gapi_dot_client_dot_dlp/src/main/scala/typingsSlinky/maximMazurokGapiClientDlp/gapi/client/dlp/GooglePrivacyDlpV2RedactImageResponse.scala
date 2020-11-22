package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2RedactImageResponse extends js.Object {
  
  /** If an image was being inspected and the InspectConfig's include_quote was set to true, then this field will include all text, if any, that was found in the image. */
  var extractedText: js.UndefOr[String] = js.native
  
  /** The findings. Populated when include_findings in the request is true. */
  var inspectResult: js.UndefOr[GooglePrivacyDlpV2InspectResult] = js.native
  
  /** The redacted image. The type will be the same as the original image. */
  var redactedImage: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2RedactImageResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RedactImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RedactImageResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RedactImageResponseOps[Self <: GooglePrivacyDlpV2RedactImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtractedText(value: String): Self = this.set("extractedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractedText: Self = this.set("extractedText", js.undefined)
    
    @scala.inline
    def setInspectResult(value: GooglePrivacyDlpV2InspectResult): Self = this.set("inspectResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectResult: Self = this.set("inspectResult", js.undefined)
    
    @scala.inline
    def setRedactedImage(value: String): Self = this.set("redactedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedactedImage: Self = this.set("redactedImage", js.undefined)
  }
}
