package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import typingsSlinky.validator.mod.validator.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsHash", JSImport.Namespace)
@js.native
object isHashMod extends js.Object {
  val IS_HASH: /* "isHash" */ String = js.native
  @JSName("IsHash")
  def IsHash_(algorithm: String): PropertyDecorator = js.native
  @JSName("IsHash")
  def IsHash_(algorithm: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isHash(value: js.Any, algorithm: HashAlgorithm): Boolean = js.native
}

