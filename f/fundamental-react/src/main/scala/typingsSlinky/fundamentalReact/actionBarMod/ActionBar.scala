package typingsSlinky.fundamentalReact.actionBarMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.FunctionComponentActionBa
import typingsSlinky.fundamentalReact.FunctionComponentActionBaCall
import typingsSlinky.fundamentalReact.FunctionComponentActionBaContextTypes
import typingsSlinky.fundamentalReact.PartialActionBarProps
import typingsSlinky.fundamentalReact.WeakValidationMapActionBa
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/ActionBar/ActionBar", "ActionBar")
@js.native
object ActionBar extends js.Object {
  var Actions: FunctionComponentActionBa = js.native
  var Back: FunctionComponentActionBaCall = js.native
  var Header: FunctionComponentActionBaContextTypes = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialActionBarProps] = js.native
  var displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.ActionBar | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapActionBa] = js.native
  def apply(props: PropsWithChildren[ActionBarProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ActionBarProps], context: js.Any): ReactElement | Null = js.native
}

