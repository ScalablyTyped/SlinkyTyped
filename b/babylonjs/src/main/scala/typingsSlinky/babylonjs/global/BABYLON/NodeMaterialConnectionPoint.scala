package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
/* static members */
object NodeMaterialConnectionPoint {
  
  /**
    * Checks if two types are equivalent
    * @param type1 type 1 to check
    * @param type2 type 2 to check
    * @returns true if both types are equivalent, else false
    */
  @JSGlobal("BABYLON.NodeMaterialConnectionPoint.AreEquivalentTypes")
  @js.native
  def AreEquivalentTypes(type1: Double, type2: Double): Boolean = js.native
}
