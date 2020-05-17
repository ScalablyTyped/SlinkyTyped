package typingsSlinky.reactAriaModal.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactAriaModal.anon.PickAriaModalPropstitleId
import typingsSlinky.reactAriaModal.anon.PickAriaModalPropstitleTe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-aria-modal", JSImport.Default)
@js.native
class default ()
  extends Component[
      AriaModalProps with (RequiredAriaTypes[PickAriaModalPropstitleId, PickAriaModalPropstitleTe]), 
      js.Object, 
      js.Any
    ]

/* static members */
@JSImport("react-aria-modal", JSImport.Default)
@js.native
object default extends js.Object {
  def renderTo(node: String): ReactComponentClass[_] = js.native
  def renderTo(node: HTMLElement): ReactComponentClass[_] = js.native
}

