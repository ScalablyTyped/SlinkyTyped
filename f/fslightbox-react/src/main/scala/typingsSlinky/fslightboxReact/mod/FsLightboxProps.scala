package typingsSlinky.fslightboxReact.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsLightboxProps extends js.Object {
  // custom sources
  var customSources: js.UndefOr[js.Array[ReactElement]] = js.native
  // types
  var disableLocalStorage: js.UndefOr[Boolean] = js.native
  // preferences
  var loadOnlyCurrentSource: js.UndefOr[Boolean] = js.native
  var maxYoutubeVideoDimensions: js.UndefOr[VideoDimensions] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  // events
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  var openOnMount: js.UndefOr[Boolean] = js.native
  // slide number controlling
  var slide: js.UndefOr[Double] = js.native
  var slideDistance: js.UndefOr[Double] = js.native
  var source: js.UndefOr[String] = js.native
  var sourceIndex: js.UndefOr[Double] = js.native
  var sources: js.UndefOr[js.Array[String]] = js.native
  var toggler: Boolean = js.native
  var `type`: js.UndefOr[SourceType] = js.native
  var types: js.UndefOr[js.Array[SourceType]] = js.native
  // sources
  var videosPosters: js.UndefOr[js.Array[VideoPoster]] = js.native
}

object FsLightboxProps {
  @scala.inline
  def apply(toggler: Boolean): FsLightboxProps = {
    val __obj = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsLightboxProps]
  }
  @scala.inline
  implicit class FsLightboxPropsOps[Self <: FsLightboxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToggler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomSources(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSources")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLocalStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLocalStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadOnlyCurrentSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnlyCurrentSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnlyCurrentSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnlyCurrentSource")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxYoutubeVideoDimensions(value: VideoDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYoutubeVideoDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxYoutubeVideoDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYoutubeVideoDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
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
    @scala.inline
    def withSourceIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: SourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[SourceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withVideosPosters(value: js.Array[VideoPoster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videosPosters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideosPosters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videosPosters")(js.undefined)
        ret
    }
  }
  
}

