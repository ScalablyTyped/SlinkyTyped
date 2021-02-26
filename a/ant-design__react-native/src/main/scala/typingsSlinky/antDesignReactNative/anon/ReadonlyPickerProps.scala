package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@ant-design/react-native.@ant-design/react-native/lib/picker/PickerTypes.PickerProps> */
@js.native
trait ReadonlyPickerProps extends StObject {
  
  val defaultSelectedValue: js.UndefOr[js.Any] = js.native
  
  val disabled: js.UndefOr[Boolean] = js.native
  
  val indicatorClassName: js.UndefOr[String] = js.native
  
  val indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  val itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  val noAnimate: js.UndefOr[Boolean] = js.native
  
  val onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  val onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  val selectedValue: js.UndefOr[js.Any] = js.native
  
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object ReadonlyPickerProps {
  
  @scala.inline
  def apply(): ReadonlyPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPickerProps]
  }
  
  @scala.inline
  implicit class ReadonlyPickerPropsMutableBuilder[Self <: ReadonlyPickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSelectedValue(value: js.Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
    
    @scala.inline
    def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
    
    @scala.inline
    def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
    
    @scala.inline
    def setItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
    
    @scala.inline
    def setOnScrollChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
