package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Groupdescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsListIdPGroupsInOrgResponseData extends js.Object {
  
  var groups: js.Array[Groupdescription] = js.native
}
object TeamsListIdPGroupsInOrgResponseData {
  
  @scala.inline
  def apply(groups: js.Array[Groupdescription]): TeamsListIdPGroupsInOrgResponseData = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListIdPGroupsInOrgResponseData]
  }
  
  @scala.inline
  implicit class TeamsListIdPGroupsInOrgResponseDataOps[Self <: TeamsListIdPGroupsInOrgResponseData] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: Groupdescription*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[Groupdescription]): Self = this.set("groups", value.asInstanceOf[js.Any])
  }
}
