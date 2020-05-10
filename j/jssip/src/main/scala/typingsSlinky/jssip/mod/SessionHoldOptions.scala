package typingsSlinky.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionHoldOptions extends js.Object {
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  var useUpdate: js.UndefOr[Boolean] = js.native
}

object SessionHoldOptions {
  @scala.inline
  def apply(): SessionHoldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionHoldOptions]
  }
  @scala.inline
  implicit class SessionHoldOptionsOps[Self <: SessionHoldOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUpdate")(js.undefined)
        ret
    }
  }
  
}

