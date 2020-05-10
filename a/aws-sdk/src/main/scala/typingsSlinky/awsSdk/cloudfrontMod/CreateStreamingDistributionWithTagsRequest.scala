package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamingDistributionWithTagsRequest extends js.Object {
  /**
    *  The streaming distribution's configuration information. 
    */
  var StreamingDistributionConfigWithTags: typingsSlinky.awsSdk.cloudfrontMod.StreamingDistributionConfigWithTags = js.native
}

object CreateStreamingDistributionWithTagsRequest {
  @scala.inline
  def apply(StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags): CreateStreamingDistributionWithTagsRequest = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfigWithTags = StreamingDistributionConfigWithTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingDistributionWithTagsRequest]
  }
  @scala.inline
  implicit class CreateStreamingDistributionWithTagsRequestOps[Self <: CreateStreamingDistributionWithTagsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamingDistributionConfigWithTags(value: StreamingDistributionConfigWithTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamingDistributionConfigWithTags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

