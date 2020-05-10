package typingsSlinky.phaser.Phaser.Types.Loader.FileTypes

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageFrameConfig extends js.Object {
  /**
    * The frame to stop parsing at. If not provided it will calculate the value based on the image and frame dimensions.
    */
  var endFrame: js.UndefOr[integer] = js.native
  /**
    * The height of the frame in pixels. Uses the `frameWidth` value if not provided.
    */
  var frameHeight: js.UndefOr[integer] = js.native
  /**
    * The width of the frame in pixels.
    */
  var frameWidth: integer = js.native
  /**
    * The margin in the image. This is the space around the edge of the frames.
    */
  var margin: js.UndefOr[integer] = js.native
  /**
    * The spacing between each frame in the image.
    */
  var spacing: js.UndefOr[integer] = js.native
  /**
    * The first frame to start parsing from.
    */
  var startFrame: js.UndefOr[integer] = js.native
}

object ImageFrameConfig {
  @scala.inline
  def apply(frameWidth: integer): ImageFrameConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFrameConfig]
  }
  @scala.inline
  implicit class ImageFrameConfigOps[Self <: ImageFrameConfig] (val x: Self) extends AnyVal {
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

