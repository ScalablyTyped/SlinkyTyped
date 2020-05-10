package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the owner of a Drive item.
  */
@js.native
trait SchemaOwner extends js.Object {
  /**
    * The domain of the Drive item owner.
    */
  var domain: js.UndefOr[SchemaDomain] = js.native
  /**
    * The Team Drive that owns the Drive item.
    */
  var teamDrive: js.UndefOr[SchemaTeamDriveReference] = js.native
  /**
    * The user that owns the Drive item.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaOwner {
  @scala.inline
  def apply(): SchemaOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOwner]
  }
  @scala.inline
  implicit class SchemaOwnerOps[Self <: SchemaOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: SchemaDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
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
    @scala.inline
    def withUser(value: SchemaUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

