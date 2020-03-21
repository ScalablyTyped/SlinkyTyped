package typingsSlinky.fundamentalReact.menuMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.FunctionComponentMenuGrou
import typingsSlinky.fundamentalReact.FunctionComponentMenuItem
import typingsSlinky.fundamentalReact.FunctionComponentMenuList
import typingsSlinky.fundamentalReact.PartialMenuProps
import typingsSlinky.fundamentalReact.WeakValidationMapMenuProp
import typingsSlinky.fundamentalReact.fundamentalReactStrings.Menu
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Menu/Menu", JSImport.Default)
@js.native
object default extends js.Object {
  var Group: FunctionComponentMenuGrou = js.native
  var Item: FunctionComponentMenuItem = js.native
  var List: FunctionComponentMenuList = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialMenuProps] = js.native
  var displayName: js.UndefOr[Menu | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapMenuProp] = js.native
  def apply(props: PropsWithChildren[MenuProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MenuProps], context: js.Any): ReactElement | Null = js.native
}

