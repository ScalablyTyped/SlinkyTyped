package typingsSlinky.reactHelmet.mod

import org.scalajs.dom.raw.HTMLBodyElement
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelmetHTMLBodyDatum extends js.Object {
  def toComponent(): HTMLAttributes[HTMLBodyElement] = js.native
}

object HelmetHTMLBodyDatum {
  @scala.inline
  def apply(toComponent: () => HTMLAttributes[HTMLBodyElement]): HelmetHTMLBodyDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
    __obj.asInstanceOf[HelmetHTMLBodyDatum]
  }
  @scala.inline
  implicit class HelmetHTMLBodyDatumOps[Self <: HelmetHTMLBodyDatum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToComponent(value: () => HTMLAttributes[HTMLBodyElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toComponent")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

