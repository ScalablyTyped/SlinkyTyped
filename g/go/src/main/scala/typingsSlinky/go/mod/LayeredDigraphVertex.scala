package typingsSlinky.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This holds LayeredDigraphLayout-specific information about Nodes.*/
@JSImport("go", "LayeredDigraphVertex")
@js.native
/**
  * This constructs a vertex that does not know about any Node.
  */
class LayeredDigraphVertex () extends LayoutVertex {
  
  /**The column to which the node is assigned.*/
  var column: Double = js.native
  
  /**The connected component to which the node is assigned.*/
  var component: Double = js.native
  
  /**The index to which the node is assigned.*/
  var index: Double = js.native
  
  /**The layer to which the node is assigned.*/
  var layer: Double = js.native
  
  /**Another LayeredDigraphVertex in the same layer that this node should be near.*/
  var near: LayeredDigraphVertex = js.native
}
