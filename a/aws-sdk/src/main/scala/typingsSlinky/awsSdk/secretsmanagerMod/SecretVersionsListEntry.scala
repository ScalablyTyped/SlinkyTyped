package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretVersionsListEntry extends js.Object {
  /**
    * The date and time this version of the secret was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.
    */
  var LastAccessedDate: js.UndefOr[js.Date] = js.native
  /**
    * The unique version identifier of this version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
  /**
    * An array of staging labels that are currently associated with this version of the secret.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.native
}

object SecretVersionsListEntry {
  @scala.inline
  def apply(): SecretVersionsListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretVersionsListEntry]
  }
  @scala.inline
  implicit class SecretVersionsListEntryOps[Self <: SecretVersionsListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAccessedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAccessedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAccessedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAccessedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: SecretVersionIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionStages(value: SecretVersionStagesType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionStages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionStages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionStages")(js.undefined)
        ret
    }
  }
  
}

