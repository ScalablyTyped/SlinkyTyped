package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeCollectionLayout extends StObject {
  
  /**
    * Position the nodes for a discrete/synchronous layout.
    * http://js.cytoscape.org/#nodes.layoutPositions
    * @param layout The layout.
    * @param options The layout options object.
    */
  def layoutPositions(layout: String, options: LayoutPositionOptions, handler: ElementPositionFunction): Unit = js.native
}
object NodeCollectionLayout {
  
  @scala.inline
  def apply(layoutPositions: (String, LayoutPositionOptions, ElementPositionFunction) => Unit): NodeCollectionLayout = {
    val __obj = js.Dynamic.literal(layoutPositions = js.Any.fromFunction3(layoutPositions))
    __obj.asInstanceOf[NodeCollectionLayout]
  }
  
  @scala.inline
  implicit class NodeCollectionLayoutMutableBuilder[Self <: NodeCollectionLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayoutPositions(value: (String, LayoutPositionOptions, ElementPositionFunction) => Unit): Self = StObject.set(x, "layoutPositions", js.Any.fromFunction3(value))
  }
}
