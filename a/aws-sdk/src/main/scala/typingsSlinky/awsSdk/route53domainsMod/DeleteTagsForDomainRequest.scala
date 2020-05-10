package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsForDomainRequest extends js.Object {
  /**
    * The domain for which you want to delete one or more tags.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * A list of tag keys to delete.
    */
  var TagsToDelete: TagKeyList = js.native
}

object DeleteTagsForDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName, TagsToDelete: TagKeyList): DeleteTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], TagsToDelete = TagsToDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsForDomainRequest]
  }
  @scala.inline
  implicit class DeleteTagsForDomainRequestOps[Self <: DeleteTagsForDomainRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagsToDelete(value: TagKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToDelete")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

