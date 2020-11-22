package typingsSlinky.cliTable3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Cell = typingsSlinky.cliTable3.mod.CellValue | typingsSlinky.cliTable3.mod.CellOptions
  
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  
  type CrossTableRow = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.cliTable3.mod.Cell]]
  
  type HorizontalTableRow = js.Array[typingsSlinky.cliTable3.mod.Cell]
  
  type Table = typingsSlinky.cliTable3.mod.GenericTable[
    typingsSlinky.cliTable3.mod.HorizontalTableRow | typingsSlinky.cliTable3.mod.VerticalTableRow | typingsSlinky.cliTable3.mod.CrossTableRow
  ]
  
  type VerticalTableRow = org.scalablytyped.runtime.StringDictionary[typingsSlinky.cliTable3.mod.Cell]
}
