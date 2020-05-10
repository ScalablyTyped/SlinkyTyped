package typingsSlinky.mcustomscrollbar

import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.auto
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.stepless
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.stepped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScrollAmount extends js.Object {
  /**
    * Enable or disable scroll buttons.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Scroll buttons pixels scrolling amount, value in pixels or "auto"
    */
  var scrollAmount: js.UndefOr[auto | Double] = js.native
  /**
    * Define the buttons scrolling type/behavior.
    * scrollType: "stepless" – continuously scroll content while pressing the button (default)
    * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
    */
  var scrollType: js.UndefOr[stepless | stepped] = js.native
  /**
    * Set a tabindex value for the buttons.
    */
  var tabindex: js.UndefOr[Double] = js.native
}

object AnonScrollAmount {
  @scala.inline
  def apply(): AnonScrollAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonScrollAmount]
  }
  @scala.inline
  implicit class AnonScrollAmountOps[Self <: AnonScrollAmount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollAmount(value: auto | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollType(value: stepless | stepped): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollType")(js.undefined)
        ret
    }
    @scala.inline
    def withTabindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(js.undefined)
        ret
    }
  }
  
}

