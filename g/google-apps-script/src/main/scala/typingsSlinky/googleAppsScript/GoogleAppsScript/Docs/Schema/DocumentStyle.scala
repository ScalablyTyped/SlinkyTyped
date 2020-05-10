package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentStyle extends js.Object {
  var background: js.UndefOr[Background] = js.native
  var defaultFooterId: js.UndefOr[String] = js.native
  var defaultHeaderId: js.UndefOr[String] = js.native
  var evenPageFooterId: js.UndefOr[String] = js.native
  var evenPageHeaderId: js.UndefOr[String] = js.native
  var firstPageFooterId: js.UndefOr[String] = js.native
  var firstPageHeaderId: js.UndefOr[String] = js.native
  var marginBottom: js.UndefOr[Dimension] = js.native
  var marginLeft: js.UndefOr[Dimension] = js.native
  var marginRight: js.UndefOr[Dimension] = js.native
  var marginTop: js.UndefOr[Dimension] = js.native
  var pageNumberStart: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Size] = js.native
  var useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.native
  var useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.native
}

object DocumentStyle {
  @scala.inline
  def apply(): DocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStyle]
  }
  @scala.inline
  implicit class DocumentStyleOps[Self <: DocumentStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: Background): Self = {
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
    def withMarginBottom(value: Dimension): Self = {
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
    def withMarginLeft(value: Dimension): Self = {
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
    def withMarginRight(value: Dimension): Self = {
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
    def withMarginTop(value: Dimension): Self = {
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
    def withPageSize(value: Size): Self = {
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

