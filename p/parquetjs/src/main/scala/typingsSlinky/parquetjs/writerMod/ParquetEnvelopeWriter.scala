package typingsSlinky.parquetjs.writerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.WriteStream
import typingsSlinky.parquetjs.anon.Columns
import typingsSlinky.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typingsSlinky.parquetjs.schemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter")
@js.native
class ParquetEnvelopeWriter protected () extends js.Object {
  def this(
    schema: ParquetSchema,
    writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
    closeFn: js.Function0[js.Promise[Unit]],
    fileOffset: Double
  ) = this()
  def this(
    schema: ParquetSchema,
    writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
    closeFn: js.Function0[js.Promise[Unit]],
    fileOffset: Double,
    opts: String
  ) = this()
  def this(
    schema: ParquetSchema,
    writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
    closeFn: js.Function0[js.Promise[Unit]],
    fileOffset: Double,
    opts: ParquetWriterOpts
  ) = this()
  
  def close(): js.Promise[Unit] = js.native
  
  var offset: Double = js.native
  
  var pageSize: Double = js.native
  
  var rowCount: Double = js.native
  
  var rowGroups: js.Array[Columns] = js.native
  
  var schema: ParquetSchema = js.native
  
  def setPageSize(cnt: Double): Unit = js.native
  
  var useDataPageV2: Boolean = js.native
  
  def write(buf: Buffer): js.Promise[Unit] = js.native
  
  def writeFooter(userMetadata: StringDictionary[String]): js.Promise[Unit] = js.native
  
  def writeHeader(): js.Promise[Unit] = js.native
  
  def writeRowGroup(records: RowBufferInterface): js.Promise[Unit] = js.native
  
  def writeSection(buf: Buffer): js.Promise[Unit] = js.native
}
/* static members */
@JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter")
@js.native
object ParquetEnvelopeWriter extends js.Object {
  
  def openStream(schema: ParquetSchema, outputStream: WriteStream): js.Promise[ParquetEnvelopeWriter] = js.native
  def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[ParquetEnvelopeWriter] = js.native
  def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: ParquetWriterOpts): js.Promise[ParquetEnvelopeWriter] = js.native
}
