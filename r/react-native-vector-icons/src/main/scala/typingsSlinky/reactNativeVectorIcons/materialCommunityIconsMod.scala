package typingsSlinky.reactNativeVectorIcons

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeVectorIcons.iconMod.Icon
import typingsSlinky.reactNativeVectorIcons.iconMod.IconButtonProps
import typingsSlinky.reactNativeVectorIcons.iconMod.ImageSource
import typingsSlinky.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typingsSlinky.reactNativeVectorIcons.iconMod.ToolbarAndroidProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-vector-icons/MaterialCommunityIcons", JSImport.Namespace)
@js.native
object materialCommunityIconsMod extends js.Object {
  
  @js.native
  class default () extends Icon
  /* static members */
  @js.native
  object default extends js.Object {
    
    def getImageSource(name: String): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: js.UndefOr[scala.Nothing], color: String): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
    
    def getRawGlyphMap(): StringDictionary[Double] = js.native
    
    def hasIcon(name: String): Boolean = js.native
    
    def loadFont(): js.Promise[Unit] = js.native
    def loadFont(file: String): js.Promise[Unit] = js.native
    
    @js.native
    class Button ()
      extends Component[IconButtonProps, js.Any, js.Any]
    
    @js.native
    class TabBarItem ()
      extends Component[TabBarItemIOSProps, js.Any, js.Any]
    
    @js.native
    class TabBarItemIOS ()
      extends Component[TabBarItemIOSProps, js.Any, js.Any]
    
    @js.native
    class ToolbarAndroid ()
      extends Component[ToolbarAndroidProps, js.Any, js.Any]
  }
}
