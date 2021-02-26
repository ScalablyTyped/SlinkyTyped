package typingsSlinky.babylonjs.materialsIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "BackgroundMaterial")
@js.native
class BackgroundMaterial protected ()
  extends typingsSlinky.babylonjs.backgroundIndexMod.BackgroundMaterial {
  /**
    * Instantiates a Background Material in the given scene
    * @param name The friendly name of the material
    * @param scene The scene to add the material to
    */
  def this(name: String, scene: Scene) = this()
}
/* static members */
object BackgroundMaterial {
  
  @JSImport("babylonjs/Materials/index", "BackgroundMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse a JSON input to create back a background material.
    * @param source The JSON data to parse
    * @param scene The scene to create the parsed material in
    * @param rootUrl The root url of the assets the material depends upon
    * @returns the instantiated BackgroundMaterial.
    */
  @JSImport("babylonjs/Materials/index", "BackgroundMaterial.Parse")
  @js.native
  def Parse(source: js.Any, scene: Scene, rootUrl: String): typingsSlinky.babylonjs.backgroundMaterialMod.BackgroundMaterial = js.native
  
  /**
    * Standard reflectance value at parallel view angle.
    */
  @JSImport("babylonjs/Materials/index", "BackgroundMaterial.StandardReflectance0")
  @js.native
  def StandardReflectance0: Double = js.native
  @scala.inline
  def StandardReflectance0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StandardReflectance0")(x.asInstanceOf[js.Any])
  
  /**
    * Standard reflectance value at grazing angle.
    */
  @JSImport("babylonjs/Materials/index", "BackgroundMaterial.StandardReflectance90")
  @js.native
  def StandardReflectance90: Double = js.native
  @scala.inline
  def StandardReflectance90_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StandardReflectance90")(x.asInstanceOf[js.Any])
}
