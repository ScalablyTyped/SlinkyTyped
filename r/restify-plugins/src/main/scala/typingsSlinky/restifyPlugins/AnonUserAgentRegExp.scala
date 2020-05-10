package typingsSlinky.restifyPlugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUserAgentRegExp extends js.Object {
  var userAgentRegExp: js.Any = js.native
}

object AnonUserAgentRegExp {
  @scala.inline
  def apply(userAgentRegExp: js.Any): AnonUserAgentRegExp = {
    val __obj = js.Dynamic.literal(userAgentRegExp = userAgentRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUserAgentRegExp]
  }
  @scala.inline
  implicit class AnonUserAgentRegExpOps[Self <: AnonUserAgentRegExp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserAgentRegExp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentRegExp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

