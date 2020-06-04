package typingsSlinky.materialUiCore.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.html.select.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.anon.PartialMenuProps
import typingsSlinky.materialUiCore.anon.Value
import typingsSlinky.materialUiCore.materialUiCoreStrings.filled
import typingsSlinky.materialUiCore.materialUiCoreStrings.outlined
import typingsSlinky.materialUiCore.materialUiCoreStrings.standard
import typingsSlinky.materialUiCore.selectInputMod.SelectInputProps
import typingsSlinky.materialUiCore.selectInputMod.default
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectInput {
  @JSImport("@material-ui/core/Select/SelectInput", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def IconComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("IconComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def IconComponentComponentClass(value: ReactComponentClass[_]): this.type = set("IconComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def IconComponent(value: ReactType[_]): this.type = set("IconComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def MenuProps(value: PartialMenuProps): this.type = set("MenuProps", value.asInstanceOf[js.Any])
    @scala.inline
    def SelectDisplayProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("SelectDisplayProps", value.asInstanceOf[js.Any])
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRef(value: /* ref */ HTMLSelectElement | Value => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[_] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onClose(value: /* event */ ChangeEvent[js.Object] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[_] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onOpen(value: /* event */ ChangeEvent[js.Object] => Unit): this.type = set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def renderValue(
      value: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => TagMod[Any]
    ): this.type = set("renderValue", js.Any.fromFunction1(value))
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def variant(value: standard | outlined | filled): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    autoWidth: Boolean,
    multiple: Boolean,
    native: Boolean,
    value: String | Double | Boolean | (js.Array[String | Double | Boolean])
  ): Builder = {
    val __props = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectInputProps]))
  }
}

