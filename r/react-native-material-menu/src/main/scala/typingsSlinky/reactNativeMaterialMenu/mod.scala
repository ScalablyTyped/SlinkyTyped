package typingsSlinky.reactNativeMaterialMenu

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.clip
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.head
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.middle
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-material-menu", JSImport.Default)
  @js.native
  class default () extends Menu
  
  @JSImport("react-native-material-menu", "MenuDivider")
  @js.native
  class MenuDivider protected ()
    extends Component[MenuDividerProps, js.Object, js.Any] {
    def this(props: MenuDividerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuDividerProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-material-menu", "MenuItem")
  @js.native
  class MenuItem protected ()
    extends Component[MenuItemProps, js.Object, js.Any] {
    def this(props: MenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuItemProps, context: js.Any) = this()
  }
  
  @js.native
  trait Menu
    extends Component[MenuProps, js.Object, js.Any] {
    
    def hide(): js.Object = js.native
    
    def show(): js.Object = js.native
  }
  
  @js.native
  trait MenuDividerProps extends StObject {
    
    var color: js.UndefOr[String] = js.native
  }
  object MenuDividerProps {
    
    @scala.inline
    def apply(): MenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuDividerProps]
    }
    
    @scala.inline
    implicit class MenuDividerPropsMutableBuilder[Self <: MenuDividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  @js.native
  trait MenuItemProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledTextColor: js.UndefOr[String] = js.native
    
    var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.native
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var testID: js.UndefOr[String] = js.native
    
    var textStyle: js.UndefOr[TextStyle] = js.native
    
    var underlayColor: js.UndefOr[String] = js.native
  }
  object MenuItemProps {
    
    @scala.inline
    def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledTextColor(value: String): Self = StObject.set(x, "disabledTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledTextColorUndefined: Self = StObject.set(x, "disabledTextColor", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  @js.native
  trait MenuProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var button: js.UndefOr[ReactElement] = js.native
    
    var onHidden: js.UndefOr[js.Function0[Unit]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var testID: js.UndefOr[String] = js.native
  }
  object MenuProps {
    
    @scala.inline
    def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    @scala.inline
    implicit class MenuPropsMutableBuilder[Self <: MenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setButton(value: ReactElement): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setOnHidden(value: () => Unit): Self = StObject.set(x, "onHidden", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    }
  }
}
