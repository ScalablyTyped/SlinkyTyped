package typingsSlinky.reactMaterialUiFormValidator.components

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Menus.DropDownMenuProps
import typingsSlinky.materialUi.MaterialUI.SelectFieldProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectValidator {
  
  @JSImport("react-material-ui-form-validator", "SelectValidator")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMaterialUiFormValidator.mod.SelectValidator] {
    
    @scala.inline
    def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropDownMenuProps(value: DropDownMenuProps): this.type = set("dropDownMenuProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorMessagesVarargs(value: js.Any*): this.type = set("errorMessages", js.Array(value :_*))
    
    @scala.inline
    def errorMessages(value: js.Array[_] | String): this.type = set("errorMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorStyle(value: CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorTextReactElement(value: ReactElement): this.type = set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorText(value: ReactElement): this.type = set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelFixed(value: Boolean): this.type = set("floatingLabelFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelStyle(value: CSSProperties): this.type = set("floatingLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelTextReactElement(value: ReactElement): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatingLabelText(value: ReactElement): this.type = set("floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hintStyle(value: CSSProperties): this.type = set("hintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hintTextReactElement(value: ReactElement): this.type = set("hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hintText(value: ReactElement): this.type = set("hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconStyle(value: CSSProperties): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyle(value: CSSProperties): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuItemStyle(value: CSSProperties): this.type = set("menuItemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuStyle(value: js.Any): this.type = set("menuStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(
      value: (/* e */ SyntheticEvent[Event, js.Object], /* index */ Double, /* menuItemValue */ js.Any) => Unit
    ): this.type = set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def openImmediately(value: Boolean): this.type = set("openImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectFieldRoot(value: CSSProperties): this.type = set("selectFieldRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedMenuItemStyle(value: CSSProperties): this.type = set("selectedMenuItemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionRenderer(value: /* value */ js.Any => ReactElement): this.type = set("selectionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineDisabledStyle(value: CSSProperties): this.type = set("underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineFocusStyle(value: CSSProperties): this.type = set("underlineFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineStyle(value: CSSProperties): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validatorListener(value: /* isValid */ Boolean => Unit): this.type = set("validatorListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def validatorsVarargs(value: js.Any*): this.type = set("validators", js.Array(value :_*))
    
    @scala.inline
    def validators(value: js.Array[_]): this.type = set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withRequiredValidator(value: Boolean): this.type = set("withRequiredValidator", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ValidatorComponentProps with SelectFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: String, value: js.Any): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ValidatorComponentProps with SelectFieldProps]))
  }
}
