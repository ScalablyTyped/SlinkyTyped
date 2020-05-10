package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOpsItemResponse extends js.Object {
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[String] = js.native
}

object CreateOpsItemResponse {
  @scala.inline
  def apply(): CreateOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOpsItemResponse]
  }
  @scala.inline
  implicit class CreateOpsItemResponseOps[Self <: CreateOpsItemResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutOpsItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsItemId")(js.undefined)
        ret
    }
  }
  
}

