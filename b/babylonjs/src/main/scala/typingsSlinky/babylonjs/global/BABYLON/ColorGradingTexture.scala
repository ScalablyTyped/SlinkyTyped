package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ColorGradingTexture")
@js.native
class ColorGradingTexture protected ()
  extends typingsSlinky.babylonjs.BABYLON.ColorGradingTexture {
  /**
    * Instantiates a ColorGradingTexture from the following parameters.
    *
    * @param url The location of the color gradind data (currently only supporting 3dl)
    * @param sceneOrEngine The scene or engine the texture will be used in
    * @param onLoad defines a callback triggered when the texture has been loaded
    */
  def this(url: String, sceneOrEngine: typingsSlinky.babylonjs.BABYLON.Scene) = this()
  def this(url: String, sceneOrEngine: typingsSlinky.babylonjs.BABYLON.ThinEngine) = this()
  def this(
    url: String,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.Scene,
    onLoad: Nullable[js.Function0[Unit]]
  ) = this()
  def this(
    url: String,
    sceneOrEngine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    onLoad: Nullable[js.Function0[Unit]]
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.ColorGradingTexture")
@js.native
object ColorGradingTexture extends js.Object {
  
  /**
    * Parses a color grading texture serialized by Babylon.
    * @param parsedTexture The texture information being parsedTexture
    * @param scene The scene to load the texture in
    * @param rootUrl The root url of the data assets to load
    * @return A color gradind texture
    */
  def Parse(parsedTexture: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): Nullable[typingsSlinky.babylonjs.BABYLON.ColorGradingTexture] = js.native
  
  /**
    * Empty line regex stored for GC.
    */
  var _noneEmptyLineRegex: js.Any = js.native
}
