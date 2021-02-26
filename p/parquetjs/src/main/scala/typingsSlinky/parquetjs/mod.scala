package typingsSlinky.parquetjs

import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.WriteStream
import typingsSlinky.parquetjs.metadataInterfaceMod.MetadataInterface
import typingsSlinky.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typingsSlinky.parquetjs.rowInterfaceMod.RowInterface
import typingsSlinky.parquetjs.schemaInterfaceMod.SchemaInterface
import typingsSlinky.parquetjs.writerMod.ParquetWriterOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parquetjs", "ParquetEnvelopeReader")
  @js.native
  class ParquetEnvelopeReader protected ()
    extends typingsSlinky.parquetjs.readerMod.ParquetEnvelopeReader {
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
  /* static members */
  object ParquetEnvelopeReader {
    
    @JSImport("parquetjs", "ParquetEnvelopeReader.openFile")
    @js.native
    def openFile(filePath: String): typingsSlinky.parquetjs.readerMod.ParquetReader = js.native
  }
  
  @JSImport("parquetjs", "ParquetEnvelopeWriter")
  @js.native
  class ParquetEnvelopeWriter protected ()
    extends typingsSlinky.parquetjs.writerMod.ParquetEnvelopeWriter {
    def this(
      schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double
    ) = this()
    def this(
      schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: String
    ) = this()
    def this(
      schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: ParquetWriterOpts
    ) = this()
  }
  /* static members */
  object ParquetEnvelopeWriter {
    
    @JSImport("parquetjs", "ParquetEnvelopeWriter.openStream")
    @js.native
    def openStream(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typingsSlinky.parquetjs.writerMod.ParquetEnvelopeWriter] = js.native
    @JSImport("parquetjs", "ParquetEnvelopeWriter.openStream")
    @js.native
    def openStream(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typingsSlinky.parquetjs.writerMod.ParquetEnvelopeWriter] = js.native
    @JSImport("parquetjs", "ParquetEnvelopeWriter.openStream")
    @js.native
    def openStream(
      schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typingsSlinky.parquetjs.writerMod.ParquetEnvelopeWriter] = js.native
  }
  
  @JSImport("parquetjs", "ParquetReader")
  @js.native
  class ParquetReader protected ()
    extends typingsSlinky.parquetjs.readerMod.ParquetReader {
    def this(
      metadata: MetadataInterface,
      envelopeReader: typingsSlinky.parquetjs.readerMod.ParquetEnvelopeReader
    ) = this()
  }
  /* static members */
  object ParquetReader {
    
    @JSImport("parquetjs", "ParquetReader.openFile")
    @js.native
    def openFile(filePath: String): js.Promise[typingsSlinky.parquetjs.readerMod.ParquetReader] = js.native
  }
  
  @JSImport("parquetjs", "ParquetSchema")
  @js.native
  class ParquetSchema protected ()
    extends typingsSlinky.parquetjs.schemaMod.ParquetSchema {
    def this(schema: SchemaInterface) = this()
  }
  
  object ParquetShredder {
    
    @JSImport("parquetjs", "ParquetShredder.materializeRecords")
    @js.native
    def materializeRecords(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema, buffer: RowBufferInterface): Unit = js.native
    
    @JSImport("parquetjs", "ParquetShredder.shredRecord")
    @js.native
    def shredRecord(
      schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema,
      record: RowInterface,
      buffer: RowBufferInterface
    ): Unit = js.native
  }
  
  @JSImport("parquetjs", "ParquetTransformer")
  @js.native
  class ParquetTransformer protected ()
    extends typingsSlinky.parquetjs.writerMod.ParquetTransformer {
    def this(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema) = this()
    def this(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema, opts: String) = this()
    def this(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema, opts: ParquetWriterOpts) = this()
  }
  
  @JSImport("parquetjs", "ParquetWriter")
  @js.native
  class ParquetWriter protected ()
    extends typingsSlinky.parquetjs.writerMod.ParquetWriter {
    def this(
      schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema,
      envelopeWriter: typingsSlinky.parquetjs.writerMod.ParquetEnvelopeWriter
    ) = this()
    def this(
      schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema,
      envelopeWriter: typingsSlinky.parquetjs.writerMod.ParquetEnvelopeWriter,
      opts: String
    ) = this()
    def this(
      schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema,
      envelopeWriter: typingsSlinky.parquetjs.writerMod.ParquetEnvelopeWriter,
      opts: ParquetWriterOpts
    ) = this()
  }
  /* static members */
  object ParquetWriter {
    
    @JSImport("parquetjs", "ParquetWriter.openFile")
    @js.native
    def openFile(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema, path: PathLike): js.Promise[typingsSlinky.parquetjs.writerMod.ParquetWriter] = js.native
    @JSImport("parquetjs", "ParquetWriter.openFile")
    @js.native
    def openFile(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema, path: PathLike, opts: String): js.Promise[typingsSlinky.parquetjs.writerMod.ParquetWriter] = js.native
    @JSImport("parquetjs", "ParquetWriter.openFile")
    @js.native
    def openFile(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema, path: PathLike, opts: ParquetWriterOpts): js.Promise[typingsSlinky.parquetjs.writerMod.ParquetWriter] = js.native
    
    @JSImport("parquetjs", "ParquetWriter.openStream")
    @js.native
    def openStream(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typingsSlinky.parquetjs.writerMod.ParquetWriter] = js.native
    @JSImport("parquetjs", "ParquetWriter.openStream")
    @js.native
    def openStream(schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typingsSlinky.parquetjs.writerMod.ParquetWriter] = js.native
    @JSImport("parquetjs", "ParquetWriter.openStream")
    @js.native
    def openStream(
      schema: typingsSlinky.parquetjs.schemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typingsSlinky.parquetjs.writerMod.ParquetWriter] = js.native
  }
}
