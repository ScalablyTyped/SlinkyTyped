package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NodeMaterialConnectionPoint")
@js.native
class NodeMaterialConnectionPoint protected ()
  extends typingsSlinky.babylonjs.BABYLON.NodeMaterialConnectionPoint {
  /**
    * Creates a new connection point
    * @param name defines the connection point name
    * @param ownerBlock defines the block hosting this connection point
    * @param direction defines the direction of the connection point
    */
  def this(
    name: String,
    ownerBlock: typingsSlinky.babylonjs.BABYLON.NodeMaterialBlock,
    direction: typingsSlinky.babylonjs.BABYLON.NodeMaterialConnectionPointDirection
  ) = this()
}

