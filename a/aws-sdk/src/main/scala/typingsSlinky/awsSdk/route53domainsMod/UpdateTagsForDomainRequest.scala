package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTagsForDomainRequest extends js.Object {
  /**
    * The domain for which you want to add or update tags.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the corresponding value will be replaced.
    */
  var TagsToUpdate: js.UndefOr[TagList] = js.native
}

object UpdateTagsForDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): UpdateTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagsForDomainRequest]
  }
  @scala.inline
  implicit class UpdateTagsForDomainRequestOps[Self <: UpdateTagsForDomainRequest] (val x: Self) extends AnyVal {
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
    def withTagsToUpdate(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsToUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsToUpdate")(js.undefined)
        ret
    }
  }
  
}

