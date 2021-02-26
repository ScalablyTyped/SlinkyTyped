package typingsSlinky.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaIDObj extends StObject {
  
  var schema_name: String = js.native
  
  var schema_version: String = js.native
}
object SchemaIDObj {
  
  @scala.inline
  def apply(schema_name: String, schema_version: String): SchemaIDObj = {
    val __obj = js.Dynamic.literal(schema_name = schema_name.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIDObj]
  }
  
  @scala.inline
  implicit class SchemaIDObjMutableBuilder[Self <: SchemaIDObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema_name(value: String): Self = StObject.set(x, "schema_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_version(value: String): Self = StObject.set(x, "schema_version", value.asInstanceOf[js.Any])
  }
}
