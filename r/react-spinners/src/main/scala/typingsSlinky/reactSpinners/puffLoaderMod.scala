package typingsSlinky.reactSpinners

import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactSpinners.interfacesMod.LengthType
import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeProps
import typingsSlinky.reactSpinners.interfacesMod.PrecompiledCss
import typingsSlinky.reactSpinners.interfacesMod.StyleFunction
import typingsSlinky.reactSpinners.interfacesMod.StyleFunctionWithIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puffLoaderMod {
  
  @JSImport("react-spinners/PuffLoader", JSImport.Default)
  @js.native
  class default () extends Loader
  object default {
    
    /* static member */
    /* Inlined std.Required<react-spinners.react-spinners/interfaces.LoaderSizeProps> */
    object defaultProps {
      
      @JSImport("react-spinners/PuffLoader", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-spinners/PuffLoader", "default.defaultProps.color")
      @js.native
      def color: String = js.native
      @scala.inline
      def color_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
      
      @JSImport("react-spinners/PuffLoader", "default.defaultProps.css")
      @js.native
      def css: String | PrecompiledCss = js.native
      @scala.inline
      def css_=(x: String | PrecompiledCss): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("css")(x.asInstanceOf[js.Any])
      
      @JSImport("react-spinners/PuffLoader", "default.defaultProps.loading")
      @js.native
      def loading: Boolean = js.native
      @scala.inline
      def loading_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loading")(x.asInstanceOf[js.Any])
      
      @JSImport("react-spinners/PuffLoader", "default.defaultProps.size")
      @js.native
      def size: LengthType = js.native
      @scala.inline
      def size_=(x: LengthType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeProps, js.Object, js.Any] {
    
    var style: StyleFunctionWithIndex = js.native
    
    var wrapper: StyleFunction = js.native
  }
}
