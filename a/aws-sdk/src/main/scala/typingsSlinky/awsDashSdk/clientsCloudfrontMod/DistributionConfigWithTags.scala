package typingsSlinky.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionConfigWithTags extends js.Object {
  /**
    * A distribution configuration.
    */
  var DistributionConfig: typingsSlinky.awsDashSdk.clientsCloudfrontMod.DistributionConfig = js.native
  /**
    * A complex type that contains zero or more Tag elements.
    */
  var Tags: typingsSlinky.awsDashSdk.clientsCloudfrontMod.Tags = js.native
}

object DistributionConfigWithTags {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig, Tags: Tags): DistributionConfigWithTags = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistributionConfigWithTags]
  }
}

