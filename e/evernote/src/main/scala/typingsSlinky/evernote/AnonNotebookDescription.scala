package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.SharedNotebookPrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotebookDescription extends js.Object {
  var notebookDescription: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  var recommended: js.UndefOr[Boolean] = js.native
}

object AnonNotebookDescription {
  @scala.inline
  def apply(): AnonNotebookDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNotebookDescription]
  }
  @scala.inline
  implicit class AnonNotebookDescriptionOps[Self <: AnonNotebookDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivilege(value: SharedNotebookPrivilegeLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivilege: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommended")(js.undefined)
        ret
    }
  }
  
}

