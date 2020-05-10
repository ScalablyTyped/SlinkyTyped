package typingsSlinky.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestResponse extends js.Object {
  /**
    * The status of a SuggestRequest. Contains the resource ID (rid) and how long it took to process the request (timems).
    */
  var status: js.UndefOr[SuggestStatus] = js.native
  /**
    * Container for the matching search suggestion information.
    */
  var suggest: js.UndefOr[SuggestModel] = js.native
}

object SuggestResponse {
  @scala.inline
  def apply(): SuggestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestResponse]
  }
  @scala.inline
  implicit class SuggestResponseOps[Self <: SuggestResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: SuggestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggest(value: SuggestModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest")(js.undefined)
        ret
    }
  }
  
}

