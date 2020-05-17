package typingsSlinky.fastCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type RowArray = js.Array[java.lang.String]
  type RowHashArray = js.Array[js.Tuple2[java.lang.String, js.Any]]
  type RowMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RowTransformCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* row */ js.UndefOr[typingsSlinky.fastCsv.typesMod.Row], 
    scala.Unit
  ]
}
