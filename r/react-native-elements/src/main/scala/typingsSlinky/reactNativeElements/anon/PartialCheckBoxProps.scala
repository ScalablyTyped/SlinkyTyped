package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.IconType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.CheckBoxProps> */
@js.native
trait PartialCheckBoxProps extends StObject {
  
  var Component: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var center: js.UndefOr[Boolean] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var checkedColor: js.UndefOr[String] = js.native
  
  var checkedIcon: js.UndefOr[String | ReactElement] = js.native
  
  var checkedTitle: js.UndefOr[String] = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var iconRight: js.UndefOr[Boolean] = js.native
  
  var iconType: js.UndefOr[IconType] = js.native
  
  var onIconPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLongIconPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var right: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var title: js.UndefOr[String | ReactElement] = js.native
  
  var titleProps: js.UndefOr[PartialTextProperties] = js.native
  
  var uncheckedColor: js.UndefOr[String] = js.native
  
  var uncheckedIcon: js.UndefOr[String | ReactElement] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object PartialCheckBoxProps {
  
  @scala.inline
  def apply(): PartialCheckBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckBoxProps]
  }
  
  @scala.inline
  implicit class PartialCheckBoxPropsMutableBuilder[Self <: PartialCheckBoxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedColor(value: String): Self = StObject.set(x, "checkedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedColorUndefined: Self = StObject.set(x, "checkedColor", js.undefined)
    
    @scala.inline
    def setCheckedIcon(value: String | ReactElement): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedIconReactElement(value: ReactElement): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
    
    @scala.inline
    def setCheckedTitle(value: String): Self = StObject.set(x, "checkedTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedTitleUndefined: Self = StObject.set(x, "checkedTitle", js.undefined)
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setIconRight(value: Boolean): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
    
    @scala.inline
    def setIconType(value: IconType): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    @scala.inline
    def setOnIconPress(value: () => Unit): Self = StObject.set(x, "onIconPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnIconPressUndefined: Self = StObject.set(x, "onIconPress", js.undefined)
    
    @scala.inline
    def setOnLongIconPress(value: () => Unit): Self = StObject.set(x, "onLongIconPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLongIconPressUndefined: Self = StObject.set(x, "onLongIconPress", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleProps(value: PartialTextProperties): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUncheckedColor(value: String): Self = StObject.set(x, "uncheckedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedColorUndefined: Self = StObject.set(x, "uncheckedColor", js.undefined)
    
    @scala.inline
    def setUncheckedIcon(value: String | ReactElement): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedIconReactElement(value: ReactElement): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
