package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartQueryResponse extends js.Object {
  /**
    * The unique ID of the query. 
    */
  var queryId: js.UndefOr[QueryId] = js.native
}

object StartQueryResponse {
  @scala.inline
  def apply(): StartQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartQueryResponse]
  }
  @scala.inline
  implicit class StartQueryResponseOps[Self <: StartQueryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryId(value: QueryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryId")(js.undefined)
        ret
    }
  }
  
}

