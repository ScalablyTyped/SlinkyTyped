package typingsSlinky.ol.mouseWheelZoomMod

import typingsSlinky.ol.conditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var condition: js.UndefOr[Condition] = js.native
  
  var constrainResolution: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var maxDelta: js.UndefOr[Double] = js.native
  
  var onFocusOnly: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var useAnchor: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: Condition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setConstrainResolution(value: Boolean): Self = this.set("constrainResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainResolution: Self = this.set("constrainResolution", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setMaxDelta(value: Double): Self = this.set("maxDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDelta: Self = this.set("maxDelta", js.undefined)
    
    @scala.inline
    def setOnFocusOnly(value: Boolean): Self = this.set("onFocusOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocusOnly: Self = this.set("onFocusOnly", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUseAnchor(value: Boolean): Self = this.set("useAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAnchor: Self = this.set("useAnchor", js.undefined)
  }
}
