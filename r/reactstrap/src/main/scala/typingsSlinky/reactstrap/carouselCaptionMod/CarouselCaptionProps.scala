package typingsSlinky.reactstrap.carouselCaptionMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselCaptionProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var captionHeader: js.UndefOr[String] = js.native
  var captionText: String = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
}

object CarouselCaptionProps {
  @scala.inline
  def apply(captionText: String): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal(captionText = captionText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselCaptionProps]
  }
  @scala.inline
  implicit class CarouselCaptionPropsOps[Self <: CarouselCaptionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptionHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withCssModule(value: CSSModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssModule")(js.undefined)
        ret
    }
  }
  
}

