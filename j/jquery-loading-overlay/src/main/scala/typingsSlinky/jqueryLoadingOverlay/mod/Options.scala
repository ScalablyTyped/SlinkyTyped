package typingsSlinky.jqueryLoadingOverlay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  loadingClass  :string,   overlayClass  :string,   spinnerClass  :string,   iconClass  :string,   textClass  :string,   loadingText  :string}> */
@js.native
trait Options extends js.Object {
  var iconClass: js.UndefOr[String] = js.native
  var loadingClass: js.UndefOr[String] = js.native
  var loadingText: js.UndefOr[String] = js.native
  var overlayClass: js.UndefOr[String] = js.native
  var spinnerClass: js.UndefOr[String] = js.native
  var textClass: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTextClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textClass")(js.undefined)
        ret
    }
  }
  
}

