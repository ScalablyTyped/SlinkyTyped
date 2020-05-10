package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A lightweight reference to the target of activity.
  */
@js.native
trait SchemaTargetReference extends js.Object {
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[SchemaDriveItemReference] = js.native
  /**
    * The target is a Team Drive.
    */
  var teamDrive: js.UndefOr[SchemaTeamDriveReference] = js.native
}

object SchemaTargetReference {
  @scala.inline
  def apply(): SchemaTargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetReference]
  }
  @scala.inline
  implicit class SchemaTargetReferenceOps[Self <: SchemaTargetReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveItem(value: SchemaDriveItemReference): Self = {
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
    def withTeamDrive(value: SchemaTeamDriveReference): Self = {
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

