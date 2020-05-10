package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStreamInput extends js.Object {
  /**
    * Optional: The version of the stream that you want to delete.  Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream version, use the DescribeStream API. If not specified, only the CreationTime is checked before deleting the stream.
    */
  var CurrentVersion: js.UndefOr[Version] = js.native
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to delete. 
    */
  var StreamARN: ResourceARN = js.native
}

object DeleteStreamInput {
  @scala.inline
  def apply(StreamARN: ResourceARN): DeleteStreamInput = {
    val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamInput]
  }
  @scala.inline
  implicit class DeleteStreamInputOps[Self <: DeleteStreamInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentVersion")(js.undefined)
        ret
    }
  }
  
}

