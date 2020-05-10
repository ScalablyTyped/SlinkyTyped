package typingsSlinky.heremaps.H.map.render.p2d.RenderEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** optional */
  var enableSubpixelRendering: js.UndefOr[Boolean] = js.native
  /** The pixelRatio to use for over-sampling in cases of high-resolution displays */
  var pixelRatio: Double = js.native
  /** Object describes how many cached zoom levels should be used as a base map background while base map tiles are */
  var renderBaseBackground: js.UndefOr[js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(pixelRatio: Double): Options = {
    val __obj = js.Dynamic.literal(pixelRatio = pixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableSubpixelRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSubpixelRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSubpixelRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSubpixelRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBaseBackground(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBaseBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderBaseBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBaseBackground")(js.undefined)
        ret
    }
  }
  
}

