package typingsSlinky.rcTooltip.components

import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTooltip.mod.RCTooltip.Placement
import typingsSlinky.rcTooltip.mod.RCTooltip.Props
import typingsSlinky.rcTooltip.mod.RCTooltip.Trigger
import typingsSlinky.rcTooltip.mod.default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.react.mod.ReactFragment
import typingsSlinky.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcTooltip {
  @JSImport("rc-tooltip", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def afterVisibleChange(value: /* visible */ js.UndefOr[Boolean] => Unit): this.type = set("afterVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def align(value: js.Object): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def arrowContentReactElement(value: ReactElement): this.type = set("arrowContent", value.asInstanceOf[js.Any])
    @scala.inline
    def arrowContent(value: TagMod[Any]): this.type = set("arrowContent", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultVisible(value: Boolean): this.type = set("defaultVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def destroyTooltipOnHide(value: Boolean): this.type = set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
    @scala.inline
    def getTooltipContainer(value: () => Element): this.type = set("getTooltipContainer", js.Any.fromFunction0(value))
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def onPopupAlign(value: (/* popupDomNode */ Element, /* align */ js.Object) => Unit): this.type = set("onPopupAlign", js.Any.fromFunction2(value))
    @scala.inline
    def onVisibleChange(value: /* visible */ js.UndefOr[Boolean] => Unit): this.type = set("onVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def placement(value: Placement | js.Object): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def trigger(value: js.Array[Trigger]): this.type = set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(overlay: js.Function0[ReactChild] | ReactChild | ReactFragment | ReactPortal): Builder = {
    val __props = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

