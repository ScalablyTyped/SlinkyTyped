package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the target of activity.
  */
@js.native
trait SchemaTarget extends js.Object {
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[SchemaDriveItem] = js.native
  /**
    * The target is a comment on a Drive file.
    */
  var fileComment: js.UndefOr[SchemaFileComment] = js.native
  /**
    * The target is a Team Drive.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.native
}

object SchemaTarget {
  @scala.inline
  def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  @scala.inline
  implicit class SchemaTargetOps[Self <: SchemaTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveItem(value: SchemaDriveItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withFileComment(value: SchemaFileComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileComment")(js.undefined)
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
  }
  
}

