package typingsSlinky.creditCardType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("credit-card-type/dist/lib/matches", JSImport.Namespace)
@js.native
object matchesMod extends js.Object {
  
  def matches(cardNumber: String, pattern: String): Boolean = js.native
  def matches(cardNumber: String, pattern: js.Array[Double | String]): Boolean = js.native
  def matches(cardNumber: String, pattern: Double): Boolean = js.native
}
