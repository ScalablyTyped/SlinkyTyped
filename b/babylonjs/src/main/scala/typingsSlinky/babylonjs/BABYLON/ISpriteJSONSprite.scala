package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpriteJSONSprite extends js.Object {
  /**
    * string name of the Frame
    */
  var filename: String = js.native
  /**
    * ISpriteJSONSpriteFrame basic object of the frame data
    */
  var frame: ISpriteJSONSpriteFrameData = js.native
  /**
    * boolean to flag is the frame was rotated.
    */
  var rotated: Boolean = js.native
  /**
    * ISpriteJSONSpriteFrame basic object of the source data
    */
  var sourceSize: ISpriteJSONSpriteSourceSize = js.native
  /**
    * ISpriteJSONSpriteFrame basic object of the source data
    */
  var spriteSourceSize: ISpriteJSONSpriteFrameData = js.native
  /**
    * boolean to flag is the frame was trimmed.
    */
  var trimmed: Boolean = js.native
}

object ISpriteJSONSprite {
  @scala.inline
  def apply(
    filename: String,
    frame: ISpriteJSONSpriteFrameData,
    rotated: Boolean,
    sourceSize: ISpriteJSONSpriteSourceSize,
    spriteSourceSize: ISpriteJSONSpriteFrameData,
    trimmed: Boolean
  ): ISpriteJSONSprite = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], rotated = rotated.asInstanceOf[js.Any], sourceSize = sourceSize.asInstanceOf[js.Any], spriteSourceSize = spriteSourceSize.asInstanceOf[js.Any], trimmed = trimmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONSprite]
  }
  @scala.inline
  implicit class ISpriteJSONSpriteOps[Self <: ISpriteJSONSprite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: ISpriteJSONSpriteFrameData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceSize(value: ISpriteJSONSpriteSourceSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpriteSourceSize(value: ISpriteJSONSpriteFrameData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spriteSourceSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrimmed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimmed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

