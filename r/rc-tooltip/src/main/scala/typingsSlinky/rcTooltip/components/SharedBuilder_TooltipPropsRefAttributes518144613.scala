package typingsSlinky.rcTooltip.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTooltip.anon.KeepParent
import typingsSlinky.rcTrigger.interfaceMod.ActionType
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.rcTrigger.interfaceMod.AnimationType
import typingsSlinky.rcTrigger.interfaceMod.BuildInPlacements
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TooltipPropsRefAttributes518144613[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def afterVisibleChange(value: () => Unit): this.type = set("afterVisibleChange", js.Any.fromFunction0(value))
  
  @scala.inline
  def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
  
  @scala.inline
  def animation(value: AnimationType): this.type = set("animation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def arrowContent(value: ReactElement): this.type = set("arrowContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def arrowContentReactElement(value: ReactElement): this.type = set("arrowContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def builtinPlacements(value: BuildInPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultVisible(value: Boolean): this.type = set("defaultVisible", value.asInstanceOf[js.Any])
  
  @scala.inline
  def destroyTooltipOnHide(value: Boolean | KeepParent): this.type = set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getTooltipContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getTooltipContainer", js.Any.fromFunction1(value))
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): this.type = set("onPopupAlign", js.Any.fromFunction2(value))
  
  @scala.inline
  def onVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onVisibleChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def overlay(value: js.Function0[ReactElement] | ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
  
  @scala.inline
  def overlayInnerStyle(value: CSSProperties): this.type = set("overlayInnerStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trigger(value: ActionType | js.Array[ActionType]): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def triggerVarargs(value: ActionType*): this.type = set("trigger", js.Array(value :_*))
  
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
