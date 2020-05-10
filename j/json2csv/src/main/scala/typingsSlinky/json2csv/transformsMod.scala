package typingsSlinky.json2csv

import typingsSlinky.json2csv.baseMod.Json2CsvTransform
import typingsSlinky.json2csv.flattenMod.FlattenOptions
import typingsSlinky.json2csv.unwindMod.UnwindOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv/transforms", JSImport.Namespace)
@js.native
object transformsMod extends js.Object {
  def flatten(): Json2CsvTransform[_, _] = js.native
  def flatten(options: FlattenOptions): Json2CsvTransform[_, _] = js.native
  def unwind(): Json2CsvTransform[_, js.Array[_]] = js.native
  def unwind(options: UnwindOptions): Json2CsvTransform[_, js.Array[_]] = js.native
}

