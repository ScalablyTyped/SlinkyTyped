package typingsSlinky.reactstrap.carouselCaptionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselCaptionProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var captionHeader: js.UndefOr[String] = js.undefined
  var captionText: String
  var cssModule: js.UndefOr[CSSModule] = js.undefined
}

object CarouselCaptionProps {
  @scala.inline
  def apply(
    captionText: String,
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    captionHeader: String = null,
    cssModule: CSSModule = null
  ): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal(captionText = captionText.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (captionHeader != null) __obj.updateDynamic("captionHeader")(captionHeader.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselCaptionProps]
  }
}

