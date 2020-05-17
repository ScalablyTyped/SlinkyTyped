package typingsSlinky.fundamentalReact.listMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.FunctionComponentListFoot
import typingsSlinky.fundamentalReact.anon.FunctionComponentListHead
import typingsSlinky.fundamentalReact.anon.FunctionComponentListIcon
import typingsSlinky.fundamentalReact.anon.FunctionComponentListItem
import typingsSlinky.fundamentalReact.anon.FunctionComponentListText
import typingsSlinky.fundamentalReact.anon.PartialListProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapListProp
import typingsSlinky.fundamentalReact.fundamentalReactStrings.List
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/List/List", JSImport.Default)
@js.native
object default extends js.Object {
  var Footer: FunctionComponentListFoot = js.native
  var Header: FunctionComponentListHead = js.native
  var Icon: FunctionComponentListIcon = js.native
  var Item: FunctionComponentListItem = js.native
  var Text: FunctionComponentListText = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialListProps] = js.native
  var displayName: js.UndefOr[List | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapListProp] = js.native
  def apply(props: PropsWithChildren[ListProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListProps], context: js.Any): ReactElement | Null = js.native
}

