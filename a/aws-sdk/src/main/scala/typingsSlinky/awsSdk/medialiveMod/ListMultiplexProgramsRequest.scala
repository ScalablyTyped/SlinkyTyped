package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultiplexProgramsRequest extends js.Object {
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MaxResults] = js.native
  /**
    * The ID of the multiplex that the programs belong to.
    */
  var MultiplexId: string = js.native
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListMultiplexProgramsRequest {
  @scala.inline
  def apply(MultiplexId: string): ListMultiplexProgramsRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultiplexProgramsRequest]
  }
  @scala.inline
  implicit class ListMultiplexProgramsRequestOps[Self <: ListMultiplexProgramsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiplexId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiplexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
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
  }
  
}

