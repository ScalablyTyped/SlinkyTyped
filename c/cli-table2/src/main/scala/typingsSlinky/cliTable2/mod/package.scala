package typingsSlinky.cliTable2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CrossTable = typingsSlinky.cliTable2.mod.GenericTable[typingsSlinky.cliTable2.mod.CrossTableRow]
  type CrossTableRow = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.cliTable2.mod.Cell]]
  type HorizontalTable = typingsSlinky.cliTable2.mod.GenericTable[typingsSlinky.cliTable2.mod.HorizontalTableRow]
  type HorizontalTableRow = js.Array[typingsSlinky.cliTable2.mod.Cell]
  type VerticalTable = typingsSlinky.cliTable2.mod.GenericTable[typingsSlinky.cliTable2.mod.VerticalTableRow]
  type VerticalTableRow = org.scalablytyped.runtime.StringDictionary[typingsSlinky.cliTable2.mod.Cell]
}
