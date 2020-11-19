package typingsSlinky.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AutoFilter = java.lang.String | typingsSlinky.exceljs.anon.From
  
  type Buffer = js.typedarray.ArrayBuffer
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - typingsSlinky.std.Date
    - typingsSlinky.exceljs.mod.CellErrorValue
    - typingsSlinky.exceljs.mod.CellRichTextValue
    - typingsSlinky.exceljs.mod.CellHyperlinkValue
    - typingsSlinky.exceljs.mod.CellFormulaValue
    - typingsSlinky.exceljs.mod.CellSharedFormulaValue
  */
  type CellValue = typingsSlinky.exceljs.mod._CellValue | scala.Null | scala.Double | java.lang.String | scala.Boolean | js.Date
  
  type DefinedNamesModel = js.Array[typingsSlinky.exceljs.mod.DefinedNamesRanges]
  
  // https://c2fo.io/fast-csv/docs/parsing/options
  type HeaderArray = js.Array[js.UndefOr[java.lang.String | scala.Null]]
  
  type HeaderTransformFunction = js.Function1[
    /* headers */ typingsSlinky.exceljs.mod.HeaderArray, 
    typingsSlinky.exceljs.mod.HeaderArray
  ]
  
  type QuoteColumnMap = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type QuoteColumns = scala.Boolean | js.Array[scala.Boolean] | typingsSlinky.exceljs.mod.QuoteColumnMap
  
  type RowArray = js.Array[java.lang.String]
  
  type RowHashArray = js.Array[js.Tuple2[java.lang.String, js.Any]]
  
  type RowMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type RowTransformCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* row */ js.UndefOr[typingsSlinky.exceljs.mod.Rows], 
    scala.Unit
  ]
  
  type Rows = typingsSlinky.exceljs.mod.RowArray | typingsSlinky.exceljs.mod.RowMap | typingsSlinky.exceljs.mod.RowHashArray
  
  type WorksheetView = typingsSlinky.exceljs.mod.WorksheetViewCommon with (typingsSlinky.exceljs.mod.WorksheetViewNormal | typingsSlinky.exceljs.mod.WorksheetViewFrozen | typingsSlinky.exceljs.mod.WorksheetViewSplit)
}
