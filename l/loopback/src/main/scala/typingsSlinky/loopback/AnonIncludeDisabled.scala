package typingsSlinky.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeDisabled extends js.Object {
  var includeDisabled: Boolean = js.native
}

object AnonIncludeDisabled {
  @scala.inline
  def apply(includeDisabled: Boolean): AnonIncludeDisabled = {
    val __obj = js.Dynamic.literal(includeDisabled = includeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeDisabled]
  }
  @scala.inline
  implicit class AnonIncludeDisabledOps[Self <: AnonIncludeDisabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDisabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

