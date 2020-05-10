package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsKinesisStream extends js.Object {
  var resourceArn: String = js.native
  var roleArn: String = js.native
}

object AnalyticsApplicationInputsKinesisStream {
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationInputsKinesisStream = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsKinesisStream]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsKinesisStreamOps[Self <: AnalyticsApplicationInputsKinesisStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

