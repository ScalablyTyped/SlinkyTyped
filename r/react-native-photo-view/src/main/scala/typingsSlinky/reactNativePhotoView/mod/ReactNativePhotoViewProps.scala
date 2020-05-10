package typingsSlinky.reactNativePhotoView.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNativePhotoView.AnonX
import typingsSlinky.reactNativePhotoView.reactNativePhotoViewStrings.center
import typingsSlinky.reactNativePhotoView.reactNativePhotoViewStrings.centerCrop
import typingsSlinky.reactNativePhotoView.reactNativePhotoViewStrings.centerInside
import typingsSlinky.reactNativePhotoView.reactNativePhotoViewStrings.fitCenter
import typingsSlinky.reactNativePhotoView.reactNativePhotoViewStrings.fitEnd
import typingsSlinky.reactNativePhotoView.reactNativePhotoViewStrings.fitStart
import typingsSlinky.reactNativePhotoView.reactNativePhotoViewStrings.fitXY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativePhotoViewProps extends js.Object {
  var androidScaleType: js.UndefOr[center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY] = js.native
  var androidZoomTransitionDuration: js.UndefOr[Double] = js.native
  var fadeDuration: js.UndefOr[Double] = js.native
  var loadingIndicatorSource: js.UndefOr[ImageSourcePropType] = js.native
  var maximumZoomScale: js.UndefOr[Double] = js.native
  var minimumZoomScale: js.UndefOr[Double] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onProgress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.native
  var onScale: js.UndefOr[js.Function2[/* scale */ Double, /* target */ js.UndefOr[ReactElement], Unit]] = js.native
  var onTap: js.UndefOr[js.Function2[/* point */ AnonX, /* target */ js.UndefOr[ReactElement], Unit]] = js.native
  var onViewTap: js.UndefOr[js.Function2[/* point */ AnonX, /* target */ js.UndefOr[ReactElement], Unit]] = js.native
  var scale: js.UndefOr[Double] = js.native
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.native
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[ImageSourcePropType] = js.native
}

object ReactNativePhotoViewProps {
  @scala.inline
  def apply(): ReactNativePhotoViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactNativePhotoViewProps]
  }
  @scala.inline
  implicit class ReactNativePhotoViewPropsOps[Self <: ReactNativePhotoViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidScaleType(value: center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidScaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidScaleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidScaleType")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidZoomTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidZoomTransitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidZoomTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidZoomTransitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIndicatorSource(value: ImageSourcePropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicatorSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIndicatorSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicatorSource")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumZoomScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumZoomScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumZoomScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumZoomScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumZoomScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZoomScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumZoomScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZoomScale")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoadEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: (/* loaded */ Double, /* total */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScale(value: (/* scale */ Double, /* target */ js.UndefOr[ReactElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScale")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScale")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTap(value: (/* point */ AnonX, /* target */ js.UndefOr[ReactElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewTap(value: (/* point */ AnonX, /* target */ js.UndefOr[ReactElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewTap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnViewTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewTap")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsHorizontalScrollIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsHorizontalScrollIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsHorizontalScrollIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsHorizontalScrollIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsVerticalScrollIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsVerticalScrollIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsVerticalScrollIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsVerticalScrollIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: ImageSourcePropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

