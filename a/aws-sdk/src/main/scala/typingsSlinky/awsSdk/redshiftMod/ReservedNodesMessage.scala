package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedNodesMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The list of ReservedNode objects.
    */
  var ReservedNodes: js.UndefOr[ReservedNodeList] = js.native
}
object ReservedNodesMessage {
  
  @scala.inline
  def apply(): ReservedNodesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNodesMessage]
  }
  
  @scala.inline
  implicit class ReservedNodesMessageMutableBuilder[Self <: ReservedNodesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setReservedNodes(value: ReservedNodeList): Self = StObject.set(x, "ReservedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNodesUndefined: Self = StObject.set(x, "ReservedNodes", js.undefined)
    
    @scala.inline
    def setReservedNodesVarargs(value: ReservedNode*): Self = StObject.set(x, "ReservedNodes", js.Array(value :_*))
  }
}
