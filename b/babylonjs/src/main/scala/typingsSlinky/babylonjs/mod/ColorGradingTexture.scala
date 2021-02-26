package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ColorGradingTexture")
@js.native
class ColorGradingTexture protected ()
  extends typingsSlinky.babylonjs.legacyMod.ColorGradingTexture {
  /**
    * Instantiates a ColorGradingTexture from the following parameters.
    *
    * @param url The location of the color gradind data (currently only supporting 3dl)
    * @param sceneOrEngine The scene or engine the texture will be used in
    * @param onLoad defines a callback triggered when the texture has been loaded
    */
  def this(url: String, sceneOrEngine: typingsSlinky.babylonjs.sceneMod.Scene) = this()
  def this(url: String, sceneOrEngine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine) = this()
  def this(
    url: String,
    sceneOrEngine: typingsSlinky.babylonjs.sceneMod.Scene,
    onLoad: Nullable[js.Function0[Unit]]
  ) = this()
  def this(
    url: String,
    sceneOrEngine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine,
    onLoad: Nullable[js.Function0[Unit]]
  ) = this()
}
/* static members */
object ColorGradingTexture {
  
  @JSImport("babylonjs", "ColorGradingTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a color grading texture serialized by Babylon.
    * @param parsedTexture The texture information being parsedTexture
    * @param scene The scene to load the texture in
    * @param rootUrl The root url of the data assets to load
    * @return A color gradind texture
    */
  @JSImport("babylonjs", "ColorGradingTexture.Parse")
  @js.native
  def Parse(parsedTexture: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): Nullable[typingsSlinky.babylonjs.colorGradingTextureMod.ColorGradingTexture] = js.native
  
  /**
    * Empty line regex stored for GC.
    */
  @JSImport("babylonjs", "ColorGradingTexture._noneEmptyLineRegex")
  @js.native
  def _noneEmptyLineRegex: js.Any = js.native
  @scala.inline
  def _noneEmptyLineRegex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_noneEmptyLineRegex")(x.asInstanceOf[js.Any])
}
