package typingsSlinky.pulumiAws.bucketNotificationMod

import typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationLambdaFunction
import typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationQueue
import typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationTopic
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketNotificationState extends js.Object {
  /**
    * The name of the bucket to put notification configuration.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * Used to configure notifications to a Lambda Function (documented below).
    */
  val lambdaFunctions: js.UndefOr[Input[js.Array[Input[BucketNotificationLambdaFunction]]]] = js.native
  /**
    * The notification configuration to SQS Queue (documented below).
    */
  val queues: js.UndefOr[Input[js.Array[Input[BucketNotificationQueue]]]] = js.native
  /**
    * The notification configuration to SNS Topic (documented below).
    */
  val topics: js.UndefOr[Input[js.Array[Input[BucketNotificationTopic]]]] = js.native
}

object BucketNotificationState {
  @scala.inline
  def apply(): BucketNotificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketNotificationState]
  }
  @scala.inline
  implicit class BucketNotificationStateOps[Self <: BucketNotificationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctions(value: Input[js.Array[Input[BucketNotificationLambdaFunction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withQueues(value: Input[js.Array[Input[BucketNotificationQueue]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(js.undefined)
        ret
    }
    @scala.inline
    def withTopics(value: Input[js.Array[Input[BucketNotificationTopic]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(js.undefined)
        ret
    }
  }
  
}

