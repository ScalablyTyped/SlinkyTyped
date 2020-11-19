package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsJWT", JSImport.Namespace)
@js.native
object isJWTMod extends js.Object {
  
  val IS_JWT: /* "isJwt" */ String = js.native
  
  @JSName("IsJWT")
  def IsJWT_(): PropertyDecorator = js.native
  @JSName("IsJWT")
  def IsJWT_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isJWT(value: js.Any): Boolean = js.native
}
