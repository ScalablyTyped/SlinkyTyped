package typingsSlinky.cypress.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region Effects
// #region Effects
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.cypress.cypressStrings.fast
  - typingsSlinky.cypress.cypressStrings.slow
*/
trait Duration extends js.Object

object Duration {
  @scala.inline
  def fast: typingsSlinky.cypress.cypressStrings.fast = "fast".asInstanceOf[typingsSlinky.cypress.cypressStrings.fast]
  @scala.inline
  def slow: typingsSlinky.cypress.cypressStrings.slow = "slow".asInstanceOf[typingsSlinky.cypress.cypressStrings.slow]
  @scala.inline
  implicit def apply(value: Double): Duration = value.asInstanceOf[Duration]
}

