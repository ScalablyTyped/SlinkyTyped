package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAttributesResponse extends js.Object {
  /**
    * A list of attribute objects that were successfully deleted from your resource.
    */
  var attributes: js.UndefOr[Attributes] = js.native
}

object DeleteAttributesResponse {
  @scala.inline
  def apply(): DeleteAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAttributesResponse]
  }
  @scala.inline
  implicit class DeleteAttributesResponseOps[Self <: DeleteAttributesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
  }
  
}

