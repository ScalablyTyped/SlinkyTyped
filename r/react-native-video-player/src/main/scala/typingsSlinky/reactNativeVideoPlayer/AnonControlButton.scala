package typingsSlinky.reactNativeVideoPlayer

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonControlButton extends js.Object {
  var controlButton: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var controlIcon: js.UndefOr[StyleProp[TextStyle]] = js.native
  var controls: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var playArrow: js.UndefOr[StyleProp[TextStyle]] = js.native
  var playButton: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var playControl: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var playIcon: js.UndefOr[StyleProp[TextStyle]] = js.native
  var seekBar: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var seekBarBackground: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var seekBarFullWidth: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var seekBarKnob: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var seekBarKnobSeeking: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var seekBarProgress: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var thumbnail: js.UndefOr[StyleProp[ImageStyle]] = js.native
  var video: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var videoWrapper: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var wrapper: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object AnonControlButton {
  @scala.inline
  def apply(): AnonControlButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonControlButton]
  }
  @scala.inline
  implicit class AnonControlButtonOps[Self <: AnonControlButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlButton(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlButton")(js.undefined)
        ret
    }
    @scala.inline
    def withControlButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlButton")(null)
        ret
    }
    @scala.inline
    def withControlIcon(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withControlIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlIcon")(null)
        ret
    }
    @scala.inline
    def withControls(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(null)
        ret
    }
    @scala.inline
    def withPlayArrow(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayArrowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playArrow")(null)
        ret
    }
    @scala.inline
    def withPlayButton(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playButton")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playButton")(null)
        ret
    }
    @scala.inline
    def withPlayControl(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playControl")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayControlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playControl")(null)
        ret
    }
    @scala.inline
    def withPlayIcon(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playIcon")(null)
        ret
    }
    @scala.inline
    def withSeekBar(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeekBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBar")(js.undefined)
        ret
    }
    @scala.inline
    def withSeekBarNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBar")(null)
        ret
    }
    @scala.inline
    def withSeekBarBackground(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeekBarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withSeekBarBackgroundNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarBackground")(null)
        ret
    }
    @scala.inline
    def withSeekBarFullWidth(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarFullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeekBarFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarFullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSeekBarFullWidthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarFullWidth")(null)
        ret
    }
    @scala.inline
    def withSeekBarKnob(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarKnob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeekBarKnob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarKnob")(js.undefined)
        ret
    }
    @scala.inline
    def withSeekBarKnobNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarKnob")(null)
        ret
    }
    @scala.inline
    def withSeekBarKnobSeeking(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarKnobSeeking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeekBarKnobSeeking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarKnobSeeking")(js.undefined)
        ret
    }
    @scala.inline
    def withSeekBarKnobSeekingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarKnobSeeking")(null)
        ret
    }
    @scala.inline
    def withSeekBarProgress(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeekBarProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withSeekBarProgressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekBarProgress")(null)
        ret
    }
    @scala.inline
    def withThumbnail(value: StyleProp[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(null)
        ret
    }
    @scala.inline
    def withVideo(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(null)
        ret
    }
    @scala.inline
    def withVideoWrapper(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoWrapper")(null)
        ret
    }
    @scala.inline
    def withWrapper(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(null)
        ret
    }
  }
  
}

