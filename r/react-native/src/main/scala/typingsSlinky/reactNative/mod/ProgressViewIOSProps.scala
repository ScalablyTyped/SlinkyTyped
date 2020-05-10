package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.bar
import typingsSlinky.reactNative.reactNativeStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressViewIOSProps extends ViewProps {
  /**
    * The progress value (between 0 and 1).
    */
  var progress: js.UndefOr[Double] = js.native
  /**
    * A stretchable image to display as the progress bar.
    */
  var progressImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.native
  /**
    * The tint color of the progress bar itself.
    */
  var progressTintColor: js.UndefOr[String] = js.native
  /**
    * The progress bar style.
    */
  var progressViewStyle: js.UndefOr[default | bar] = js.native
  /**
    * A stretchable image to display behind the progress bar.
    */
  var trackImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.native
  /**
    * The tint color of the progress bar track.
    */
  var trackTintColor: js.UndefOr[String] = js.native
}

object ProgressViewIOSProps {
  @scala.inline
  def apply(): ProgressViewIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressViewIOSProps]
  }
  @scala.inline
  implicit class ProgressViewIOSPropsOps[Self <: ProgressViewIOSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressImage(value: ImageURISource | js.Array[ImageURISource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressImage")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressViewStyle(value: default | bar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressViewStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressViewStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressViewStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackImage(value: ImageURISource | js.Array[ImageURISource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackImage")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTintColor")(js.undefined)
        ret
    }
  }
  
}

