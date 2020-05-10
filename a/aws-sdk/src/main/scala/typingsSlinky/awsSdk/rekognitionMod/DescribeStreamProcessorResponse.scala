package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamProcessorResponse extends js.Object {
  /**
    * Date and time the stream processor was created
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * Kinesis video stream that provides the source streaming video.
    */
  var Input: js.UndefOr[StreamProcessorInput] = js.native
  /**
    * The time, in Unix format, the stream processor was last updated. For example, when the stream processor moves from a running state to a failed state, or when the user starts or stops the stream processor.
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * Name of the stream processor. 
    */
  var Name: js.UndefOr[StreamProcessorName] = js.native
  /**
    * Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
    */
  var Output: js.UndefOr[StreamProcessorOutput] = js.native
  /**
    * ARN of the IAM role that allows access to the stream processor.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.RoleArn] = js.native
  /**
    * Face recognition input parameters that are being used by the stream processor. Includes the collection to use for face recognition and the face attributes to detect.
    */
  var Settings: js.UndefOr[StreamProcessorSettings] = js.native
  /**
    * Current status of the stream processor.
    */
  var Status: js.UndefOr[StreamProcessorStatus] = js.native
  /**
    * Detailed status message about the stream processor.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * ARN of the stream processor.
    */
  var StreamProcessorArn: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.StreamProcessorArn] = js.native
}

object DescribeStreamProcessorResponse {
  @scala.inline
  def apply(): DescribeStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamProcessorResponse]
  }
  @scala.inline
  implicit class DescribeStreamProcessorResponseOps[Self <: DescribeStreamProcessorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: StreamProcessorInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: StreamProcessorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: StreamProcessorOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Output")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: StreamProcessorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StreamProcessorStatus): Self = {
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
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamProcessorArn(value: StreamProcessorArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamProcessorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamProcessorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamProcessorArn")(js.undefined)
        ret
    }
  }
  
}

