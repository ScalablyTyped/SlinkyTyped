package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAttributesFromFindingsResponse extends js.Object {
  /**
    * Attributes details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}

object RemoveAttributesFromFindingsResponse {
  @scala.inline
  def apply(failedItems: FailedItems): RemoveAttributesFromFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesFromFindingsResponse]
  }
  @scala.inline
  implicit class RemoveAttributesFromFindingsResponseOps[Self <: RemoveAttributesFromFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedItems(value: FailedItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

