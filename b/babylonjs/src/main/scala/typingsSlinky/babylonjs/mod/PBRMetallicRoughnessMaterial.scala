package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PBRMetallicRoughnessMaterial")
@js.native
class PBRMetallicRoughnessMaterial protected ()
  extends typingsSlinky.babylonjs.legacyMod.PBRMetallicRoughnessMaterial {
  /**
    * Instantiates a new PBRMetalRoughnessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
}
/* static members */
@JSImport("babylonjs", "PBRMetallicRoughnessMaterial")
@js.native
object PBRMetallicRoughnessMaterial extends js.Object {
  
  /**
    * Parses a JSON object correponding to the serialize function.
    */
  def Parse(source: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, rootUrl: String): typingsSlinky.babylonjs.pbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial = js.native
}
