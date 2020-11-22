package typingsSlinky.baseui.popoverMod

import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedStylePropsArg extends js.Object {
  
  @JSName("$arrowOffset")
  var $arrowOffset: js.UndefOr[Offset] = js.native
  
  @JSName("$isAnimating")
  var $isAnimating: js.UndefOr[Boolean] = js.native
  
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  
  @JSName("$placement")
  var $placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  
  @JSName("$popoverMargin")
  var $popoverMargin: js.UndefOr[Double] = js.native
  
  @JSName("$popoverOffset")
  var $popoverOffset: js.UndefOr[Offset] = js.native
  
  @JSName("$showArrow")
  var $showArrow: js.UndefOr[Boolean] = js.native
}
object SharedStylePropsArg {
  
  @scala.inline
  def apply(): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArg]
  }
  
  @scala.inline
  implicit class SharedStylePropsArgOps[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
    
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
    def set$arrowOffset(value: Offset): Self = this.set("$arrowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$arrowOffset: Self = this.set("$arrowOffset", js.undefined)
    
    @scala.inline
    def set$isAnimating(value: Boolean): Self = this.set("$isAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$isAnimating: Self = this.set("$isAnimating", js.undefined)
    
    @scala.inline
    def set$isOpen(value: Boolean): Self = this.set("$isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$isOpen: Self = this.set("$isOpen", js.undefined)
    
    @scala.inline
    def set$placement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = this.set("$placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$placement: Self = this.set("$placement", js.undefined)
    
    @scala.inline
    def set$popoverMargin(value: Double): Self = this.set("$popoverMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$popoverMargin: Self = this.set("$popoverMargin", js.undefined)
    
    @scala.inline
    def set$popoverOffset(value: Offset): Self = this.set("$popoverOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$popoverOffset: Self = this.set("$popoverOffset", js.undefined)
    
    @scala.inline
    def set$showArrow(value: Boolean): Self = this.set("$showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$showArrow: Self = this.set("$showArrow", js.undefined)
  }
}
