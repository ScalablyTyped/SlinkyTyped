package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNamedQueriesOutput extends js.Object {
  /**
    * The list of unique query IDs.
    */
  var NamedQueryIds: js.UndefOr[NamedQueryIdList] = js.native
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListNamedQueriesOutput {
  @scala.inline
  def apply(): ListNamedQueriesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNamedQueriesOutput]
  }
  @scala.inline
  implicit class ListNamedQueriesOutputOps[Self <: ListNamedQueriesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedQueryIds(value: NamedQueryIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQueryIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedQueryIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQueryIds")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
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

