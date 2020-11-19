package typingsSlinky.handsontable.mod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object search {
  
  type SearchCallback = js.Function5[
    /* instance */ typingsSlinky.handsontable.mod.Handsontable, 
    /* row */ scala.Double, 
    /* column */ scala.Double, 
    /* value */ typingsSlinky.handsontable.mod.Handsontable.CellValue, 
    /* result */ scala.Boolean, 
    scala.Unit
  ]
  
  type SearchQueryMethod = js.Function3[
    /* queryStr */ java.lang.String, 
    /* value */ typingsSlinky.handsontable.mod.Handsontable.CellValue, 
    /* cellProperties */ typingsSlinky.handsontable.mod.Handsontable.CellProperties, 
    scala.Boolean
  ]
}
