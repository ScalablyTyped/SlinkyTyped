package typingsSlinky.expressJsonschema

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressJsonschema.anon.Instance
import typingsSlinky.expressJsonschema.anon.Messages
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.jsonSchema.mod.JSONSchema4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-jsonschema", "JsonSchemaCustomPropertyError")
  @js.native
  class JsonSchemaCustomPropertyError protected () extends StObject {
    def this(propertyName: String) = this()
    
    var message: String = js.native
    
    var name: String = js.native
  }
  
  @JSImport("express-jsonschema", "JsonSchemaValidation")
  @js.native
  class JsonSchemaValidation protected () extends StObject {
    def this(validations: StringDictionary[Instance]) = this()
    
    var message: String = js.native
    
    var name: String = js.native
    
    var validations: StringDictionary[js.Array[Messages]] = js.native
  }
  
  @JSImport("express-jsonschema", "addSchemaProperties")
  @js.native
  def addSchemaProperties(
    newProperties: StringDictionary[
      js.Function4[
        /* instance */ js.Any, 
        /* schema */ JSONSchema4, 
        /* options */ js.Any, 
        /* ctx */ js.Any, 
        Unit | String
      ]
    ]
  ): Unit = js.native
  
  @JSImport("express-jsonschema", "validate")
  @js.native
  def validate(schemas: StringDictionary[JSONSchema4]): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  @JSImport("express-jsonschema", "validate")
  @js.native
  def validate(schemas: StringDictionary[JSONSchema4], schemaDependencies: js.Array[JSONSchema4]): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
}
