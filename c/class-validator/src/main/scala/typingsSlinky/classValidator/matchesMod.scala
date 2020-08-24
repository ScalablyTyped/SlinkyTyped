package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/Matches", JSImport.Namespace)
@js.native
object matchesMod extends js.Object {
  val MATCHES: /* "matches" */ String = js.native
  @JSName("Matches")
  def Matches_(pattern: String): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: String, modifiers: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: String, modifiers: String): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: String, modifiers: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: js.RegExp): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: js.RegExp, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def matches(value: String, pattern: String, modifiers: String): Boolean = js.native
  def matches(value: String, pattern: js.RegExp): Boolean = js.native
}

