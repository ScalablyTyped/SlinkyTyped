package typingsSlinky.babylonjs.materialsIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "PBRSpecularGlossinessMaterial")
@js.native
class PBRSpecularGlossinessMaterial protected ()
  extends typingsSlinky.babylonjs.materialsPbrIndexMod.PBRSpecularGlossinessMaterial {
  /**
    * Instantiates a new PBRSpecularGlossinessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: Scene) = this()
}
/* static members */
object PBRSpecularGlossinessMaterial {
  
  /**
    * Parses a JSON object correponding to the serialize function.
    */
  @JSImport("babylonjs/Materials/index", "PBRSpecularGlossinessMaterial.Parse")
  @js.native
  def Parse(source: js.Any, scene: Scene, rootUrl: String): typingsSlinky.babylonjs.pbrSpecularGlossinessMaterialMod.PBRSpecularGlossinessMaterial = js.native
}
