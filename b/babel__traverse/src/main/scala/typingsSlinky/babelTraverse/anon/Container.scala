package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.mod.HubInterface
import typingsSlinky.babelTraverse.mod.NodePath
import typingsSlinky.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container[C /* <: Node */, K /* <: /* keyof C */ String */] extends StObject {
  
  var container: C = js.native
  
  var hub: HubInterface = js.native
  
  var key: K = js.native
  
  var listKey: js.UndefOr[String] = js.native
  
  var parent: Node = js.native
  
  var parentPath: NodePath[Node] | Null = js.native
}
object Container {
  
  @scala.inline
  def apply[C /* <: Node */, K /* <: /* keyof C */ String */](container: C, hub: HubInterface, key: K, parent: Node): Container[C, K] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], hub = hub.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container[C, K]]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container[_, _], C /* <: Node */, K /* <: /* keyof C */ String */] (val x: Self with (Container[C, K])) extends AnyVal {
    
    @scala.inline
    def setContainer(value: C): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHub(value: HubInterface): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListKey(value: String): Self = StObject.set(x, "listKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListKeyUndefined: Self = StObject.set(x, "listKey", js.undefined)
    
    @scala.inline
    def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentPath(value: NodePath[Node]): Self = StObject.set(x, "parentPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentPathNull: Self = StObject.set(x, "parentPath", null)
  }
}
