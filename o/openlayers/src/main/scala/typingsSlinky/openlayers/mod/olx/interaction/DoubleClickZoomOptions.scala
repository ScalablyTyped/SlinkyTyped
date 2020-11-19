package typingsSlinky.openlayers.mod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleClickZoomOptions extends js.Object {
  
  var delta: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
}
object DoubleClickZoomOptions {
  
  @scala.inline
  def apply(): DoubleClickZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleClickZoomOptions]
  }
  
  @scala.inline
  implicit class DoubleClickZoomOptionsOps[Self <: DoubleClickZoomOptions] (val x: Self) extends AnyVal {
    
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
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
}
