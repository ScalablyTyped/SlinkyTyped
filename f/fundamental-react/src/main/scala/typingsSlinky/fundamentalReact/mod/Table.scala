package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialTableProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapTablePro
import typingsSlinky.fundamentalReact.tableMod.TableProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "Table")
@js.native
object Table extends js.Object {
  
  def apply(props: PropsWithChildren[TableProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TableProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialTableProps] = js.native
  
  var displayName: js.UndefOr[String | typingsSlinky.fundamentalReact.fundamentalReactStrings.Table] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapTablePro] = js.native
}
