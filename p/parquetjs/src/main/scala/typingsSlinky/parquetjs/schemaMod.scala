package typingsSlinky.parquetjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.parquetjs.fieldInterfaceMod.FieldInterface
import typingsSlinky.parquetjs.schemaInterfaceMod.SchemaInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @JSImport("parquetjs/lib/schema", "ParquetSchema")
  @js.native
  class ParquetSchema protected () extends StObject {
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
