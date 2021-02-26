package typingsSlinky.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Mapbox> */
@js.native
trait PartialMapboxAccesstoken extends StObject {
  
  var accesstoken: js.UndefOr[String] = js.native
  
  var bearing: js.UndefOr[Double] = js.native
  
  var center: js.UndefOr[PartialMapboxCenter] = js.native
  
  var domain: js.UndefOr[PartialDomain] = js.native
  
  var layers: js.UndefOr[js.Array[PartialMapboxLayersBelow]] = js.native
  
  var pitch: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[Double | String] = js.native
  
  var uirevision: js.UndefOr[Double | String] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object PartialMapboxAccesstoken {
  
  @scala.inline
  def apply(): PartialMapboxAccesstoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapboxAccesstoken]
  }
  
  @scala.inline
  implicit class PartialMapboxAccesstokenMutableBuilder[Self <: PartialMapboxAccesstoken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccesstoken(value: String): Self = StObject.set(x, "accesstoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccesstokenUndefined: Self = StObject.set(x, "accesstoken", js.undefined)
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    @scala.inline
    def setCenter(value: PartialMapboxCenter): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[PartialMapboxLayersBelow]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: PartialMapboxLayersBelow*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setStyle(value: Double | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUirevisionUndefined: Self = StObject.set(x, "uirevision", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
