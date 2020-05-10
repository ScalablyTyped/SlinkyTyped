package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Export advanced options
  */
@js.native
trait SchemaExportOptions extends js.Object {
  /**
    * Option available for Drive export.
    */
  var driveOptions: js.UndefOr[SchemaDriveExportOptions] = js.native
  /**
    * Option available for groups export.
    */
  var groupsOptions: js.UndefOr[SchemaGroupsExportOptions] = js.native
  /**
    * Option available for hangouts chat export.
    */
  var hangoutsChatOptions: js.UndefOr[SchemaHangoutsChatExportOptions] = js.native
  /**
    * Option available for mail export.
    */
  var mailOptions: js.UndefOr[SchemaMailExportOptions] = js.native
  /**
    * The requested export location.
    */
  var region: js.UndefOr[String] = js.native
}

object SchemaExportOptions {
  @scala.inline
  def apply(): SchemaExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportOptions]
  }
  @scala.inline
  implicit class SchemaExportOptionsOps[Self <: SchemaExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveOptions(value: SchemaDriveExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupsOptions(value: SchemaGroupsExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHangoutsChatOptions(value: SchemaHangoutsChatExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangoutsChatOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHangoutsChatOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangoutsChatOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMailOptions(value: SchemaMailExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

