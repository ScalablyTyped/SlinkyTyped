package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsRequest extends js.Object {
  /**
    * A list of configuration items with tags that you want to delete.
    */
  var configurationIds: ConfigurationIdList = js.native
  /**
    * Tags that you want to delete from one or more configuration items. Specify the tags that you want to delete in a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
    */
  var tags: js.UndefOr[TagSet] = js.native
}

object DeleteTagsRequest {
  @scala.inline
  def apply(configurationIds: ConfigurationIdList): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsRequest]
  }
  @scala.inline
  implicit class DeleteTagsRequestOps[Self <: DeleteTagsRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

