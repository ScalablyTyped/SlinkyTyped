package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesDragDropOptionsObject extends js.Object {
  
  /**
    * (Highcharts, Highstock, Gantt) Options for the drag handles.
    */
  var dragHandle: js.UndefOr[DragDropHandleOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Set the maximum X value the points can be
    * moved to.
    */
  var dragMaxX: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Set the maximum Y value the points can be
    * moved to.
    */
  var dragMaxY: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Set the minimum X value the points can be
    * moved to.
    */
  var dragMinX: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Set the minimum Y value the points can be
    * moved to.
    */
  var dragMinY: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The X precision value to drag to for this
    * series. Set to 0 to disable. By default this is disabled, except for
    * category axes, where the default is 1.
    */
  var dragPrecisionX: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The Y precision value to drag to for this
    * series. Set to 0 to disable. By default this is disabled, except for
    * category axes, where the default is 1.
    */
  var dragPrecisionY: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The amount of pixels to drag the pointer
    * before it counts as a drag operation. This prevents drag/drop to fire
    * when just clicking or selecting points.
    */
  var dragSensitivity: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Allow close value to be dragged individually.
    */
  var draggableClose: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gantt) Allow end value to be dragged individually.
    */
  var draggableEnd: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Allow high value to be dragged individually.
    */
  var draggableHigh: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Allow low value to be dragged individually.
    */
  var draggableLow: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Allow open value to be dragged individually.
    */
  var draggableOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) Allow Q1 value to be dragged individually.
    */
  var draggableQ1: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) Allow Q3 value to be dragged individually.
    */
  var draggableQ3: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gantt) Allow start value to be dragged individually.
    */
  var draggableStart: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Allow target value to be dragged individually.
    */
  var draggableTarget: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
    */
  var draggableX: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Allow x value to be dragged individually.
    */
  var draggableX1: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Allow x2 value to be dragged individually.
    */
  var draggableX2: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Enable dragging in the Y dimension. Note
    * that this is not supported for TreeGrid axes (the default axis type in
    * Gantt charts).
    */
  var draggableY: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Group the points by a property. Points
    * with the same property value will be grouped together when moving.
    */
  var groupBy: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
    * box has one state by default, the `default` state.
    */
  var guideBox: js.UndefOr[
    PlotAreaDragDropGuideBoxOptions | PlotArearangeDragDropGuideBoxOptions | PlotAreasplineDragDropGuideBoxOptions | PlotAreasplinerangeDragDropGuideBoxOptions | PlotBarDragDropGuideBoxOptions | PlotBoxplotDragDropGuideBoxOptions | PlotBubbleDragDropGuideBoxOptions | PlotBulletDragDropGuideBoxOptions | PlotCandlestickDragDropGuideBoxOptions | PlotColumnDragDropGuideBoxOptions | PlotColumnpyramidDragDropGuideBoxOptions | PlotColumnrangeDragDropGuideBoxOptions | PlotDumbbellDragDropGuideBoxOptions | PlotErrorbarDragDropGuideBoxOptions | PlotFlagsDragDropGuideBoxOptions | PlotFunnel3dDragDropGuideBoxOptions | PlotGanttDragDropGuideBoxOptions | PlotHeatmapDragDropGuideBoxOptions | PlotLineDragDropGuideBoxOptions | PlotLollipopDragDropGuideBoxOptions | PlotMapbubbleDragDropGuideBoxOptions | PlotMapDragDropGuideBoxOptions | PlotMaplineDragDropGuideBoxOptions | PlotMappointDragDropGuideBoxOptions | PlotOhlcDragDropGuideBoxOptions | PlotPolygonDragDropGuideBoxOptions | PlotPyramid3dDragDropGuideBoxOptions | PlotScatterDragDropGuideBoxOptions | PlotSeriesDragDropGuideBoxOptions | PlotSplineDragDropGuideBoxOptions | PlotStreamgraphDragDropGuideBoxOptions | PlotTilemapDragDropGuideBoxOptions | PlotTimelineDragDropGuideBoxOptions | PlotVariwideDragDropGuideBoxOptions | PlotWaterfallDragDropGuideBoxOptions | PlotXrangeDragDropGuideBoxOptions | Dictionary[DragDropGuideBoxOptionsObject]
  ] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
    * false, a guide box is drawn to illustrate the new point size.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.native
}
object SeriesDragDropOptionsObject {
  
