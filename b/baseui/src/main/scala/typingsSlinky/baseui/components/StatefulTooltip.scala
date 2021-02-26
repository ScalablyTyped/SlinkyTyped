package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.Close
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.close
import typingsSlinky.baseui.baseuiStrings.hover
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.menu
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.open
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.tooltip
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.popoverMod.PopoverOverrides
import typingsSlinky.baseui.popoverMod.State
import typingsSlinky.baseui.tooltipMod.StatefulTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulTooltip {
  
  @JSImport("baseui/tooltip", "StatefulTooltip")
  @js.native
  val component: js.Object = js.native
  
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
    def content(value: ReactElement | (js.Function1[/* args */ Close, ReactElement])): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentFunction1(value: /* args */ Close => ReactElement): this.type = set("content", js.Any.fromFunction1(value))
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `data-baseweb`(value: String): this.type = set("data-baseweb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dismissOnClickOutside(value: Boolean): this.type = set("dismissOnClickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dismissOnEsc(value: Boolean): this.type = set("dismissOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusLock(value: Boolean): this.type = set("focusLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ignoreBoundary(value: Boolean): this.type = set("ignoreBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: () => _): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMouseEnterDelay(value: Double): this.type = set("onMouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseLeaveDelay(value: Double): this.type = set("onMouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOpen(value: () => _): this.type = set("onOpen", js.Any.fromFunction0(value))
    
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
    def stateReducer(
      value: (/* stateChangeType */ open | close, /* nextState */ State, /* currentState */ State) => State
    ): this.type = set("stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def triggerType(value: click | hover): this.type = set("triggerType", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StatefulTooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatefulTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
