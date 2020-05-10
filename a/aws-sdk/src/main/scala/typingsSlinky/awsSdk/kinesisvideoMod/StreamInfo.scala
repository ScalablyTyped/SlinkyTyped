package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamInfo extends js.Object {
  /**
    * A time stamp that indicates when the stream was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * How long the stream retains data, in hours.
    */
  var DataRetentionInHours: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.DataRetentionInHours] = js.native
  /**
    * The name of the device that is associated with the stream.
    */
  var DeviceName: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.DeviceName] = js.native
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on the stream.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.KmsKeyId] = js.native
  /**
    * The MediaType of the stream. 
    */
  var MediaType: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.MediaType] = js.native
  /**
    * The status of the stream.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.Status] = js.native
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.StreamName] = js.native
  /**
    * The version of the stream.
    */
  var Version: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.Version] = js.native
}

object StreamInfo {
  @scala.inline
  def apply(): StreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamInfo]
  }
  @scala.inline
  implicit class StreamInfoOps[Self <: StreamInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDataRetentionInHours(value: DataRetentionInHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRetentionInHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRetentionInHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRetentionInHours")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceName(value: DeviceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: MediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

