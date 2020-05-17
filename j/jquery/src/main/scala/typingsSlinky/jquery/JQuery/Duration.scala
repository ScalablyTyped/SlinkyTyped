package typingsSlinky.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region Effects
// #region Effects
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.jquery.jqueryStrings.fast
  - typingsSlinky.jquery.jqueryStrings.slow
*/
trait Duration extends js.Object

object Duration {
  @scala.inline
  def fast: typingsSlinky.jquery.jqueryStrings.fast = "fast".asInstanceOf[typingsSlinky.jquery.jqueryStrings.fast]
  @scala.inline
  def slow: typingsSlinky.jquery.jqueryStrings.slow = "slow".asInstanceOf[typingsSlinky.jquery.jqueryStrings.slow]
  @scala.inline
  implicit def apply(value: Double): Duration = value.asInstanceOf[Duration]
}

