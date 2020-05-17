package typingsSlinky.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CcAddresses extends js.Object {
  var ccAddresses: js.UndefOr[js.Array[String]] = js.native
  var guid: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var note: js.UndefOr[typingsSlinky.evernote.mod.Types.Note] = js.native
  var subject: js.UndefOr[String] = js.native
  var toAddresses: js.UndefOr[js.Array[String]] = js.native
}

object CcAddresses {
  @scala.inline
  def apply(): CcAddresses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CcAddresses]
  }
  @scala.inline
  implicit class CcAddressesOps[Self <: CcAddresses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCcAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: typingsSlinky.evernote.mod.Types.Note): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withToAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toAddresses")(js.undefined)
        ret
    }
  }
  
}

