package typingsSlinky.parquetjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.nodeInt64.mod.^
import typingsSlinky.parquetjs.metadataInterfaceMod.MetadataInterface
import typingsSlinky.parquetjs.metadataInterfaceMod.MetadataRowGroupsInterface
import typingsSlinky.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typingsSlinky.parquetjs.rowInterfaceMod.RowInterface
import typingsSlinky.parquetjs.schemaMod.ParquetSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerMod {
  
  @JSImport("parquetjs/lib/reader", "ParquetCursor")
  @js.native
  class ParquetCursor protected () extends StObject {
    def this(
      metadata: MetadataInterface,
      envelopeReader: ParquetEnvelopeReader,
      schema: ParquetSchema,
      columnList: js.Array[js.Array[String] | String]
    ) = this()
    
    var columnList: js.Array[js.Array[String] | String] = js.native
    
    var envelopeReader: ParquetEnvelopeReader = js.native
    
    var metadata: MetadataInterface = js.native
    
    def next(): js.Promise[RowInterface] = js.native
    
    def rewind(): Unit = js.native
    
    var rowGroup: js.Array[RowInterface] = js.native
    
    var rowGroupIndex: Double = js.native
    
    var schema: ParquetSchema = js.native
  }
  
  @JSImport("parquetjs/lib/reader", "ParquetEnvelopeReader")
  @js.native
  class ParquetEnvelopeReader protected () extends StObject {
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
    
    def close(fd: Double): js.Promise[js.Error] = js.native
    
    var fileSize: Double = js.native
    
    def read(fd: Double, position: Double, length: Double): js.Promise[Buffer | js.Error] = js.native
    
    def readColumnChunk(schema: ParquetSchema, colChunk: js.Object): Unit = js.native
    
    def readFooter(): MetadataInterface = js.native
    
    def readHeader(): scala.Nothing = js.native
    
    def readRowGroup(
      schema: ParquetSchema,
      rowGroup: MetadataRowGroupsInterface,
      columnList: js.Array[js.Array[String] | String]
    ): RowBufferInterface = js.native
  }
  /* static members */
  object ParquetEnvelopeReader {
    
    @JSImport("parquetjs/lib/reader", "ParquetEnvelopeReader.openFile")
    @js.native
    def openFile(filePath: String): ParquetReader = js.native
  }
  
  @JSImport("parquetjs/lib/reader", "ParquetReader")
  @js.native
  class ParquetReader protected () extends StObject {
    def this(metadata: MetadataInterface, envelopeReader: ParquetEnvelopeReader) = this()
    
    def close(): js.Promise[Unit] = js.native
    
    var envelopeReader: ParquetEnvelopeReader = js.native
    
    def getCursor(): ParquetCursor = js.native
    def getCursor(columnList: js.Array[js.Array[String] | String]): ParquetCursor = js.native
    
    def getMetadata(): StringDictionary[String] = js.native
    
    def getRowCount(): ^ = js.native
    
    def getSchema(): ParquetSchema = js.native
    
    var metadata: MetadataInterface = js.native
    
    var schema: ParquetSchema = js.native
  }
  /* static members */
  object ParquetReader {
    
    @JSImport("parquetjs/lib/reader", "ParquetReader.openFile")
    @js.native
    def openFile(filePath: String): js.Promise[ParquetReader] = js.native
  }
}
