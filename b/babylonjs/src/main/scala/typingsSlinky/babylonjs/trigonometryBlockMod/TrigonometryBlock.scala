package typingsSlinky.babylonjs.trigonometryBlockMod

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/trigonometryBlock", "TrigonometryBlock")
@js.native
class TrigonometryBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new TrigonometryBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  
  /**
    * Gets the input component
    */
  def input: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the operation applied by the block
    */
  var operation: TrigonometryBlockOperations = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}
