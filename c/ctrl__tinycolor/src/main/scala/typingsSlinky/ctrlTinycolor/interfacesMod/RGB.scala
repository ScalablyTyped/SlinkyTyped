package typingsSlinky.ctrlTinycolor.interfacesMod

import typingsSlinky.ctrlTinycolor.distMod._ColorInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RGB extends _ColorInput {
  
  var b: Double | String = js.native
  
  var g: Double | String = js.native
  
  var r: Double | String = js.native
}
object RGB {
  
  @scala.inline
  def apply(b: Double | String, g: Double | String, r: Double | String): RGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGB]
  }
  
  @scala.inline
  implicit class RGBOps[Self <: RGB] (val x: Self) extends AnyVal {
    
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
    def setB(value: Double | String): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: Double | String): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double | String): Self = this.set("r", value.asInstanceOf[js.Any])
  }
}
