package typingsSlinky.babylonjs.spritesIndexMod

import typingsSlinky.babylonjs.ispritesMod.ISpriteJSONAtlas
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.spriteMapMod.ISpriteMapOptions
import typingsSlinky.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Sprites/index", "SpriteMap")
@js.native
class SpriteMap protected ()
  extends typingsSlinky.babylonjs.spriteMapMod.SpriteMap {
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
    spriteSheet: Texture,
    options: ISpriteMapOptions,
    scene: Scene
  ) = this()
}

