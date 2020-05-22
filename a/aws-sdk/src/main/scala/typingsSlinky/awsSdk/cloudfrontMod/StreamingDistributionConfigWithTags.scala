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
}

