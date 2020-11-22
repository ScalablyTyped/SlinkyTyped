package typingsSlinky.babylonjs.buildersIndexMod

import typingsSlinky.babylonjs.capsuleBuilderMod.ICreateCapsuleOptions
import typingsSlinky.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/Builders/index", "CapsuleBuilder")
@js.native
class CapsuleBuilder ()
  extends typingsSlinky.babylonjs.capsuleBuilderMod.CapsuleBuilder
/* static members */
@JSImport("babylonjs/Meshes/Builders/index", "CapsuleBuilder")
@js.native
object CapsuleBuilder extends js.Object {
  
  def CreateCapsule(name: String, options: js.UndefOr[scala.Nothing], scene: js.Any): Mesh = js.native
  /**
    * Creates a capsule or a pill mesh
    * @param name defines the name of the mesh
    * @param options The constructors options.
    * @param scene The scene the mesh is scoped to.
    * @returns Capsule Mesh
    */
  def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: js.Any): Mesh = js.native
}
