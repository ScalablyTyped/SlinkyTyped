package typingsSlinky.fundamentalReact.anon

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.fundamentalReactStrings.ListDotItem
import typingsSlinky.fundamentalReact.listMod.ListItemProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListItemProps> & {  displayName :'List.Item'} */
@js.native
trait FunctionComponentListItem extends js.Object {
  
  def apply(props: PropsWithChildren[ListItemProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListItemProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialListItemProps] = js.native
  
  var displayName: js.UndefOr[String] with ListDotItem = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListItem] = js.native
}
