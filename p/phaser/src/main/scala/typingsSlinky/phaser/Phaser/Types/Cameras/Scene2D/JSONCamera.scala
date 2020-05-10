package typingsSlinky.phaser.Phaser.Types.Cameras.Scene2D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONCamera extends js.Object {
  /**
    * The background color of camera
    */
  var backgroundColor: String = js.native
  /**
    * The bounds of camera
    */
  var bounds: js.UndefOr[JSONCameraBounds] = js.native
  /**
    * The height size of camera
    */
  var height: Double = js.native
  /**
    * The name of the camera
    */
  var name: String = js.native
  /**
    * The rotation of camera
    */
  var rotation: Double = js.native
  /**
    * The round pixels st status of camera
    */
  var roundPixels: Boolean = js.native
  /**
    * The horizontal scroll of camera
    */
  var scrollX: Double = js.native
  /**
    * The vertical scroll of camera
    */
  var scrollY: Double = js.native
  /**
    * The width size of camera
    */
  var width: Double = js.native
  /**
    * The horizontal position of camera
    */
  var x: Double = js.native
  /**
    * The vertical position of camera
    */
  var y: Double = js.native
  /**
    * The zoom of camera
    */
  var zoom: Double = js.native
}

object JSONCamera {
  @scala.inline
  def apply(
    backgroundColor: String,
    height: Double,
    name: String,
    rotation: Double,
    roundPixels: Boolean,
    scrollX: Double,
    scrollY: Double,
    width: Double,
    x: Double,
    y: Double,
    zoom: Double
  ): JSONCamera = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], roundPixels = roundPixels.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONCamera]
  }
  @scala.inline
  implicit class JSONCameraOps[Self <: JSONCamera] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundPixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: JSONCameraBounds): Self = {
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
  }
  
}

