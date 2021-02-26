package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DfpSettings extends StObject {
  
  /** Ad Manager network code for this directory site. */
  var dfpNetworkCode: js.UndefOr[String] = js.native
  
  /** Ad Manager network name for this directory site. */
  var dfpNetworkName: js.UndefOr[String] = js.native
  
  /** Whether this directory site accepts programmatic placements. */
  var programmaticPlacementAccepted: js.UndefOr[Boolean] = js.native
  
  /** Whether this directory site accepts publisher-paid tags. */
  var pubPaidPlacementAccepted: js.UndefOr[Boolean] = js.native
  
  /** Whether this directory site is available only via Publisher Portal. */
  var publisherPortalOnly: js.UndefOr[Boolean] = js.native
}
object DfpSettings {
  
  @scala.inline
  def apply(): DfpSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DfpSettings]
  }
  
  @scala.inline
  implicit class DfpSettingsMutableBuilder[Self <: DfpSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDfpNetworkCode(value: String): Self = StObject.set(x, "dfpNetworkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfpNetworkCodeUndefined: Self = StObject.set(x, "dfpNetworkCode", js.undefined)
    
    @scala.inline
    def setDfpNetworkName(value: String): Self = StObject.set(x, "dfpNetworkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfpNetworkNameUndefined: Self = StObject.set(x, "dfpNetworkName", js.undefined)
    
    @scala.inline
    def setProgrammaticPlacementAccepted(value: Boolean): Self = StObject.set(x, "programmaticPlacementAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgrammaticPlacementAcceptedUndefined: Self = StObject.set(x, "programmaticPlacementAccepted", js.undefined)
    
    @scala.inline
    def setPubPaidPlacementAccepted(value: Boolean): Self = StObject.set(x, "pubPaidPlacementAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubPaidPlacementAcceptedUndefined: Self = StObject.set(x, "pubPaidPlacementAccepted", js.undefined)
    
    @scala.inline
    def setPublisherPortalOnly(value: Boolean): Self = StObject.set(x, "publisherPortalOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherPortalOnlyUndefined: Self = StObject.set(x, "publisherPortalOnly", js.undefined)
  }
}
