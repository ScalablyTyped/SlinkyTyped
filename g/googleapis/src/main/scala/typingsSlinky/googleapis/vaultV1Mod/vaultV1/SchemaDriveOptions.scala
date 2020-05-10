package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive search advanced options
  */
@js.native
trait SchemaDriveOptions extends js.Object {
  /**
    * Set to true to include Team Drive.
    */
  var includeTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * Search the versions of the Drive file as of the reference date. These
    * timestamps are in GMT and rounded down to the given date.
    */
  var versionDate: js.UndefOr[String] = js.native
}

object SchemaDriveOptions {
  @scala.inline
  def apply(): SchemaDriveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveOptions]
  }
  @scala.inline
  implicit class SchemaDriveOptionsOps[Self <: SchemaDriveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeTeamDrives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTeamDrives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTeamDrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTeamDrives")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionDate")(js.undefined)
        ret
    }
  }
  
}

