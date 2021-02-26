package typingsSlinky.reactNativeVectorIcons

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeVectorIcons.iconMod.Icon
import typingsSlinky.reactNativeVectorIcons.iconMod.IconButtonProps
import typingsSlinky.reactNativeVectorIcons.iconMod.IconProps
import typingsSlinky.reactNativeVectorIcons.iconMod.ImageSource
import typingsSlinky.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typingsSlinky.reactNativeVectorIcons.iconMod.ToolbarAndroidProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entypoMod {
  
  @JSImport("react-native-vector-icons/Entypo", JSImport.Default)
  @js.native
  class default protected () extends Icon {
    def this(props: IconProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-vector-icons/Entypo", "default.Button")
    @js.native
    class Button protected ()
      extends typingsSlinky.reactNativeVectorIcons.iconMod.Icon.Button {
      def this(props: IconButtonProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: IconButtonProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Entypo", "default.TabBarItem")
    @js.native
    class TabBarItem protected ()
      extends typingsSlinky.reactNativeVectorIcons.iconMod.Icon.TabBarItem {
      def this(props: TabBarItemIOSProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabBarItemIOSProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Entypo", "default.TabBarItemIOS")
    @js.native
    class TabBarItemIOS protected ()
      extends typingsSlinky.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS {
      def this(props: TabBarItemIOSProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabBarItemIOSProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Entypo", "default.ToolbarAndroid")
    @js.native
    class ToolbarAndroid protected ()
      extends typingsSlinky.reactNativeVectorIcons.iconMod.Icon.ToolbarAndroid {
      def this(props: ToolbarAndroidProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ToolbarAndroidProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Entypo", "default.getImageSource")
    @js.native
    def getImageSource(name: String): js.Promise[ImageSource] = js.native
    @JSImport("react-native-vector-icons/Entypo", "default.getImageSource")
    @js.native
    def getImageSource(name: String, size: js.UndefOr[scala.Nothing], color: String): js.Promise[ImageSource] = js.native
    @JSImport("react-native-vector-icons/Entypo", "default.getImageSource")
    @js.native
    def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
    @JSImport("react-native-vector-icons/Entypo", "default.getImageSource")
    @js.native
    def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
    
    @JSImport("react-native-vector-icons/Entypo", "default.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String): ImageSource = js.native
    @JSImport("react-native-vector-icons/Entypo", "default.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String, size: js.UndefOr[scala.Nothing], color: String): ImageSource = js.native
    @JSImport("react-native-vector-icons/Entypo", "default.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String, size: Double): ImageSource = js.native
    @JSImport("react-native-vector-icons/Entypo", "default.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String, size: Double, color: String): ImageSource = js.native
    
    @JSImport("react-native-vector-icons/Entypo", "default.getRawGlyphMap")
    @js.native
    def getRawGlyphMap(): StringDictionary[Double] = js.native
    
    @JSImport("react-native-vector-icons/Entypo", "default.hasIcon")
    @js.native
    def hasIcon(name: String): Boolean = js.native
    
    @JSImport("react-native-vector-icons/Entypo", "default.loadFont")
    @js.native
    def loadFont(): js.Promise[Unit] = js.native
    @JSImport("react-native-vector-icons/Entypo", "default.loadFont")
    @js.native
    def loadFont(file: String): js.Promise[Unit] = js.native
  }
}
