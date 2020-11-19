package typingsSlinky.fastCsvParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AsyncRowTransform[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */] = js.Function2[
    /* row */ I, 
    /* cb */ typingsSlinky.fastCsvParse.typesMod.RowTransformCallback[O], 
    scala.Unit
  ]
  
  type AsyncRowValidate[R /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */] = js.Function2[
    /* row */ R, 
    /* cb */ typingsSlinky.fastCsvParse.typesMod.RowValidateCallback, 
    scala.Unit
  ]
  
  type HeaderArray = js.Array[js.UndefOr[java.lang.String | scala.Null]]
  
  type HeaderTransformFunction = js.Function1[
    /* headers */ typingsSlinky.fastCsvParse.typesMod.HeaderArray, 
    typingsSlinky.fastCsvParse.typesMod.HeaderArray
  ]
  
  type Row[V] = typingsSlinky.fastCsvParse.typesMod.RowMap[V] | typingsSlinky.fastCsvParse.typesMod.RowArray[V]
  
  type RowArray[V] = js.Array[V]
  
  type RowMap[V] = typingsSlinky.std.Record[java.lang.String, V]
  
  type RowTransformCallback[R /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */] = js.Function2[/* error */ js.UndefOr[js.Error | scala.Null], /* row */ js.UndefOr[R], scala.Unit]
  
  type RowTransformFunction[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */] = (typingsSlinky.fastCsvParse.typesMod.SyncRowTransform[I, O]) | (typingsSlinky.fastCsvParse.typesMod.AsyncRowTransform[I, O])
  
  type RowValidate[R /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */] = typingsSlinky.fastCsvParse.typesMod.AsyncRowValidate[R] | typingsSlinky.fastCsvParse.typesMod.SyncRowValidate[R]
  
  type RowValidateCallback = js.Function3[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* isValid */ js.UndefOr[scala.Boolean], 
    /* reason */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type RowValidatorCallback[R /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */] = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* result */ js.UndefOr[typingsSlinky.fastCsvParse.typesMod.RowValidationResult[R]], 
    scala.Unit
  ]
  
  type SyncRowTransform[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */] = js.Function1[/* row */ I, O]
  
  type SyncRowValidate[R /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */] = js.Function1[/* row */ R, scala.Boolean]
}
