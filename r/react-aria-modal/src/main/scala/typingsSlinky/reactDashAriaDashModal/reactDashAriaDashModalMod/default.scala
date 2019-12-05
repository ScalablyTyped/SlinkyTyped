package typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalStrings.titleId
import typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalStrings.titleText
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-aria-modal", JSImport.Default)
@js.native
class default ()
  extends Component[
      AriaModalProps with (RequiredAriaTypes[Pick[AriaModalProps, titleId], Pick[AriaModalProps, titleText]]), 
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

