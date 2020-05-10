package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionConfigWithTags extends js.Object {
  /**
    * A distribution configuration.
    */
  var DistributionConfig: typingsSlinky.awsSdk.cloudfrontMod.DistributionConfig = js.native
  /**
    * A complex type that contains zero or more Tag elements.
    */
  var Tags: typingsSlinky.awsSdk.cloudfrontMod.Tags = js.native
}

object DistributionConfigWithTags {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig, Tags: Tags): DistributionConfigWithTags = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfigWithTags]
  }
  @scala.inline
  implicit class DistributionConfigWithTagsOps[Self <: DistributionConfigWithTags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistributionConfig(value: DistributionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributionConfig")(value.asInstanceOf[js.Any])
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

