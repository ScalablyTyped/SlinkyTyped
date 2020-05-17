package typingsSlinky.rcCascader.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcCascader.cascaderMod.CascaderFieldNames
import typingsSlinky.rcCascader.cascaderMod.CascaderOption
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_CascaderProps300585724[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def builtinPlacements(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
  ): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
  @scala.inline
  def changeOnSelect(value: Boolean): this.type = set("changeOnSelect", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultValue(value: js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def dropdownMenuColumnStyle(value: CSSProperties): this.type = set("dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def expandIconReactElement(value: ReactElement): this.type = set("expandIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def expandIcon(value: TagMod[Any]): this.type = set("expandIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def expandTrigger(value: String): this.type = set("expandTrigger", value.asInstanceOf[js.Any])
  @scala.inline
  def fieldNames(value: CascaderFieldNames): this.type = set("fieldNames", value.asInstanceOf[js.Any])
  @scala.inline
  def filedNames(value: CascaderFieldNames): this.type = set("filedNames", value.asInstanceOf[js.Any])
  @scala.inline
  def getPopupContainer(value: js.Any): this.type = set("getPopupContainer", value.asInstanceOf[js.Any])
  @scala.inline
  def loadData(value: /* selectOptions */ js.Array[CascaderOption] => Unit): this.type = set("loadData", js.Any.fromFunction1(value))
  @scala.inline
  def loadingIconReactElement(value: ReactElement): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def loadingIcon(value: TagMod[Any]): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: (/* value */ js.Array[String], /* selectOptions */ js.Array[CascaderOption]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
  @scala.inline
  def onKeyDown(value: /* e */ SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  @scala.inline
  def onPopupVisibleChange(value: /* popupVisible */ Boolean => Unit): this.type = set("onPopupVisibleChange", js.Any.fromFunction1(value))
  @scala.inline
  def options(value: js.Array[CascaderOption]): this.type = set("options", value.asInstanceOf[js.Any])
  @scala.inline
  def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
  @scala.inline
  def popupPlacement(value: String): this.type = set("popupPlacement", value.asInstanceOf[js.Any])
  @scala.inline
  def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  @scala.inline
  def value(value: js.Array[String]): this.type = set("value", value.asInstanceOf[js.Any])
}

