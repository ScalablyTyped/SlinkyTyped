package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingDistributionConfigWithTags extends js.Object {
  /**
    * A streaming distribution Configuration.
    */
  var StreamingDistributionConfig: typingsSlinky.awsSdk.cloudfrontMod.StreamingDistributionConfig = js.native
  /**
    * A complex type that contains zero or more Tag elements.
    */
  var Tags: typingsSlinky.awsSdk.cloudfrontMod.Tags = js.native
}

object StreamingDistributionConfigWithTags {
  @scala.inline
  def apply(StreamingDistributionConfig: StreamingDistributionConfig, Tags: Tags): StreamingDistributionConfigWithTags = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingDistributionConfigWithTags]
  }
  @scala.inline
  implicit class StreamingDistributionConfigWithTagsOps[Self <: StreamingDistributionConfigWithTags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamingDistributionConfig(value: StreamingDistributionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamingDistributionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

