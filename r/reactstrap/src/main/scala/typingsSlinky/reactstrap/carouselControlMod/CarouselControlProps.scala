package typingsSlinky.reactstrap.carouselControlMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import typingsSlinky.reactstrap.reactstrapStrings.next
import typingsSlinky.reactstrap.reactstrapStrings.prev
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselControlProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* s */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var direction: prev | next
  var directionText: String
  def onClickHandler(): Unit
}

object CarouselControlProps {
  @scala.inline
  def apply(
    direction: prev | next,
    directionText: String,
    onClickHandler: () => Unit,
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    StringDictionary: /* s */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null
  ): CarouselControlProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], directionText = directionText.asInstanceOf[js.Any], onClickHandler = js.Any.fromFunction0(onClickHandler))
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselControlProps]
  }
}

