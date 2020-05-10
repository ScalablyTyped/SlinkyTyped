package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a Team Drive.
  */
@js.native
trait SchemaTeamDrive extends js.Object {
  /**
    * The resource name of the Team Drive. The format is
    * &quot;teamDrives/TEAM_DRIVE_ID&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The root of this Team Drive.
    */
  var root: js.UndefOr[SchemaDriveItem] = js.native
  /**
    * The title of the Team Drive.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaTeamDrive {
  @scala.inline
  def apply(): SchemaTeamDrive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDrive]
  }
  @scala.inline
  implicit class SchemaTeamDriveOps[Self <: SchemaTeamDrive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: SchemaDriveItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

