package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ReidentifyContentResponse extends js.Object {
  
  /** The re-identified item. */
  var item: js.UndefOr[GooglePrivacyDlpV2ContentItem] = js.native
  
  /** An overview of the changes that were made to the `item`. */
  var overview: js.UndefOr[GooglePrivacyDlpV2TransformationOverview] = js.native
}
object GooglePrivacyDlpV2ReidentifyContentResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ReidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ReidentifyContentResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ReidentifyContentResponseOps[Self <: GooglePrivacyDlpV2ReidentifyContentResponse] (val x: Self) extends AnyVal {
    
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
    def setItem(value: GooglePrivacyDlpV2ContentItem): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setOverview(value: GooglePrivacyDlpV2TransformationOverview): Self = this.set("overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
  }
}
