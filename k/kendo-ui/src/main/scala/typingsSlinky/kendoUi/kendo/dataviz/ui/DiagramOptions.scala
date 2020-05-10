package typingsSlinky.kendoUi.kendo.dataviz.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ DiagramAddEvent, Unit]] = js.native
  var autoBind: js.UndefOr[Boolean] = js.native
  var cancel: js.UndefOr[js.Function1[/* e */ DiagramCancelEvent, Unit]] = js.native
  var change: js.UndefOr[js.Function1[/* e */ DiagramChangeEvent, Unit]] = js.native
  var click: js.UndefOr[js.Function1[/* e */ DiagramClickEvent, Unit]] = js.native
  var connectionDefaults: js.UndefOr[DiagramConnectionDefaults] = js.native
  var connections: js.UndefOr[js.Array[DiagramConnection]] = js.native
  var connectionsDataSource: js.UndefOr[js.Any | DataSource] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ DiagramDataBoundEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var drag: js.UndefOr[js.Function1[/* e */ DiagramDragEvent, Unit]] = js.native
  var dragEnd: js.UndefOr[js.Function1[/* e */ DiagramDragEndEvent, Unit]] = js.native
  var dragStart: js.UndefOr[js.Function1[/* e */ DiagramDragStartEvent, Unit]] = js.native
  var edit: js.UndefOr[js.Function1[/* e */ DiagramEditEvent, Unit]] = js.native
  var editable: js.UndefOr[Boolean | DiagramEditable] = js.native
  var itemBoundsChange: js.UndefOr[js.Function1[/* e */ DiagramItemBoundsChangeEvent, Unit]] = js.native
  var itemRotate: js.UndefOr[js.Function1[/* e */ DiagramItemRotateEvent, Unit]] = js.native
  var layout: js.UndefOr[DiagramLayout] = js.native
  var mouseEnter: js.UndefOr[js.Function1[/* e */ DiagramMouseEnterEvent, Unit]] = js.native
  var mouseLeave: js.UndefOr[js.Function1[/* e */ DiagramMouseLeaveEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var pan: js.UndefOr[js.Function1[/* e */ DiagramPanEvent, Unit]] = js.native
  var pannable: js.UndefOr[Boolean | DiagramPannable] = js.native
  var pdf: js.UndefOr[DiagramPdf] = js.native
  var remove: js.UndefOr[js.Function1[/* e */ DiagramRemoveEvent, Unit]] = js.native
  var save: js.UndefOr[js.Function1[/* e */ DiagramSaveEvent, Unit]] = js.native
  var select: js.UndefOr[js.Function1[/* e */ DiagramSelectEvent, Unit]] = js.native
  var selectable: js.UndefOr[Boolean | DiagramSelectable] = js.native
  var shapeDefaults: js.UndefOr[DiagramShapeDefaults] = js.native
  var shapes: js.UndefOr[js.Array[DiagramShape]] = js.native
  var template: js.UndefOr[String | js.Function] = js.native
  var theme: js.UndefOr[String] = js.native
  var toolBarClick: js.UndefOr[js.Function1[/* e */ DiagramToolBarClickEvent, Unit]] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomEnd: js.UndefOr[js.Function1[/* e */ DiagramZoomEndEvent, Unit]] = js.native
  var zoomMax: js.UndefOr[Double] = js.native
  var zoomMin: js.UndefOr[Double] = js.native
  var zoomRate: js.UndefOr[Double] = js.native
  var zoomStart: js.UndefOr[js.Function1[/* e */ DiagramZoomStartEvent, Unit]] = js.native
}

object DiagramOptions {
  @scala.inline
  def apply(): DiagramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramOptions]
  }
  @scala.inline
  implicit class DiagramOptionsOps[Self <: DiagramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* e */ DiagramAddEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: /* e */ DiagramCancelEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ DiagramChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: /* e */ DiagramClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionDefaults(value: DiagramConnectionDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withConnections(value: js.Array[DiagramConnection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionsDataSource(value: js.Any | DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionsDataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionsDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionsDataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: /* e */ DiagramDataBoundEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any | DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: /* e */ DiagramDragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnd(value: /* e */ DiagramDragEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: /* e */ DiagramDragStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: /* e */ DiagramEditEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean | DiagramEditable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withItemBoundsChange(value: /* e */ DiagramItemBoundsChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemBoundsChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemBoundsChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemBoundsChange")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRotate(value: /* e */ DiagramItemRotateEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRotate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: DiagramLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseEnter(value: /* e */ DiagramMouseEnterEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseLeave(value: /* e */ DiagramMouseLeaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPan(value: /* e */ DiagramPanEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.undefined)
        ret
    }
    @scala.inline
    def withPannable(value: Boolean | DiagramPannable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pannable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPannable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pannable")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: DiagramPdf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* e */ DiagramRemoveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: /* e */ DiagramSaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* e */ DiagramSelectEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean | DiagramSelectable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeDefaults(value: DiagramShapeDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withShapes(value: js.Array[DiagramShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withToolBarClick(value: /* e */ DiagramToolBarClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolBarClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToolBarClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolBarClick")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEnd(value: /* e */ DiagramZoomEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMax")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMin")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomRate")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomStart(value: /* e */ DiagramZoomStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStart")(js.undefined)
        ret
    }
  }
  
}

