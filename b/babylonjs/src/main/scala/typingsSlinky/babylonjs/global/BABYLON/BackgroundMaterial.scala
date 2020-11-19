package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BackgroundMaterial")
@js.native
class BackgroundMaterial protected ()
  extends typingsSlinky.babylonjs.BABYLON.BackgroundMaterial {
  /**
    * Instantiates a Background Material in the given scene
    * @param name The friendly name of the material
    * @param scene The scene to add the material to
    */
  def this(name: String, scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
}
/* static members */
@JSGlobal("BABYLON.BackgroundMaterial")
@js.native
object BackgroundMaterial extends js.Object {
  
  /**
    * Parse a JSON input to create back a background material.
    * @param source The JSON data to parse
    * @param scene The scene to create the parsed material in
    * @param rootUrl The root url of the assets the material depends upon
    * @returns the instantiated BackgroundMaterial.
    */
  def Parse(source: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene, rootUrl: String): typingsSlinky.babylonjs.BABYLON.BackgroundMaterial = js.native
  
  /**
    * Standard reflectance value at parallel view angle.
    */
  var StandardReflectance0: Double = js.native
  
  /**
    * Standard reflectance value at grazing angle.
    */
  var StandardReflectance90: Double = js.native
}
