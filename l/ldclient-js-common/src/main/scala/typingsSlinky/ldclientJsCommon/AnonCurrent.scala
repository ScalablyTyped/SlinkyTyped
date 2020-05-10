package typingsSlinky.ldclientJsCommon

import typingsSlinky.ldclientJsCommon.mod.LDFlagValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrent extends js.Object {
  var current: LDFlagValue = js.native
  var previous: LDFlagValue = js.native
}

object AnonCurrent {
  @scala.inline
  def apply(current: LDFlagValue, previous: LDFlagValue): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent]
  }
  @scala.inline
  implicit class AnonCurrentOps[Self <: AnonCurrent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: LDFlagValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: LDFlagValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

