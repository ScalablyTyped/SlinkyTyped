package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends StObject {
  
  /** A user-assigned name for this group, used only for display purposes. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The filter used to determine which monitored resources belong to this group. */
  var filter: js.UndefOr[String] = js.native
  
  /** If true, the members of this group are considered to be a cluster. The system can perform additional analysis on groups that are clusters. */
  var isCluster: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The name of this group. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] When creating a group, this field is ignored and a new name is created
    * consisting of the project specified in the call to CreateGroup and a unique [GROUP_ID] that is generated automatically.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The name of the group's parent, if it has one. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] For groups with no parent, parent_name is the empty string, "". */
  var parentName: js.UndefOr[String] = js.native
}
object Group {
  
  @scala.inline
  def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setIsCluster(value: Boolean): Self = StObject.set(x, "isCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClusterUndefined: Self = StObject.set(x, "isCluster", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
  }
}
