package typingsSlinky.parquetjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.WriteStream
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.parquetjs.anon.Columns
import typingsSlinky.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typingsSlinky.parquetjs.rowInterfaceMod.RowInterface
import typingsSlinky.parquetjs.schemaMod.ParquetSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerMod {
  
  @JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter")
  @js.native
  class ParquetEnvelopeWriter protected () extends StObject {
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
  object ParquetEnvelopeWriter {
    
    @JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter.openStream")
    @js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream): js.Promise[ParquetEnvelopeWriter] = js.native
    @JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter.openStream")
    @js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[ParquetEnvelopeWriter] = js.native
    @JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter.openStream")
    @js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: ParquetWriterOpts): js.Promise[ParquetEnvelopeWriter] = js.native
  }
  
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
  
  @JSImport("parquetjs/lib/writer", "ParquetWriter")
  @js.native
  class ParquetWriter protected () extends StObject {
    def this(schema: ParquetSchema, envelopeWriter: ParquetEnvelopeWriter) = this()
    def this(schema: ParquetSchema, envelopeWriter: ParquetEnvelopeWriter, opts: String) = this()
    def this(schema: ParquetSchema, envelopeWriter: ParquetEnvelopeWriter, opts: ParquetWriterOpts) = this()
    
    def appendRow(row: RowInterface): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    var closed: Boolean = js.native
    
    var envelopeWriter: ParquetEnvelopeWriter = js.native
    
    var rowBuffer: RowBufferInterface = js.native
    
    var rowGroupSize: Double = js.native
    
    var schema: ParquetSchema = js.native
    
    def setMetadata(key: String, value: String): Unit = js.native
    def setMetadata(key: String, value: Boolean): Unit = js.native
    def setMetadata(key: String, value: Double): Unit = js.native
    def setMetadata(key: Boolean, value: String): Unit = js.native
    def setMetadata(key: Boolean, value: Boolean): Unit = js.native
    def setMetadata(key: Boolean, value: Double): Unit = js.native
    def setMetadata(key: Double, value: String): Unit = js.native
    def setMetadata(key: Double, value: Boolean): Unit = js.native
    def setMetadata(key: Double, value: Double): Unit = js.native
    
    def setPageSize(cnt: Double): Unit = js.native
    
    def setRowGroupSize(cnt: Double): Unit = js.native
    
    var userMetadata: StringDictionary[String] = js.native
  }
  /* static members */
  object ParquetWriter {
    
    @JSImport("parquetjs/lib/writer", "ParquetWriter.openFile")
    @js.native
    def openFile(schema: ParquetSchema, path: PathLike): js.Promise[ParquetWriter] = js.native
    @JSImport("parquetjs/lib/writer", "ParquetWriter.openFile")
    @js.native
    def openFile(schema: ParquetSchema, path: PathLike, opts: String): js.Promise[ParquetWriter] = js.native
    @JSImport("parquetjs/lib/writer", "ParquetWriter.openFile")
    @js.native
    def openFile(schema: ParquetSchema, path: PathLike, opts: ParquetWriterOpts): js.Promise[ParquetWriter] = js.native
    
    @JSImport("parquetjs/lib/writer", "ParquetWriter.openStream")
    @js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream): js.Promise[ParquetWriter] = js.native
    @JSImport("parquetjs/lib/writer", "ParquetWriter.openStream")
    @js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[ParquetWriter] = js.native
    @JSImport("parquetjs/lib/writer", "ParquetWriter.openStream")
    @js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: ParquetWriterOpts): js.Promise[ParquetWriter] = js.native
  }
  
  @js.native
  trait ParquetWriterOpts extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.native
    
    var bitWidth: js.UndefOr[Double] = js.native
    
    var disableEnvelope: js.UndefOr[Boolean] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var fd: js.UndefOr[Double] = js.native
    
    var flags: js.UndefOr[String] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var rowGroupSize: js.UndefOr[Double] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var useDataPageV2: js.UndefOr[Boolean] = js.native
  }
  object ParquetWriterOpts {
    
    @scala.inline
    def apply(): ParquetWriterOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParquetWriterOpts]
    }
    
    @scala.inline
    implicit class ParquetWriterOptsMutableBuilder[Self <: ParquetWriterOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setBitWidth(value: Double): Self = StObject.set(x, "bitWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitWidthUndefined: Self = StObject.set(x, "bitWidth", js.undefined)
      
      @scala.inline
      def setDisableEnvelope(value: Boolean): Self = StObject.set(x, "disableEnvelope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEnvelopeUndefined: Self = StObject.set(x, "disableEnvelope", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setRowGroupSize(value: Double): Self = StObject.set(x, "rowGroupSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupSizeUndefined: Self = StObject.set(x, "rowGroupSize", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setUseDataPageV2(value: Boolean): Self = StObject.set(x, "useDataPageV2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDataPageV2Undefined: Self = StObject.set(x, "useDataPageV2", js.undefined)
    }
  }
}
