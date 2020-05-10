package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.buttonButtonMod.ButtonType
import typingsSlinky.antd.buttonButtonMod.NativeButtonProps
import typingsSlinky.antd.placementsMod.AdjustOverflow
import typingsSlinky.antd.popconfirmMod.PopconfirmProps
import typingsSlinky.antd.popconfirmMod.default
import typingsSlinky.antd.tooltipMod.TooltipPlacement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popconfirm {
  @JSImport("antd/lib/popconfirm", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def arrowPointAtCenter(value: Boolean): this.type = set("arrowPointAtCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def autoAdjustOverflow(value: Boolean | AdjustOverflow): this.type = set("autoAdjustOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def builtinPlacements(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
    ): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelButtonProps(value: NativeButtonProps): this.type = set("cancelButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelTextReactElement(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelText(value: TagMod[Any]): this.type = set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: TagMod[Any]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def okButtonProps(value: NativeButtonProps): this.type = set("okButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def okTextReactElement(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def okText(value: TagMod[Any]): this.type = set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def okType(value: ButtonType): this.type = set("okType", value.asInstanceOf[js.Any])
    @scala.inline
    def onCancel(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onConfirm(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): this.type = set("onConfirm", js.Any.fromFunction1(value))
    @scala.inline
    def onVisibleChange(value: (/* visible */ Boolean, /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]]) => Unit): this.type = set("onVisibleChange", js.Any.fromFunction2(value))
    @scala.inline
    def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def placement(value: TooltipPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopconfirmProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Popconfirm.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

