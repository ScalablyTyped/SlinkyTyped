package typingsSlinky.babylonjs.spriteMapMod

import typingsSlinky.babylonjs.ispritesMod.ISpriteJSONAtlas
import typingsSlinky.babylonjs.sceneMod.IDisposable
import typingsSlinky.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpriteMap extends IDisposable {
  /**
    * The JSON Array file from a https://www.codeandweb.com/texturepacker export.  Or similar structure.
    */
  var atlasJSON: ISpriteJSONAtlas = js.native
  /**
    * String name of the SpriteMap.
    */
  var name: String = js.native
  /**
    * The parameters to initialize the SpriteMap with.
    */
  var options: ISpriteMapOptions = js.native
  /**
    * Texture of the SpriteMap.
    */
  var spriteSheet: Texture = js.native
}

object ISpriteMap {
  @scala.inline
  def apply(
    atlasJSON: ISpriteJSONAtlas,
    dispose: () => Unit,
    name: String,
    options: ISpriteMapOptions,
    spriteSheet: Texture
  ): ISpriteMap = {
    val __obj = js.Dynamic.literal(atlasJSON = atlasJSON.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], spriteSheet = spriteSheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteMap]
  }
  @scala.inline
  implicit class ISpriteMapOps[Self <: ISpriteMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtlasJSON(value: ISpriteJSONAtlas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: ISpriteMapOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpriteSheet(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spriteSheet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

