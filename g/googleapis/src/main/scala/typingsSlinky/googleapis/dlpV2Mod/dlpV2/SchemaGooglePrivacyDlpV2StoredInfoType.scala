package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StoredInfoType resource message that contains information about the current
  * version and any pending updates.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StoredInfoType extends js.Object {
  /**
    * Current version of the stored info type.
    */
  var currentVersion: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion] = js.native
  /**
    * Resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Pending versions of the stored info type. Empty if no versions are
    * pending.
    */
  var pendingVersions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion]] = js.native
}

object SchemaGooglePrivacyDlpV2StoredInfoType {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2StoredInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoType]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StoredInfoTypeOps[Self <: SchemaGooglePrivacyDlpV2StoredInfoType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentVersion(value: SchemaGooglePrivacyDlpV2StoredInfoTypeVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(js.undefined)
        ret
    }
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
    def withPendingVersions(value: js.Array[SchemaGooglePrivacyDlpV2StoredInfoTypeVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingVersions")(js.undefined)
        ret
    }
  }
  
}

