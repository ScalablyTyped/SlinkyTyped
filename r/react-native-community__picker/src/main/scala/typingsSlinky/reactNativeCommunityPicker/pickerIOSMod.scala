package typingsSlinky.reactNativeCommunityPicker

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeCommunityPicker.anon.ItemIndex
import typingsSlinky.reactNativeCommunityPicker.pickerMod.ItemValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerIOSMod {
  
  @JSImport("@react-native-community/picker/typings/PickerIOS", "PickerIOS")
  @js.native
  class PickerIOS protected ()
    extends Component[PickerIOSProps, js.Object, js.Any] {
    def this(props: PickerIOSProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerIOSProps, context: js.Any) = this()
  }
  object PickerIOS {
    
    /* was `typeof PickerIOSItem` */
    @JSImport("@react-native-community/picker/typings/PickerIOS", "PickerIOS.Item")
    @js.native
    class Item ()
      extends Component[PickerIOSItemProps, js.Object, js.Any]
  }
  
  type PickerIOSItem = ReactComponentClass[PickerIOSItemProps]
  
  @js.native
  trait PickerIOSItemProps extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var testID: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[Double | String] = js.native
  }
  object PickerIOSItemProps {
    
    @scala.inline
    def apply(): PickerIOSItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerIOSItemProps]
    }
    
    @scala.inline
    implicit class PickerIOSItemPropsMutableBuilder[Self <: PickerIOSItemProps] (val x: Self) extends AnyVal {
      
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
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait PickerIOSProps extends ViewProps {
    
    var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var onChange: js.UndefOr[SyntheticEvent[Event, ItemIndex]] = js.native
    
    var onValueChange: js.UndefOr[js.Function2[/* itemValue */ ItemValue, /* itemIndex */ Double, Unit]] = js.native
    
    var selectedValue: js.UndefOr[ItemValue] = js.native
    
    @JSName("style")
    var style_PickerIOSProps: js.UndefOr[StyleProp[TextStyle]] = js.native
  }
  object PickerIOSProps {
    
    @scala.inline
    def apply(): PickerIOSProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerIOSProps]
    }
    
    @scala.inline
    implicit class PickerIOSPropsMutableBuilder[Self <: PickerIOSProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[Event, ItemIndex]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* itemValue */ ItemValue, /* itemIndex */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
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
