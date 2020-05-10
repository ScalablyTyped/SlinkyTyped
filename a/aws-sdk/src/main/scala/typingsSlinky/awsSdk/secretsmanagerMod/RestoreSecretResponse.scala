package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreSecretResponse extends js.Object {
  /**
    * The ARN of the secret that was restored.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret that was restored.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
}

object RestoreSecretResponse {
  @scala.inline
  def apply(): RestoreSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreSecretResponse]
  }
  @scala.inline
  implicit class RestoreSecretResponseOps[Self <: RestoreSecretResponse] (val x: Self) extends AnyVal {
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
  }
  
}

