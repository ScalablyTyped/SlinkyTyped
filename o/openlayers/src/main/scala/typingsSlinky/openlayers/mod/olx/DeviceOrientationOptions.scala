package typingsSlinky.openlayers.mod.olx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceOrientationOptions extends js.Object {
  
  var tracking: js.UndefOr[Boolean] = js.native
}
object DeviceOrientationOptions {
  
  @scala.inline
  def apply(): DeviceOrientationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOrientationOptions]
  }
  
  @scala.inline
  implicit class DeviceOrientationOptionsOps[Self <: DeviceOrientationOptions] (val x: Self) extends AnyVal {
    
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
    def setTracking(value: Boolean): Self = this.set("tracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracking: Self = this.set("tracking", js.undefined)
  }
}
