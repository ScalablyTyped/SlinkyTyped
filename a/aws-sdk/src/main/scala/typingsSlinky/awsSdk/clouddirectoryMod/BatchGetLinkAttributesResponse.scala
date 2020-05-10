package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetLinkAttributesResponse extends js.Object {
  /**
    * The attributes that are associated with the typed link.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.native
}

object BatchGetLinkAttributesResponse {
  @scala.inline
  def apply(): BatchGetLinkAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetLinkAttributesResponse]
  }
  @scala.inline
  implicit class BatchGetLinkAttributesResponseOps[Self <: BatchGetLinkAttributesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: AttributeKeyAndValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
  }
  
}

