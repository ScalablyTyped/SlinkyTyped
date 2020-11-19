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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-jsonschema", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  
  def validate(schemas: StringDictionary[JSONSchema4]): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def validate(schemas: StringDictionary[JSONSchema4], schemaDependencies: js.Array[JSONSchema4]): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  
  @js.native
  class JsonSchemaCustomPropertyError protected () extends js.Object {
    def this(propertyName: String) = this()
    
    var message: String = js.native
    
    var name: String = js.native
  }
  
  @js.native
  class JsonSchemaValidation protected () extends js.Object {
    def this(validations: StringDictionary[Instance]) = this()
    
    var message: String = js.native
    
    var name: String = js.native
    
    var validations: StringDictionary[js.Array[Messages]] = js.native
  }
}
