package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes
import typingsSlinky.babylonjs.nodeMaterialBlockTargetsMod.NodeMaterialBlockTargets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/Input/index", JSImport.Namespace)
@js.native
object inputIndexMod extends js.Object {
  @js.native
  class InputBlock protected ()
    extends typingsSlinky.babylonjs.inputBlockMod.InputBlock {
    /**
      * Creates a new InputBlock
      * @param name defines the block name
      * @param target defines the target of that block (Vertex by default)
      * @param type defines the type of the input (can be set to NodeMaterialBlockConnectionPointTypes.AutoDetect)
      */
    def this(name: String) = this()
    def this(name: String, target: NodeMaterialBlockTargets) = this()
    def this(name: String, target: NodeMaterialBlockTargets, `type`: NodeMaterialBlockConnectionPointTypes) = this()
  }
  
  @js.native
  object AnimatedInputBlockTypes extends js.Object {
    /* 0 */ val None: typingsSlinky.babylonjs.animatedInputBlockTypesMod.AnimatedInputBlockTypes.None with Double = js.native
    /* 1 */ val Time: typingsSlinky.babylonjs.animatedInputBlockTypesMod.AnimatedInputBlockTypes.Time with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.babylonjs.animatedInputBlockTypesMod.AnimatedInputBlockTypes with Double
      ] = js.native
  }
  
}

