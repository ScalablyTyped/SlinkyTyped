package typingsSlinky.nodeRedEditorClient.anon

import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddToGroup extends StObject {
  
  var addToGroup: js.UndefOr[js.Object] = js.native
  
  var links: js.UndefOr[js.Array[js.Object]] = js.native
  
  var nodes: js.Array[js.Object] = js.native
  
  var removeFromGroup: js.UndefOr[js.Object] = js.native
  
  var removedLinks: js.UndefOr[js.Array[js.Object]] = js.native
  
  var t: move = js.native
}
object AddToGroup {
  
  @scala.inline
  def apply(nodes: js.Array[js.Object], t: move): AddToGroup = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToGroup]
  }
  
  @scala.inline
  implicit class AddToGroupMutableBuilder[Self <: AddToGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddToGroup(value: js.Object): Self = StObject.set(x, "addToGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddToGroupUndefined: Self = StObject.set(x, "addToGroup", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setRemoveFromGroup(value: js.Object): Self = StObject.set(x, "removeFromGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFromGroupUndefined: Self = StObject.set(x, "removeFromGroup", js.undefined)
    
    @scala.inline
    def setRemovedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "removedLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedLinksUndefined: Self = StObject.set(x, "removedLinks", js.undefined)
    
    @scala.inline
    def setRemovedLinksVarargs(value: js.Object*): Self = StObject.set(x, "removedLinks", js.Array(value :_*))
    
    @scala.inline
    def setT(value: move): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
