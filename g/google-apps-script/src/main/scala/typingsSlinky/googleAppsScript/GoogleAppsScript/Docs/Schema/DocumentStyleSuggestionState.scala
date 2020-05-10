package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentStyleSuggestionState extends js.Object {
  var backgroundSuggestionState: js.UndefOr[BackgroundSuggestionState] = js.native
  var defaultFooterIdSuggested: js.UndefOr[Boolean] = js.native
  var defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  var evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.native
  var evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  var firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.native
  var firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  var marginBottomSuggested: js.UndefOr[Boolean] = js.native
  var marginLeftSuggested: js.UndefOr[Boolean] = js.native
  var marginRightSuggested: js.UndefOr[Boolean] = js.native
  var marginTopSuggested: js.UndefOr[Boolean] = js.native
  var pageNumberStartSuggested: js.UndefOr[Boolean] = js.native
  var pageSizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.native
  var useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.native
  var useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.native
}

object DocumentStyleSuggestionState {
  @scala.inline
  def apply(): DocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStyleSuggestionState]
  }
  @scala.inline
  implicit class DocumentStyleSuggestionStateOps[Self <: DocumentStyleSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundSuggestionState(value: BackgroundSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFooterIdSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFooterIdSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFooterIdSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFooterIdSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHeaderIdSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaderIdSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHeaderIdSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaderIdSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withEvenPageFooterIdSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenPageFooterIdSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvenPageFooterIdSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenPageFooterIdSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withEvenPageHeaderIdSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenPageHeaderIdSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvenPageHeaderIdSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenPageHeaderIdSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageFooterIdSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageFooterIdSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageFooterIdSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageFooterIdSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageHeaderIdSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageHeaderIdSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageHeaderIdSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageHeaderIdSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottomSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottomSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottomSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottomSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeftSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeftSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeftSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeftSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRightSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRightSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRightSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRightSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTopSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTopSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTopSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTopSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withPageNumberStartSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumberStartSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageNumberStartSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumberStartSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeSuggestionState(value: SizeSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEvenPageHeaderFooterSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEvenPageHeaderFooterSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEvenPageHeaderFooterSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEvenPageHeaderFooterSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFirstPageHeaderFooterSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFirstPageHeaderFooterSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFirstPageHeaderFooterSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFirstPageHeaderFooterSuggested")(js.undefined)
        ret
    }
  }
  
}

