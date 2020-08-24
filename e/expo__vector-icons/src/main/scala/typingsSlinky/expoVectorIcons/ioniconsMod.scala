package typingsSlinky.expoVectorIcons

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.expoVectorIcons.createIconSetMod.Icon
import typingsSlinky.expoVectorIcons.createIconSetMod.IconProps
import typingsSlinky.expoVectorIcons.expoVectorIconsStrings.ionicons
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/vector-icons/build/Ionicons", JSImport.Namespace)
@js.native
object ioniconsMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[IconProps[String], js.Object, js.Any] {
    def this(props: IconProps[String]) = this()
  }
  
  @js.native
  object default extends TopLevel[Icon[String, ionicons]]
  
}

