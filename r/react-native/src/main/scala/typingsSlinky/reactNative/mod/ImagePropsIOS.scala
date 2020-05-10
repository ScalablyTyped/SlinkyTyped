package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePropsIOS extends js.Object {
  /**
    * blurRadius: the blur radius of the blur filter added to the image
    * @platform ios
    */
  var blurRadius: js.UndefOr[Double] = js.native
  /**
    * When the image is resized, the corners of the size specified by capInsets will stay a fixed size,
    * but the center content and borders of the image will be stretched.
    * This is useful for creating resizable rounded buttons, shadows, and other resizable assets.
    * More info on Apple documentation
    */
  var capInsets: js.UndefOr[Insets] = js.native
  /**
    * Invoked when a partial load of the image is complete. The definition of
    * what constitutes a "partial load" is loader specific though this is meant
    * for progressive JPEG loads.
    * @platform ios
    */
  var onPartialLoad: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Invoked on download progress with {nativeEvent: {loaded, total}}
    */
  var onProgress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageProgressEventDataIOS], Unit]] = js.native
}

object ImagePropsIOS {
  @scala.inline
  def apply(): ImagePropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePropsIOS]
  }
  @scala.inline
  implicit class ImagePropsIOSOps[Self <: ImagePropsIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlurRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCapInsets(value: Insets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capInsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapInsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capInsets")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPartialLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPartialLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPartialLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPartialLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: SyntheticEvent[NodeHandle, ImageProgressEventDataIOS] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
  }
  
}

