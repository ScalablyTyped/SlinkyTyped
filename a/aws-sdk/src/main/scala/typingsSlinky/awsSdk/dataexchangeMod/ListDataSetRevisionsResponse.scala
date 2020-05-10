package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSetRevisionsResponse extends js.Object {
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.NextToken] = js.native
  /**
    * The asset objects listed by the request.
    */
  var Revisions: js.UndefOr[ListOfRevisionEntry] = js.native
}

object ListDataSetRevisionsResponse {
  @scala.inline
  def apply(): ListDataSetRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSetRevisionsResponse]
  }
  @scala.inline
  implicit class ListDataSetRevisionsResponseOps[Self <: ListDataSetRevisionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withRevisions(value: ListOfRevisionEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revisions")(js.undefined)
        ret
    }
  }
  
}

