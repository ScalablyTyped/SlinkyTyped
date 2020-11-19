package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSubnetGroupMessage extends js.Object {
  
  /**
    * A list of ClusterSubnetGroup instances. 
    */
  var ClusterSubnetGroups: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ClusterSubnetGroups] = js.native
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object ClusterSubnetGroupMessage {
  
  @scala.inline
  def apply(): ClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class ClusterSubnetGroupMessageOps[Self <: ClusterSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterSubnetGroupsVarargs(value: ClusterSubnetGroup*): Self = this.set("ClusterSubnetGroups", js.Array(value :_*))
    
    @scala.inline
    def setClusterSubnetGroups(value: ClusterSubnetGroups): Self = this.set("ClusterSubnetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSubnetGroups: Self = this.set("ClusterSubnetGroups", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
