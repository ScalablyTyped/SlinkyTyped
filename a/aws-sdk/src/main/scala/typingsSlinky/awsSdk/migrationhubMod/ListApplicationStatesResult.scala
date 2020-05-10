package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationStatesResult extends js.Object {
  /**
    * A list of Applications that exist in Application Discovery Service.
    */
  var ApplicationStateList: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ApplicationStateList] = js.native
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListApplicationStatesResult {
  @scala.inline
  def apply(): ListApplicationStatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationStatesResult]
  }
  @scala.inline
  implicit class ListApplicationStatesResultOps[Self <: ListApplicationStatesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationStateList(value: ApplicationStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationStateList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationStateList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationStateList")(js.undefined)
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

