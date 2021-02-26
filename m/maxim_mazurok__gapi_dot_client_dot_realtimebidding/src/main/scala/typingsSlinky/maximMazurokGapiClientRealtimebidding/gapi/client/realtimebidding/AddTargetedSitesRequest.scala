package typingsSlinky.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTargetedSitesRequest extends StObject {
  
  /** A list of site URLs to target in the pretargeting configuration. These values will be added to the list of targeted URLs in PretargetingConfig.webTargeting.values. */
  var sites: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The targeting mode that should be applied to the list of site URLs. If there are existing targeted sites, must be equal to the existing
    * PretargetingConfig.webTargeting.targetingMode or a 400 bad request error will be returned.
    */
  var targetingMode: js.UndefOr[String] = js.native
}
object AddTargetedSitesRequest {
  
  @scala.inline
  def apply(): AddTargetedSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTargetedSitesRequest]
  }
  
  @scala.inline
  implicit class AddTargetedSitesRequestMutableBuilder[Self <: AddTargetedSitesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSites(value: js.Array[String]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    @scala.inline
    def setSitesVarargs(value: String*): Self = StObject.set(x, "sites", js.Array(value :_*))
    
    @scala.inline
    def setTargetingMode(value: String): Self = StObject.set(x, "targetingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingModeUndefined: Self = StObject.set(x, "targetingMode", js.undefined)
  }
}
