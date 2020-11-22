package typingsSlinky.baseui.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.hover
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.menu
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.tooltip
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.helperMod.PropsT
import typingsSlinky.baseui.popoverMod.PopoverOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableHelper {
  
  @JSImport("baseui/helper", "Unstable_Helper")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def accessibilityType(value: none | menu | tooltip): this.type = set("accessibilityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animateOutTime(value: Double): this.type = set("animateOutTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentFunction0(value: () => ReactElement): this.type = set("content", js.Any.fromFunction0(value))
    
    @scala.inline
    def content(value: ReactElement | js.Function0[ReactElement]): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `data-baseweb`(value: String): this.type = set("data-baseweb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusLock(value: Boolean): this.type = set("focusLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ignoreBoundary(value: Boolean): this.type = set("ignoreBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: () => _): this.type = set("onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def onClick(value: /* e */ Event => _): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClickOutside(value: /* event */ MouseEvent => _): this.type = set("onClickOutside", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEsc(value: () => _): this.type = set("onEsc", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFocus(value: () => _): this.type = set("onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMouseEnter(value: () => _): this.type = set("onMouseEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMouseEnterDelay(value: Double): this.type = set("onMouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseLeave(value: () => _): this.type = set("onMouseLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMouseLeaveDelay(value: Double): this.type = set("onMouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: PopoverOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popoverMargin(value: Double): this.type = set("popoverMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popperOptions(value: js.Any): this.type = set("popperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def returnFocus(value: Boolean): this.type = set("returnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerType(value: click | hover): this.type = set("triggerType", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsT): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsT]))
  }
}
