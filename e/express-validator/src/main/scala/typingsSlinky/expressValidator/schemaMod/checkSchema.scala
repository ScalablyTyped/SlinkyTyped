package typingsSlinky.expressValidator.schemaMod

import typingsSlinky.expressValidator.baseMod.Location
import typingsSlinky.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/middlewares/schema", "checkSchema")
@js.native
object checkSchema extends js.Object {
  
  def apply(schema: Schema): js.Array[ValidationChain] = js.native
  def apply(schema: Schema, defaultLocations: js.Array[Location]): js.Array[ValidationChain] = js.native
}
