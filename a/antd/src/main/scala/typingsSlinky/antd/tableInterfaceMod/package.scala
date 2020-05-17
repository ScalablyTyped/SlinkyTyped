package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableInterfaceMod {
  type ColumnsType[RecordType] = js.Array[
    typingsSlinky.antd.tableInterfaceMod.ColumnGroupType[RecordType] | typingsSlinky.antd.tableInterfaceMod.ColumnType[RecordType]
  ]
  type CompareFn[T] = js.Function3[
    /* a */ T, 
    /* b */ T, 
    /* sortOrder */ js.UndefOr[typingsSlinky.antd.tableInterfaceMod.SortOrder], 
    scala.Double
  ]
  type GetPopupContainer = js.Function1[/* triggerNode */ org.scalajs.dom.raw.HTMLElement, org.scalajs.dom.raw.HTMLElement]
  type Key = typingsSlinky.react.mod.Key
  type SelectionItemSelectFn = js.Function1[
    /* currentRowKeys */ js.Array[typingsSlinky.antd.tableInterfaceMod.Key], 
    scala.Unit
  ]
  type SelectionSelectFn[T] = js.Function4[
    /* record */ T, 
    /* selected */ scala.Boolean, 
    /* selectedRows */ js.Array[js.Object], 
    /* nativeEvent */ org.scalajs.dom.raw.Event, 
    scala.Unit
  ]
  type TransformColumns[RecordType] = js.Function1[
    /* columns */ typingsSlinky.antd.tableInterfaceMod.ColumnsType[RecordType], 
    typingsSlinky.antd.tableInterfaceMod.ColumnsType[RecordType]
  ]
}
