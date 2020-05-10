package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpriteJSONAtlas extends js.Object {
  /**
    * Array of objects that contain the frame data.
    */
  var frames: js.Array[ISpriteJSONSprite] = js.native
  /**
    * object basic object containing the sprite meta data.
    */
  var meta: js.UndefOr[js.Object] = js.native
}

object ISpriteJSONAtlas {
  @scala.inline
  def apply(frames: js.Array[ISpriteJSONSprite]): ISpriteJSONAtlas = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONAtlas]
  }
  @scala.inline
  implicit class ISpriteJSONAtlasOps[Self <: ISpriteJSONAtlas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrames(value: js.Array[ISpriteJSONSprite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
  }
  
}

