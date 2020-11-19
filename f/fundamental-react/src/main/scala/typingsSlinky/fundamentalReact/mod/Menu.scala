package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.FunctionComponentMenuGrou
import typingsSlinky.fundamentalReact.anon.FunctionComponentMenuItem
import typingsSlinky.fundamentalReact.anon.FunctionComponentMenuList
import typingsSlinky.fundamentalReact.anon.PartialMenuProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapMenuProp
import typingsSlinky.fundamentalReact.menuMod.MenuProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "Menu")
@js.native
object Menu extends js.Object {
  
  def apply(props: PropsWithChildren[MenuProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MenuProps], context: js.Any): ReactElement | Null = js.native
  
  var Group: FunctionComponentMenuGrou = js.native
  
  var Item: FunctionComponentMenuItem = js.native
  
  var List: FunctionComponentMenuList = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuProps] = js.native
  
  var displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Menu | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuProp] = js.native
}
