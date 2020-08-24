package typingsSlinky.fastCsvFormat

import typingsSlinky.fastCsvFormat.formatterOptionsMod.FormatterOptions
import typingsSlinky.fastCsvFormat.typesMod.Row
import typingsSlinky.fastCsvFormat.typesMod.RowTransformFunction
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/format/build/src/CsvFormatterStream", JSImport.Namespace)
@js.native
object csvFormatterStreamMod extends js.Object {
  @js.native
  class CsvFormatterStream[I /* <: Row */, O /* <: Row */] protected () extends Transform {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
    var formatterOptions: js.Any = js.native
    var hasWrittenBOM: js.Any = js.native
    var rowFormatter: js.Any = js.native
    def _transform(row: I, encoding: String, cb: TransformCallback): Unit = js.native
    def transform(transformFunction: RowTransformFunction[I, O]): CsvFormatterStream[I, O] = js.native
  }
  
}

