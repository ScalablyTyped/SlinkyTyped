package typingsSlinky.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type ColumnsType[RecordType] = js.Array[
    typingsSlinky.rcTable.interfaceMod.ColumnGroupType[RecordType] | typingsSlinky.rcTable.interfaceMod.ColumnType[RecordType]
  ]
  type CustomizeComponent = typingsSlinky.rcTable.interfaceMod.Component[js.Any]
  type CustomizeScrollBody[RecordType] = js.Function2[
    /* data */ js.Array[RecordType], 
    /* info */ typingsSlinky.rcTable.anon.OnScroll, 
    slinky.core.TagMod[scala.Any]
  ]
  type DefaultRecordType = typingsSlinky.std.Record[java.lang.String, js.Any]
  type ExpandedRowRender[ValueType] = js.Function4[
    /* record */ ValueType, 
    /* index */ scala.Double, 
    /* indent */ scala.Double, 
    /* expanded */ scala.Boolean, 
    slinky.core.TagMod[scala.Any]
  ]
  type GetComponent = js.Function2[
    /* path */ js.Array[java.lang.String], 
    /* defaultComponent */ js.UndefOr[typingsSlinky.rcTable.interfaceMod.CustomizeComponent], 
    typingsSlinky.rcTable.interfaceMod.CustomizeComponent
  ]
  type GetComponentProps[DataType] = js.Function2[
    /* data */ DataType, 
    /* index */ js.UndefOr[scala.Double], 
    typingsSlinky.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]
  ]
  type GetRowKey[RecordType] = js.Function2[
    /* record */ RecordType, 
    /* index */ js.UndefOr[scala.Double], 
    typingsSlinky.rcTable.interfaceMod.Key
  ]
  type Key = typingsSlinky.react.mod.Key
  type PanelRender[RecordType] = js.Function1[/* data */ js.Array[RecordType], slinky.core.TagMod[scala.Any]]
  type RenderExpandIcon[RecordType] = js.Function1[
    /* props */ typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps[RecordType], 
    slinky.core.TagMod[scala.Any]
  ]
  type RowClassName[RecordType] = js.Function3[
    /* record */ RecordType, 
    /* index */ scala.Double, 
    /* indent */ scala.Double, 
    java.lang.String
  ]
  type TriggerEventHandler[RecordType] = js.Function2[
    /* record */ RecordType, 
    /* event */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
}
