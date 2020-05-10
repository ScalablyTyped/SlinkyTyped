package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsKmsKeyDetails extends js.Object {
  /**
    * The twelve-digit account ID of the AWS account that owns the CMK.
    */
  var AWSAccountId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time when the CMK was created.
    */
  var CreationDate: js.UndefOr[Double] = js.native
  /**
    * The globally unique identifier for the CMK.
    */
  var KeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed.
    */
  var KeyManager: js.UndefOr[NonEmptyString] = js.native
  /**
    * The state of the CMK.
    */
  var KeyState: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source of the CMK's key material. When this value is AWS_KMS, AWS KMS created the key material. When this value is EXTERNAL, the key material was imported from your existing key management infrastructure or the CMK lacks key material. When this value is AWS_CLOUDHSM, the key material was created in the AWS CloudHSM cluster associated with a custom key store.
    */
  var Origin: js.UndefOr[NonEmptyString] = js.native
}

object AwsKmsKeyDetails {
  @scala.inline
  def apply(): AwsKmsKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsKmsKeyDetails]
  }
  @scala.inline
  implicit class AwsKmsKeyDetailsOps[Self <: AwsKmsKeyDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAWSAccountId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAWSAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyManager(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyManager")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyState(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyState")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(js.undefined)
        ret
    }
  }
  
}

