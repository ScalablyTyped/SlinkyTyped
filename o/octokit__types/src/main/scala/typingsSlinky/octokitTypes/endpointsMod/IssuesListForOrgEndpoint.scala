package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.all
import typingsSlinky.octokitTypes.octokitTypesStrings.asc
import typingsSlinky.octokitTypes.octokitTypesStrings.assigned
import typingsSlinky.octokitTypes.octokitTypesStrings.closed
import typingsSlinky.octokitTypes.octokitTypesStrings.comments
import typingsSlinky.octokitTypes.octokitTypesStrings.created
import typingsSlinky.octokitTypes.octokitTypesStrings.desc
import typingsSlinky.octokitTypes.octokitTypesStrings.mentioned
import typingsSlinky.octokitTypes.octokitTypesStrings.open
import typingsSlinky.octokitTypes.octokitTypesStrings.subscribed
import typingsSlinky.octokitTypes.octokitTypesStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesListForOrgEndpoint extends js.Object {
  
  /**
    * The direction of the sort. Can be either `asc` or `desc`.
    */
  var direction: js.UndefOr[asc | desc] = js.native
  
  /**
    * Indicates which sorts of issues to return. Can be one of:
    * \* `assigned`: Issues assigned to you
    * \* `created`: Issues created by you
    * \* `mentioned`: Issues mentioning you
    * \* `subscribed`: Issues you're subscribed to updates for
    * \* `all`: All issues the authenticated user can see, regardless of participation or creation
    */
  var filter: js.UndefOr[assigned | created | mentioned | subscribed | all] = js.native
  
  /**
    * A list of comma separated label names. Example: `bug,ui,@high`
    */
  var labels: js.UndefOr[String] = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  
  /**
    * Only issues updated at or after this time are returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var since: js.UndefOr[String] = js.native
  
  /**
    * What to sort results by. Can be either `created`, `updated`, `comments`.
    */
  var sort: js.UndefOr[created | updated | comments] = js.native
  
  /**
    * Indicates the state of the issues to return. Can be either `open`, `closed`, or `all`.
    */
  var state: js.UndefOr[open | closed | all] = js.native
}
object IssuesListForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String): IssuesListForOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListForOrgEndpoint]
  }
  
  @scala.inline
  implicit class IssuesListForOrgEndpointOps[Self <: IssuesListForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: asc | desc): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setFilter(value: assigned | created | mentioned | subscribed | all): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLabels(value: String): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
    
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    
    @scala.inline
    def setSort(value: created | updated | comments): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setState(value: open | closed | all): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
