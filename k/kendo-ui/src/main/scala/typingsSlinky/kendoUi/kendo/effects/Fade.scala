package typingsSlinky.kendoUi.kendo.effects

import typingsSlinky.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fade extends Effect {
  def direction(value: String): Fade = js.native
  def endValue(value: Double): Fade = js.native
  def startValue(value: Double): Fade = js.native
}

object Fade {
  @scala.inline
  def apply(
    add: Effect => Effect,
    direction: String => Fade,
    duration: Double => Effect,
    endValue: Double => Fade,
    play: () => JQueryPromise[_],
    reverse: () => JQueryPromise[_],
    startValue: Double => Fade,
    stop: () => Effect
  ): Fade = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), endValue = js.Any.fromFunction1(endValue), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), startValue = js.Any.fromFunction1(startValue), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Fade]
  }
  @scala.inline
  implicit class FadeOps[Self <: Fade] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String => Fade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndValue(value: Double => Fade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartValue(value: Double => Fade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

