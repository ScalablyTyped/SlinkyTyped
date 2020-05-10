package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAliasesResponse extends js.Object {
  /**
    * The entity's paginated aliases.
    */
  var Aliases: js.UndefOr[typingsSlinky.awsSdk.workmailMod.Aliases] = js.native
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.workmailMod.NextToken] = js.native
}

object ListAliasesResponse {
  @scala.inline
  def apply(): ListAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAliasesResponse]
  }
  @scala.inline
  implicit class ListAliasesResponseOps[Self <: ListAliasesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: Aliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aliases")(js.undefined)
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

