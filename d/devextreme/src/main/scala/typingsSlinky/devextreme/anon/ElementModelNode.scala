package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.viz.dxTreeMap
import typingsSlinky.devextreme.mod.DevExpress.viz.dxTreeMapNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementModelNode extends StObject {
  
  var component: js.UndefOr[dxTreeMap] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var node: js.UndefOr[dxTreeMapNode] = js.native
}
object ElementModelNode {
  
  @scala.inline
  def apply(): ElementModelNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementModelNode]
  }
  
  @scala.inline
  implicit class ElementModelNodeMutableBuilder[Self <: ElementModelNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxTreeMap): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNode(value: dxTreeMapNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
