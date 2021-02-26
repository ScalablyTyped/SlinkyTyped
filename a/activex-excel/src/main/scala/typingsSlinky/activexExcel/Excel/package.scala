package typingsSlinky.activexExcel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Excel {
  
  type AddIns2 = typingsSlinky.activexExcel.Excel.AddIns
  
  type InternationalResult[T] = scala.Boolean | scala.Double | java.lang.String
  
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
  
  type PivotTableWizardAutoPage[TSourceType] = js.UndefOr[scala.Boolean]
  
  type PivotTableWizardSourceData[TSourceType] = js.UndefOr[
    typingsSlinky.activexExcel.Excel.Range | (typingsSlinky.std.SafeArray[typingsSlinky.activexExcel.Excel.Range | java.lang.String]) | java.lang.String
  ]
  
  type PrintToFileName[T] = js.UndefOr[java.lang.String]
  
  type XlCreator = typingsSlinky.activexExcel.activexExcelNumbers.`1480803660`
  
  type XlDataLabelSeparator = typingsSlinky.activexExcel.activexExcelNumbers.`1`
}
