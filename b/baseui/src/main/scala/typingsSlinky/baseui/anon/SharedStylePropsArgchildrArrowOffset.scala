package typingsSlinky.baseui.anon

import slinky.core.facade.ReactElement
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
import typingsSlinky.baseui.popoverMod.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/popover.SharedStylePropsArg & {  children :react.react.ReactNode | undefined} */
@js.native
trait SharedStylePropsArgchildrArrowOffset extends StObject {
  
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
  
  var children: js.UndefOr[ReactElement] = js.native
}
object SharedStylePropsArgchildrArrowOffset {
  
  @scala.inline
  def apply(): SharedStylePropsArgchildrArrowOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArgchildrArrowOffset]
  }
  
  @scala.inline
  implicit class SharedStylePropsArgchildrArrowOffsetMutableBuilder[Self <: SharedStylePropsArgchildrArrowOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$arrowOffset(value: Offset): Self = StObject.set(x, "$arrowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$arrowOffsetUndefined: Self = StObject.set(x, "$arrowOffset", js.undefined)
    
    @scala.inline
    def set$isAnimating(value: Boolean): Self = StObject.set(x, "$isAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isAnimatingUndefined: Self = StObject.set(x, "$isAnimating", js.undefined)
    
    @scala.inline
    def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isOpenUndefined: Self = StObject.set(x, "$isOpen", js.undefined)
    
    @scala.inline
    def set$placement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$placementUndefined: Self = StObject.set(x, "$placement", js.undefined)
    
    @scala.inline
    def set$popoverMargin(value: Double): Self = StObject.set(x, "$popoverMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$popoverMarginUndefined: Self = StObject.set(x, "$popoverMargin", js.undefined)
    
    @scala.inline
    def set$popoverOffset(value: Offset): Self = StObject.set(x, "$popoverOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$popoverOffsetUndefined: Self = StObject.set(x, "$popoverOffset", js.undefined)
    
    @scala.inline
    def set$showArrow(value: Boolean): Self = StObject.set(x, "$showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$showArrowUndefined: Self = StObject.set(x, "$showArrow", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
