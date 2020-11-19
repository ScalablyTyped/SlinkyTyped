package typingsSlinky.schemaUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object validationErrorMod {
  
  type JSONSchema6 = typingsSlinky.jsonSchema.mod.JSONSchema6
  
  type JSONSchema7 = typingsSlinky.jsonSchema.mod.JSONSchema7
  
  type PostFormatter = js.Function2[
    /* formattedError */ java.lang.String, 
    /* error */ typingsSlinky.schemaUtils.anon.ErrorObjectchildrenArrayE, 
    java.lang.String
  ]
  
  type SPECIFICITY = scala.Double
  
  type Schema = (typingsSlinky.jsonSchema.mod.JSONSchema4 with typingsSlinky.schemaUtils.validateMod.Extend) | (typingsSlinky.jsonSchema.mod.JSONSchema6 with typingsSlinky.schemaUtils.validateMod.Extend) | (typingsSlinky.jsonSchema.mod.JSONSchema7 with typingsSlinky.schemaUtils.validateMod.Extend)
}
