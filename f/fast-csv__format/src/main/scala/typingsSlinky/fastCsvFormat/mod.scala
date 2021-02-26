package typingsSlinky.fastCsvFormat

import typingsSlinky.fastCsvFormat.formatterOptionsMod.FormatterOptionsArgs
import typingsSlinky.fastCsvFormat.typesMod.Row
import typingsSlinky.fastCsvFormat.typesMod.RowTransformFunction
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fast-csv/format", "CsvFormatterStream")
  @js.native
  class CsvFormatterStream[I /* <: Row */, O /* <: Row */] protected ()
    extends typingsSlinky.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] {
    def this(formatterOptions: typingsSlinky.fastCsvFormat.formatterOptionsMod.FormatterOptions[I, O]) = this()
  }
  
  @JSImport("@fast-csv/format", "FormatterOptions")
  @js.native
  class FormatterOptions[I /* <: Row */, O /* <: Row */] ()
    extends typingsSlinky.fastCsvFormat.formatterOptionsMod.FormatterOptions[I, O] {
    def this(opts: FormatterOptionsArgs[I, O]) = this()
  }
  
  @JSImport("@fast-csv/format", "format")
  @js.native
  def format[I /* <: Row */, O /* <: Row */](): typingsSlinky.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  @JSImport("@fast-csv/format", "format")
  @js.native
  def format[I /* <: Row */, O /* <: Row */](options: FormatterOptionsArgs[I, O]): typingsSlinky.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  
  @JSImport("@fast-csv/format", "isSyncTransform")
  @js.native
  def isSyncTransform[I /* <: Row */, O /* <: Row */](transform: RowTransformFunction[I, O]): /* is @fast-csv/format.@fast-csv/format/build/src/types.SyncRowTransform<I, O> */ Boolean = js.native
  
  @JSImport("@fast-csv/format", "write")
  @js.native
  def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): typingsSlinky.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  @JSImport("@fast-csv/format", "write")
  @js.native
  def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): typingsSlinky.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  
  @JSImport("@fast-csv/format", "writeToBuffer")
  @js.native
  def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[Buffer] = js.native
  @JSImport("@fast-csv/format", "writeToBuffer")
  @js.native
  def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I], opts: FormatterOptionsArgs[I, O]): js.Promise[Buffer] = js.native
  
  @JSImport("@fast-csv/format", "writeToPath")
  @js.native
  def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I]): WriteStream = js.native
  @JSImport("@fast-csv/format", "writeToPath")
  @js.native
  def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): WriteStream = js.native
  
  @JSImport("@fast-csv/format", "writeToStream")
  @js.native
  def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I]): T = js.native
  @JSImport("@fast-csv/format", "writeToStream")
  @js.native
  def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): T = js.native
  
  @JSImport("@fast-csv/format", "writeToString")
  @js.native
  def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[String] = js.native
  @JSImport("@fast-csv/format", "writeToString")
  @js.native
  def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): js.Promise[String] = js.native
}
