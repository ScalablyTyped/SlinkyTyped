package typingsSlinky.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleS3Action extends js.Object {
  /**
    * The name of the S3 bucket
    */
  var bucketName: String = js.native
  /**
    * The ARN of the KMS key
    */
  var kmsKeyArn: js.UndefOr[String] = js.native
  /**
    * The key prefix of the S3 bucket
    */
  var objectKeyPrefix: js.UndefOr[String] = js.native
  /**
    * The position of the action in the receipt rule
    */
  var position: Double = js.native
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.native
}

object ReceiptRuleS3Action {
  @scala.inline
  def apply(bucketName: String, position: Double): ReceiptRuleS3Action = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleS3Action]
  }
  @scala.inline
  implicit class ReceiptRuleS3ActionOps[Self <: ReceiptRuleS3Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectKeyPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectKeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectKeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectKeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(js.undefined)
        ret
    }
  }
  
}

