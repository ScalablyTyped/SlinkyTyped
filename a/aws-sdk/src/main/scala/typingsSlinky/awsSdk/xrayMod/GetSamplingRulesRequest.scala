package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingRulesRequest extends js.Object {
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetSamplingRulesRequest {
  @scala.inline
  def apply(): GetSamplingRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingRulesRequest]
  }
  @scala.inline
  implicit class GetSamplingRulesRequestOps[Self <: GetSamplingRulesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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

