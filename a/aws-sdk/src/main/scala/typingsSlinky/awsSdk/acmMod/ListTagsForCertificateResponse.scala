package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForCertificateResponse extends js.Object {
  /**
    * The key-value pairs that define the applied tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ListTagsForCertificateResponse {
  @scala.inline
  def apply(): ListTagsForCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForCertificateResponse]
  }
  @scala.inline
  implicit class ListTagsForCertificateResponseOps[Self <: ListTagsForCertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

