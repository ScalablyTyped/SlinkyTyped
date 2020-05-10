package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryStreamEncryptionConfiguration extends js.Object {
  /**
    * Provides details in case one of the following operations fails due to an error related to KMS: CreateDeliveryStream, DeleteDeliveryStream, StartDeliveryStreamEncryption, StopDeliveryStreamEncryption.
    */
  var FailureDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.FailureDescription] = js.native
  /**
    * If KeyType is CUSTOMER_MANAGED_CMK, this field contains the ARN of the customer managed CMK. If KeyType is AWS_OWNED_CMK, DeliveryStreamEncryptionConfiguration doesn't contain a value for KeyARN.
    */
  var KeyARN: js.UndefOr[AWSKMSKeyARN] = js.native
  /**
    * Indicates the type of customer master key (CMK) that is used for encryption. The default setting is AWS_OWNED_CMK. For more information about CMKs, see Customer Master Keys (CMKs).
    */
  var KeyType: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.KeyType] = js.native
  /**
    * This is the server-side encryption (SSE) status for the delivery stream. For a full description of the different values of this status, see StartDeliveryStreamEncryption and StopDeliveryStreamEncryption. If this status is ENABLING_FAILED or DISABLING_FAILED, it is the status of the most recent attempt to enable or disable SSE, respectively.
    */
  var Status: js.UndefOr[DeliveryStreamEncryptionStatus] = js.native
}

object DeliveryStreamEncryptionConfiguration {
  @scala.inline
  def apply(): DeliveryStreamEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryStreamEncryptionConfiguration]
  }
  @scala.inline
  implicit class DeliveryStreamEncryptionConfigurationOps[Self <: DeliveryStreamEncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureDescription(value: FailureDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyARN(value: AWSKMSKeyARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyARN")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyType(value: KeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DeliveryStreamEncryptionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

