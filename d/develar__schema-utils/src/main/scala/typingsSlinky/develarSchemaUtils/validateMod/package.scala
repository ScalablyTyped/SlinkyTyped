package typingsSlinky.develarSchemaUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object validateMod {
  
  type ErrorObject = typingsSlinky.ajv.mod.ErrorObject
  
  type JSONSchema4 = typingsSlinky.jsonSchema.mod.JSONSchema4
  
  type JSONSchema6 = typingsSlinky.jsonSchema.mod.JSONSchema6
  
  type JSONSchema7 = typingsSlinky.jsonSchema.mod.JSONSchema7
  
  type PostFormatter = js.Function2[
    /* formattedError */ java.lang.String, 
    /* error */ typingsSlinky.develarSchemaUtils.anon.ErrorObjectchildrenArrayE, 
    java.lang.String
  ]
  
  type Schema = typingsSlinky.jsonSchema.mod.JSONSchema4 | typingsSlinky.jsonSchema.mod.JSONSchema6 | typingsSlinky.jsonSchema.mod.JSONSchema7
}
