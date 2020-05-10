package typingsSlinky.phaser.Phaser.Types.Animations

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateFrameNames extends js.Object {
  /**
    * If `frames` is not provided, the number of the last frame to return.
    */
  var end: js.UndefOr[integer] = js.native
  /**
    * If provided as an array, the range defined by `start` and `end` will be ignored and these frame numbers will be used.
    */
  var frames: js.UndefOr[Boolean | js.Array[integer]] = js.native
  /**
    * The array to append the created configuration objects to.
    */
  var outputArray: js.UndefOr[js.Array[AnimationFrame]] = js.native
  /**
    * The string to append to every resulting frame name if using a range or an array of `frames`.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * If `frames` is not provided, the number of the first frame to return.
    */
  var start: js.UndefOr[integer] = js.native
  /**
    * The string to append to every resulting frame name if using a range or an array of `frames`.
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * The minimum expected lengths of each resulting frame's number. Numbers will be left-padded with zeroes until they are this long, then prepended and appended to create the resulting frame name.
    */
  var zeroPad: js.UndefOr[integer] = js.native
}

object GenerateFrameNames {
  @scala.inline
  def apply(): GenerateFrameNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateFrameNames]
  }
  @scala.inline
  implicit class GenerateFrameNamesOps[Self <: GenerateFrameNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withFrames(value: Boolean | js.Array[integer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputArray(value: js.Array[AnimationFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArray")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroPad(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroPad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroPad")(js.undefined)
        ret
    }
  }
  
}

