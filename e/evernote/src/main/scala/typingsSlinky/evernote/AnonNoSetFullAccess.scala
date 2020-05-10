package typingsSlinky.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNoSetFullAccess extends js.Object {
  var noSetFullAccess: js.UndefOr[Boolean] = js.native
  var noSetModifyNote: js.UndefOr[Boolean] = js.native
  var noSetReadNote: js.UndefOr[Boolean] = js.native
}

object AnonNoSetFullAccess {
  @scala.inline
  def apply(): AnonNoSetFullAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNoSetFullAccess]
  }
  @scala.inline
  implicit class AnonNoSetFullAccessOps[Self <: AnonNoSetFullAccess] (val x: Self) extends AnyVal {
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
    def withNoSetModifyNote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetModifyNote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSetModifyNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetModifyNote")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSetReadNote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetReadNote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSetReadNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSetReadNote")(js.undefined)
        ret
    }
  }
  
}

