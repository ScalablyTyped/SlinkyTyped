package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.PRODUCTION
  - typings.googlepay.googlepayStrings.TEST
*/
trait EnvironmentType extends js.Object

object EnvironmentType {
  @scala.inline
  def PRODUCTION: typingsSlinky.googlepay.googlepayStrings.PRODUCTION = this.cast("PRODUCTION")
  @scala.inline
  def TEST: typingsSlinky.googlepay.googlepayStrings.TEST = this.cast("TEST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

