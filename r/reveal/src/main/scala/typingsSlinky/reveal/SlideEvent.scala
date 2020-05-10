package typingsSlinky.reveal

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#slide-changed-event
@js.native
trait SlideEvent extends js.Object {
  var currentSlide: Element = js.native
  var indexh: Double = js.native
  var indexv: js.UndefOr[Double] = js.native
  var previousSlide: js.UndefOr[Element] = js.native
}

object SlideEvent {
  @scala.inline
  def apply(currentSlide: Element, indexh: Double): SlideEvent = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], indexh = indexh.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideEvent]
  }
  @scala.inline
  implicit class SlideEventOps[Self <: SlideEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSlide(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexv(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexv")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousSlide(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSlide")(js.undefined)
        ret
    }
  }
  
}

