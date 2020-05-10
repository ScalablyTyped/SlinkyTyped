package typingsSlinky.pulumiAws.getSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretVersionArgs extends js.Object {
  /**
    * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
    */
  val secretId: String = js.native
  /**
    * Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `versionStage`.
    */
  val versionId: js.UndefOr[String] = js.native
  /**
    * Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
    */
  val versionStage: js.UndefOr[String] = js.native
}

object GetSecretVersionArgs {
  @scala.inline
  def apply(secretId: String): GetSecretVersionArgs = {
    val __obj = js.Dynamic.literal(secretId = secretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretVersionArgs]
  }
  @scala.inline
  implicit class GetSecretVersionArgsOps[Self <: GetSecretVersionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecretId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionStage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionStage")(js.undefined)
        ret
    }
  }
  
}

