package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "NodeMaterialConnectionPoint")
@js.native
class NodeMaterialConnectionPoint protected ()
  extends typingsSlinky.babylonjs.legacyMod.NodeMaterialConnectionPoint {
  /**
    * Creates a new connection point
    * @param name defines the connection point name
    * @param ownerBlock defines the block hosting this connection point
    * @param direction defines the direction of the connection point
    */
  def this(
    name: String,
    ownerBlock: typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock,
    direction: typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection
  ) = this()
}
