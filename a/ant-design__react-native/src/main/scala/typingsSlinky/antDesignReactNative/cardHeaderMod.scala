package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.PickCardStyleheaderConten
import typingsSlinky.antDesignReactNative.anon.ThumbStyle
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderMod {
  
  @JSImport("@ant-design/react-native/lib/card/CardHeader", JSImport.Default)
  @js.native
  class default () extends CardHeader
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/card/CardHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/card/CardHeader", "default.defaultProps")
    @js.native
    def defaultProps: ThumbStyle = js.native
    @scala.inline
    def defaultProps_=(x: ThumbStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardHeader
    extends Component[CardHeaderProps, js.Any, js.Any]
  
  @js.native
  trait CardHeaderProps extends CardHeaderPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var thumbStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
  }
  object CardHeaderProps {
    
    @scala.inline
    def apply(): CardHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderProps]
    }
    
    @scala.inline
    implicit class CardHeaderPropsMutableBuilder[Self <: CardHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setThumbStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
      
      @scala.inline
      def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    }
  }
  
  @js.native
  trait CardHeaderPropsType extends WithThemeStyles[PickCardStyleheaderConten] {
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    /** need url of img, if this is string. */
    var thumb: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object CardHeaderPropsType {
    
    @scala.inline
    def apply(): CardHeaderPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderPropsType]
    }
    
    @scala.inline
    implicit class CardHeaderPropsTypeMutableBuilder[Self <: CardHeaderPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setThumb(value: ReactElement): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbReactElement(value: ReactElement): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
