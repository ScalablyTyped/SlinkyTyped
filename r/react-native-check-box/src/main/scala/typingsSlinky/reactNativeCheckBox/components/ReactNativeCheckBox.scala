package typingsSlinky.reactNativeCheckBox.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCheckBox.mod.CheckBoxProps
import typingsSlinky.reactNativeCheckBox.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeCheckBox {
  @JSImport("react-native-check-box", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def checkBoxColor(value: String): this.type = set("checkBoxColor", value.asInstanceOf[js.Any])
    @scala.inline
    def checkedCheckBoxColor(value: String): this.type = set("checkedCheckBoxColor", value.asInstanceOf[js.Any])
    @scala.inline
    def checkedImage(value: ReactElement): this.type = set("checkedImage", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def leftText(value: String): this.type = set("leftText", value.asInstanceOf[js.Any])
    @scala.inline
    def leftTextStyle(value: StyleProp[TextStyle]): this.type = set("leftTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def leftTextStyleNull: this.type = set("leftTextStyle", null)
    @scala.inline
    def leftTextViewReactElement(value: ReactElement): this.type = set("leftTextView", value.asInstanceOf[js.Any])
    @scala.inline
    def leftTextView(value: ReactElement): this.type = set("leftTextView", value.asInstanceOf[js.Any])
    @scala.inline
    def rightText(value: String): this.type = set("rightText", value.asInstanceOf[js.Any])
    @scala.inline
    def rightTextStyle(value: StyleProp[TextStyle]): this.type = set("rightTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def rightTextStyleNull: this.type = set("rightTextStyle", null)
    @scala.inline
    def rightTextViewReactElement(value: ReactElement): this.type = set("rightTextView", value.asInstanceOf[js.Any])
    @scala.inline
    def rightTextView(value: ReactElement): this.type = set("rightTextView", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def unCheckedImage(value: ReactElement): this.type = set("unCheckedImage", value.asInstanceOf[js.Any])
    @scala.inline
    def uncheckedCheckBoxColor(value: String): this.type = set("uncheckedCheckBoxColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(isChecked: Boolean, onClick: () => Unit): Builder = {
    val __props = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckBoxProps]))
  }
}

