package typingsSlinky.babylonjs.buildersIndexMod

import typingsSlinky.babylonjs.capsuleBuilderMod.ICreateCapsuleOptions
import typingsSlinky.babylonjs.meshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/Builders/index", "CapsuleBuilder")
@js.native
class CapsuleBuilder ()
  extends typingsSlinky.babylonjs.capsuleBuilderMod.CapsuleBuilder
/* static members */
object CapsuleBuilder {
  
  @JSImport("babylonjs/Meshes/Builders/index", "CapsuleBuilder.CreateCapsule")
  @js.native
  def CreateCapsule(name: String, options: js.UndefOr[scala.Nothing], scene: js.Any): Mesh = js.native
  /**
    * Creates a capsule or a pill mesh
    * @param name defines the name of the mesh
    * @param options The constructors options.
    * @param scene The scene the mesh is scoped to.
    * @returns Capsule Mesh
    */
  @JSImport("babylonjs/Meshes/Builders/index", "CapsuleBuilder.CreateCapsule")
  @js.native
  def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: js.Any): Mesh = js.native
}
