package typingsSlinky.favicons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconOptions extends js.Object {
  
  var background: js.UndefOr[Boolean | String] = js.native
  
  var mask: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var ovelayShadow: js.UndefOr[Boolean] = js.native
  
  var overlayGlow: js.UndefOr[Boolean] = js.native
}
object IconOptions {
  
  @scala.inline
  def apply(): IconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconOptions]
  }
  
  @scala.inline
  implicit class IconOptionsOps[Self <: IconOptions] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: Boolean | String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOvelayShadow(value: Boolean): Self = this.set("ovelayShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOvelayShadow: Self = this.set("ovelayShadow", js.undefined)
    
    @scala.inline
    def setOverlayGlow(value: Boolean): Self = this.set("overlayGlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayGlow: Self = this.set("overlayGlow", js.undefined)
  }
}
