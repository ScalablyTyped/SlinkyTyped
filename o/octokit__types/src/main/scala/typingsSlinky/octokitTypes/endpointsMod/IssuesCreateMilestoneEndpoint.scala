package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.closed
import typingsSlinky.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesCreateMilestoneEndpoint extends StObject {
  
  /**
    * A description of the milestone.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var due_on: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * The state of the milestone. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.native
  
  /**
    * The title of the milestone.
    */
  var title: String = js.native
}
object IssuesCreateMilestoneEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, title: String): IssuesCreateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateMilestoneEndpoint]
  }
  
  @scala.inline
  implicit class IssuesCreateMilestoneEndpointMutableBuilder[Self <: IssuesCreateMilestoneEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_onUndefined: Self = StObject.set(x, "due_on", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
