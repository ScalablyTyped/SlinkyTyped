package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base DocumentStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaDocumentStyleSuggestionState extends js.Object {
  /**
    * A mask that indicates which of the fields in background have been changed
    * in this suggestion.
    */
  var backgroundSuggestionState: js.UndefOr[SchemaBackgroundSuggestionState] = js.native
  /**
    * Indicates if there was a suggested change to default_footer_id.
    */
  var defaultFooterIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to default_header_id.
    */
  var defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to even_page_footer_id.
    */
  var evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to even_page_header_id.
    */
  var evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to first_page_footer_id.
    */
  var firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to first_page_header_id.
    */
  var firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to margin_bottom.
    */
  var marginBottomSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to margin_left.
    */
  var marginLeftSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to margin_right.
    */
  var marginRightSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to margin_top.
    */
  var marginTopSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to page_number_start.
    */
  var pageNumberStartSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in size have been changed in
    * this suggestion.
    */
  var pageSizeSuggestionState: js.UndefOr[SchemaSizeSuggestionState] = js.native
  /**
    * Indicates if there was a suggested change to use_even_page_header_footer.
    */
  var useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to
    * use_first_page_header_footer.
    */
  var useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaDocumentStyleSuggestionState {
  @scala.inline
  def apply(): SchemaDocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentStyleSuggestionState]
  }
  @scala.inline
  implicit class SchemaDocumentStyleSuggestionStateOps[Self <: SchemaDocumentStyleSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundSuggestionState(value: SchemaBackgroundSuggestionState): Self = {
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
    def withPageSizeSuggestionState(value: SchemaSizeSuggestionState): Self = {
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

