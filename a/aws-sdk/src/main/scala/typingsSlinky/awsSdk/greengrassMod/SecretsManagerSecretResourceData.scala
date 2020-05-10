package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretsManagerSecretResourceData extends js.Object {
  /**
    * The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest version (represented by the ''AWSCURRENT'' staging label) is included by default.
    */
  var ARN: js.UndefOr[string] = js.native
  /**
    * Optional. The staging labels whose values you want to make available on the core, in addition to ''AWSCURRENT''.
    */
  var AdditionalStagingLabelsToDownload: js.UndefOr[listOfString] = js.native
}

object SecretsManagerSecretResourceData {
  @scala.inline
  def apply(): SecretsManagerSecretResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretsManagerSecretResourceData]
  }
  @scala.inline
  implicit class SecretsManagerSecretResourceDataOps[Self <: SecretsManagerSecretResourceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: string): Self = {
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
    def withAdditionalStagingLabelsToDownload(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalStagingLabelsToDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalStagingLabelsToDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalStagingLabelsToDownload")(js.undefined)
        ret
    }
  }
  
}

