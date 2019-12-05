package typingsSlinky.fastDashCsv

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fastDashCsv.buildSrcFormatterTypesMod.Row
import typingsSlinky.fastDashCsv.buildSrcFormatterTypesMod.RowArray
import typingsSlinky.fastDashCsv.buildSrcFormatterTypesMod.RowHashArray
import typingsSlinky.fastDashCsv.buildSrcFormatterTypesMod.RowMap
import typingsSlinky.fastDashCsv.buildSrcFormatterTypesMod.RowTransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter/types", JSImport.Namespace)
@js.native
object buildSrcFormatterTypesMod extends js.Object {
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

