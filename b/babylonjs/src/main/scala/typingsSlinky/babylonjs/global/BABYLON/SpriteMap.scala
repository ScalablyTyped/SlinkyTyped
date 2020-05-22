package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.ISpriteJSONAtlas
import typingsSlinky.babylonjs.BABYLON.ISpriteMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SpriteMap")
@js.native
class SpriteMap protected ()
  extends typingsSlinky.babylonjs.BABYLON.SpriteMap {
  /**
    * Creates a new SpriteMap
    * @param name defines the SpriteMaps Name
    * @param atlasJSON is the JSON file that controls the Sprites Frames and Meta
    * @param spriteSheet is the Texture that the Sprites are on.
    * @param options a basic deployment configuration
    * @param scene The Scene that the map is deployed on
    */
  def this(
    name: String,
    atlasJSON: ISpriteJSONAtlas,
    spriteSheet: typingsSlinky.babylonjs.BABYLON.Texture,
    options: ISpriteMapOptions,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  /**
    * The JSON Array file from a https://www.codeandweb.com/texturepacker export.  Or similar structure.
    */
  /* CompleteClass */
  override var atlasJSON: ISpriteJSONAtlas = js.native
  /**
    * String name of the SpriteMap.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * The parameters to initialize the SpriteMap with.
    */
  /* CompleteClass */
  override var options: ISpriteMapOptions = js.native
  /**
    * Texture of the SpriteMap.
    */
  /* CompleteClass */
  override var spriteSheet: typingsSlinky.babylonjs.BABYLON.Texture = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

