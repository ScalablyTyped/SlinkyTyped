package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBootstrapActionsOutput extends StObject {
  
  /**
    * The bootstrap actions associated with the cluster.
    */
  var BootstrapActions: js.UndefOr[CommandList] = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.emrMod.Marker] = js.native
}
object ListBootstrapActionsOutput {
  
  @scala.inline
  def apply(): ListBootstrapActionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBootstrapActionsOutput]
  }
  
  @scala.inline
  implicit class ListBootstrapActionsOutputMutableBuilder[Self <: ListBootstrapActionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootstrapActions(value: CommandList): Self = StObject.set(x, "BootstrapActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapActionsUndefined: Self = StObject.set(x, "BootstrapActions", js.undefined)
    
    @scala.inline
    def setBootstrapActionsVarargs(value: Command*): Self = StObject.set(x, "BootstrapActions", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
