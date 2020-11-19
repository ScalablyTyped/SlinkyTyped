package typingsSlinky.json2csv.json2csvbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object json2csv {
  
  type FieldValueCallback[T] = typingsSlinky.json2csv.json2csvbaseMod.json2csv.FieldValueCallbackWithoutField[T] | typingsSlinky.json2csv.json2csvbaseMod.json2csv.FieldValueCallbackWithField[T]
  
  type FieldValueCallbackWithField[T] = js.Function2[
    /* row */ T, 
    /* field */ typingsSlinky.json2csv.json2csvbaseMod.json2csv.FieldValueCallbackInfo, 
    js.Any
  ]
  
  type FieldValueCallbackWithoutField[T] = js.Function1[/* row */ T, js.Any]
}
