package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Groupdescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData extends StObject {
  
  var groups: Groupdescription = js.native
}
object TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData {
  
  @scala.inline
  def apply(groups: Groupdescription): TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData]
  }
  
  @scala.inline
  implicit class TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseDataMutableBuilder[Self <: TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: Groupdescription): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
  }
}
