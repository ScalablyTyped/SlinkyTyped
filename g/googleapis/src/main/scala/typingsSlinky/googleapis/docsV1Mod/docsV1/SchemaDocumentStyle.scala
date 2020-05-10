package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The style of the document.
  */
@js.native
trait SchemaDocumentStyle extends js.Object {
  /**
    * The background of the document.
    */
  var background: js.UndefOr[SchemaBackground] = js.native
  /**
    * The ID of the default footer. If not set, there is no default footer.
    */
  var defaultFooterId: js.UndefOr[String] = js.native
  /**
    * The ID of the default header. If not set, there is no default header.
    */
  var defaultHeaderId: js.UndefOr[String] = js.native
  /**
    * The ID of the footer used only for even pages. The value of
    * use_even_page_header_footer determines whether to use the
    * default_footer_id or this value for the footer on even pages. If not set,
    * there is no even page footer.
    */
  var evenPageFooterId: js.UndefOr[String] = js.native
  /**
    * The ID of the header used only for even pages. The value of
    * use_even_page_header_footer determines whether to use the
    * default_header_id or this value for the header on even pages. If not set,
    * there is no even page header.
    */
  var evenPageHeaderId: js.UndefOr[String] = js.native
  /**
    * The ID of the footer used only for the first page. If not set then a
    * unique footer for the first page does not exist. The value of
    * use_first_page_header_footer determines whether to use the
    * default_footer_id or this value for the footer on the first page. If not
    * set, there is no first page footer.
    */
  var firstPageFooterId: js.UndefOr[String] = js.native
  /**
    * The ID of the header used only for the first page. If not set then a
    * unique header for the first page does not exist. The value of
    * use_first_page_header_footer determines whether to use the
    * default_header_id or this value for the header on the first page. If not
    * set, there is no first page header.
    */
  var firstPageHeaderId: js.UndefOr[String] = js.native
  /**
    * The bottom page margin.
    */
  var marginBottom: js.UndefOr[SchemaDimension] = js.native
  /**
    * The left page margin.
    */
  var marginLeft: js.UndefOr[SchemaDimension] = js.native
  /**
    * The right page margin.
    */
  var marginRight: js.UndefOr[SchemaDimension] = js.native
  /**
    * The top page margin.
    */
  var marginTop: js.UndefOr[SchemaDimension] = js.native
  /**
    * The page number from which to start counting the number of pages.
    */
  var pageNumberStart: js.UndefOr[Double] = js.native
  /**
    * The size of a page in the document.
    */
  var pageSize: js.UndefOr[SchemaSize] = js.native
  /**
    * Indicates whether to use the even page header / footer IDs for the even
    * pages.
    */
  var useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to use the first page header / footer IDs for the first
    * page.
    */
  var useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.native
}

object SchemaDocumentStyle {
  @scala.inline
  def apply(): SchemaDocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentStyle]
  }
  @scala.inline
  implicit class SchemaDocumentStyleOps[Self <: SchemaDocumentStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: SchemaBackground): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFooterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFooterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFooterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFooterId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHeaderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHeaderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaderId")(js.undefined)
        ret
    }
    @scala.inline
    def withEvenPageFooterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenPageFooterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvenPageFooterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenPageFooterId")(js.undefined)
        ret
    }
    @scala.inline
    def withEvenPageHeaderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenPageHeaderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvenPageHeaderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenPageHeaderId")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageFooterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageFooterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageFooterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageFooterId")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageHeaderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageHeaderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageHeaderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageHeaderId")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottom(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeft(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRight(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTop(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPageNumberStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumberStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageNumberStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumberStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: SchemaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEvenPageHeaderFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEvenPageHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEvenPageHeaderFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEvenPageHeaderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFirstPageHeaderFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFirstPageHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFirstPageHeaderFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFirstPageHeaderFooter")(js.undefined)
        ret
    }
  }
  
}

