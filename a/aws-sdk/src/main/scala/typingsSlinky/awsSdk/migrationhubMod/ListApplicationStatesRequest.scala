package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationStatesRequest extends js.Object {
  /**
    * The configurationIds from the Application Discovery Service that uniquely identifies your applications.
    */
  var ApplicationIds: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ApplicationIds] = js.native
  /**
    * Maximum number of results to be returned per page.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.MaxResults] = js.native
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListApplicationStatesRequest {
  @scala.inline
  def apply(): ListApplicationStatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationStatesRequest]
  }
  @scala.inline
  implicit class ListApplicationStatesRequestOps[Self <: ListApplicationStatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationIds(value: ApplicationIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationIds")(js.undefined)
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

