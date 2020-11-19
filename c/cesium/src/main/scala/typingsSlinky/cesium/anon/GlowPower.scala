package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlowPower extends js.Object {
  
  var color: js.UndefOr[Property] = js.native
  
  var glowPower: js.UndefOr[Property] = js.native
}
object GlowPower {
  
  @scala.inline
  def apply(): GlowPower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlowPower]
  }
  
  @scala.inline
  implicit class GlowPowerOps[Self <: GlowPower] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Property): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setGlowPower(value: Property): Self = this.set("glowPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlowPower: Self = this.set("glowPower", js.undefined)
  }
}
