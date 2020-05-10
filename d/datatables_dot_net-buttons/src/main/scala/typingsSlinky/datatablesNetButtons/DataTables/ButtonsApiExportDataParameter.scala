package typingsSlinky.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonsApiExportDataParameter extends js.Object {
  var columns: js.UndefOr[js.Any] = js.native
  var decodeEntities: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[js.Any] = js.native
  var modifier: js.UndefOr[js.Any] = js.native
  var orthogonal: js.UndefOr[String] = js.native
  var rows: js.UndefOr[js.Any] = js.native
  var stripHtml: js.UndefOr[Boolean] = js.native
  var stripNewlines: js.UndefOr[Boolean] = js.native
  var trim: js.UndefOr[Boolean] = js.native
}

object ButtonsApiExportDataParameter {
  @scala.inline
  def apply(): ButtonsApiExportDataParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonsApiExportDataParameter]
  }
  @scala.inline
  implicit class ButtonsApiExportDataParameterOps[Self <: ButtonsApiExportDataParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDecodeEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodeEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withModifier(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOrthogonal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orthogonal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrthogonal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orthogonal")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withStripHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withStripNewlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripNewlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripNewlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripNewlines")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

