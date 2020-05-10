package typingsSlinky.jquery.JQuery_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
  * @since 1.8
  */
// This should be a class but doesn't work correctly under the JQuery namespace. Tween should be an inner class of jQuery.
@js.native
trait Tween[TElement] extends js.Object {
  /**
    * The easing used
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var easing: String = js.native
  /**
    * The element being animated
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var elem: TElement = js.native
  /**
    * The ending value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var end: Double = js.native
  /**
    * The current value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var now: Double = js.native
  /**
    * A reference to the animation options
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var options: EffectsOptions[TElement] = js.native
  // Undocumented. Is this intended to be public?
  var pos: js.UndefOr[Double] = js.native
  /**
    * The property being animated
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var prop: String = js.native
  /**
    * The starting value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var start: Double = js.native
  /**
    * The CSS unit for the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var unit: String = js.native
  /**
    * Reads the current value for property from the element
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  def cur(): js.Any = js.native
  /**
    * Updates the value for the property on the animated elemd.
    * @param progress A number from 0 to 1.
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  def run(progress: Double): this.type = js.native
}

object Tween {
  @scala.inline
  def apply[TElement](
    cur: () => js.Any,
    easing: String,
    elem: TElement,
    end: Double,
    now: Double,
    options: EffectsOptions[TElement],
    prop: String,
    run: Double => Tween[TElement],
    start: Double,
    unit: String
  ): Tween[TElement] = {
    val __obj = js.Dynamic.literal(cur = js.Any.fromFunction0(cur), easing = easing.asInstanceOf[js.Any], elem = elem.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], run = js.Any.fromFunction1(run), start = start.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tween[TElement]]
  }
  @scala.inline
  implicit class TweenOps[Self[telement] <: Tween[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withCur(value: () => js.Any): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEasing(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElem(value: TElement): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNow(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: EffectsOptions[TElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProp(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: Double => Tween[TElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPos: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(js.undefined)
        ret
    }
  }
  
}

