package typingsSlinky.ckeditorCkeditor5Utils.mod

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var element: HTMLElement = js.native
  var fitInViewport: js.UndefOr[Boolean] = js.native
  var limiter: js.UndefOr[
    HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
  ] = js.native
  var positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]] = js.native
  var target: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect]) = js.native
}

object Options {
  @scala.inline
  def apply(
    element: HTMLElement,
    positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]],
    target: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
  ): Options = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositions(value: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetClientRect(value: ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetFunction0(value: () => HTMLElement | Range | ClientRect | Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(
      value: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFitInViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitInViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitInViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitInViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withLimiter(
      value: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimiterFunction0(value: () => HTMLElement | Range | ClientRect | Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limiter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLimiterClientRect(value: ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimiterRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimiterHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limiter")(js.undefined)
        ret
    }
  }
  
}

