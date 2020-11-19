package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRSpecularGlossinessMaterial")
@js.native
class PBRSpecularGlossinessMaterial protected ()
  extends typingsSlinky.babylonjs.BABYLON.PBRSpecularGlossinessMaterial {
  /**
    * Instantiates a new PBRSpecularGlossinessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
}
/* static members */
@JSGlobal("BABYLON.PBRSpecularGlossinessMaterial")
@js.native
object PBRSpecularGlossinessMaterial extends js.Object {
  
  /**
    * Parses a JSON object correponding to the serialize function.
    */
  def Parse(source: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene, rootUrl: String): typingsSlinky.babylonjs.BABYLON.PBRSpecularGlossinessMaterial = js.native
}
