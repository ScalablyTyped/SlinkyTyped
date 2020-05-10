package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchIndexResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The thing groups that match the search query.
    */
  var thingGroups: js.UndefOr[ThingGroupDocumentList] = js.native
  /**
    * The things that match the search query.
    */
  var things: js.UndefOr[ThingDocumentList] = js.native
}

object SearchIndexResponse {
  @scala.inline
  def apply(): SearchIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchIndexResponse]
  }
  @scala.inline
  implicit class SearchIndexResponseOps[Self <: SearchIndexResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withThingGroups(value: ThingGroupDocumentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withThings(value: ThingDocumentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("things")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("things")(js.undefined)
        ret
    }
  }
  
}

