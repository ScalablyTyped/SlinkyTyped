package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.InputBlock")
@js.native
class InputBlock protected ()
  extends typingsSlinky.babylonjs.BABYLON.InputBlock {
  /**
    * Creates a new InputBlock
    * @param name defines the block name
    * @param target defines the target of that block (Vertex by default)
    * @param type defines the type of the input (can be set to NodeMaterialBlockConnectionPointTypes.AutoDetect)
    */
  def this(name: String) = this()
  def this(name: String, target: typingsSlinky.babylonjs.BABYLON.NodeMaterialBlockTargets) = this()
  def this(
    name: String,
    target: js.UndefOr[scala.Nothing],
    `type`: typingsSlinky.babylonjs.BABYLON.NodeMaterialBlockConnectionPointTypes
  ) = this()
  def this(
    name: String,
    target: typingsSlinky.babylonjs.BABYLON.NodeMaterialBlockTargets,
    `type`: typingsSlinky.babylonjs.BABYLON.NodeMaterialBlockConnectionPointTypes
  ) = this()
}
