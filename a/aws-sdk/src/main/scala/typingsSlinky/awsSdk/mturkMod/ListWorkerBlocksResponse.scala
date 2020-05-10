package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkerBlocksResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
  /**
    *  The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
    */
  var WorkerBlocks: js.UndefOr[WorkerBlockList] = js.native
}

object ListWorkerBlocksResponse {
  @scala.inline
  def apply(): ListWorkerBlocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkerBlocksResponse]
  }
  @scala.inline
  implicit class ListWorkerBlocksResponseOps[Self <: ListWorkerBlocksResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNumResults(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumResults")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerBlocks(value: WorkerBlockList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerBlocks")(js.undefined)
        ret
    }
  }
  
}

