package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesResponse extends js.Object {
  /**
    *  Array of EntitySummary object.
    */
  var EntitySummaryList: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.EntitySummaryList] = js.native
  /**
    * The value of the next token if it exists. Null if there is no more result.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.NextToken] = js.native
}

object ListEntitiesResponse {
  @scala.inline
  def apply(): ListEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesResponse]
  }
  @scala.inline
  implicit class ListEntitiesResponseOps[Self <: ListEntitiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitySummaryList(value: EntitySummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitySummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitySummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitySummaryList")(js.undefined)
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

