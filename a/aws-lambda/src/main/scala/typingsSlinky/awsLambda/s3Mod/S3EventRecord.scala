package typingsSlinky.awsLambda.s3Mod

import typingsSlinky.awsLambda.anon.Bucket
import typingsSlinky.awsLambda.anon.PrincipalId
import typingsSlinky.awsLambda.anon.SourceIPAddress
import typingsSlinky.awsLambda.anon.Xamzid2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3EventRecord extends js.Object {
  var awsRegion: String = js.native
  var eventName: String = js.native
  var eventSource: String = js.native
  var eventTime: String = js.native
  var eventVersion: String = js.native
  var glacierEventData: js.UndefOr[S3EventRecordGlacierEventData] = js.native
  var requestParameters: SourceIPAddress = js.native
  var responseElements: Xamzid2 = js.native
  var s3: Bucket = js.native
  var userIdentity: PrincipalId = js.native
}

object S3EventRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    eventName: String,
    eventSource: String,
    eventTime: String,
    eventVersion: String,
    requestParameters: SourceIPAddress,
    responseElements: Xamzid2,
    s3: Bucket,
    userIdentity: PrincipalId
  ): S3EventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], responseElements = responseElements.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3EventRecord]
  }
  @scala.inline
  implicit class S3EventRecordOps[Self <: S3EventRecord] (val x: Self) extends AnyVal {
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
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestParameters(value: SourceIPAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseElements(value: Xamzid2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3(value: Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserIdentity(value: PrincipalId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlacierEventData(value: S3EventRecordGlacierEventData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glacierEventData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlacierEventData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glacierEventData")(js.undefined)
        ret
    }
  }
  
}

