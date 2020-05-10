package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeadLetterConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
    */
  var TargetArn: js.UndefOr[ResourceArn] = js.native
}

object DeadLetterConfig {
  @scala.inline
  def apply(): DeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeadLetterConfig]
  }
  @scala.inline
  implicit class DeadLetterConfigOps[Self <: DeadLetterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetArn")(js.undefined)
        ret
    }
  }
  
}

