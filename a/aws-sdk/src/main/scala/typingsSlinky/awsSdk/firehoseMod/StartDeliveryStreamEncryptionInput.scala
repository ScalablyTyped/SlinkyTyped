package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDeliveryStreamEncryptionInput extends js.Object {
  /**
    * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
    */
  var DeliveryStreamEncryptionConfigurationInput: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.DeliveryStreamEncryptionConfigurationInput] = js.native
  /**
    * The name of the delivery stream for which you want to enable server-side encryption (SSE).
    */
  var DeliveryStreamName: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamName = js.native
}

object StartDeliveryStreamEncryptionInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): StartDeliveryStreamEncryptionInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeliveryStreamEncryptionInput]
  }
  @scala.inline
  implicit class StartDeliveryStreamEncryptionInputOps[Self <: StartDeliveryStreamEncryptionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStreamName(value: DeliveryStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryStreamEncryptionConfigurationInput(value: DeliveryStreamEncryptionConfigurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamEncryptionConfigurationInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryStreamEncryptionConfigurationInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamEncryptionConfigurationInput")(js.undefined)
        ret
    }
  }
  
}

