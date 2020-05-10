package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpsItemResponse extends js.Object {
  /**
    * The OpsItem.
    */
  var OpsItem: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OpsItem] = js.native
}

object GetOpsItemResponse {
  @scala.inline
  def apply(): GetOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpsItemResponse]
  }
  @scala.inline
  implicit class GetOpsItemResponseOps[Self <: GetOpsItemResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpsItem(value: OpsItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpsItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsItem")(js.undefined)
        ret
    }
  }
  
}

