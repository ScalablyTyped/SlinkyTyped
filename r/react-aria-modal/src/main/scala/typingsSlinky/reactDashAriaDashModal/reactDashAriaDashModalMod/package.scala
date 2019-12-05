package typingsSlinky.reactDashAriaDashModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAriaDashModalMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalStrings.titleId
  import typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalStrings.titleText
  import typingsSlinky.std.Pick

  type AriaModal = ReactComponentClass[
    AriaModalProps with (RequiredAriaTypes[Pick[AriaModalProps, titleId], Pick[AriaModalProps, titleText]])
  ]
  type RequiredAriaTypes[T, U] = (typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalStrings.RequiredAriaTypes with T with js.Any) | (typingsSlinky.reactDashAriaDashModal.reactDashAriaDashModalStrings.RequiredAriaTypes with js.Any with U)
}
