package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "NodeMaterialConnectionPoint")
@js.native
class NodeMaterialConnectionPoint protected ()
  extends typingsSlinky.babylonjs.indexMod.NodeMaterialConnectionPoint {
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
/* static members */
@JSImport("babylonjs/Legacy/legacy", "NodeMaterialConnectionPoint")
@js.native
object NodeMaterialConnectionPoint extends js.Object {
  
  /**
    * Checks if two types are equivalent
    * @param type1 type 1 to check
    * @param type2 type 2 to check
    * @returns true if both types are equivalent, else false
    */
  def AreEquivalentTypes(type1: Double, type2: Double): Boolean = js.native
}
