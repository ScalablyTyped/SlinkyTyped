package typingsSlinky.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNoEmail extends js.Object {
  var noEmail: js.UndefOr[Boolean] = js.native
  var noShare: js.UndefOr[Boolean] = js.native
  var noSharePublicly: js.UndefOr[Boolean] = js.native
  var noUpdateContent: js.UndefOr[Boolean] = js.native
  var noUpdateTitle: js.UndefOr[Boolean] = js.native
}

object AnonNoEmail {
  @scala.inline
  def apply(): AnonNoEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNoEmail]
  }
  @scala.inline
  implicit class AnonNoEmailOps[Self <: AnonNoEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withNoShare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoShare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noShare")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSharePublicly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSharePublicly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSharePublicly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSharePublicly")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUpdateContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUpdateContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateContent")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUpdateTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUpdateTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUpdateTitle")(js.undefined)
        ret
    }
  }
  
}

