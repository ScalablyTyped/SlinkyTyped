package typingsSlinky.cathoQuantum

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.reset
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.submit
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.cathoQuantum.iconButtonMod.IconButton
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@catho/quantum/Button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  @js.native
  trait ButtonProps extends js.Object {
    @JSName("$as")
    var $as: js.UndefOr[ReactElement | String] = js.native
    var center: js.UndefOr[Boolean] = js.native
    var children: js.UndefOr[js.Array[TagMod[Any]] | TagMod[Any]] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var full: js.UndefOr[Boolean] = js.native
    var icon: js.UndefOr[String] = js.native
    var id: js.UndefOr[String] = js.native
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
    var skin: js.UndefOr[neutral | primary | secondary | success | warning | error] = js.native
    var stroked: js.UndefOr[Boolean] = js.native
    var theme: js.UndefOr[AnonBreakpoints] = js.native
    var `type`: js.UndefOr[button | reset | submit] = js.native
  }
  
  @js.native
  class default ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Icon: IconButton = js.native
  }
  
  type Button = ReactComponentClass[ButtonProps]
}

