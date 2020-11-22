package typingsSlinky.schemaUtils

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.schemaUtils.validationErrorMod.Schema
import typingsSlinky.schemaUtils.validationErrorMod.SchemaUtilErrorObject
import typingsSlinky.schemaUtils.validationErrorMod.ValidationErrorConfiguration
import typingsSlinky.schemaUtils.validationErrorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("schema-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ValidationError: Instantiable3[
    /* errors */ js.Array[SchemaUtilErrorObject], 
    /* schema */ Schema, 
    /* configuration */ js.UndefOr[ValidationErrorConfiguration], 
    default
  ] = js.native
  
  val validate: js.Function3[
    /* schema */ typingsSlinky.schemaUtils.validateMod.Schema, 
    /* options */ js.Array[js.Object] | js.Object, 
    /* configuration */ js.UndefOr[typingsSlinky.schemaUtils.validateMod.ValidationErrorConfiguration], 
    Unit
  ] = js.native
}