  @scala.inline
  def apply(): SeriesDragDropOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesDragDropOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesDragDropOptionsObjectOps[Self <: SeriesDragDropOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDragHandle(value: DragDropHandleOptionsObject): Self = this.set("dragHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragHandle: Self = this.set("dragHandle", js.undefined)
    
    @scala.inline
    def setDragMaxX(value: Double): Self = this.set("dragMaxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragMaxX: Self = this.set("dragMaxX", js.undefined)
    
    @scala.inline
    def setDragMaxY(value: Double): Self = this.set("dragMaxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragMaxY: Self = this.set("dragMaxY", js.undefined)
    
    @scala.inline
    def setDragMinX(value: Double): Self = this.set("dragMinX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragMinX: Self = this.set("dragMinX", js.undefined)
    
    @scala.inline
    def setDragMinY(value: Double): Self = this.set("dragMinY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragMinY: Self = this.set("dragMinY", js.undefined)
    
    @scala.inline
    def setDragPrecisionX(value: Double): Self = this.set("dragPrecisionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragPrecisionX: Self = this.set("dragPrecisionX", js.undefined)
    
    @scala.inline
    def setDragPrecisionY(value: Double): Self = this.set("dragPrecisionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragPrecisionY: Self = this.set("dragPrecisionY", js.undefined)
    
    @scala.inline
    def setDragSensitivity(value: Double): Self = this.set("dragSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragSensitivity: Self = this.set("dragSensitivity", js.undefined)
    
    @scala.inline
    def setDraggableClose(value: Boolean): Self = this.set("draggableClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableClose: Self = this.set("draggableClose", js.undefined)
    
    @scala.inline
    def setDraggableEnd(value: Boolean): Self = this.set("draggableEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableEnd: Self = this.set("draggableEnd", js.undefined)
    
    @scala.inline
    def setDraggableHigh(value: Boolean): Self = this.set("draggableHigh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableHigh: Self = this.set("draggableHigh", js.undefined)
    
    @scala.inline
    def setDraggableLow(value: Boolean): Self = this.set("draggableLow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableLow: Self = this.set("draggableLow", js.undefined)
    
    @scala.inline
    def setDraggableOpen(value: Boolean): Self = this.set("draggableOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableOpen: Self = this.set("draggableOpen", js.undefined)
    
    @scala.inline
    def setDraggableQ1(value: Boolean): Self = this.set("draggableQ1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableQ1: Self = this.set("draggableQ1", js.undefined)
    
    @scala.inline
    def setDraggableQ3(value: Boolean): Self = this.set("draggableQ3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableQ3: Self = this.set("draggableQ3", js.undefined)
    
    @scala.inline
    def setDraggableStart(value: Boolean): Self = this.set("draggableStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableStart: Self = this.set("draggableStart", js.undefined)
    
    @scala.inline
    def setDraggableTarget(value: Boolean): Self = this.set("draggableTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableTarget: Self = this.set("draggableTarget", js.undefined)
    
    @scala.inline
    def setDraggableX(value: Boolean): Self = this.set("draggableX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableX: Self = this.set("draggableX", js.undefined)
    
    @scala.inline
    def setDraggableX1(value: Boolean): Self = this.set("draggableX1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableX1: Self = this.set("draggableX1", js.undefined)
    
    @scala.inline
    def setDraggableX2(value: Boolean): Self = this.set("draggableX2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableX2: Self = this.set("draggableX2", js.undefined)
    
    @scala.inline
    def setDraggableY(value: Boolean): Self = this.set("draggableY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableY: Self = this.set("draggableY", js.undefined)
    
    @scala.inline
    def setGroupBy(value: String): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setGuideBox(
      value: PlotAreaDragDropGuideBoxOptions | PlotArearangeDragDropGuideBoxOptions | PlotAreasplineDragDropGuideBoxOptions | PlotAreasplinerangeDragDropGuideBoxOptions | PlotBarDragDropGuideBoxOptions | PlotBoxplotDragDropGuideBoxOptions | PlotBubbleDragDropGuideBoxOptions | PlotBulletDragDropGuideBoxOptions | PlotCandlestickDragDropGuideBoxOptions | PlotColumnDragDropGuideBoxOptions | PlotColumnpyramidDragDropGuideBoxOptions | PlotColumnrangeDragDropGuideBoxOptions | PlotDumbbellDragDropGuideBoxOptions | PlotErrorbarDragDropGuideBoxOptions | PlotFlagsDragDropGuideBoxOptions | PlotFunnel3dDragDropGuideBoxOptions | PlotGanttDragDropGuideBoxOptions | PlotHeatmapDragDropGuideBoxOptions | PlotLineDragDropGuideBoxOptions | PlotLollipopDragDropGuideBoxOptions | PlotMapbubbleDragDropGuideBoxOptions | PlotMapDragDropGuideBoxOptions | PlotMaplineDragDropGuideBoxOptions | PlotMappointDragDropGuideBoxOptions | PlotOhlcDragDropGuideBoxOptions | PlotPolygonDragDropGuideBoxOptions | PlotPyramid3dDragDropGuideBoxOptions | PlotScatterDragDropGuideBoxOptions | PlotSeriesDragDropGuideBoxOptions | PlotSplineDragDropGuideBoxOptions | PlotStreamgraphDragDropGuideBoxOptions | PlotTilemapDragDropGuideBoxOptions | PlotTimelineDragDropGuideBoxOptions | PlotVariwideDragDropGuideBoxOptions | PlotWaterfallDragDropGuideBoxOptions | PlotXrangeDragDropGuideBoxOptions | Dictionary[DragDropGuideBoxOptionsObject]
    ): Self = this.set("guideBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuideBox: Self = this.set("guideBox", js.undefined)
    
    @scala.inline
    def setLiveRedraw(value: Boolean): Self = this.set("liveRedraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveRedraw: Self = this.set("liveRedraw", js.undefined)
  }
}
