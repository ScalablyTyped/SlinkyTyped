package typingsSlinky.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConnectionsInput extends js.Object {
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.MaxResults] = js.native
  /**
    * The token that was returned from the previous ListConnections call, which can be used to return the next set of connections in the list.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.NextToken] = js.native
  /**
    * Filters the list of connections to those associated with a specified provider, such as Bitbucket.
    */
  var ProviderTypeFilter: js.UndefOr[ProviderType] = js.native
}

object ListConnectionsInput {
  @scala.inline
  def apply(): ListConnectionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsInput]
  }
  @scala.inline
  implicit class ListConnectionsInputOps[Self <: ListConnectionsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withProviderTypeFilter(value: ProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderTypeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderTypeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderTypeFilter")(js.undefined)
        ret
    }
  }
  
}

