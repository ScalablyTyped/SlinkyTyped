package typingsSlinky.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the features of the browser running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.features` from within any Scene.
  */
@js.native
trait Features extends js.Object {
  /**
    * Is canvas available?
    */
  var canvas: Boolean = js.native
  /**
    * True if canvas supports a 'copy' bitblt onto itself when the source and destination regions overlap.
    */
  var canvasBitBltShift: Boolean = js.native
  /**
    * Is file available?
    */
  var file: Boolean = js.native
  /**
    * Is fileSystem available?
    */
  var fileSystem: Boolean = js.native
  /**
    * Does the device support the getUserMedia API?
    */
  var getUserMedia: Boolean = js.native
  /**
    * Is the device big or little endian? (only detected if the browser supports TypedArrays)
    */
  var littleEndian: Boolean = js.native
  /**
    * Is localStorage available?
    */
  var localStorage: Boolean = js.native
  /**
    * Is Pointer Lock available?
    */
  var pointerLock: Boolean = js.native
  /**
    * Does the device context support 32bit pixel manipulation using array buffer views?
    */
  var support32bit: Boolean = js.native
  /**
    * Does the device support the Vibration API?
    */
  var vibration: Boolean = js.native
  /**
    * Is webGL available?
    */
  var webGL: Boolean = js.native
  /**
    * Is worker available?
    */
  var worker: Boolean = js.native
}

object Features {
  @scala.inline
  def apply(
    canvas: Boolean,
    canvasBitBltShift: Boolean,
    file: Boolean,
    fileSystem: Boolean,
    getUserMedia: Boolean,
    littleEndian: Boolean,
    localStorage: Boolean,
    pointerLock: Boolean,
    support32bit: Boolean,
    vibration: Boolean,
    webGL: Boolean,
    worker: Boolean
  ): Features = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], canvasBitBltShift = canvasBitBltShift.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileSystem = fileSystem.asInstanceOf[js.Any], getUserMedia = getUserMedia.asInstanceOf[js.Any], littleEndian = littleEndian.asInstanceOf[js.Any], localStorage = localStorage.asInstanceOf[js.Any], pointerLock = pointerLock.asInstanceOf[js.Any], support32bit = support32bit.asInstanceOf[js.Any], vibration = vibration.asInstanceOf[js.Any], webGL = webGL.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvasBitBltShift(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasBitBltShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUserMedia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLittleEndian(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("littleEndian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupport32bit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support32bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVibration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebGL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webGL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

