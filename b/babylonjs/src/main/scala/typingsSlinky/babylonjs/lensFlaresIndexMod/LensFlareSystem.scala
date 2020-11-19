package typingsSlinky.babylonjs.lensFlaresIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/LensFlares/index", "LensFlareSystem")
@js.native
class LensFlareSystem protected ()
  extends typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem {
  /**
    * Instantiates a lens flare system.
    * This represents a Lens Flare System or the shiny effect created by the light reflection on the  camera lenses.
    * It is usually composed of several `lensFlare`.
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    * @param name Define the name of the lens flare system in the scene
    * @param emitter Define the source (the emitter) of the lens flares (it can be a camera, a light or a mesh).
    * @param scene Define the scene the lens flare system belongs to
    */
  def this(/**
    * Define the name of the lens flare system
    */
  name: String, emitter: js.Any, scene: Scene) = this()
}
/* static members */
@JSImport("babylonjs/LensFlares/index", "LensFlareSystem")
@js.native
object LensFlareSystem extends js.Object {
  
  /**
    * Parse a lens flare system from a JSON repressentation
    * @param parsedLensFlareSystem Define the JSON to parse
    * @param scene Define the scene the parsed system should be instantiated in
    * @param rootUrl Define the rootUrl of the load sequence to easily find a load relative dependencies such as textures
    * @returns the parsed system
    */
  def Parse(parsedLensFlareSystem: js.Any, scene: Scene, rootUrl: String): typingsSlinky.babylonjs.lensFlareSystemMod.LensFlareSystem = js.native
  
  /** @hidden */
  def _SceneComponentInitialization(scene: Scene): Unit = js.native
}
