package typingsSlinky.reactNativeModalFilterPicker.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.FlatListProps
import typingsSlinky.reactNative.mod.KeyboardAvoidingView
import typingsSlinky.reactNative.mod.ListViewProps
import typingsSlinky.reactNative.mod.ModalProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalFilterPicker.mod.ModalFilterPickerOption
import typingsSlinky.reactNativeModalFilterPicker.mod.ModalFilterPickerProps
import typingsSlinky.reactNativeModalFilterPicker.mod.default
import typingsSlinky.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.always
import typingsSlinky.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.handle
import typingsSlinky.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.never
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeModalFilterPicker {
  
  @scala.inline
  def apply[T /* <: ModalFilterPickerOption */](onCancel: () => Unit, onSelect: String => Unit, options: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelect = js.Any.fromFunction1(onSelect), options = options.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ModalFilterPickerProps[T]]))
  }
  
  @JSImport("react-native-modal-filter-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T /* <: ModalFilterPickerOption */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[T]] {
    
    @scala.inline
    def androidUnderlineColor(value: String): this.type = set("androidUnderlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelButtonStyle(value: StyleProp[ViewStyle]): this.type = set("cancelButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelButtonStyleNull: this.type = set("cancelButtonStyle", null)
    
    @scala.inline
    def cancelButtonText(value: String): this.type = set("cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelButtonTextStyle(value: StyleProp[TextStyle]): this.type = set("cancelButtonTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelButtonTextStyleNull: this.type = set("cancelButtonTextStyle", null)
    
    @scala.inline
    def cancelContainerStyle(value: StyleProp[ViewStyle]): this.type = set("cancelContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelContainerStyleNull: this.type = set("cancelContainerStyle", null)
    
    @scala.inline
    def filterTextInputContainerStyle(value: StyleProp[ViewStyle]): this.type = set("filterTextInputContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterTextInputContainerStyleNull: this.type = set("filterTextInputContainerStyle", null)
    
    @scala.inline
    def filterTextInputStyle(value: StyleProp[TextStyle]): this.type = set("filterTextInputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterTextInputStyleNull: this.type = set("filterTextInputStyle", null)
    
    @scala.inline
    def keyboardShouldPersistTaps(value: never | always | handle): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listContainerStyle(value: StyleProp[ViewStyle]): this.type = set("listContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listContainerStyleNull: this.type = set("listContainerStyle", null)
    
    @scala.inline
    def listViewProps(value: Partial[ListViewProps | FlatListProps[T]]): this.type = set("listViewProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modal(value: ModalProps): this.type = set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noResultsText(value: String): this.type = set("noResultsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def optionTextStyle(value: StyleProp[TextStyle]): this.type = set("optionTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def optionTextStyleNull: this.type = set("optionTextStyle", null)
    
    @scala.inline
    def overlayStyle(value: StyleProp[KeyboardAvoidingView | ViewStyle]): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayStyleNull: this.type = set("overlayStyle", null)
    
    @scala.inline
    def placeholderText(value: String): this.type = set("placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholderTextColor(value: String): this.type = set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderCancelButton(value: () => ReactElement): this.type = set("renderCancelButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderList(value: () => ReactElement): this.type = set("renderList", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderOption(value: (T, /* isSelected */ Boolean) => ReactElement): this.type = set("renderOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def selectedOption(value: String): this.type = set("selectedOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedOptionTextStyle(value: StyleProp[TextStyle]): this.type = set("selectedOptionTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedOptionTextStyleNull: this.type = set("selectedOptionTextStyle", null)
    
    @scala.inline
    def showFilter(value: Boolean): this.type = set("showFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleTextStyle(value: StyleProp[TextStyle]): this.type = set("titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleTextStyleNull: this.type = set("titleTextStyle", null)
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: ModalFilterPickerOption */](p: ModalFilterPickerProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
