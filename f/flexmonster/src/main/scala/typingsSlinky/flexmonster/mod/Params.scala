package typingsSlinky.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  // events
  var afterchartdraw: js.UndefOr[js.Function0[Unit]] = js.native
  var aftergriddraw: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.native
  var beforegriddraw: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.native
  var beforetoolbarcreated: js.UndefOr[js.Function1[/* toolbar */ Toolbar, Unit]] = js.native
  var cellclick: js.UndefOr[js.Function1[/* cell */ CellData, Unit]] = js.native
  var celldoubleclick: js.UndefOr[js.Function1[/* cell */ CellData, Unit]] = js.native
  var chartclick: js.UndefOr[js.Function1[/* data */ ChartData, Unit]] = js.native
  var componentFolder: js.UndefOr[String] = js.native
  // other
  var container: js.UndefOr[String] = js.native
  var customizeCell: js.UndefOr[js.Function2[/* cell */ CellBuilder, /* data */ CellData, Unit]] = js.native
  var customizeContextMenu: js.UndefOr[
    js.Function3[
      /* items */ js.Array[ContextMenuItem], 
      /* data */ CellData | ChartData, 
      /* viewType */ String, 
      js.Array[ContextMenuItem]
    ]
  ] = js.native
  var datachanged: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.native
  var dataerror: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.native
  var datafilecancelled: js.UndefOr[js.Function0[Unit]] = js.native
  var dataloaded: js.UndefOr[js.Function0[Unit]] = js.native
  var exportcomplete: js.UndefOr[js.Function0[Unit]] = js.native
  var exportstart: js.UndefOr[js.Function0[Unit]] = js.native
  var fieldslistclose: js.UndefOr[js.Function0[Unit]] = js.native
  var fieldslistopen: js.UndefOr[js.Function0[Unit]] = js.native
  var filterclose: js.UndefOr[js.Function0[Unit]] = js.native
  var filteropen: js.UndefOr[js.Function0[Unit]] = js.native
  var global: js.UndefOr[Report] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var licenseKey: js.UndefOr[String] = js.native
  var loadingdata: js.UndefOr[js.Function0[Unit]] = js.native
  var loadinglocalization: js.UndefOr[js.Function0[Unit]] = js.native
  var loadingolapstructure: js.UndefOr[js.Function0[Unit]] = js.native
  var loadingreportfile: js.UndefOr[js.Function0[Unit]] = js.native
  var localizationerror: js.UndefOr[js.Function0[Unit]] = js.native
  var localizationloaded: js.UndefOr[js.Function0[Unit]] = js.native
  var olapstructureerror: js.UndefOr[js.Function0[Unit]] = js.native
  var olapstructureloaded: js.UndefOr[js.Function0[Unit]] = js.native
  var openingreportfile: js.UndefOr[js.Function0[Unit]] = js.native
  var printcomplete: js.UndefOr[js.Function0[Unit]] = js.native
  var printstart: js.UndefOr[js.Function0[Unit]] = js.native
  var querycomplete: js.UndefOr[js.Function0[Unit]] = js.native
  var queryerror: js.UndefOr[js.Function0[Unit]] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  var report: js.UndefOr[Report | String] = js.native
  var reportchange: js.UndefOr[js.Function0[Unit]] = js.native
  var reportcomplete: js.UndefOr[js.Function0[Unit]] = js.native
  var reportfilecancelled: js.UndefOr[js.Function0[Unit]] = js.native
  var reportfileerror: js.UndefOr[js.Function0[Unit]] = js.native
  var reportfileloaded: js.UndefOr[js.Function0[Unit]] = js.native
  var runningquery: js.UndefOr[js.Function0[Unit]] = js.native
  // params
  var toolbar: js.UndefOr[Boolean] = js.native
  var update: js.UndefOr[js.Function0[Unit]] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterchartdraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterchartdraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterchartdraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterchartdraw")(js.undefined)
        ret
    }
    @scala.inline
    def withAftergriddraw(value: /* param */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aftergriddraw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAftergriddraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aftergriddraw")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforegriddraw(value: /* param */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforegriddraw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforegriddraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforegriddraw")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforetoolbarcreated(value: /* toolbar */ Toolbar => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforetoolbarcreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforetoolbarcreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforetoolbarcreated")(js.undefined)
        ret
    }
    @scala.inline
    def withCellclick(value: /* cell */ CellData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellclick")(js.undefined)
        ret
    }
    @scala.inline
    def withCelldoubleclick(value: /* cell */ CellData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("celldoubleclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCelldoubleclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("celldoubleclick")(js.undefined)
        ret
    }
    @scala.inline
    def withChartclick(value: /* data */ ChartData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChartclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartclick")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeCell(value: (/* cell */ CellBuilder, /* data */ CellData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomizeCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeCell")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeContextMenu(
      value: (/* items */ js.Array[ContextMenuItem], /* data */ CellData | ChartData, /* viewType */ String) => js.Array[ContextMenuItem]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeContextMenu")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCustomizeContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withDatachanged(value: /* param */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datachanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDatachanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datachanged")(js.undefined)
        ret
    }
    @scala.inline
    def withDataerror(value: /* param */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataerror")(js.undefined)
        ret
    }
    @scala.inline
    def withDatafilecancelled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafilecancelled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDatafilecancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafilecancelled")(js.undefined)
        ret
    }
    @scala.inline
    def withDataloaded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataloaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDataloaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataloaded")(js.undefined)
        ret
    }
    @scala.inline
    def withExportcomplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportcomplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExportcomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportcomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withExportstart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportstart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExportstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportstart")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldslistclose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldslistclose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFieldslistclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldslistclose")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldslistopen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldslistopen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFieldslistopen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldslistopen")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterclose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterclose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFilterclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterclose")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteropen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteropen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFilteropen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteropen")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: Report): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingdata(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingdata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLoadingdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingdata")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadinglocalization(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadinglocalization")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLoadinglocalization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadinglocalization")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingolapstructure(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingolapstructure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLoadingolapstructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingolapstructure")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingreportfile(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingreportfile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLoadingreportfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingreportfile")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizationerror(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizationerror")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLocalizationerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizationerror")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizationloaded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizationloaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLocalizationloaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizationloaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOlapstructureerror(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("olapstructureerror")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOlapstructureerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("olapstructureerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOlapstructureloaded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("olapstructureloaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOlapstructureloaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("olapstructureloaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOpeningreportfile(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openingreportfile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOpeningreportfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openingreportfile")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintcomplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printcomplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPrintcomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printcomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintstart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printstart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPrintstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printstart")(js.undefined)
        ret
    }
    @scala.inline
    def withQuerycomplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querycomplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutQuerycomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querycomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryerror(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryerror")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutQueryerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryerror")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withReport(value: Report | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.undefined)
        ret
    }
    @scala.inline
    def withReportchange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportchange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReportchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportchange")(js.undefined)
        ret
    }
    @scala.inline
    def withReportcomplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportcomplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReportcomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportcomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withReportfilecancelled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportfilecancelled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReportfilecancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportfilecancelled")(js.undefined)
        ret
    }
    @scala.inline
    def withReportfileerror(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportfileerror")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReportfileerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportfileerror")(js.undefined)
        ret
    }
    @scala.inline
    def withReportfileloaded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportfileloaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReportfileloaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportfileloaded")(js.undefined)
        ret
    }
    @scala.inline
    def withRunningquery(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningquery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRunningquery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningquery")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

