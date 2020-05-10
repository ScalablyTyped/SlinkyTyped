package typingsSlinky.rmcTooltip.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ITooltipProps_1631586751[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def afterVisibleChange(value: js.Function): this.type = set("afterVisibleChange", value.asInstanceOf[js.Any])
  @scala.inline
  def align(value: js.Object): this.type = set("align", value.asInstanceOf[js.Any])
  @scala.inline
  def animation(value: js.Any): this.type = set("animation", value.asInstanceOf[js.Any])
  @scala.inline
  def arrowContent(value: js.Any): this.type = set("arrowContent", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultVisible(value: Boolean): this.type = set("defaultVisible", value.asInstanceOf[js.Any])
  @scala.inline
  def destroyTooltipOnHide(value: Boolean): this.type = set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
  @scala.inline
  def getTooltipContainer(value: js.Function): this.type = set("getTooltipContainer", value.asInstanceOf[js.Any])
  @scala.inline
  def onVisibleChange(value: js.Function): this.type = set("onVisibleChange", value.asInstanceOf[js.Any])
  @scala.inline
  def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
  @scala.inline
  def overlay(value: TagMod[Any] | js.Function): this.type = set("overlay", value.asInstanceOf[js.Any])
  @scala.inline
  def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def overlayStyle(value: js.Object): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  @scala.inline
  def trigger(value: js.Any): this.type = set("trigger", value.asInstanceOf[js.Any])
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}

