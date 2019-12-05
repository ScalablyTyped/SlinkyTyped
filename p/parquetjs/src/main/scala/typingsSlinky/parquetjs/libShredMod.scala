package typingsSlinky.parquetjs

import typingsSlinky.parquetjs.libRowBufferDotInterfaceMod.RowBufferInterface
import typingsSlinky.parquetjs.libRowDotInterfaceMod.RowInterface
import typingsSlinky.parquetjs.libSchemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/shred", JSImport.Namespace)
@js.native
object libShredMod extends js.Object {
  @js.native
  object shredder extends js.Object {
    def materializeRecords(schema: ParquetSchema, buffer: RowBufferInterface): Unit = js.native
    def shredRecord(schema: ParquetSchema, record: RowInterface, buffer: RowBufferInterface): Unit = js.native
  }
  
}

