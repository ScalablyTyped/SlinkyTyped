package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseWheelOptions extends js.Object {
  
  var deltaX: js.UndefOr[Double] = js.native
  
  var deltaY: js.UndefOr[Double] = js.native
}
object MouseWheelOptions {
  
  @scala.inline
  def apply(): MouseWheelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseWheelOptions]
  }
  
  @scala.inline
  implicit class MouseWheelOptionsOps[Self <: MouseWheelOptions] (val x: Self) extends AnyVal {
    
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
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaX: Self = this.set("deltaX", js.undefined)
    
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaY: Self = this.set("deltaY", js.undefined)
  }
}
