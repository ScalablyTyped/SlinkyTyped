package typingsSlinky.activexOffice.Office

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceLink extends js.Object {
  val Application: js.Any = js.native
  val CreatedBy: String = js.native
  val CreatedDate: VarDate = js.native
  val Creator: Double = js.native
  var Description: String = js.native
  val ModifiedBy: String = js.native
  val ModifiedDate: VarDate = js.native
  var Notes: String = js.native
  @JSName("Office.SharedWorkspaceLink_typekey")
  var OfficeDotSharedWorkspaceLink_typekey: SharedWorkspaceLink = js.native
  val Parent: js.Any = js.native
  var URL: String = js.native
  def Delete(): Unit = js.native
  def Save(): Unit = js.native
}

object SharedWorkspaceLink {
  @scala.inline
  def apply(
    Application: js.Any,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Delete: () => Unit,
    Description: String,
    ModifiedBy: String,
    ModifiedDate: VarDate,
    Notes: String,
    OfficeDotSharedWorkspaceLink_typekey: SharedWorkspaceLink,
    Parent: js.Any,
    Save: () => Unit,
    URL: String
  ): SharedWorkspaceLink = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Description = Description.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Notes = Notes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), URL = URL.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceLink_typekey")(OfficeDotSharedWorkspaceLink_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceLink]
  }
  @scala.inline
  implicit class SharedWorkspaceLinkOps[Self <: SharedWorkspaceLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotSharedWorkspaceLink_typekey(value: SharedWorkspaceLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.SharedWorkspaceLink_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

