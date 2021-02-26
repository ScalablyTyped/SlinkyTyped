package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The definition for an object within a data source.
  */
@js.native
trait SchemaObjectDefinition extends StObject {
  
  /**
    * Name for the object, which then defines its type. Item indexing requests
    * should set the objectType field equal to this value. For example, if
    * *name* is *Document*, then indexing requests for items of type Document
    * should set objectType equal to *Document*. Each object definition must be
    * uniquely named within a schema. The name must start with a letter and can
    * only contain letters (A-Z, a-z) or numbers (0-9). The maximum length is
    * 256 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The optional object-specific options.
    */
  var options: js.UndefOr[SchemaObjectOptions] = js.native
  
  /**
    * The property definitions for the object. The maximum number of elements
    * is 1000.
    */
  var propertyDefinitions: js.UndefOr[js.Array[SchemaPropertyDefinition]] = js.native
}
object SchemaObjectDefinition {
  
  @scala.inline
  def apply(): SchemaObjectDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectDefinition]
  }
  
  @scala.inline
  implicit class SchemaObjectDefinitionMutableBuilder[Self <: SchemaObjectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: SchemaObjectOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPropertyDefinitions(value: js.Array[SchemaPropertyDefinition]): Self = StObject.set(x, "propertyDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDefinitionsUndefined: Self = StObject.set(x, "propertyDefinitions", js.undefined)
    
    @scala.inline
    def setPropertyDefinitionsVarargs(value: SchemaPropertyDefinition*): Self = StObject.set(x, "propertyDefinitions", js.Array(value :_*))
  }
}
