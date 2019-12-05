package typingsSlinky.egg

import typingsSlinky.egg.eggStrings.DENY
import typingsSlinky.egg.eggStrings.SAMEORIGIN
import typingsSlinky.egg.eggStrings.`ALLOW-FROM`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALLOWFROM extends js.Object {
  var enable: Boolean
  var value: SAMEORIGIN | DENY | `ALLOW-FROM`
}

object Anon_ALLOWFROM {
  @scala.inline
  def apply(enable: Boolean, value: SAMEORIGIN | DENY | `ALLOW-FROM`): Anon_ALLOWFROM = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ALLOWFROM]
  }
}

