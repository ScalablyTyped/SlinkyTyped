package typingsSlinky.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Buffer = js.typedarray.ArrayBuffer
  type DefinedNamesModel = js.Array[typingsSlinky.exceljs.mod.DefinedNamesRanges]
  type DocumentType = typingsSlinky.exceljs.exceljsNumbers.`1`
  type WorksheetView = typingsSlinky.exceljs.mod.WorksheetViewCommon with (typingsSlinky.exceljs.mod.WorksheetViewNormal | typingsSlinky.exceljs.mod.WorksheetViewFrozen | typingsSlinky.exceljs.mod.WorksheetViewSplit)
}
