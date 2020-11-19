package typingsSlinky.parquetjs.writerMod

import typingsSlinky.node.streamMod.Transform
import typingsSlinky.parquetjs.rowInterfaceMod.RowInterface
import typingsSlinky.parquetjs.schemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parquetjs/lib/writer", "ParquetTransformer")
@js.native
class ParquetTransformer protected () extends Transform {
  def this(schema: ParquetSchema) = this()
  def this(schema: ParquetSchema, opts: String) = this()
  def this(schema: ParquetSchema, opts: ParquetWriterOpts) = this()
  
  def _flush(callback: js.Function0[Unit]): Unit = js.native
  
  def _transform(row: RowInterface, encoding: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def _transform(row: RowInterface, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def _transform(row: RowInterface, encoding: Null, callback: js.Function0[Unit]): Unit = js.native
  
  var writer: ParquetWriter = js.native
}
