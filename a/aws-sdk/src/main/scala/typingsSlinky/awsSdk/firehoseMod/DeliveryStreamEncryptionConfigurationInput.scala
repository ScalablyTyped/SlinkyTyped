package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryStreamEncryptionConfigurationInput extends js.Object {
  /**
    * If you set KeyType to CUSTOMER_MANAGED_CMK, you must specify the Amazon Resource Name (ARN) of the CMK. If you set KeyType to AWS_OWNED_CMK, Kinesis Data Firehose uses a service-account CMK.
    */
  var KeyARN: js.UndefOr[AWSKMSKeyARN] = js.native
  /**
    * Indicates the type of customer master key (CMK) to use for encryption. The default setting is AWS_OWNED_CMK. For more information about CMKs, see Customer Master Keys (CMKs). When you invoke CreateDeliveryStream or StartDeliveryStreamEncryption with KeyType set to CUSTOMER_MANAGED_CMK, Kinesis Data Firehose invokes the Amazon KMS operation CreateGrant to create a grant that allows the Kinesis Data Firehose service to use the customer managed CMK to perform encryption and decryption. Kinesis Data Firehose manages that grant.  When you invoke StartDeliveryStreamEncryption to change the CMK for a delivery stream that is already encrypted with a customer managed CMK, Kinesis Data Firehose schedules the grant it had on the old CMK for retirement.
    */
  var KeyType: typingsSlinky.awsSdk.firehoseMod.KeyType = js.native
}

object DeliveryStreamEncryptionConfigurationInput {
  @scala.inline
  def apply(KeyType: KeyType): DeliveryStreamEncryptionConfigurationInput = {
    val __obj = js.Dynamic.literal(KeyType = KeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryStreamEncryptionConfigurationInput]
  }
  @scala.inline
  implicit class DeliveryStreamEncryptionConfigurationInputOps[Self <: DeliveryStreamEncryptionConfigurationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyType(value: KeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyType")(value.asInstanceOf[js.Any])
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
  }
  
}

