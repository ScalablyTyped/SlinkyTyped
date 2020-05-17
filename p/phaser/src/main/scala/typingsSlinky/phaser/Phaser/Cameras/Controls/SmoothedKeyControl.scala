package typingsSlinky.phaser.Phaser.Cameras.Controls

import typingsSlinky.phaser.Phaser.Cameras.Scene2D.Camera
import typingsSlinky.phaser.Phaser.Input.Keyboard.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Smoothed Key Camera Control.
  * 
  * This allows you to control the movement and zoom of a camera using the defined keys.
  * Unlike the Fixed Camera Control you can also provide physics values for acceleration, drag and maxSpeed for smoothing effects.
  * 
  * ```javascript
  * var controlConfig = {
  *     camera: this.cameras.main,
  *     left: cursors.left,
  *     right: cursors.right,
  *     up: cursors.up,
  *     down: cursors.down,
  *     zoomIn: this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.Q),
  *     zoomOut: this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.E),
  *     zoomSpeed: 0.02,
  *     acceleration: 0.06,
  *     drag: 0.0005,
  *     maxSpeed: 1.0
  * };
  * ```
  * 
  * You must call the `update` method of this controller every frame.
  */
@js.native
trait SmoothedKeyControl extends js.Object {
  /**
    * The horizontal acceleration the camera will move.
    */
  var accelX: Double = js.native
  /**
    * The vertical acceleration the camera will move.
    */
  var accelY: Double = js.native
  /**
    * A flag controlling if the Controls will update the Camera or not.
    */
  var active: Boolean = js.native
  /**
    * The Camera that this Control will update.
    */
  var camera: Camera = js.native
  /**
    * The Key to be pressed that will move the Camera down.
    */
  var down: Key = js.native
  /**
    * The horizontal drag applied to the camera when it is moving.
    */
  var dragX: Double = js.native
  /**
    * The vertical drag applied to the camera when it is moving.
    */
  var dragY: Double = js.native
  /**
    * The Key to be pressed that will move the Camera left.
    */
  var left: Key = js.native
  /**
    * The maximum horizontal speed the camera will move.
    */
  var maxSpeedX: Double = js.native
  /**
    * The maximum vertical speed the camera will move.
    */
  var maxSpeedY: Double = js.native
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: Key = js.native
  /**
    * The Key to be pressed that will move the Camera up.
    */
  var up: Key = js.native
  /**
    * The Key to be pressed that will zoom the Camera in.
    */
  var zoomIn: Key = js.native
  /**
    * The Key to be pressed that will zoom the Camera out.
    */
  var zoomOut: Key = js.native
  /**
    * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
    */
  var zoomSpeed: Double = js.native
  /**
    * Destroys this Key Control.
    */
  def destroy(): Unit = js.native
  /**
    * Binds this Key Control to a camera.
    * @param camera The camera to bind this Key Control to.
    */
  def setCamera(camera: Camera): SmoothedKeyControl = js.native
  /**
    * Starts the Key Control running, providing it has been linked to a camera.
    */
  def start(): SmoothedKeyControl = js.native
  /**
    * Stops this Key Control from running. Call `start` to start it again.
    */
  def stop(): SmoothedKeyControl = js.native
  /**
    * Applies the results of pressing the control keys to the Camera.
    * 
    * You must call this every step, it is not called automatically.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(delta: Double): Unit = js.native
}

object SmoothedKeyControl {
  @scala.inline
  def apply(
    accelX: Double,
    accelY: Double,
    active: Boolean,
    camera: Camera,
    destroy: () => Unit,
    down: Key,
    dragX: Double,
    dragY: Double,
    left: Key,
    maxSpeedX: Double,
    maxSpeedY: Double,
    right: Key,
    setCamera: Camera => SmoothedKeyControl,
    start: () => SmoothedKeyControl,
    stop: () => SmoothedKeyControl,
    up: Key,
    update: Double => Unit,
    zoomIn: Key,
    zoomOut: Key,
    zoomSpeed: Double
  ): SmoothedKeyControl = {
    val __obj = js.Dynamic.literal(accelX = accelX.asInstanceOf[js.Any], accelY = accelY.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), down = down.asInstanceOf[js.Any], dragX = dragX.asInstanceOf[js.Any], dragY = dragY.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], maxSpeedX = maxSpeedX.asInstanceOf[js.Any], maxSpeedY = maxSpeedY.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], setCamera = js.Any.fromFunction1(setCamera), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), up = up.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), zoomIn = zoomIn.asInstanceOf[js.Any], zoomOut = zoomOut.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothedKeyControl]
  }
  @scala.inline
  implicit class SmoothedKeyControlOps[Self <: SmoothedKeyControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccelY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCamera(value: Camera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDown(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSpeedX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpeedX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSpeedY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpeedY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCamera(value: Camera => SmoothedKeyControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCamera")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => SmoothedKeyControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => SmoothedKeyControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUp(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withZoomIn(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomOut(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSpeed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

