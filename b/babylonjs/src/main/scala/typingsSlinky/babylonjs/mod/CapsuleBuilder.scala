package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.capsuleBuilderMod.ICreateCapsuleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "CapsuleBuilder")
@js.native
class CapsuleBuilder ()
  extends typingsSlinky.babylonjs.legacyMod.CapsuleBuilder
/* static members */
@JSImport("babylonjs", "CapsuleBuilder")
@js.native
object CapsuleBuilder extends js.Object {
  
  def CreateCapsule(name: String, options: js.UndefOr[scala.Nothing], scene: js.Any): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  /**
    * Creates a capsule or a pill mesh
    * @param name defines the name of the mesh
    * @param options The constructors options.
    * @param scene The scene the mesh is scoped to.
    * @returns Capsule Mesh
    */
  def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: js.Any): typingsSlinky.babylonjs.meshMod.Mesh = js.native
}
