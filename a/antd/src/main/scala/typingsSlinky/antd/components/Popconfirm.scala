package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.buttonButtonMod.LegacyButtonType
import typingsSlinky.antd.buttonButtonMod.NativeButtonProps
import typingsSlinky.antd.colorsMod.PresetColorType
import typingsSlinky.antd.getRenderPropValueMod.RenderFunction
import typingsSlinky.antd.placementsMod.AdjustOverflow
import typingsSlinky.antd.popconfirmMod.PopconfirmProps
import typingsSlinky.antd.tooltipMod.TooltipPlacement
import typingsSlinky.antd.typeMod.LiteralUnion
import typingsSlinky.rcTooltip.anon.KeepParent
import typingsSlinky.rcTrigger.interfaceMod.ActionType
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.rcTrigger.interfaceMod.AnimationType
import typingsSlinky.rcTrigger.interfaceMod.BuildInPlacements
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popconfirm {
  
  @JSImport("antd", "Popconfirm")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Any with js.Object] {
    
    @scala.inline
    def afterVisibleChange(value: () => Unit): this.type = set("afterVisibleChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: AnimationType): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrowContentReactElement(value: ReactElement): this.type = set("arrowContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrowContent(value: ReactElement): this.type = set("arrowContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrowPointAtCenter(value: Boolean): this.type = set("arrowPointAtCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoAdjustOverflow(value: Boolean | AdjustOverflow): this.type = set("autoAdjustOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def builtinPlacements(value: BuildInPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelButtonProps(value: NativeButtonProps): this.type = set("cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelTextReactElement(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelText(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: LiteralUnion[PresetColorType, String]): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultVisible(value: Boolean): this.type = set("defaultVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destroyTooltipOnHide(value: Boolean | KeepParent): this.type = set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def getTooltipContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getTooltipContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okButtonProps(value: NativeButtonProps): this.type = set("okButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okTextReactElement(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okText(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okType(value: LegacyButtonType): this.type = set("okType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCancel(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onConfirm(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): this.type = set("onConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): this.type = set("onPopupAlign", js.Any.fromFunction2(value))
    
    @scala.inline
    def onVisibleChange(
      value: (/* visible */ Boolean, /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLDivElement]]) => Unit
    ): this.type = set("onVisibleChange", js.Any.fromFunction2(value))
    
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
    def overlayInnerStyle(value: CSSProperties): this.type = set("overlayInnerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: TooltipPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleFunction0(value: () => ReactElement): this.type = set("title", js.Any.fromFunction0(value))
    
    @scala.inline
    def title(value: ReactElement | RenderFunction): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerVarargs(value: ActionType*): this.type = set("trigger", js.Array(value :_*))
    
    @scala.inline
    def trigger(value: ActionType | js.Array[ActionType]): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopconfirmProps with RefAttributes[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Popconfirm.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
