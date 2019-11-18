package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.antd.esTableCreateStoreMod.Store
import typingsSlinky.antd.esTableInterfaceMod.CheckboxPropsCache
import typingsSlinky.antd.esTableInterfaceMod.TableProps
import typingsSlinky.antd.esTableTableMod.StoreTable
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/table/Table", JSImport.Namespace)
@js.native
object esTableTableMod extends js.Object {
  @js.native
  trait StoreTable[T]
    extends Component[OmitTablePropsTkeyofWithStore[T], js.Object, js.Any] {
    var CheckboxPropsCache: typingsSlinky.antd.esTableInterfaceMod.CheckboxPropsCache = js.native
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
    var Column: Instantiable0[typingsSlinky.antd.esTableColumnMod.default[js.Object]] = js.native
    var ColumnGroup: TypeofClassColumnGroup = js.native
    var displayName: String = js.native
  }
  
}

