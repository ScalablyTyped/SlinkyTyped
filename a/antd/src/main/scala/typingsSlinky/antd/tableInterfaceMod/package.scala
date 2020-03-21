package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableInterfaceMod {
  type ColumnTitle[RecordType] = slinky.core.TagMod[scala.Any] | (js.Function1[
    /* props */ typingsSlinky.antd.tableInterfaceMod.ColumnTitleProps[RecordType], 
    slinky.core.TagMod[scala.Any]
  ])
  type ColumnsType[RecordType] = js.Array[
    typingsSlinky.antd.tableInterfaceMod.ColumnGroupType[RecordType] | typingsSlinky.antd.tableInterfaceMod.ColumnType[RecordType]
  ]
  type CompareFn[T] = js.Function3[
    /* a */ T, 
    /* b */ T, 
    /* sortOrder */ js.UndefOr[typingsSlinky.antd.tableInterfaceMod.SortOrder], 
    scala.Double
  ]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsSlinky.antd.antdStrings.row
    - typingsSlinky.antd.antdStrings.nest
  */
  type ExpandType = typingsSlinky.antd.tableInterfaceMod._ExpandType | scala.Null
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
    /* nativeEvent */ typingsSlinky.std.Event_, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.descend
    - typingsSlinky.antd.antdStrings.ascend
    - scala.Null
  */
  type SortOrder = typingsSlinky.antd.tableInterfaceMod._SortOrder | scala.Null
  type TransformColumns[RecordType] = js.Function1[
    /* columns */ typingsSlinky.antd.tableInterfaceMod.ColumnsType[RecordType], 
    typingsSlinky.antd.tableInterfaceMod.ColumnsType[RecordType]
  ]
}
