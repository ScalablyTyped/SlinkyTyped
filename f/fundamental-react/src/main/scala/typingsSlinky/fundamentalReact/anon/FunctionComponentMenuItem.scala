package typingsSlinky.fundamentalReact.anon

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.fundamentalReactStrings.MenuDotItem
import typingsSlinky.fundamentalReact.menuMod.MenuItemProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuItemProps> & {  displayName :'Menu.Item'} */
@js.native
trait FunctionComponentMenuItem extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialMenuItemProps] = js.native
  var displayName: js.UndefOr[String] with MenuDotItem = js.native
  var propTypes: js.UndefOr[WeakValidationMapMenuItem] = js.native
  def apply(props: PropsWithChildren[MenuItemProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MenuItemProps], context: js.Any): ReactElement | Null = js.native
}

