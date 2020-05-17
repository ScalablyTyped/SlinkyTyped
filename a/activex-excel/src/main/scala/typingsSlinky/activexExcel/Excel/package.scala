package typingsSlinky.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Excel {
  type AddIns2 = typingsSlinky.activexExcel.Excel.AddIns
  type PivotFieldsResult = typingsSlinky.activexExcel.Excel.PivotFields with (js.Function1[
    /* Index */ scala.Double | java.lang.String, 
    typingsSlinky.activexExcel.Excel.PivotField
  ]) with (js.Function1[
    /* Indexes */ typingsSlinky.std.SafeArray[scala.Double | java.lang.String], 
    typingsSlinky.activexExcel.Excel.PivotFields
  ])
  type PivotItemsResult = typingsSlinky.activexExcel.Excel.PivotItems with (js.Function1[
    /* Index */ scala.Double | java.lang.String, 
    typingsSlinky.activexExcel.Excel.PivotItem
  ]) with (js.Function1[
    /* Indexes */ typingsSlinky.std.SafeArray[scala.Double | java.lang.String], 
    typingsSlinky.activexExcel.Excel.PivotItems
  ])
  type XlCreator = typingsSlinky.activexExcel.activexExcelNumbers.`1480803660`
  type XlDataLabelSeparator = typingsSlinky.activexExcel.activexExcelNumbers.`1`
}
