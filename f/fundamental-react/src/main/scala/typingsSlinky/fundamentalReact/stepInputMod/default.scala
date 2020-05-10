package typingsSlinky.fundamentalReact.stepInputMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.PartialStepInputProps
import typingsSlinky.fundamentalReact.WeakValidationMapStepInpu
import typingsSlinky.fundamentalReact.fundamentalReactStrings.StepInput
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/StepInput/StepInput", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialStepInputProps] = js.native
  var displayName: js.UndefOr[StepInput | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapStepInpu] = js.native
  def apply(props: PropsWithChildren[StepInputProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[StepInputProps], context: js.Any): ReactElement | Null = js.native
}

