package typingsSlinky.mcustomscrollbar

import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.auto
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.stepless
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.stepped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnable extends js.Object {
  /**
    * Enable or disable content scrolling via keyboard.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Set the keyboard arrows scrolling amount (in pixels). 
    * The default value "auto" adjusts scrolling amount according to scrollable content length.
    */
  var scrollAmount: js.UndefOr[auto | Double] = js.native
  /**
    * Define the buttons scrolling type/behavior.
    * scrollType: "stepless" – continuously scroll content while pressing the button (default)
    * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
    */
  var scrollType: js.UndefOr[stepless | stepped] = js.native
}

object AnonEnable {
  @scala.inline
  def apply(): AnonEnable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEnable]
  }
  @scala.inline
  implicit class AnonEnableOps[Self <: AnonEnable] (val x: Self) extends AnyVal {
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
  }
  
}

