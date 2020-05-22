package typingsSlinky.reactHelmet.mod

import org.scalajs.dom.raw.HTMLHtmlElement
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetHTMLElementDatum extends js.Object {
  def toComponent(): HTMLAttributes[HTMLHtmlElement]
}

object HelmetHTMLElementDatum {
  @scala.inline
  def apply(toComponent: () => HTMLAttributes[HTMLHtmlElement]): HelmetHTMLElementDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
    __obj.asInstanceOf[HelmetHTMLElementDatum]
  }
}

