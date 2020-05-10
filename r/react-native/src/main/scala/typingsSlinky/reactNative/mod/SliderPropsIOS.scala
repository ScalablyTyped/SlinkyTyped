package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderPropsIOS extends ViewProps {
  /**
    * Assigns a maximum track image. Only static images are supported.
    * The leftmost pixel of the image will be stretched to fill the track.
    */
  var maximumTrackImage: js.UndefOr[ImageURISource] = js.native
  /**
    * Assigns a minimum track image. Only static images are supported.
    * The rightmost pixel of the image will be stretched to fill the track.
    */
  var minimumTrackImage: js.UndefOr[ImageURISource] = js.native
  /**
    * Sets an image for the thumb. Only static images are supported.
    */
  var thumbImage: js.UndefOr[ImageURISource] = js.native
  /**
    * Assigns a single image for the track. Only static images
    * are supported. The center pixel of the image will be stretched
    * to fill the track.
    */
  var trackImage: js.UndefOr[ImageURISource] = js.native
}

object SliderPropsIOS {
  @scala.inline
  def apply(): SliderPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderPropsIOS]
  }
  @scala.inline
  implicit class SliderPropsIOSOps[Self <: SliderPropsIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumTrackImage(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTrackImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumTrackImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTrackImage")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumTrackImage(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumTrackImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumTrackImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumTrackImage")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbImage(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbImage")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackImage(value: ImageURISource): Self = {
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
  }
  
}

