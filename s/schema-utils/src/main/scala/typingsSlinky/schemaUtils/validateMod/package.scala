package typingsSlinky.schemaUtils

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
    /* error */ typingsSlinky.schemaUtils.validateMod.SchemaUtilErrorObject, 
    java.lang.String
  ]
  
  type Schema = (typingsSlinky.jsonSchema.mod.JSONSchema4 with typingsSlinky.schemaUtils.validateMod.Extend) | (typingsSlinky.jsonSchema.mod.JSONSchema6 with typingsSlinky.schemaUtils.validateMod.Extend) | (typingsSlinky.jsonSchema.mod.JSONSchema7 with typingsSlinky.schemaUtils.validateMod.Extend)
}
