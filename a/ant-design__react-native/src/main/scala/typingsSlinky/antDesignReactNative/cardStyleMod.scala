package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardStyleMod {
  
  @JSImport("@ant-design/react-native/lib/card/style", JSImport.Default)
  @js.native
  def default(theme: Theme): CardStyle = js.native
  
  @js.native
  trait CardStyle extends StObject {
    
    var body: ViewStyle = js.native
    
    var card: ViewStyle = js.native
    
    var footerContent: TextStyle = js.native
    
    var footerExtra: TextStyle = js.native
    
    var footerWrap: ViewStyle = js.native
    
    var full: ViewStyle = js.native
    
    var headerContent: TextStyle = js.native
    
    var headerContentWrap: ViewStyle = js.native
    
    var headerExtra: TextStyle = js.native
    
    var headerExtraWrap: ViewStyle = js.native
    
    var headerImage: ImageStyle = js.native
    
    var headerTitle: ViewStyle = js.native
    
    var headerWrap: ViewStyle = js.native
  }
  object CardStyle {
    
    @scala.inline
    def apply(
      body: ViewStyle,
      card: ViewStyle,
      footerContent: TextStyle,
      footerExtra: TextStyle,
      footerWrap: ViewStyle,
      full: ViewStyle,
      headerContent: TextStyle,
      headerContentWrap: ViewStyle,
      headerExtra: TextStyle,
      headerExtraWrap: ViewStyle,
      headerImage: ImageStyle,
      headerTitle: ViewStyle,
      headerWrap: ViewStyle
    ): CardStyle = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerContentWrap = headerContentWrap.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerExtraWrap = headerExtraWrap.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardStyle]
    }
    
    @scala.inline
    implicit class CardStyleMutableBuilder[Self <: CardStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: ViewStyle): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCard(value: ViewStyle): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterContent(value: TextStyle): Self = StObject.set(x, "footerContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterExtra(value: TextStyle): Self = StObject.set(x, "footerExtra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterWrap(value: ViewStyle): Self = StObject.set(x, "footerWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull(value: ViewStyle): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderContent(value: TextStyle): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderContentWrap(value: ViewStyle): Self = StObject.set(x, "headerContentWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderExtra(value: TextStyle): Self = StObject.set(x, "headerExtra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderExtraWrap(value: ViewStyle): Self = StObject.set(x, "headerExtraWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderImage(value: ImageStyle): Self = StObject.set(x, "headerImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTitle(value: ViewStyle): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderWrap(value: ViewStyle): Self = StObject.set(x, "headerWrap", value.asInstanceOf[js.Any])
    }
  }
}
