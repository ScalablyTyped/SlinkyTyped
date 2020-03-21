package typingsSlinky.fastCsv

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @js.native
  trait RowTransformFunction extends js.Object {
    def apply(row: Row): Row = js.native
    def apply(row: Row, callback: RowTransformCallback): Unit = js.native
  }
  
  type Row = RowArray | RowMap | RowHashArray
  type RowArray = js.Array[String]
  type RowHashArray = js.Array[js.Tuple2[String, js.Any]]
  type RowMap = StringDictionary[js.Any]
  type RowTransformCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* row */ js.UndefOr[Row], Unit]
}

