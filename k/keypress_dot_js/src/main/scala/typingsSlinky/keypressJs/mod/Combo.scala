package typingsSlinky.keypressJs.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Combo extends js.Object {
  var is_counting: js.UndefOr[Boolean] = js.native
  var is_exclusive: js.UndefOr[Boolean] = js.native
  var is_sequence: js.UndefOr[Boolean] = js.native
  var is_solitary: js.UndefOr[Boolean] = js.native
  var is_unordered: js.UndefOr[Boolean] = js.native
  var keys: js.UndefOr[String] = js.native
  var on_keydown: js.UndefOr[
    js.Function2[/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double], _]
  ] = js.native
  var on_keyup: js.UndefOr[js.Function1[/* event */ js.UndefOr[KeyboardEvent], _]] = js.native
  var on_release: js.UndefOr[js.Function1[/* event */ js.UndefOr[KeyboardEvent], _]] = js.native
  var prevent_default: js.UndefOr[Boolean] = js.native
  var prevent_repeat: js.UndefOr[Boolean] = js.native
  var `this`: js.UndefOr[Element] = js.native
}

object Combo {
  @scala.inline
  def apply(): Combo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Combo]
  }
  @scala.inline
  implicit class ComboOps[Self <: Combo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_counting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_counting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_counting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_counting")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_exclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_exclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_exclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_sequence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_sequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_solitary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_solitary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_solitary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_solitary")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_unordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_unordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_unordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_unordered")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_keydown(value: (/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_keydown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOn_keydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_keyup(value: /* event */ js.UndefOr[KeyboardEvent] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_keyup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOn_keyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_keyup")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_release(value: /* event */ js.UndefOr[KeyboardEvent] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_release")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOn_release: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_release")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevent_default(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevent_default: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent_default")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevent_repeat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent_repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevent_repeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent_repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withThis(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("this")(js.undefined)
        ret
    }
  }
  
}

