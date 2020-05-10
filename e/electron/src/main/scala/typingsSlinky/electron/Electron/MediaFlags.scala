package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaFlags extends js.Object {
  /**
    * Whether the media element can be rotated.
    */
  var canRotate: Boolean = js.native
  /**
    * Whether the media element's controls are toggleable.
    */
  var canToggleControls: Boolean = js.native
  /**
    * Whether the media element has audio.
    */
  var hasAudio: Boolean = js.native
  /**
    * Whether the media element has crashed.
    */
  var inError: Boolean = js.native
  /**
    * Whether the media element's controls are visible.
    */
  var isControlsVisible: Boolean = js.native
  /**
    * Whether the media element is looping.
    */
  var isLooping: Boolean = js.native
  /**
    * Whether the media element is muted.
    */
  var isMuted: Boolean = js.native
  /**
    * Whether the media element is paused.
    */
  var isPaused: Boolean = js.native
}

object MediaFlags {
  @scala.inline
  def apply(
    canRotate: Boolean,
    canToggleControls: Boolean,
    hasAudio: Boolean,
    inError: Boolean,
    isControlsVisible: Boolean,
    isLooping: Boolean,
    isMuted: Boolean,
    isPaused: Boolean
  ): MediaFlags = {
    val __obj = js.Dynamic.literal(canRotate = canRotate.asInstanceOf[js.Any], canToggleControls = canToggleControls.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], inError = inError.asInstanceOf[js.Any], isControlsVisible = isControlsVisible.asInstanceOf[js.Any], isLooping = isLooping.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFlags]
  }
  @scala.inline
  implicit class MediaFlagsOps[Self <: MediaFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanToggleControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canToggleControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsControlsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isControlsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLooping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLooping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

