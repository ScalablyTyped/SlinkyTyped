package typingsSlinky.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A schema definition associated with an NgModule.
  *
  * @see `@NgModule`, `CUSTOM_ELEMENTS_SCHEMA`, `NO_ERRORS_SCHEMA`
  *
  * @param name The name of a defined schema.
  *
  * @publicApi
  */
@js.native
trait SchemaMetadata extends StObject {
  
  var name: String = js.native
}
object SchemaMetadata {
  
  @scala.inline
  def apply(name: String): SchemaMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadata]
  }
  
  @scala.inline
  implicit class SchemaMetadataMutableBuilder[Self <: SchemaMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
