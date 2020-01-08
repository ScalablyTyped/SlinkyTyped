package typingsSlinky.parquetjs

import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.WriteStream
import typingsSlinky.parquetjs.libMetadataDotInterfaceMod.MetadataInterface
import typingsSlinky.parquetjs.libRowBufferDotInterfaceMod.RowBufferInterface
import typingsSlinky.parquetjs.libRowDotInterfaceMod.RowInterface
import typingsSlinky.parquetjs.libSchemaDotInterfaceMod.SchemaInterface
import typingsSlinky.parquetjs.libWriterMod.ParquetWriterOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/parquet", JSImport.Namespace)
@js.native
object parquetMod extends js.Object {
  @js.native
  class ParquetEnvelopeReader protected ()
    extends typingsSlinky.parquetjs.libReaderMod.ParquetEnvelopeReader {
    def this(
      readFn: js.Function3[
            /* fd */ Double, 
            /* position */ Double, 
            /* length */ Double, 
            js.Promise[Buffer | js.Error]
          ],
      closeFn: js.Function1[/* fd */ Double, js.Promise[js.Error]],
      fileSize: Double
    ) = this()
  }
  
  @js.native
  class ParquetEnvelopeWriter protected ()
    extends typingsSlinky.parquetjs.libWriterMod.ParquetEnvelopeWriter {
    def this(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double
    ) = this()
    def this(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: String
    ) = this()
    def this(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: ParquetWriterOpts
    ) = this()
  }
  
  @js.native
  class ParquetReader protected ()
    extends typingsSlinky.parquetjs.libReaderMod.ParquetReader {
    def this(
      metadata: MetadataInterface,
      envelopeReader: typingsSlinky.parquetjs.libReaderMod.ParquetEnvelopeReader
    ) = this()
  }
  
  @js.native
  class ParquetSchema protected ()
    extends typingsSlinky.parquetjs.libSchemaMod.ParquetSchema {
    def this(schema: SchemaInterface) = this()
  }
  
  @js.native
  class ParquetTransformer protected ()
    extends typingsSlinky.parquetjs.libWriterMod.ParquetTransformer {
    def this(schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema) = this()
    def this(schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema, opts: String) = this()
    def this(schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema, opts: ParquetWriterOpts) = this()
  }
  
  @js.native
  class ParquetWriter protected ()
    extends typingsSlinky.parquetjs.libWriterMod.ParquetWriter {
    def this(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      envelopeWriter: typingsSlinky.parquetjs.libWriterMod.ParquetEnvelopeWriter
    ) = this()
    def this(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      envelopeWriter: typingsSlinky.parquetjs.libWriterMod.ParquetEnvelopeWriter,
      opts: String
    ) = this()
    def this(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      envelopeWriter: typingsSlinky.parquetjs.libWriterMod.ParquetEnvelopeWriter,
      opts: ParquetWriterOpts
    ) = this()
  }
  
  /* static members */
  @js.native
  object ParquetEnvelopeReader extends js.Object {
    def openFile(filePath: String): typingsSlinky.parquetjs.libReaderMod.ParquetReader = js.native
  }
  
  /* static members */
  @js.native
  object ParquetEnvelopeWriter extends js.Object {
    def openStream(schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typingsSlinky.parquetjs.libWriterMod.ParquetEnvelopeWriter] = js.native
    def openStream(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: String
    ): js.Promise[typingsSlinky.parquetjs.libWriterMod.ParquetEnvelopeWriter] = js.native
    def openStream(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typingsSlinky.parquetjs.libWriterMod.ParquetEnvelopeWriter] = js.native
  }
  
  /* static members */
  @js.native
  object ParquetReader extends js.Object {
    def openFile(filePath: String): js.Promise[typingsSlinky.parquetjs.libReaderMod.ParquetReader] = js.native
  }
  
  @js.native
  object ParquetShredder extends js.Object {
    def materializeRecords(schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema, buffer: RowBufferInterface): Unit = js.native
    def shredRecord(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      record: RowInterface,
      buffer: RowBufferInterface
    ): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ParquetWriter extends js.Object {
    def openFile(schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema, path: PathLike): js.Promise[typingsSlinky.parquetjs.libWriterMod.ParquetWriter] = js.native
    def openFile(schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema, path: PathLike, opts: String): js.Promise[typingsSlinky.parquetjs.libWriterMod.ParquetWriter] = js.native
    def openFile(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      path: PathLike,
      opts: ParquetWriterOpts
    ): js.Promise[typingsSlinky.parquetjs.libWriterMod.ParquetWriter] = js.native
    def openStream(schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typingsSlinky.parquetjs.libWriterMod.ParquetWriter] = js.native
    def openStream(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: String
    ): js.Promise[typingsSlinky.parquetjs.libWriterMod.ParquetWriter] = js.native
    def openStream(
      schema: typingsSlinky.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typingsSlinky.parquetjs.libWriterMod.ParquetWriter] = js.native
  }
  
}

