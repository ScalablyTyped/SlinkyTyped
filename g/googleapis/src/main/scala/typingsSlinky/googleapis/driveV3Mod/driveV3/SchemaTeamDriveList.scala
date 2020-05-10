package typingsSlinky.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Team Drives.
  */
@js.native
trait SchemaTeamDriveList extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#teamDriveList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of Team Drives. This will be absent if
    * the end of the Team Drives list has been reached. If the token is
    * rejected for any reason, it should be discarded, and pagination should be
    * restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of Team Drives. If nextPageToken is populated, then this list
    * may be incomplete and an additional page of results should be fetched.
    */
  var teamDrives: js.UndefOr[js.Array[SchemaTeamDrive]] = js.native
}

object SchemaTeamDriveList {
  @scala.inline
  def apply(): SchemaTeamDriveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDriveList]
  }
  @scala.inline
  implicit class SchemaTeamDriveListOps[Self <: SchemaTeamDriveList] (val x: Self) extends AnyVal {
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
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamDrives(value: js.Array[SchemaTeamDrive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamDrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrives")(js.undefined)
        ret
    }
  }
  
}

