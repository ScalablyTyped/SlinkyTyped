package typingsSlinky.reactImageloader.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageLoaderProps extends Props[ImageLoader] {
  /** An optional class name for the wrapper component. */
  var className: js.UndefOr[String] = js.native
  /** An optional object containing props for the underlying img component. */
  var imgProps: js.UndefOr[js.Any] = js.native
  /** An optional handler for the error event. */
  var onError: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  /** An optional handler for the load event. */
  var onLoad: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  /** An optional function that returns a React element to be shown while the image loads. */
  var preloader: js.UndefOr[js.Function1[/* params */ js.Any, ReactElement]] = js.native
  /** The URL of the image to be loaded. */
  var src: String = js.native
  /** An optional object containing styles for the wrapper component. */
  var style: js.UndefOr[CSSProperties] = js.native
  /** A function that takes a props argument and returns a React element to be used as the wrapper component. Defaults to React.DOM.span. */
  var wrapper: js.UndefOr[js.Function1[/* props */ js.Any, ReactElement]] = js.native
}

object ImageLoaderProps {
  @scala.inline
  def apply(src: String): ImageLoaderProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoaderProps]
  }
  @scala.inline
  implicit class ImageLoaderPropsOps[Self <: ImageLoaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withImgProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloader(value: /* params */ js.Any => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreloader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloader")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: /* props */ js.Any => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}

