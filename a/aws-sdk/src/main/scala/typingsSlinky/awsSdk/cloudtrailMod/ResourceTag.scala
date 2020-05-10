package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTag extends js.Object {
  /**
    * Specifies the ARN of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * A list of tags.
    */
  var TagsList: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.TagsList] = js.native
}

object ResourceTag {
  @scala.inline
  def apply(): ResourceTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTag]
  }
  @scala.inline
  implicit class ResourceTagOps[Self <: ResourceTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsList(value: TagsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsList")(js.undefined)
        ret
    }
  }
  
}

