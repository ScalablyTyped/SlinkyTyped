package typingsSlinky.babylonjs.materialsIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "PBRBaseSimpleMaterial")
@js.native
abstract class PBRBaseSimpleMaterial protected ()
  extends typingsSlinky.babylonjs.pbrIndexMod.PBRBaseSimpleMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: Scene) = this()
}
