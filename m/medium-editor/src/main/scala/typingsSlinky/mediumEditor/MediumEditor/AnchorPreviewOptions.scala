package typingsSlinky.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorPreviewOptions extends js.Object {
  var hideDelay: js.UndefOr[Double] = js.native
  var previewValueSelector: js.UndefOr[String] = js.native
  var showOnEmptyLinks: js.UndefOr[Boolean] = js.native
  var showWhenToolbarIsVisible: js.UndefOr[Boolean] = js.native
}

object AnchorPreviewOptions {
  @scala.inline
  def apply(): AnchorPreviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorPreviewOptions]
  }
  @scala.inline
  implicit class AnchorPreviewOptionsOps[Self <: AnchorPreviewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewValueSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewValueSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewValueSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewValueSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnEmptyLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnEmptyLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnEmptyLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnEmptyLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWhenToolbarIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWhenToolbarIsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWhenToolbarIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWhenToolbarIsVisible")(js.undefined)
        ret
    }
  }
  
}

