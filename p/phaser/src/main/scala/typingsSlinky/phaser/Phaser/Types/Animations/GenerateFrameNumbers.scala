package typingsSlinky.phaser.Phaser.Types.Animations

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateFrameNumbers extends js.Object {
  /**
    * The ending frame of the animation.
    */
  var end: js.UndefOr[integer] = js.native
  /**
    * A frame to put at the beginning of the animation, before `start` or `outputArray` or `frames`.
    */
  var first: js.UndefOr[Boolean | integer] = js.native
  /**
    * A custom sequence of frames.
    */
  var frames: js.UndefOr[Boolean | js.Array[integer]] = js.native
  /**
    * An array to concatenate the output onto.
    */
  var outputArray: js.UndefOr[js.Array[AnimationFrame]] = js.native
  /**
    * The starting frame of the animation.
    */
  var start: js.UndefOr[integer] = js.native
}

object GenerateFrameNumbers {
  @scala.inline
  def apply(): GenerateFrameNumbers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateFrameNumbers]
  }
  @scala.inline
  implicit class GenerateFrameNumbersOps[Self <: GenerateFrameNumbers] (val x: Self) extends AnyVal {
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
    def withFirst(value: Boolean | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
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
  }
  
}

