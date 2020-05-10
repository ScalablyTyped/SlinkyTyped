package typingsSlinky.betterScroll

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.InfinityOption> */
@js.native
trait PartialInfinityOption extends js.Object {
  var createTombstone: js.UndefOr[js.Function0[Element]] = js.native
  var fetch: js.UndefOr[js.Function1[/* count */ Double, Unit]] = js.native
  var render: js.UndefOr[js.Function2[/* item */ js.Any, /* div */ Element, Element]] = js.native
}

object PartialInfinityOption {
  @scala.inline
  def apply(): PartialInfinityOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInfinityOption]
  }
  @scala.inline
  implicit class PartialInfinityOptionOps[Self <: PartialInfinityOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTombstone(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTombstone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreateTombstone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTombstone")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch(value: /* count */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: (/* item */ js.Any, /* div */ Element) => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

