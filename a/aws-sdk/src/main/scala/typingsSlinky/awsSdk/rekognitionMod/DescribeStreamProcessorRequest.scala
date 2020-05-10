package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamProcessorRequest extends js.Object {
  /**
    * Name of the stream processor for which you want information.
    */
  var Name: StreamProcessorName = js.native
}

object DescribeStreamProcessorRequest {
  @scala.inline
  def apply(Name: StreamProcessorName): DescribeStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamProcessorRequest]
  }
  @scala.inline
  implicit class DescribeStreamProcessorRequestOps[Self <: DescribeStreamProcessorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: StreamProcessorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

