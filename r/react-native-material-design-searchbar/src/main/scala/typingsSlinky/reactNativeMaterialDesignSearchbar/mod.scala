package typingsSlinky.reactNativeMaterialDesignSearchbar

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ReturnKeyType
import typingsSlinky.reactNative.mod.ReturnKeyTypeAndroid
import typingsSlinky.reactNative.mod.ReturnKeyTypeIOS
import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-material-design-searchbar", JSImport.Default)
  @js.native
  class default ()
    extends Component[SearchBarProps, js.Any, js.Any]
  
  type SearchBar = ReactComponentClass[SearchBarProps]
  
  @js.native
  trait SearchBarProps extends StObject {
    
    var alwaysShowBackButton: js.UndefOr[Boolean] = js.native
    
    var autoCorrect: js.UndefOr[Boolean] = js.native
    
    var height: Double = js.native
    
    var iconBackName: js.UndefOr[String] = js.native
    
    var iconCloseName: js.UndefOr[String] = js.native
    
    var iconColor: js.UndefOr[String] = js.native
    
    var iconPadding: js.UndefOr[Double] = js.native
    
    var iconSearchName: js.UndefOr[String] = js.native
    
    var iconSize: js.UndefOr[Double] = js.native
    
    var inputProps: js.UndefOr[TextInputProps] = js.native
    
    var inputStyle: js.UndefOr[TextStyle] = js.native
    
    var onBackPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onEndEditing: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSearchChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
    
    var onSubmitEditing: js.UndefOr[js.Function0[Unit]] = js.native
    
    var padding: js.UndefOr[Double] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var placeholderColor: js.UndefOr[String] = js.native
    
    var returnKeyType: js.UndefOr[ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS] = js.native
    
    var textStyle: js.UndefOr[TextStyle] = js.native
  }
  object SearchBarProps {
    
    @scala.inline
    def apply(height: Double): SearchBarProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchBarProps]
    }
    
    @scala.inline
    implicit class SearchBarPropsMutableBuilder[Self <: SearchBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowBackButton(value: Boolean): Self = StObject.set(x, "alwaysShowBackButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowBackButtonUndefined: Self = StObject.set(x, "alwaysShowBackButton", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconBackName(value: String): Self = StObject.set(x, "iconBackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconBackNameUndefined: Self = StObject.set(x, "iconBackName", js.undefined)
      
      @scala.inline
      def setIconCloseName(value: String): Self = StObject.set(x, "iconCloseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconCloseNameUndefined: Self = StObject.set(x, "iconCloseName", js.undefined)
      
      @scala.inline
      def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      @scala.inline
      def setIconPadding(value: Double): Self = StObject.set(x, "iconPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPaddingUndefined: Self = StObject.set(x, "iconPadding", js.undefined)
      
      @scala.inline
      def setIconSearchName(value: String): Self = StObject.set(x, "iconSearchName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSearchNameUndefined: Self = StObject.set(x, "iconSearchName", js.undefined)
      
      @scala.inline
      def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      @scala.inline
      def setInputProps(value: TextInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setInputStyle(value: TextStyle): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setOnBackPress(value: () => Unit): Self = StObject.set(x, "onBackPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBackPressUndefined: Self = StObject.set(x, "onBackPress", js.undefined)
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnEndEditing(value: () => Unit): Self = StObject.set(x, "onEndEditing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEndEditingUndefined: Self = StObject.set(x, "onEndEditing", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnSearchChange(value: /* text */ String => Unit): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
      
      @scala.inline
      def setOnSubmitEditing(value: () => Unit): Self = StObject.set(x, "onSubmitEditing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderColor(value: String): Self = StObject.set(x, "placeholderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderColorUndefined: Self = StObject.set(x, "placeholderColor", js.undefined)
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReturnKeyType(value: ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
}
