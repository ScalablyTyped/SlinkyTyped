package typingsSlinky.reapop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterTimeout extends js.Object {
  var enterTimeout: js.UndefOr[Double] = js.native
  var leaveTimeout: js.UndefOr[Double] = js.native
  var name: js.UndefOr[js.Any] = js.native
}

object EnterTimeout {
  @scala.inline
  def apply(): EnterTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterTimeout]
  }
  @scala.inline
  implicit class EnterTimeoutOps[Self <: EnterTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

