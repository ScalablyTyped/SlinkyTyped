package typingsSlinky.pulumiAws.kmsGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyResult extends js.Object {
  val arn: String = js.native
  val awsAccountId: String = js.native
  val creationDate: String = js.native
  val customerMasterKeySpec: String = js.native
  val deletionDate: String = js.native
  val description: String = js.native
  val enabled: Boolean = js.native
  val expirationModel: String = js.native
  val grantTokens: js.UndefOr[js.Array[String]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val keyId: String = js.native
  val keyManager: String = js.native
  val keyState: String = js.native
  val keyUsage: String = js.native
  val origin: String = js.native
  val validTo: String = js.native
}

object GetKeyResult {
  @scala.inline
  def apply(
    arn: String,
    awsAccountId: String,
    creationDate: String,
    customerMasterKeySpec: String,
    deletionDate: String,
    description: String,
    enabled: Boolean,
    expirationModel: String,
    id: String,
    keyId: String,
    keyManager: String,
    keyState: String,
    keyUsage: String,
    origin: String,
    validTo: String
  ): GetKeyResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], awsAccountId = awsAccountId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], customerMasterKeySpec = customerMasterKeySpec.asInstanceOf[js.Any], deletionDate = deletionDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], expirationModel = expirationModel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], keyManager = keyManager.asInstanceOf[js.Any], keyState = keyState.asInstanceOf[js.Any], keyUsage = keyUsage.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], validTo = validTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyResult]
  }
  @scala.inline
  implicit class GetKeyResultOps[Self <: GetKeyResult] (val x: Self) extends AnyVal {
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
    def withAwsAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomerMasterKeySpec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerMasterKeySpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletionDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyManager(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyUsage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrantTokens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantTokens")(js.undefined)
        ret
    }
  }
  
}

