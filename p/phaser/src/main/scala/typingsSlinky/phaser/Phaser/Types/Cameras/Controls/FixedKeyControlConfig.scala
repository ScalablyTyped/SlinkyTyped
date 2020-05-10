package typingsSlinky.phaser.Phaser.Types.Cameras.Controls

import typingsSlinky.phaser.Phaser.Cameras.Scene2D.Camera
import typingsSlinky.phaser.Phaser.Input.Keyboard.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedKeyControlConfig extends js.Object {
  /**
    * The Camera that this Control will update.
    */
  var camera: js.UndefOr[Camera] = js.native
  /**
    * The Key to be pressed that will move the Camera down.
    */
  var down: js.UndefOr[Key] = js.native
  /**
    * The Key to be pressed that will move the Camera left.
    */
  var left: js.UndefOr[Key] = js.native
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: js.UndefOr[Key] = js.native
  /**
    * The horizontal and vertical speed the camera will move.
    */
  var speed: js.UndefOr[Double | js.Object] = js.native
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

object FixedKeyControlConfig {
  @scala.inline
  def apply(): FixedKeyControlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedKeyControlConfig]
  }
  @scala.inline
  implicit class FixedKeyControlConfigOps[Self <: FixedKeyControlConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDown(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
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
    def withSpeed(value: Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
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

