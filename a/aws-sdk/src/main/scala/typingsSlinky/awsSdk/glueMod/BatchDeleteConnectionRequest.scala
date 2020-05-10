package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteConnectionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A list of names of the connections to delete.
    */
  var ConnectionNameList: DeleteConnectionNameList = js.native
}

object BatchDeleteConnectionRequest {
  @scala.inline
  def apply(ConnectionNameList: DeleteConnectionNameList): BatchDeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionNameList = ConnectionNameList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteConnectionRequest]
  }
  @scala.inline
  implicit class BatchDeleteConnectionRequestOps[Self <: BatchDeleteConnectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionNameList(value: DeleteConnectionNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionNameList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalogId(value: CatalogIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(js.undefined)
        ret
    }
  }
  
}

