package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/card/style.CardStyle, 'headerContentWrap' | 'headerContent' | 'headerExtraWrap' | 'headerExtra' | 'headerImage' | 'headerTitle' | 'headerWrap'> */
@js.native
trait PickCardStyleheaderConten extends StObject {
  
  var headerContent: TextStyle = js.native
  
  var headerContentWrap: ViewStyle = js.native
  
  var headerExtra: TextStyle = js.native
  
  var headerExtraWrap: ViewStyle = js.native
  
  var headerImage: ImageStyle = js.native
  
  var headerTitle: ViewStyle = js.native
  
  var headerWrap: ViewStyle = js.native
}
object PickCardStyleheaderConten {
  
  @scala.inline
  def apply(
    headerContent: TextStyle,
    headerContentWrap: ViewStyle,
    headerExtra: TextStyle,
    headerExtraWrap: ViewStyle,
    headerImage: ImageStyle,
    headerTitle: ViewStyle,
    headerWrap: ViewStyle
  ): PickCardStyleheaderConten = {
    val __obj = js.Dynamic.literal(headerContent = headerContent.asInstanceOf[js.Any], headerContentWrap = headerContentWrap.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerExtraWrap = headerExtraWrap.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCardStyleheaderConten]
  }
  
  @scala.inline
  implicit class PickCardStyleheaderContenMutableBuilder[Self <: PickCardStyleheaderConten] (val x: Self) extends AnyVal {
    
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
