package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLinkAttributesResponse extends js.Object {
  /**
    * The attributes that are associated with the typed link.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.native
}

object GetLinkAttributesResponse {
  @scala.inline
  def apply(): GetLinkAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLinkAttributesResponse]
  }
  @scala.inline
  implicit class GetLinkAttributesResponseOps[Self <: GetLinkAttributesResponse] (val x: Self) extends AnyVal {
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

