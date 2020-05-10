package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretValueResponse extends js.Object {
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The date and time that this version of the secret was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  /**
    * The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a base64-encoded string. This parameter is not used if the secret is created by the Secrets Manager console. If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the SecretString or SecretBinary fields.
    */
  var SecretBinary: js.UndefOr[SecretBinaryType] = js.native
  /**
    * The decrypted part of the protected secret information that was originally provided as a string. If you create this secret by using the Secrets Manager console then only the SecretString parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse. If you store custom information in the secret by using the CreateSecret, UpdateSecret, or PutSecretValue API operations instead of the Secrets Manager console, or by using the Other secret type in the console, then you must code your Lambda rotation function to parse and interpret those values.
    */
  var SecretString: js.UndefOr[SecretStringType] = js.native
  /**
    * The unique identifier of this version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
  /**
    * A list of all of the staging labels currently attached to this version of the secret.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.native
}

object GetSecretValueResponse {
  @scala.inline
  def apply(): GetSecretValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecretValueResponse]
  }
  @scala.inline
  implicit class GetSecretValueResponseOps[Self <: GetSecretValueResponse] (val x: Self) extends AnyVal {
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
    def withSecretBinaryUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretBinary(value: SecretBinaryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretBinary")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretString(value: SecretStringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretString")(js.undefined)
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

