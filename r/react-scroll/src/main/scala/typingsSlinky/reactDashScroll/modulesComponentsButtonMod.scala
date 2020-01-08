package typingsSlinky.reactDashScroll

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.HTMLProps
import typingsSlinky.reactDashScroll.modulesComponentsLinkMod.ReactScrollLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-scroll/modules/components/Button", JSImport.Namespace)
@js.native
object modulesComponentsButtonMod extends js.Object {
  @js.native
  class default ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  type Button = ReactComponentClass[ButtonProps]
  type ButtonProps = ReactScrollLinkProps with HTMLProps[HTMLButtonElement]
}

