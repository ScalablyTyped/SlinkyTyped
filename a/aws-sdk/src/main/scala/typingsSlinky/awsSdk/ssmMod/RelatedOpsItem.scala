package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedOpsItem extends js.Object {
  /**
    * The ID of an OpsItem related to the current OpsItem.
    */
  var OpsItemId: String = js.native
}

object RelatedOpsItem {
  @scala.inline
  def apply(OpsItemId: String): RelatedOpsItem = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedOpsItem]
  }
  @scala.inline
  implicit class RelatedOpsItemOps[Self <: RelatedOpsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpsItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsItemId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

