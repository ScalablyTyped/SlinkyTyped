package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialSelectProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapSelectPr
import typingsSlinky.fundamentalReact.selectMod.SelectProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Select")
@js.native
object Select extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialSelectProps] = js.native
  var displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Select | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapSelectPr] = js.native
  def apply(props: PropsWithChildren[SelectProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[SelectProps], context: js.Any): ReactElement | Null = js.native
}

