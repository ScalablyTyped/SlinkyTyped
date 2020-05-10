package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteImportDataRequest extends js.Object {
  /**
    * The IDs for the import tasks that you want to delete.
    */
  var importTaskIds: ToDeleteIdentifierList = js.native
}

object BatchDeleteImportDataRequest {
  @scala.inline
  def apply(importTaskIds: ToDeleteIdentifierList): BatchDeleteImportDataRequest = {
    val __obj = js.Dynamic.literal(importTaskIds = importTaskIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteImportDataRequest]
  }
  @scala.inline
  implicit class BatchDeleteImportDataRequestOps[Self <: BatchDeleteImportDataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportTaskIds(value: ToDeleteIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importTaskIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

