package typingsSlinky.cliTable3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Cell = typingsSlinky.cliTable3.mod.CellValue | typingsSlinky.cliTable3.mod.CellOptions
  
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  
  type CrossTable = typingsSlinky.cliTable3.mod.GenericTable[typingsSlinky.cliTable3.mod.CrossTableRow]
  
  type CrossTableRow = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.cliTable3.mod.Cell]]
  
  type HorizontalTable = typingsSlinky.cliTable3.mod.GenericTable[typingsSlinky.cliTable3.mod.HorizontalTableRow]
  
  type HorizontalTableRow = js.Array[typingsSlinky.cliTable3.mod.Cell]
  
  type Table = typingsSlinky.cliTable3.mod.HorizontalTable | typingsSlinky.cliTable3.mod.VerticalTable | typingsSlinky.cliTable3.mod.CrossTable
  
  type VerticalTable = typingsSlinky.cliTable3.mod.GenericTable[typingsSlinky.cliTable3.mod.VerticalTableRow]
  
  type VerticalTableRow = org.scalablytyped.runtime.StringDictionary[typingsSlinky.cliTable3.mod.Cell]
}
