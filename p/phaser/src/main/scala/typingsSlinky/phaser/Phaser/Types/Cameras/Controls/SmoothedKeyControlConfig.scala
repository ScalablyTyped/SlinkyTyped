package typingsSlinky.phaser.Phaser.Types.Cameras.Controls

import typingsSlinky.phaser.Phaser.Cameras.Scene2D.Camera
import typingsSlinky.phaser.Phaser.Input.Keyboard.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmoothedKeyControlConfig extends js.Object {
  /**
    * The horizontal and vertical acceleration the camera will move.
    */
  var acceleration: js.UndefOr[Double | js.Object] = js.native
  /**
    * The Camera that this Control will update.
    */
  var camera: js.UndefOr[Camera] = js.native
  /**
    * The horizontal and vertical drag applied to the camera when it is moving.
    */
  var drag: js.UndefOr[Double | js.Object] = js.native
  /**
    * The Key to be pressed that will move the Camera left.
    */
  var left: js.UndefOr[Key] = js.native
  /**
    * The maximum horizontal and vertical speed the camera will move.
    */
  var maxSpeed: js.UndefOr[Double | js.Object] = js.native
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: js.UndefOr[Key] = js.native
  /**
    * The Key to be pressed that will move the Camera up.
    */
  var up: js.UndefOr[Key] = js.native
  /**
    * The Key to be pressed that will zoom the Camera in.
    */
  var zoomIn: js.UndefOr[Key] = js.native
  /**
    * The Key to be pressed that will zoom the Camera out.
    */
  var zoomOut: js.UndefOr[Key] = js.native
  /**
    * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
    */
  var zoomSpeed: js.UndefOr[Double] = js.native
}

object SmoothedKeyControlConfig {
  @scala.inline
  def apply(): SmoothedKeyControlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmoothedKeyControlConfig]
  }
  @scala.inline
  implicit class SmoothedKeyControlConfigOps[Self <: SmoothedKeyControlConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleration(value: Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withCamera(value: Camera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSpeed(value: Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withUp(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomIn(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOut(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSpeed")(js.undefined)
        ret
    }
  }
  
}

