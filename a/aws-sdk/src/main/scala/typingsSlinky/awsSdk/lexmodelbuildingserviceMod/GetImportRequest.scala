package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImportRequest extends js.Object {
  /**
    * The identifier of the import job information to return.
    */
  var importId: String = js.native
}

object GetImportRequest {
  @scala.inline
  def apply(importId: String): GetImportRequest = {
    val __obj = js.Dynamic.literal(importId = importId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportRequest]
  }
  @scala.inline
  implicit class GetImportRequestOps[Self <: GetImportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

