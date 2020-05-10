package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamKinesisSourceConfiguration extends js.Object {
  /**
    * The kinesis stream used as the source of the firehose delivery stream.
    */
  var kinesisStreamArn: String = js.native
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: String = js.native
}

object FirehoseDeliveryStreamKinesisSourceConfiguration {
  @scala.inline
  def apply(kinesisStreamArn: String, roleArn: String): FirehoseDeliveryStreamKinesisSourceConfiguration = {
    val __obj = js.Dynamic.literal(kinesisStreamArn = kinesisStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamKinesisSourceConfiguration]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamKinesisSourceConfigurationOps[Self <: FirehoseDeliveryStreamKinesisSourceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKinesisStreamArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisStreamArn")(value.asInstanceOf[js.Any])
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

