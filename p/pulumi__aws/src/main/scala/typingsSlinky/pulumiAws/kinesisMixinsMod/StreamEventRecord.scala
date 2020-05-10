package typingsSlinky.pulumiAws.kinesisMixinsMod

import typingsSlinky.pulumiAws.AnonKinesisSchemaVersion
import typingsSlinky.pulumiAws.pulumiAwsStrings.awsColonkinesis
import typingsSlinky.pulumiAws.pulumiAwsStrings.awsColonkinesisColonrecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamEventRecord extends js.Object {
  var awsRegion: String = js.native
  var eventID: String = js.native
  var eventName: awsColonkinesisColonrecord = js.native
  var eventSource: awsColonkinesis = js.native
  var eventSourceARN: String = js.native
  var eventVersion: String = js.native
  var invokeIdentityArn: String = js.native
  var kinesis: AnonKinesisSchemaVersion = js.native
}

object StreamEventRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    eventID: String,
    eventName: awsColonkinesisColonrecord,
    eventSource: awsColonkinesis,
    eventSourceARN: String,
    eventVersion: String,
    invokeIdentityArn: String,
    kinesis: AnonKinesisSchemaVersion
  ): StreamEventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventID = eventID.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], invokeIdentityArn = invokeIdentityArn.asInstanceOf[js.Any], kinesis = kinesis.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEventRecord]
  }
  @scala.inline
  implicit class StreamEventRecordOps[Self <: StreamEventRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventName(value: awsColonkinesisColonrecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSource(value: awsColonkinesis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSourceARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokeIdentityArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeIdentityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKinesis(value: AnonKinesisSchemaVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

