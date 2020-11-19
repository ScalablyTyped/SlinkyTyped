package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ColorGradingTexture")
@js.native
class ColorGradingTexture protected ()
  extends typingsSlinky.babylonjs.indexMod.ColorGradingTexture {
  /**
    * Instantiates a ColorGradingTexture from the following parameters.
    *
    * @param url The location of the color gradind data (currently only supporting 3dl)
    * @param scene The scene the texture will be used in
    */
  def this(url: String, scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "ColorGradingTexture")
@js.native
object ColorGradingTexture extends js.Object {
  
  /**
    * Parses a color grading texture serialized by Babylon.
    * @param parsedTexture The texture information being parsedTexture
    * @param scene The scene to load the texture in
    * @param rootUrl The root url of the data assets to load
    * @return A color gradind texture
    */
  def Parse(parsedTexture: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): Nullable[typingsSlinky.babylonjs.colorGradingTextureMod.ColorGradingTexture] = js.native
  
  /**
    * Empty line regex stored for GC.
    */
  var _noneEmptyLineRegex: js.Any = js.native
}
