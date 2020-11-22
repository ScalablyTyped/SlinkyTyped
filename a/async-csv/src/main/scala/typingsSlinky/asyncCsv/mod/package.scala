package typingsSlinky.asyncCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Cast[T] = js.Function2[
    /* value */ T, 
    /* context */ typingsSlinky.asyncCsv.mod.CastingContext, 
    java.lang.String
  ]
  
  type CastingDateFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typingsSlinky.asyncCsv.mod.CastingContext, 
    js.Date
  ]
  
  type CastingFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typingsSlinky.asyncCsv.mod.CastingContext, 
    js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.asyncCsv.asyncCsvBooleans.`false`
    - typingsSlinky.asyncCsv.anon.Name
  */
  type ColumnOption = js.UndefOr[typingsSlinky.asyncCsv.mod._ColumnOption | java.lang.String | scala.Null]
  
  type ParseColumnOption = js.UndefOr[java.lang.String | scala.Null]
  
  type PlainObject[T] = typingsSlinky.std.Record[java.lang.String, T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.node.Buffer
    - typingsSlinky.asyncCsv.asyncCsvStrings.auto
    - typingsSlinky.asyncCsv.asyncCsvStrings.unix
    - typingsSlinky.asyncCsv.asyncCsvStrings.mac
    - typingsSlinky.asyncCsv.asyncCsvStrings.windows
    - typingsSlinky.asyncCsv.asyncCsvStrings.ascii
    - typingsSlinky.asyncCsv.asyncCsvStrings.unicode
  */
  type RecordDelimiter = typingsSlinky.asyncCsv.mod._RecordDelimiter | java.lang.String | typingsSlinky.node.Buffer
}
