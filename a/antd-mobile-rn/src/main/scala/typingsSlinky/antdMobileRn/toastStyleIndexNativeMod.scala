package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.BackgroundColorMinWidth
import typingsSlinky.antdMobileRn.anon.BackgroundColorString
import typingsSlinky.antdMobileRn.anon.BorderRadiusPadding
import typingsSlinky.antdMobileRn.anon.BorderRadiusPaddingHorizontal
import typingsSlinky.antdMobileRn.anon.BottomJustifyContent
import typingsSlinky.antdMobileRn.anon.HeightMarginBottom
import typingsSlinky.antdMobileRn.anon.JustifyContentPadding
import typingsSlinky.antdMobileRn.anon.`0`
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.centering")
    @js.native
    def centering: JustifyContentPadding = js.native
    @scala.inline
    def centering_=(x: JustifyContentPadding): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("centering")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.container")
    @js.native
    def container: BottomJustifyContent = js.native
    @scala.inline
    def container_=(x: BottomJustifyContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.content")
    @js.native
    def content: `0` = js.native
    @scala.inline
    def content_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.iconToast")
    @js.native
    def iconToast: BorderRadiusPadding = js.native
    @scala.inline
    def iconToast_=(x: BorderRadiusPadding): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iconToast")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.image")
    @js.native
    def image: HeightMarginBottom = js.native
    @scala.inline
    def image_=(x: HeightMarginBottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.innerContainer")
    @js.native
    def innerContainer: BackgroundColorString = js.native
    @scala.inline
    def innerContainer_=(x: BackgroundColorString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.innerWrap")
    @js.native
    def innerWrap: BackgroundColorMinWidth = js.native
    @scala.inline
    def innerWrap_=(x: BackgroundColorMinWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerWrap")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.textToast")
    @js.native
    def textToast: BorderRadiusPaddingHorizontal = js.native
    @scala.inline
    def textToast_=(x: BorderRadiusPaddingHorizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textToast")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IToastStyle extends StObject {
    
    var centering: ViewStyle = js.native
    
    var container: ViewStyle = js.native
    
    var content: TextStyle = js.native
    
    var iconToast: ViewStyle = js.native
    
    var image: ImageStyle = js.native
    
    var innerContainer: ViewStyle = js.native
    
    var innerWrap: ViewStyle = js.native
    
    var textToast: ViewStyle = js.native
  }
  object IToastStyle {
    
    @scala.inline
    def apply(
      centering: ViewStyle,
      container: ViewStyle,
      content: TextStyle,
      iconToast: ViewStyle,
      image: ImageStyle,
      innerContainer: ViewStyle,
      innerWrap: ViewStyle,
      textToast: ViewStyle
    ): IToastStyle = {
      val __obj = js.Dynamic.literal(centering = centering.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], iconToast = iconToast.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], innerWrap = innerWrap.asInstanceOf[js.Any], textToast = textToast.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToastStyle]
    }
    
    @scala.inline
    implicit class IToastStyleMutableBuilder[Self <: IToastStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCentering(value: ViewStyle): Self = StObject.set(x, "centering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: TextStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconToast(value: ViewStyle): Self = StObject.set(x, "iconToast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: ImageStyle): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContainer(value: ViewStyle): Self = StObject.set(x, "innerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerWrap(value: ViewStyle): Self = StObject.set(x, "innerWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextToast(value: ViewStyle): Self = StObject.set(x, "textToast", value.asInstanceOf[js.Any])
    }
  }
}
