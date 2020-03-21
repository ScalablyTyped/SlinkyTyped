package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.FunctionComponentListGrou
import typingsSlinky.fundamentalReact.FunctionComponentListGrouCall
import typingsSlinky.fundamentalReact.FunctionComponentListGrouContextTypes
import typingsSlinky.fundamentalReact.PartialListGroupProps
import typingsSlinky.fundamentalReact.WeakValidationMapListGrou
import typingsSlinky.fundamentalReact.listGroupMod.ListGroupProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "ListGroup")
@js.native
object ListGroup extends js.Object {
  var Item: FunctionComponentListGrou = js.native
  var ItemActions: FunctionComponentListGrouCall = js.native
  var ItemCheckbox: FunctionComponentListGrouContextTypes = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialListGroupProps] = js.native
  var displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.ListGroup | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapListGrou] = js.native
  def apply(props: PropsWithChildren[ListGroupProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListGroupProps], context: js.Any): ReactElement | Null = js.native
}

