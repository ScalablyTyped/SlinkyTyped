package typingsSlinky.parquetjs.writerMod

import typingsSlinky.node.streamMod.Transform
import typingsSlinky.parquetjs.rowInterfaceMod.RowInterface
import typingsSlinky.parquetjs.schemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/writer", "ParquetTransformer")
@js.native
class ParquetTransformer protected () extends Transform {
  def this(schema: ParquetSchema) = this()
  def this(schema: ParquetSchema, opts: String) = this()
  def this(schema: ParquetSchema, opts: ParquetWriterOpts) = this()
  var writer: ParquetWriter = js.native
  def _flush(callback: js.Function0[Unit]): Unit = js.native
  def _transform(row: RowInterface, encoding: js.UndefOr[Null | String], callback: js.Function0[Unit]): Unit = js.native
}

