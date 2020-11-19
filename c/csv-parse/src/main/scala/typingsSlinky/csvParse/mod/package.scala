package typingsSlinky.csvParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* records */ js.UndefOr[js.Any], 
    /* info */ typingsSlinky.csvParse.mod.Info, 
    scala.Unit
  ]
  
  type CastingDateFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typingsSlinky.csvParse.mod.CastingContext, 
    js.Date
  ]
  
  type CastingFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typingsSlinky.csvParse.mod.CastingContext, 
    js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.csvParse.csvParseBooleans.`false`
    - typingsSlinky.csvParse.anon.Name
  */
  type ColumnOption = js.UndefOr[typingsSlinky.csvParse.mod._ColumnOption | java.lang.String | scala.Null]
}
