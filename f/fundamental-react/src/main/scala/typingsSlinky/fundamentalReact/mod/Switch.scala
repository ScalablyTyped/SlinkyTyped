package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialSwitchProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapSwitchPr
import typingsSlinky.fundamentalReact.switchMod.SwitchProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Switch")
@js.native
object Switch extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialSwitchProps] = js.native
  var displayName: js.UndefOr[String | typingsSlinky.fundamentalReact.fundamentalReactStrings.Switch] = js.native
  var propTypes: js.UndefOr[WeakValidationMapSwitchPr] = js.native
  def apply(props: PropsWithChildren[SwitchProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[SwitchProps], context: js.Any): ReactElement | Null = js.native
}

