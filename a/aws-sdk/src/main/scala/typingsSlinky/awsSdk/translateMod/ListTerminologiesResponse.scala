package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTerminologiesResponse extends js.Object {
  /**
    *  If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom terminologies.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.translateMod.NextToken] = js.native
  /**
    * The properties list of the custom terminologies returned on the list request.
    */
  var TerminologyPropertiesList: js.UndefOr[typingsSlinky.awsSdk.translateMod.TerminologyPropertiesList] = js.native
}

object ListTerminologiesResponse {
  @scala.inline
  def apply(): ListTerminologiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTerminologiesResponse]
  }
  @scala.inline
  implicit class ListTerminologiesResponseOps[Self <: ListTerminologiesResponse] (val x: Self) extends AnyVal {
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
    def withTerminologyPropertiesList(value: TerminologyPropertiesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminologyPropertiesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminologyPropertiesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminologyPropertiesList")(js.undefined)
        ret
    }
  }
  
}

