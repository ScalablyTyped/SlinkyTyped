package typingsSlinky.cardValidator.expirationDateMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("card-validator/dist/expiration-date", "expirationDate")
@js.native
object expirationDate extends js.Object {
  
  def apply(value: String): ExpirationDateVerification = js.native
  def apply(value: String, maxElapsedYear: Double): ExpirationDateVerification = js.native
  def apply(value: js.Any): ExpirationDateVerification = js.native
  def apply(value: js.Any, maxElapsedYear: Double): ExpirationDateVerification = js.native
  def apply(value: Record[String, String | Double]): ExpirationDateVerification = js.native
  def apply(value: Record[String, String | Double], maxElapsedYear: Double): ExpirationDateVerification = js.native
}
