package typingsSlinky.expoVectorIcons

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.expoVectorIcons.createIconSetMod.Icon
import typingsSlinky.expoVectorIcons.createIconSetMod.IconButtonProps
import typingsSlinky.expoVectorIcons.createIconSetMod.IconProps
import typingsSlinky.expoVectorIcons.expoVectorIconsStrings.evilicons
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evilIconsMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@expo/vector-icons/build/EvilIcons", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[IconProps[String], js.Object, js.Any] {
    def this(props: IconProps[String]) = this()
  }
  object default extends Shortcut {
    
    @JSImport("@expo/vector-icons/build/EvilIcons", JSImport.Default)
    @js.native
    val ^ : Icon[String, evilicons] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@expo/vector-icons/build/EvilIcons", "default.Button")
    @js.native
    class Button protected ()
      extends Component[IconButtonProps[String], js.Object, js.Any] {
      def this(props: IconButtonProps[String]) = this()
      def this(props: IconButtonProps[String], context: js.Any) = this()
    }
    
    type _To = Icon[String, evilicons]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Icon[String, evilicons] = ^
  }
}
