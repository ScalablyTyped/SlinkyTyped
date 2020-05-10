package typingsSlinky.phaser.Phaser.Types.Textures

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpriteSheetConfig extends js.Object {
  /**
    * The total number of frames to extract from the Sprite Sheet. The default value of -1 means "extract all frames".
    */
  var endFrame: js.UndefOr[integer] = js.native
  /**
    * The fixed height of each frame. If not set it will use the frameWidth as the height.
    */
  var frameHeight: js.UndefOr[integer] = js.native
  /**
    * The fixed width of each frame.
    */
  var frameWidth: integer = js.native
  /**
    * If the frames have been drawn with a margin, specify the amount here.
    */
  var margin: js.UndefOr[integer] = js.native
  /**
    * If the frames have been drawn with spacing between them, specify the amount here.
    */
  var spacing: js.UndefOr[integer] = js.native
  /**
    * Skip a number of frames. Useful when there are multiple sprite sheets in one Texture.
    */
  var startFrame: js.UndefOr[integer] = js.native
}

object SpriteSheetConfig {
  @scala.inline
  def apply(frameWidth: integer): SpriteSheetConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheetConfig]
  }
  @scala.inline
  implicit class SpriteSheetConfigOps[Self <: SpriteSheetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameWidth(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndFrame(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameHeight(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withStartFrame(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFrame")(js.undefined)
        ret
    }
  }
  
}

