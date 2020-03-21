package typingsSlinky.cathoQuantum

import slinky.core.ReactComponentClass
import typingsSlinky.cathoQuantum.buttonMod.ButtonProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@catho/quantum/SocialButton", JSImport.Namespace)
@js.native
object socialButtonMod extends js.Object {
  @js.native
  trait SocialButtonProps extends ButtonProps {
    var provider: String = js.native
  }
  
  @js.native
  class default ()
    extends Component[SocialButtonProps, js.Object, js.Any]
  
  type SocialButton = ReactComponentClass[SocialButtonProps]
}

