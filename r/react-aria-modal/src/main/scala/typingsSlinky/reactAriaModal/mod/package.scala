package typingsSlinky.reactAriaModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AriaModal = slinky.core.ReactComponentClass[
    typingsSlinky.reactAriaModal.mod.AriaModalProps with (typingsSlinky.reactAriaModal.mod.RequiredAriaTypes[
      typingsSlinky.reactAriaModal.PickAriaModalPropstitleId, 
      typingsSlinky.reactAriaModal.PickAriaModalPropstitleTe
    ])
  ]
  type RequiredAriaTypes[T, U] = (typingsSlinky.reactAriaModal.reactAriaModalStrings.RequiredAriaTypes with T with js.Any) | (typingsSlinky.reactAriaModal.reactAriaModalStrings.RequiredAriaTypes with js.Any with U)
}
