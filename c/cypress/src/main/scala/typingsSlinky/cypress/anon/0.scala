package typingsSlinky.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  def defaults(options: PartialScreenshotDefaults): Unit
}

object `0` {
  @scala.inline
  def apply(defaults: PartialScreenshotDefaults => Unit): `0` = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[`0`]
  }
}

