package typingsSlinky.reactNativeCommunityPicker

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeCommunityPicker.reactNativeCommunityPickerStrings.dialog
import typingsSlinky.reactNativeCommunityPicker.reactNativeCommunityPickerStrings.dropdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMod {
  
  @JSImport("@react-native-community/picker/typings/Picker", "Picker")
  @js.native
  class Picker protected ()
    extends Component[PickerProps, js.Object, js.Any] {
    def this(props: PickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerProps, context: js.Any) = this()
  }
  object Picker {
    
    @JSImport("@react-native-community/picker/typings/Picker", "Picker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@react-native-community/picker/typings/Picker", "Picker.Item")
    @js.native
    def Item: ReactComponentClass[PickerItemProps] = js.native
    @scala.inline
    def Item_=(x: ReactComponentClass[PickerItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dialog.
      */
    /* static member */
    @JSImport("@react-native-community/picker/typings/Picker", "Picker.MODE_DIALOG")
    @js.native
    def MODE_DIALOG: String = js.native
    @scala.inline
    def MODE_DIALOG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DIALOG")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dropdown (this is the default).
      */
    /* static member */
    @JSImport("@react-native-community/picker/typings/Picker", "Picker.MODE_DROPDOWN")
    @js.native
    def MODE_DROPDOWN: String = js.native
    @scala.inline
    def MODE_DROPDOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DROPDOWN")(x.asInstanceOf[js.Any])
  }
  
  type ItemValue = Double | String
  
  @js.native
  trait PickerItemProps extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var testID: js.UndefOr[String] = js.native
    
    var value: ItemValue = js.native
  }
  object PickerItemProps {
    
    @scala.inline
    def apply(value: ItemValue): PickerItemProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerItemProps]
    }
    
    @scala.inline
    implicit class PickerItemPropsMutableBuilder[Self <: PickerItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setValue(value: ItemValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PickerProps extends ViewProps {
    
    /**
      * If set to false, the picker will be disabled, i.e. the user will not be able to make a
      * selection.
      * @platform android
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Style to apply to each of the item labels.
      * @platform ios
      */
    var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    /**
      * On Android, specifies how to display the selection items when the user taps on the picker:
      *
      *   - 'dialog': Show a modal dialog. This is the default.
      *   - 'dropdown': Shows a dropdown anchored to the picker view
      *
      * @platform android
      */
    var mode: js.UndefOr[dialog | dropdown] = js.native
    
    /**
      * Callback for when an item is selected. This is called with the following parameters:
      *   - `itemValue`: the `value` prop of the item that was selected
      *   - `itemIndex`: the index of the selected item in this picker
      */
    var onValueChange: js.UndefOr[js.Function2[/* itemValue */ ItemValue, /* itemIndex */ Double, Unit]] = js.native
    
    /**
      * Prompt string for this picker, used on Android in dialog mode as the title of the dialog.
      * @platform android
      */
    var prompt: js.UndefOr[String] = js.native
    
    /**
      * Value matching value of one of the items. Can be a string or an integer.
      */
    var selectedValue: js.UndefOr[ItemValue] = js.native
    
    @JSName("style")
    var style_PickerProps: js.UndefOr[StyleProp[TextStyle]] = js.native
  }
  object PickerProps {
    
    @scala.inline
    def apply(): PickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerProps]
    }
    
    @scala.inline
    implicit class PickerPropsMutableBuilder[Self <: PickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setMode(value: dialog | dropdown): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* itemValue */ ItemValue, /* itemIndex */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: ItemValue): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
