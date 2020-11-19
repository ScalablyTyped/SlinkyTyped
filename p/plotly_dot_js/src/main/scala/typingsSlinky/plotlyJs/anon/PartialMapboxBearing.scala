package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Domain
import typingsSlinky.plotlyJs.mod.MapboxCenter
import typingsSlinky.plotlyJs.mod.MapboxLayers
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Mapbox> */
@js.native
trait PartialMapboxBearing extends js.Object {
  
  var accesstoken: js.UndefOr[String] = js.native
  
  var bearing: js.UndefOr[Double] = js.native
  
  var center: js.UndefOr[Partial[MapboxCenter]] = js.native
  
  var domain: js.UndefOr[Partial[Domain]] = js.native
  
  var layers: js.UndefOr[js.Array[Partial[MapboxLayers]]] = js.native
  
  var pitch: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[Double | String] = js.native
  
  var uirevision: js.UndefOr[Double | String] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object PartialMapboxBearing {
  
  @scala.inline
  def apply(): PartialMapboxBearing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapboxBearing]
  }
  
  @scala.inline
  implicit class PartialMapboxBearingOps[Self <: PartialMapboxBearing] (val x: Self) extends AnyVal {
    
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
    def setAccesstoken(value: String): Self = this.set("accesstoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccesstoken: Self = this.set("accesstoken", js.undefined)
    
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearing: Self = this.set("bearing", js.undefined)
    
    @scala.inline
    def setCenter(value: Partial[MapboxCenter]): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setDomain(value: Partial[Domain]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Partial[MapboxLayers]*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[Partial[MapboxLayers]]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    
    @scala.inline
    def setStyle(value: Double | String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUirevision(value: Double | String): Self = this.set("uirevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUirevision: Self = this.set("uirevision", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
