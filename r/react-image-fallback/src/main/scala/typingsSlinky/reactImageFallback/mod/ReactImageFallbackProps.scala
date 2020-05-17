package typingsSlinky.reactImageFallback.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactImageFallbackProps extends js.Object {
  var fallbackImage: String | ReactElement | (js.Array[ReactElement | String]) = js.native
  var initialImage: js.UndefOr[String | ReactElement] = js.native
  var initialTimeout: js.UndefOr[Double] = js.native
  var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLImageElement], Unit]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLImageElement], Unit]] = js.native
  var src: String = js.native
}

object ReactImageFallbackProps {
  @scala.inline
  def apply(fallbackImage: String | ReactElement | (js.Array[ReactElement | String]), src: String): ReactImageFallbackProps = {
    val __obj = js.Dynamic.literal(fallbackImage = fallbackImage.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactImageFallbackProps]
  }
  @scala.inline
  implicit class ReactImageFallbackPropsOps[Self <: ReactImageFallbackProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallbackImageReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbackImage(value: String | ReactElement | (js.Array[ReactElement | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialImageReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialImage(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialImage")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* event */ SyntheticEvent[Event, HTMLImageElement] => Unit): Self = {
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
    def withOnLoad(value: /* event */ SyntheticEvent[Event, HTMLImageElement] => Unit): Self = {
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
  }
  
}

