package typingsSlinky.fastCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parserTypesMod {
  type AsyncRowTransform = js.Function2[
    /* row */ typingsSlinky.fastCsv.parserTypesMod.Row, 
    /* cb */ typingsSlinky.fastCsv.parserTypesMod.RowTransformCallback, 
    scala.Unit
  ]
  type AsyncRowValidate = js.Function2[
    /* row */ typingsSlinky.fastCsv.parserTypesMod.Row, 
    /* cb */ typingsSlinky.fastCsv.parserTypesMod.RowValidateCallback, 
    scala.Unit
  ]
  type HeaderArray = js.Array[js.UndefOr[java.lang.String | scala.Null]]
  type HeaderTransformFunction = js.Function1[
    /* headers */ typingsSlinky.fastCsv.parserTypesMod.HeaderArray, 
    typingsSlinky.fastCsv.parserTypesMod.HeaderArray
  ]
  type RowArray = js.Array[java.lang.String]
  type RowMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RowTransformCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* row */ js.UndefOr[typingsSlinky.fastCsv.parserTypesMod.Row], 
    scala.Unit
  ]
  type RowValidateCallback = js.Function3[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* isValid */ js.UndefOr[scala.Boolean], 
    /* reason */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type RowValidatorCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* result */ js.UndefOr[typingsSlinky.fastCsv.parserTypesMod.RowValidationResult], 
    scala.Unit
  ]
  type SyncRowTransform = js.Function1[
    /* row */ typingsSlinky.fastCsv.parserTypesMod.Row, 
    typingsSlinky.fastCsv.parserTypesMod.Row
  ]
  type SyncRowValidate = js.Function1[/* row */ typingsSlinky.fastCsv.parserTypesMod.Row, scala.Boolean]
}
