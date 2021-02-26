package typingsSlinky.babylonjs.materialsIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "PBRMetallicRoughnessMaterial")
@js.native
class PBRMetallicRoughnessMaterial protected ()
  extends typingsSlinky.babylonjs.materialsPbrIndexMod.PBRMetallicRoughnessMaterial {
  /**
    * Instantiates a new PBRMetalRoughnessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: Scene) = this()
}
/* static members */
object PBRMetallicRoughnessMaterial {
  
  /**
    * Parses a JSON object correponding to the serialize function.
    */
  @JSImport("babylonjs/Materials/index", "PBRMetallicRoughnessMaterial.Parse")
  @js.native
  def Parse(source: js.Any, scene: Scene, rootUrl: String): typingsSlinky.babylonjs.pbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial = js.native
}
