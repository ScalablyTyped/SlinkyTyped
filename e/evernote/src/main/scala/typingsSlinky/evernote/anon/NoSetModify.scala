package typingsSlinky.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoSetModify extends js.Object {
  var noSetFullAccess: js.UndefOr[Boolean] = js.native
  var noSetModify: js.UndefOr[Boolean] = js.native
  var noSetReadOnly: js.UndefOr[Boolean] = js.native
  var noSetReadPlusActivity: js.UndefOr[Boolean] = js.native
}

object NoSetModify {
  @scala.inline
  def apply(): NoSetModify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoSetModify]
  }
  @scala.inline
  implicit class NoSetModifyOps[Self <: NoSetModify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoSetFullAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetFullAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSetFullAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetFullAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSetModify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetModify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSetModify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetModify")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSetReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSetReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSetReadPlusActivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetReadPlusActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSetReadPlusActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetReadPlusActivity")(js.undefined)
        ret
    }
  }
  
}

