package typingsSlinky.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a change to a file or Team Drive.
  */
@js.native
trait SchemaChange extends js.Object {
  /**
    * Whether the file or Team Drive has been removed from this list of
    * changes, for example by deletion or loss of access.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The updated state of the file. Present if the type is file and the file
    * has not been removed from this list of changes.
    */
  var file: js.UndefOr[SchemaFile] = js.native
  /**
    * The ID of the file associated with this change.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * The ID of the change.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#change.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time of this modification.
    */
  var modificationDate: js.UndefOr[String] = js.native
  /**
    * A link back to this change.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The updated state of the Team Drive. Present if the type is teamDrive,
    * the user is still a member of the Team Drive, and the Team Drive has not
    * been deleted.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.native
  /**
    * The ID of the Team Drive associated with this change.
    */
  var teamDriveId: js.UndefOr[String] = js.native
  /**
    * The type of the change. Possible values are file and teamDrive.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaChange {
  @scala.inline
  def apply(): SchemaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChange]
  }
  @scala.inline
  implicit class SchemaChangeOps[Self <: SchemaChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: SchemaFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
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
    def withModificationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modificationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModificationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modificationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamDrive(value: SchemaTeamDrive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamDriveId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamDriveId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

