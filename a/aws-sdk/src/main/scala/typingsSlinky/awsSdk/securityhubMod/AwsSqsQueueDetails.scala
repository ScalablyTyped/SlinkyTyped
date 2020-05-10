package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsSqsQueueDetails extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of maxReceiveCount is exceeded. 
    */
  var DeadLetterTargetArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again.
    */
  var KmsDataKeyReusePeriodSeconds: js.UndefOr[Integer] = js.native
  /**
    * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the new queue.
    */
  var QueueName: js.UndefOr[NonEmptyString] = js.native
}

object AwsSqsQueueDetails {
  @scala.inline
  def apply(): AwsSqsQueueDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSqsQueueDetails]
  }
  @scala.inline
  implicit class AwsSqsQueueDetailsOps[Self <: AwsSqsQueueDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadLetterTargetArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeadLetterTargetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadLetterTargetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeadLetterTargetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsDataKeyReusePeriodSeconds(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsDataKeyReusePeriodSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsDataKeyReusePeriodSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsDataKeyReusePeriodSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsMasterKeyId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsMasterKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsMasterKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsMasterKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueName")(js.undefined)
        ret
    }
  }
  
}

