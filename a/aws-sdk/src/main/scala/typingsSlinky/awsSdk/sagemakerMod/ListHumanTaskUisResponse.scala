package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHumanTaskUisResponse extends js.Object {
  /**
    * An array of objects describing the human task user interfaces.
    */
  var HumanTaskUiSummaries: typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiSummaries = js.native
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListHumanTaskUisResponse {
  @scala.inline
  def apply(HumanTaskUiSummaries: HumanTaskUiSummaries): ListHumanTaskUisResponse = {
    val __obj = js.Dynamic.literal(HumanTaskUiSummaries = HumanTaskUiSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanTaskUisResponse]
  }
  @scala.inline
  implicit class ListHumanTaskUisResponseOps[Self <: ListHumanTaskUisResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanTaskUiSummaries(value: HumanTaskUiSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanTaskUiSummaries")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

