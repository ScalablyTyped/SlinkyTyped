package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NodeMaterialOptimizer")
@js.native
class NodeMaterialOptimizer ()
  extends typingsSlinky.babylonjs.BABYLON.NodeMaterialOptimizer {
  /**
    * Function used to optimize a NodeMaterial graph
    * @param vertexOutputNodes defines the list of output nodes for the vertex shader
    * @param fragmentOutputNodes defines the list of output nodes for the fragment shader
    */
  /* CompleteClass */
  override def optimize(
    vertexOutputNodes: js.Array[typingsSlinky.babylonjs.BABYLON.NodeMaterialBlock],
    fragmentOutputNodes: js.Array[typingsSlinky.babylonjs.BABYLON.NodeMaterialBlock]
  ): Unit = js.native
}

