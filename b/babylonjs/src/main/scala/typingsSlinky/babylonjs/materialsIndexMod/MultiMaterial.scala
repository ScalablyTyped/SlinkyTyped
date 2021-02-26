package typingsSlinky.babylonjs.materialsIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "MultiMaterial")
@js.native
class MultiMaterial protected ()
  extends typingsSlinky.babylonjs.multiMaterialMod.MultiMaterial {
  /**
    * Instantiates a new Multi Material
    * A multi-material is used to apply different materials to different parts of the same object without the need of
    * separate meshes. This can be use to improve performances.
    * @see https://doc.babylonjs.com/how_to/multi_materials
    * @param name Define the name in the scene
    * @param scene Define the scene the material belongs to
    */
  def this(name: String, scene: Scene) = this()
}
/* static members */
object MultiMaterial {
  
  /**
    * Creates a MultiMaterial from parsed MultiMaterial data.
    * @param parsedMultiMaterial defines parsed MultiMaterial data.
    * @param scene defines the hosting scene
    * @returns a new MultiMaterial
    */
  @JSImport("babylonjs/Materials/index", "MultiMaterial.ParseMultiMaterial")
  @js.native
  def ParseMultiMaterial(parsedMultiMaterial: js.Any, scene: Scene): typingsSlinky.babylonjs.multiMaterialMod.MultiMaterial = js.native
}
