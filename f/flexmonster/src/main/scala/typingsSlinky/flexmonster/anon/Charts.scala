package typingsSlinky.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charts extends js.Object {
  var charts: String = js.native
  var charts_bar: String = js.native
  var charts_column_line: String = js.native
  var charts_line: String = js.native
  var charts_pie: String = js.native
  var charts_scatter: String = js.native
  var charts_stacked_column: String = js.native
  var connect: String = js.native
  var connect_csv: String = js.native
  var connect_csv_remote: String = js.native
  var connect_json_remote: String = js.native
  var connect_olap: String = js.native
  var export: String = js.native
  var export_csv: String = js.native
  var export_excel: String = js.native
  var export_html: String = js.native
  var export_image: String = js.native
  var export_pdf: String = js.native
  var export_print: String = js.native
  var fields: String = js.native
  var format: String = js.native
  var format_conditional: String = js.native
  var format_number: String = js.native
  var fullscreen: String = js.native
  var grid: String = js.native
  var minimize: String = js.native
  var open: String = js.native
  var open_local: String = js.native
  var open_remote: String = js.native
  var options: String = js.native
  var save: String = js.native
}

object Charts {
  @scala.inline
  def apply(
    charts: String,
    charts_bar: String,
    charts_column_line: String,
    charts_line: String,
    charts_pie: String,
    charts_scatter: String,
    charts_stacked_column: String,
    connect: String,
    connect_csv: String,
    connect_csv_remote: String,
    connect_json_remote: String,
    connect_olap: String,
    export: String,
    export_csv: String,
    export_excel: String,
    export_html: String,
    export_image: String,
    export_pdf: String,
    export_print: String,
    fields: String,
    format: String,
    format_conditional: String,
    format_number: String,
    fullscreen: String,
    grid: String,
    minimize: String,
    open: String,
    open_local: String,
    open_remote: String,
    options: String,
    save: String
  ): Charts = {
    val __obj = js.Dynamic.literal(charts = charts.asInstanceOf[js.Any], charts_bar = charts_bar.asInstanceOf[js.Any], charts_column_line = charts_column_line.asInstanceOf[js.Any], charts_line = charts_line.asInstanceOf[js.Any], charts_pie = charts_pie.asInstanceOf[js.Any], charts_scatter = charts_scatter.asInstanceOf[js.Any], charts_stacked_column = charts_stacked_column.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], connect_csv = connect_csv.asInstanceOf[js.Any], connect_csv_remote = connect_csv_remote.asInstanceOf[js.Any], connect_json_remote = connect_json_remote.asInstanceOf[js.Any], connect_olap = connect_olap.asInstanceOf[js.Any], export = export.asInstanceOf[js.Any], export_csv = export_csv.asInstanceOf[js.Any], export_excel = export_excel.asInstanceOf[js.Any], export_html = export_html.asInstanceOf[js.Any], export_image = export_image.asInstanceOf[js.Any], export_pdf = export_pdf.asInstanceOf[js.Any], export_print = export_print.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], format_conditional = format_conditional.asInstanceOf[js.Any], format_number = format_number.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], minimize = minimize.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], open_local = open_local.asInstanceOf[js.Any], open_remote = open_remote.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charts]
  }
  @scala.inline
  implicit class ChartsOps[Self <: Charts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharts_bar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts_bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharts_column_line(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts_column_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharts_line(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharts_pie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts_pie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharts_scatter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts_scatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharts_stacked_column(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts_stacked_column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect_csv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect_csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect_csv_remote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect_csv_remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect_json_remote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect_json_remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect_olap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect_olap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExport_csv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export_csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExport_excel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export_excel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExport_html(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export_html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExport_image(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExport_pdf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export_pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExport_print(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export_print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat_conditional(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_conditional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen_local(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen_remote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

