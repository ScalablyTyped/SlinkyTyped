package typingsSlinky.pulumiAws.getSecretsMod

import typingsSlinky.pulumiAws.inputMod.kms.GetSecretsSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretsArgs extends js.Object {
  /**
    * One or more encrypted payload definitions from the KMS service. See the Secret Definitions below.
    */
  val secrets: js.Array[GetSecretsSecret] = js.native
}

object GetSecretsArgs {
  @scala.inline
  def apply(secrets: js.Array[GetSecretsSecret]): GetSecretsArgs = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretsArgs]
  }
  @scala.inline
  implicit class GetSecretsArgsOps[Self <: GetSecretsArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecrets(value: js.Array[GetSecretsSecret]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

