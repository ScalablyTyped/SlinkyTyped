package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForDomainResponse extends js.Object {
  /**
    * A list of the tags that are associated with the specified domain.
    */
  var TagList: typingsSlinky.awsSdk.route53domainsMod.TagList = js.native
}

object ListTagsForDomainResponse {
  @scala.inline
  def apply(TagList: TagList): ListTagsForDomainResponse = {
    val __obj = js.Dynamic.literal(TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForDomainResponse]
  }
  @scala.inline
  implicit class ListTagsForDomainResponseOps[Self <: ListTagsForDomainResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagList(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

