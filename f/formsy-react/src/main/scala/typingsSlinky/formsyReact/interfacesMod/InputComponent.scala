package typingsSlinky.formsyReact.interfacesMod

import typingsSlinky.formsyReact.withFormsyMod.WrapperProps
import typingsSlinky.formsyReact.withFormsyMod.WrapperState
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputComponent[V]
  extends Component[WrapperProps[V], WrapperState[V], js.Any] {
  var requiredValidations: js.UndefOr[Validations[V]] = js.native
  var validations: js.UndefOr[Validations[V]] = js.native
}

