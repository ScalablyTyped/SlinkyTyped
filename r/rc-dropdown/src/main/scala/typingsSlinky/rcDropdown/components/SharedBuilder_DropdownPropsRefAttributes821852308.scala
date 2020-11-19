package typingsSlinky.rcDropdown.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTrigger.interfaceMod.ActionType
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.rcTrigger.interfaceMod.AnimationType
import typingsSlinky.rcTrigger.interfaceMod.BuildInPlacements
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DropdownPropsRefAttributes821852308[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
  
  @scala.inline
  def alignPoint(value: Boolean): this.type = set("alignPoint", value.asInstanceOf[js.Any])
  
  @scala.inline
  def animation(value: AnimationType): this.type = set("animation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def arrow(value: Boolean): this.type = set("arrow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  @scala.inline
  def hideActionVarargs(value: ActionType*): this.type = set("hideAction", js.Array(value :_*))
  
  @scala.inline
  def hideAction(value: js.Array[ActionType]): this.type = set("hideAction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minOverlayWidthMatchTrigger(value: Boolean): this.type = set("minOverlayWidthMatchTrigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onOverlayClick(value: /* e */ Event => Unit): this.type = set("onOverlayClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onVisibleChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
  
  @scala.inline
  def overlay(value: js.Function0[ReactElement] | ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placements(value: BuildInPlacements): this.type = set("placements", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showActionVarargs(value: ActionType*): this.type = set("showAction", js.Array(value :_*))
  
  @scala.inline
  def showAction(value: js.Array[ActionType]): this.type = set("showAction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def triggerVarargs(value: ActionType*): this.type = set("trigger", js.Array(value :_*))
  
  @scala.inline
  def trigger(value: ActionType | js.Array[ActionType]): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
