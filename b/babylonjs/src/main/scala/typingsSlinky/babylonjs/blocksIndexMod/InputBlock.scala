package typingsSlinky.babylonjs.blocksIndexMod

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes
import typingsSlinky.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/index", "InputBlock")
@js.native
class InputBlock protected ()
  extends typingsSlinky.babylonjs.inputIndexMod.InputBlock {
  /**
    * Creates a new InputBlock
    * @param name defines the block name
    * @param target defines the target of that block (Vertex by default)
    * @param type defines the type of the input (can be set to NodeMaterialBlockConnectionPointTypes.AutoDetect)
    */
  def this(name: String) = this()
  def this(name: String, target: NodeMaterialBlockTargets) = this()
  def this(name: String, target: js.UndefOr[scala.Nothing], `type`: NodeMaterialBlockConnectionPointTypes) = this()
  def this(name: String, target: NodeMaterialBlockTargets, `type`: NodeMaterialBlockConnectionPointTypes) = this()
}
