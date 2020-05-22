package typingsSlinky.egg.anon

import typingsSlinky.egg.eggStrings.DENY
import typingsSlinky.egg.eggStrings.SAMEORIGIN
import typingsSlinky.egg.eggStrings.`ALLOW-FROM`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var enable: Boolean
  var value: SAMEORIGIN | DENY | `ALLOW-FROM`
}

object Value {
  @scala.inline
  def apply(enable: Boolean, value: SAMEORIGIN | DENY | `ALLOW-FROM`): Value = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

