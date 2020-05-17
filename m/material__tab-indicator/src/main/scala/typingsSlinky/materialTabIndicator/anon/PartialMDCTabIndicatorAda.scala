package typingsSlinky.materialTabIndicator.anon

import org.scalajs.dom.raw.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/tab-indicator.@material/tab-indicator/adapter.MDCTabIndicatorAdapter> */
@js.native
trait PartialMDCTabIndicatorAda extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var computeContentClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.native
}

object PartialMDCTabIndicatorAda {
  @scala.inline
  def apply(): PartialMDCTabIndicatorAda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTabIndicatorAda]
  }
  @scala.inline
  implicit class PartialMDCTabIndicatorAdaOps[Self <: PartialMDCTabIndicatorAda] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: /* className */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeContentClientRect(value: () => ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeContentClientRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComputeContentClientRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeContentClientRect")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClass(value: /* className */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSetContentStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentStyleProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetContentStyleProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentStyleProperty")(js.undefined)
        ret
    }
  }
  
}

