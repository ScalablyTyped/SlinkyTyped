package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Query options for Drive holds.
  */
@js.native
trait SchemaHeldDriveQuery extends js.Object {
  /**
    * If true, include files in Team Drives in the hold.
    */
  var includeTeamDriveFiles: js.UndefOr[Boolean] = js.native
}

object SchemaHeldDriveQuery {
  @scala.inline
  def apply(): SchemaHeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldDriveQuery]
  }
  @scala.inline
  implicit class SchemaHeldDriveQueryOps[Self <: SchemaHeldDriveQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeTeamDriveFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTeamDriveFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTeamDriveFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTeamDriveFiles")(js.undefined)
        ret
    }
  }
  
}

