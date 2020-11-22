package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SubSurfaceBlock")
@js.native
class SubSurfaceBlock protected ()
  extends typingsSlinky.babylonjs.BABYLON.SubSurfaceBlock {
  /**
    * Create a new SubSurfaceBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
}
/* static members */
@JSGlobal("BABYLON.SubSurfaceBlock")
@js.native
object SubSurfaceBlock extends js.Object {
  
  /**
    * Gets the main code of the block (fragment side)
    * @param state current state of the node material building
    * @param ssBlock instance of a SubSurfaceBlock or null if the code must be generated without an active sub surface module
    * @param reflectionBlock instance of a ReflectionBlock null if the code must be generated without an active reflection module
    * @param worldPosVarName name of the variable holding the world position
    * @returns the shader code
    */
  def GetCode(
    state: typingsSlinky.babylonjs.BABYLON.NodeMaterialBuildState,
    ssBlock: Nullable[typingsSlinky.babylonjs.BABYLON.SubSurfaceBlock],
    reflectionBlock: Nullable[typingsSlinky.babylonjs.BABYLON.ReflectionBlock],
    worldPosVarName: String
  ): String = js.native
}
