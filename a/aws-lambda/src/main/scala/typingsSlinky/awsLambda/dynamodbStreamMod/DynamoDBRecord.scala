package typingsSlinky.awsLambda.dynamodbStreamMod

import typingsSlinky.awsLambda.awsLambdaStrings.INSERT
import typingsSlinky.awsLambda.awsLambdaStrings.MODIFY
import typingsSlinky.awsLambda.awsLambdaStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBRecord extends js.Object {
  var awsRegion: js.UndefOr[String] = js.native
  var dynamodb: js.UndefOr[StreamRecord] = js.native
  var eventID: js.UndefOr[String] = js.native
  var eventName: js.UndefOr[INSERT | MODIFY | REMOVE] = js.native
  var eventSource: js.UndefOr[String] = js.native
  var eventSourceARN: js.UndefOr[String] = js.native
  var eventVersion: js.UndefOr[String] = js.native
  var userIdentity: js.UndefOr[js.Any] = js.native
}

object DynamoDBRecord {
  @scala.inline
  def apply(): DynamoDBRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamoDBRecord]
  }
  @scala.inline
  implicit class DynamoDBRecordOps[Self <: DynamoDBRecord] (val x: Self) extends AnyVal {
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
    def withoutAwsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamodb(value: StreamRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamodb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(js.undefined)
        ret
    }
    @scala.inline
    def withEventID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventID")(js.undefined)
        ret
    }
    @scala.inline
    def withEventName(value: INSERT | MODIFY | REMOVE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSourceARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceARN")(js.undefined)
        ret
    }
    @scala.inline
    def withEventVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIdentity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIdentity")(js.undefined)
        ret
    }
  }
  
}

