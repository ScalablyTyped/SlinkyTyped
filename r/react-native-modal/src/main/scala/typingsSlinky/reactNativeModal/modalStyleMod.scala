package typingsSlinky.reactNativeModal

import typingsSlinky.reactNativeModal.anon.BackgroundColor
import typingsSlinky.reactNativeModal.anon.Flex
import typingsSlinky.reactNativeModal.anon.Opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalStyleMod {
  
  object default {
    
    @JSImport("react-native-modal/dist/modal.style", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal/dist/modal.style", "default.backdrop")
    @js.native
    def backdrop: BackgroundColor = js.native
    @scala.inline
    def backdrop_=(x: BackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal/dist/modal.style", "default.containerBox")
    @js.native
    def containerBox: Opacity = js.native
    @scala.inline
    def containerBox_=(x: Opacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("containerBox")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal/dist/modal.style", "default.content")
    @js.native
    def content: Flex = js.native
    @scala.inline
    def content_=(x: Flex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
  }
}
