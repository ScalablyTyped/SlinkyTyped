package typingsSlinky.phaser.Phaser.Types.Animations

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  /**
    * The key of the texture all frames of the animation will use. Can be overridden on a per frame basis.
    */
  var defaultTextureKey: js.UndefOr[String] = js.native
  /**
    * Delay before starting playback. Value given in milliseconds.
    */
  var delay: js.UndefOr[integer] = js.native
  /**
    * How long the animation should play for in milliseconds. If not given its derived from frameRate.
    */
  var duration: js.UndefOr[integer] = js.native
  /**
    * The frame rate of playback in frames per second (default 24 if duration is null)
    */
  var frameRate: js.UndefOr[integer] = js.native
  /**
    * An object containing data used to generate the frames for the animation
    */
  var frames: js.UndefOr[js.Array[AnimationFrame]] = js.native
  /**
    * Should sprite.visible = false when the animation finishes?
    */
  var hideOnComplete: js.UndefOr[Boolean] = js.native
  /**
    * The key that the animation will be associated with. i.e. sprite.animations.play(key)
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Number of times to repeat the animation (-1 for infinity)
    */
  var repeat: js.UndefOr[integer] = js.native
  /**
    * Delay before the animation repeats. Value given in milliseconds.
    */
  var repeatDelay: js.UndefOr[integer] = js.native
  /**
    * Should sprite.visible = true when the animation starts to play?
    */
  var showOnStart: js.UndefOr[Boolean] = js.native
  /**
    * Skip frames if the time lags, or always advanced anyway?
    */
  var skipMissedFrames: js.UndefOr[Boolean] = js.native
  /**
    * Should the animation yoyo? (reverse back down to the start) before repeating?
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}

object Animation {
  @scala.inline
  def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultTextureKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTextureKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTextureKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTextureKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withFrames(value: js.Array[AnimationFrame]): Self = {
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
    def withHideOnComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatDelay(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipMissedFrames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMissedFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipMissedFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMissedFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withYoyo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoyo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyo")(js.undefined)
        ret
    }
  }
  
}

