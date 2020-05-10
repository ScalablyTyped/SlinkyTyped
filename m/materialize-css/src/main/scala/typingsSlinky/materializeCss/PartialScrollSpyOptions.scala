package typingsSlinky.materializeCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ScrollSpyOptions> */
@js.native
trait PartialScrollSpyOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.native
  var getActiveElement: js.UndefOr[js.Function1[/* id */ String, String]] = js.native
  var scrollOffset: js.UndefOr[Double] = js.native
  var throttle: js.UndefOr[Double] = js.native
}

object PartialScrollSpyOptions {
  @scala.inline
  def apply(): PartialScrollSpyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollSpyOptions]
  }
  @scala.inline
  implicit class PartialScrollSpyOptionsOps[Self <: PartialScrollSpyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveElement(value: /* id */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetActiveElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveElement")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
  }
  
}

