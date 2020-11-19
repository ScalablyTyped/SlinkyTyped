package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiBooleans.`false`
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
trait ArrowOffset extends js.Object {
  
  var arrowOffset: Left = js.native
  
  var isAnimating: `false` = js.native
  
  var isLayerMounted: `false` = js.native
  
  var isMounted: `false` = js.native
  
  var placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = js.native
  
  var popoverOffset: Left = js.native
}
object ArrowOffset {
  
  @scala.inline
  def apply(
    arrowOffset: Left,
    isAnimating: `false`,
    isLayerMounted: `false`,
    isMounted: `false`,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top,
    popoverOffset: Left
  ): ArrowOffset = {
    val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isLayerMounted = isLayerMounted.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowOffset]
  }
  
  @scala.inline
  implicit class ArrowOffsetOps[Self <: ArrowOffset] (val x: Self) extends AnyVal {
    
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
    def setArrowOffset(value: Left): Self = this.set("arrowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAnimating(value: `false`): Self = this.set("isAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLayerMounted(value: `false`): Self = this.set("isLayerMounted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMounted(value: `false`): Self = this.set("isMounted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverOffset(value: Left): Self = this.set("popoverOffset", value.asInstanceOf[js.Any])
  }
}
