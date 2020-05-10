package typingsSlinky.pulumiAws.getSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretVersionResult extends js.Object {
  /**
    * The ARN of the secret.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
    */
  val secretBinary: String = js.native
  val secretId: String = js.native
  /**
    * The decrypted part of the protected secret information that was originally provided as a string.
    */
  val secretString: String = js.native
  /**
    * The unique identifier of this version of the secret.
    */
  val versionId: String = js.native
  val versionStage: js.UndefOr[String] = js.native
  val versionStages: js.Array[String] = js.native
}

object GetSecretVersionResult {
  @scala.inline
  def apply(
    arn: String,
    id: String,
    secretBinary: String,
    secretId: String,
    secretString: String,
    versionId: String,
    versionStages: js.Array[String]
  ): GetSecretVersionResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], secretBinary = secretBinary.asInstanceOf[js.Any], secretId = secretId.asInstanceOf[js.Any], secretString = secretString.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any], versionStages = versionStages.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretVersionResult]
  }
  @scala.inline
  implicit class GetSecretVersionResultOps[Self <: GetSecretVersionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretBinary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionStages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionStages")(value.asInstanceOf[js.Any])
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

