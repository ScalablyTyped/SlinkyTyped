package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClientBooks.AnonFolderName
import typingsSlinky.gapiClientBooks.AnonMoreFromAuthors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Usersettings extends js.Object {
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** User settings in sub-objects, each for different purposes. */
  var notesExport: js.UndefOr[AnonFolderName] = js.native
  var notification: js.UndefOr[AnonMoreFromAuthors] = js.native
}

object Usersettings {
  @scala.inline
  def apply(): Usersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Usersettings]
  }
  @scala.inline
  implicit class UsersettingsOps[Self <: Usersettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNotesExport(value: AnonFolderName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notesExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotesExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notesExport")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: AnonMoreFromAuthors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(js.undefined)
        ret
    }
  }
  
}

