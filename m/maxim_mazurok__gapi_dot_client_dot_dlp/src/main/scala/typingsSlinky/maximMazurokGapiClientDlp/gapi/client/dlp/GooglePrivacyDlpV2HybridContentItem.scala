package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2HybridContentItem extends StObject {
  
  /** Supplementary information that will be added to each finding. */
  var findingDetails: js.UndefOr[GooglePrivacyDlpV2HybridFindingDetails] = js.native
  
  /** The item to inspect. */
  var item: js.UndefOr[GooglePrivacyDlpV2ContentItem] = js.native
}
object GooglePrivacyDlpV2HybridContentItem {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2HybridContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2HybridContentItem]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2HybridContentItemMutableBuilder[Self <: GooglePrivacyDlpV2HybridContentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingDetails(value: GooglePrivacyDlpV2HybridFindingDetails): Self = StObject.set(x, "findingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingDetailsUndefined: Self = StObject.set(x, "findingDetails", js.undefined)
    
    @scala.inline
    def setItem(value: GooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
