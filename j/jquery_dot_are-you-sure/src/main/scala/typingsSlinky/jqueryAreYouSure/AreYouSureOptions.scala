package typingsSlinky.jqueryAreYouSure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**Options available to control dirty form checking*/
@js.native
trait AreYouSureOptions extends js.Object {
  /**Callback when form is found to be dirty - allows control of submit/reset buttons etc*/
  var change: js.UndefOr[js.Function] = js.native
  /**Class to assign to the form when dirty*/
  var dirtyClass: js.UndefOr[String] = js.native
  /**Jquery selector to use to find input elements*/
  var fieldSelector: js.UndefOr[String] = js.native
  /**Message to show when attempting to quit a dirty form without saving*/
  var message: js.UndefOr[String] = js.native
  /**Make Are-You-Sure "silent" by disabling the warning message*/
  var silent: js.UndefOr[Boolean] = js.native
}

object AreYouSureOptions {
  @scala.inline
  def apply(): AreYouSureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreYouSureOptions]
  }
  @scala.inline
  implicit class AreYouSureOptionsOps[Self <: AreYouSureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withDirtyClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirtyClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
  }
  
}

