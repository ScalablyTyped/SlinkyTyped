package typingsSlinky.parquetjs

import typingsSlinky.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typingsSlinky.parquetjs.rowInterfaceMod.RowInterface
import typingsSlinky.parquetjs.schemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parquetjs/lib/shred", JSImport.Namespace)
@js.native
object shredMod extends js.Object {
  
  @js.native
  object shredder extends js.Object {
    
    def materializeRecords(schema: ParquetSchema, buffer: RowBufferInterface): Unit = js.native
    
    def shredRecord(schema: ParquetSchema, record: RowInterface, buffer: RowBufferInterface): Unit = js.native
  }
}
