package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.antd.libTableCreateStoreMod.Store
import typingsSlinky.antd.libTableInterfaceMod.CheckboxPropsCache
import typingsSlinky.antd.libTableInterfaceMod.TableProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/Table", JSImport.Namespace)
@js.native
object libTableTableMod extends js.Object {
  @js.native
  trait StoreTable[T]
    extends Component[TableProps[T], js.Object, js.Any] {
    var CheckboxPropsCache: typingsSlinky.antd.libTableInterfaceMod.CheckboxPropsCache = js.native
    var store: Store = js.native
    def setCheckboxPropsCache(cache: CheckboxPropsCache): CheckboxPropsCache = js.native
  }
  
  @js.native
  class default[T] protected () extends StoreTable[T] {
    def this(props: TableProps[T]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Column: Instantiable0[typingsSlinky.antd.libTableColumnMod.default[js.Object]] = js.native
    var ColumnGroup: TypeofClassColumnGroup = js.native
    var displayName: String = js.native
  }
  
}

