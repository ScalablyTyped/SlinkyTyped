package typingsSlinky.cliTable2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Cell = typingsSlinky.cliTable2.mod.CellValue | typingsSlinky.cliTable2.mod.CellOptions
  
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  
  type CrossTable = typingsSlinky.cliTable2.mod.GenericTable[typingsSlinky.cliTable2.mod.CrossTableRow]
  
  type CrossTableRow = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.cliTable2.mod.Cell]]
  
  type HorizontalTable = typingsSlinky.cliTable2.mod.GenericTable[typingsSlinky.cliTable2.mod.HorizontalTableRow]
  
  type HorizontalTableRow = js.Array[typingsSlinky.cliTable2.mod.Cell]
  
  type Table = typingsSlinky.cliTable2.mod.HorizontalTable | typingsSlinky.cliTable2.mod.VerticalTable | typingsSlinky.cliTable2.mod.CrossTable
  
  type VerticalTable = typingsSlinky.cliTable2.mod.GenericTable[typingsSlinky.cliTable2.mod.VerticalTableRow]
  
  type VerticalTableRow = org.scalablytyped.runtime.StringDictionary[typingsSlinky.cliTable2.mod.Cell]
}
