package typingsSlinky.rcTable

import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.anon.Columns
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.ColumnsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useColumnsMod {
  
  /**
    * Parse `columns` & `children` into `columns`.
    */
  @JSImport("rc-table/lib/hooks/useColumns", JSImport.Default)
  @js.native
  def default[RecordType](
    hasPrefixClsColumnsChildrenExpandableExpandedKeysGetRowKeyOnTriggerExpandExpandIconRowExpandableExpandIconColumnIndexDirectionExpandRowByClick: Columns[RecordType],
    transformColumns: js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]
  ): js.Tuple2[ColumnsType[RecordType], js.Array[ColumnType[RecordType]]] = js.native
  
  @JSImport("rc-table/lib/hooks/useColumns", "convertChildrenToColumns")
  @js.native
  def convertChildrenToColumns[RecordType](children: ReactElement): ColumnsType[RecordType] = js.native
}
