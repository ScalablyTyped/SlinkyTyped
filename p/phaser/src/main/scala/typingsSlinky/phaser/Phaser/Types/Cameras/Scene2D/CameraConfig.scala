package typingsSlinky.phaser.Phaser.Types.Cameras.Scene2D

import typingsSlinky.phaser.integer
import typingsSlinky.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraConfig extends js.Object {
  /**
    * A CSS color string controlling the Camera background color.
    */
  var backgroundColor: js.UndefOr[`false` | String] = js.native
  /**
    * Defines the Camera bounds.
    */
  var bounds: js.UndefOr[js.Object] = js.native
  /**
    * The height of the Camera bounds.
    */
  @JSName("bounds.height")
  var boundsDotheight: js.UndefOr[Double] = js.native
  /**
    * The width of the Camera bounds.
    */
  @JSName("bounds.width")
  var boundsDotwidth: js.UndefOr[Double] = js.native
  /**
    * The top-left extent of the Camera bounds.
    */
  @JSName("bounds.x")
  var boundsDotx: js.UndefOr[Double] = js.native
  /**
    * The top-left extent of the Camera bounds.
    */
  @JSName("bounds.y")
  var boundsDoty: js.UndefOr[Double] = js.native
  /**
    * The height of the Camera viewport.
    */
  var height: js.UndefOr[integer] = js.native
  /**
    * The name of the Camera.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The rotation of the Camera, in radians.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * Should the Camera round pixels before rendering?
    */
  var roundPixels: js.UndefOr[Boolean] = js.native
  /**
    * The horizontal scroll position of the Camera.
    */
  var scrollX: js.UndefOr[Double] = js.native
  /**
    * The vertical scroll position of the Camera.
    */
  var scrollY: js.UndefOr[Double] = js.native
  /**
    * The width of the Camera viewport.
    */
  var width: js.UndefOr[integer] = js.native
  /**
    * The horizontal position of the Camera viewport.
    */
  var x: js.UndefOr[integer] = js.native
  /**
    * The vertical position of the Camera viewport.
    */
  var y: js.UndefOr[integer] = js.native
  /**
    * The default zoom level of the Camera.
    */
  var zoom: js.UndefOr[Double] = js.native
}

object CameraConfig {
  @scala.inline
  def apply(): CameraConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraConfig]
  }
  @scala.inline
  implicit class CameraConfigOps[Self <: CameraConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsDotheight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds.height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundsDotheight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds.height")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsDotwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds.width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundsDotwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds.width")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsDotx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds.x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundsDotx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds.x")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsDoty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds.y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundsDoty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds.y")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundPixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

