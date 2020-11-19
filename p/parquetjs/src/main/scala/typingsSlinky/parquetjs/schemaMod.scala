package typingsSlinky.parquetjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.parquetjs.fieldInterfaceMod.FieldInterface
import typingsSlinky.parquetjs.schemaInterfaceMod.SchemaInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parquetjs/lib/schema", JSImport.Namespace)
@js.native
object schemaMod extends js.Object {
  
  @js.native
  class ParquetSchema protected () extends js.Object {
    def this(schema: SchemaInterface) = this()
    
    var fieldList: js.Array[FieldInterface] = js.native
    
    var fields: StringDictionary[FieldInterface] = js.native
    
    def findField(path: String): FieldInterface = js.native
    def findField(path: js.Array[js.Array[String] | String]): FieldInterface = js.native
    
    def findFieldBranch(path: String): js.Array[FieldInterface] = js.native
    def findFieldBranch(path: js.Array[String]): js.Array[FieldInterface] = js.native
    
    var schema: SchemaInterface = js.native
  }
}
