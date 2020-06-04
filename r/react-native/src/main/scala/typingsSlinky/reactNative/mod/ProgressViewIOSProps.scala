package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.bar
import typingsSlinky.reactNative.reactNativeStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressViewIOSProps extends ViewProps {
  /**
    * The progress value (between 0 and 1).
    */
  var progress: js.UndefOr[Double] = js.undefined
  /**
    * A stretchable image to display as the progress bar.
    */
  var progressImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.undefined
  /**
    * The tint color of the progress bar itself.
    */
  var progressTintColor: js.UndefOr[String] = js.undefined
  /**
    * The progress bar style.
    */
  var progressViewStyle: js.UndefOr[default | bar] = js.undefined
  /**
    * A stretchable image to display behind the progress bar.
    */
  var trackImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.undefined
  /**
    * The tint color of the progress bar track.
    */
  var trackTintColor: js.UndefOr[String] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setProgressImage(value: ImageURISource | js.Array[ImageURISource]): Self = this.set("progressImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressImage: Self = this.set("progressImage", js.undefined)
    @scala.inline
    def setProgressTintColor(value: String): Self = this.set("progressTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressTintColor: Self = this.set("progressTintColor", js.undefined)
    @scala.inline
    def setProgressViewStyle(value: default | bar): Self = this.set("progressViewStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressViewStyle: Self = this.set("progressViewStyle", js.undefined)
    @scala.inline
    def setTrackImage(value: ImageURISource | js.Array[ImageURISource]): Self = this.set("trackImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackImage: Self = this.set("trackImage", js.undefined)
    @scala.inline
    def setTrackTintColor(value: String): Self = this.set("trackTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackTintColor: Self = this.set("trackTintColor", js.undefined)
  }
  
}

