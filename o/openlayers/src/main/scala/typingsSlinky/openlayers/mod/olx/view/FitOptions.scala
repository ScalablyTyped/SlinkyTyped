package typingsSlinky.openlayers.mod.olx.view

import typingsSlinky.openlayers.mod.Size
import typingsSlinky.openlayers.mod.olx.animation.AnimateCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FitOptions extends js.Object {
  
  var callback: js.UndefOr[AnimateCallback] = js.native
  
  var constrainResolution: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minResolution: js.UndefOr[Double] = js.native
  
  var nearest: js.UndefOr[Boolean] = js.native
  
  var padding: js.UndefOr[js.Array[Double]] = js.native
  
  var size: js.UndefOr[Size] = js.native
}
object FitOptions {
  
  @scala.inline
  def apply(): FitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitOptions]
  }
  
  @scala.inline
  implicit class FitOptionsOps[Self <: FitOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: /* completed */ Boolean => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setConstrainResolution(value: Boolean): Self = this.set("constrainResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainResolution: Self = this.set("constrainResolution", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: /* t */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinResolution(value: Double): Self = this.set("minResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinResolution: Self = this.set("minResolution", js.undefined)
    
    @scala.inline
    def setNearest(value: Boolean): Self = this.set("nearest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNearest: Self = this.set("nearest", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
