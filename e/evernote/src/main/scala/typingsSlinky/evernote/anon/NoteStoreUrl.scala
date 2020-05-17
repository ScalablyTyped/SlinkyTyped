package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.ServiceLevel
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoteStoreUrl extends js.Object {
  var noteStoreUrl: js.UndefOr[String] = js.native
  var serviceLevel: js.UndefOr[ServiceLevel] = js.native
  var userId: js.UndefOr[UserID] = js.native
  var username: js.UndefOr[String] = js.native
  var webApiUrlPrefix: js.UndefOr[String] = js.native
}

object NoteStoreUrl {
  @scala.inline
  def apply(): NoteStoreUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteStoreUrl]
  }
  @scala.inline
  implicit class NoteStoreUrlOps[Self <: NoteStoreUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoteStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteStoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteStoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteStoreUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceLevel(value: ServiceLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withWebApiUrlPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApiUrlPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebApiUrlPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApiUrlPrefix")(js.undefined)
        ret
    }
  }
  
}

