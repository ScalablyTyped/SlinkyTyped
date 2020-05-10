package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSecretValueResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the secret for which you just created a version.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret for which you just created or updated a version.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  /**
    * The unique identifier of the version of the secret you just created or updated.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
  /**
    * The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.native
}

object PutSecretValueResponse {
  @scala.inline
  def apply(): PutSecretValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSecretValueResponse]
  }
  @scala.inline
  implicit class PutSecretValueResponseOps[Self <: PutSecretValueResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: SecretARNType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: SecretNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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

