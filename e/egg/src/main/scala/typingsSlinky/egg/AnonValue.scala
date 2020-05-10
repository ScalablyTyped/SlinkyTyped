package typingsSlinky.egg

import typingsSlinky.egg.eggStrings.DENY
import typingsSlinky.egg.eggStrings.SAMEORIGIN
import typingsSlinky.egg.eggStrings.`ALLOW-FROM`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValue extends js.Object {
  var enable: Boolean = js.native
  var value: SAMEORIGIN | DENY | `ALLOW-FROM` = js.native
}

object AnonValue {
  @scala.inline
  def apply(enable: Boolean, value: SAMEORIGIN | DENY | `ALLOW-FROM`): AnonValue = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
  @scala.inline
  implicit class AnonValueOps[Self <: AnonValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: SAMEORIGIN | DENY | `ALLOW-FROM`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

