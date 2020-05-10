package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTagsRequest extends js.Object {
  /**
    * A list of configuration items that you want to tag.
    */
  var configurationIds: ConfigurationIdList = js.native
  /**
    * Tags that you want to associate with one or more configuration items. Specify the tags that you want to create in a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
    */
  var tags: TagSet = js.native
}

object CreateTagsRequest {
  @scala.inline
  def apply(configurationIds: ConfigurationIdList, tags: TagSet): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
  @scala.inline
  implicit class CreateTagsRequestOps[Self <: CreateTagsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationIds(value: ConfigurationIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

