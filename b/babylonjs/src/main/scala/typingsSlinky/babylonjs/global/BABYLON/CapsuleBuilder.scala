package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.ICreateCapsuleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CapsuleBuilder")
@js.native
class CapsuleBuilder ()
  extends typingsSlinky.babylonjs.BABYLON.CapsuleBuilder
/* static members */
@JSGlobal("BABYLON.CapsuleBuilder")
@js.native
object CapsuleBuilder extends js.Object {
  
  def CreateCapsule(name: String, options: js.UndefOr[scala.Nothing], scene: js.Any): typingsSlinky.babylonjs.BABYLON.Mesh = js.native
  /**
    * Creates a capsule or a pill mesh
    * @param name defines the name of the mesh
    * @param options The constructors options.
    * @param scene The scene the mesh is scoped to.
    * @returns Capsule Mesh
    */
  def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: js.Any): typingsSlinky.babylonjs.BABYLON.Mesh = js.native
}
