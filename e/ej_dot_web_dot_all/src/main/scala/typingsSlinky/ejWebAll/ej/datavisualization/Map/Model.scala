package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires, on clicking the map.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Specifies the background color for map
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.native
  /** Specifies the index of the map to determine the shape layer to be displayed
    * @Default {0}
    */
  var baseMapIndex: js.UndefOr[Double] = js.native
  /** Triggered while rendering the each bubbles in maps.
    */
  var bubbleRendering: js.UndefOr[js.Function1[/* e */ BubbleRenderingEventArgs, Unit]] = js.native
  /** Specify the center position where map should be displayed
    * @Default {[0,0]}
    */
  var centerPosition: js.UndefOr[js.Any] = js.native
  /** Fires before rendering the data labels. This event is triggered for each data label in the layers. You can use this event to add custom text in data labels.
    */
  var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, Unit]] = js.native
  /** Fires, on double clicking the map.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** Controls the selection through dragging
    * @Default {false}
    */
  var draggingOnSelection: js.UndefOr[Boolean] = js.native
  /** Enables or Disables the map animation
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Enables or Disables the animation for layer change in map
    * @Default {false}
    */
  var enableLayerChangeAnimation: js.UndefOr[Boolean] = js.native
  /** Enables or Disables the map panning
    * @Default {true}
    */
  var enablePan: js.UndefOr[Boolean] = js.native
  /** Enables or Disables right to left(RTL) support for maps.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Determines whether map need to resize when container is resized
    * @Default {true}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** Determines whether map need to resize when container is resized
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Layer for holding the map shapes
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  /** Fires on clicking the legend item.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, Unit]] = js.native
  /** Triggered while rendering the each legend in maps.
    */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, Unit]] = js.native
  /** Name of the culture based on which map should be localized. Labels are localized with respect to the culture name.String type properties like template text are not localized
    * automatically. Provide localized text as value to string type properties.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Triggers while entering the hovered marker shape.
    */
  var markerEnter: js.UndefOr[js.Function1[/* e */ MarkerEnterEventArgs, Unit]] = js.native
  /** Triggers while leaving the hovered marker shape.
    */
  var markerLeave: js.UndefOr[js.Function1[/* e */ MarkerLeaveEventArgs, Unit]] = js.native
  /** Triggered on selecting the map markers.
    */
  var markerSelected: js.UndefOr[js.Function1[/* e */ MarkerSelectedEventArgs, Unit]] = js.native
  /** Triggers while leaving the hovered map shape
    */
  var mouseleave: js.UndefOr[js.Function1[/* e */ MouseleaveEventArgs, Unit]] = js.native
  /** Triggers while hovering the map shape.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.native
  /** Enables or Disables the navigation control for map to perform zooming and panning on map shapes.
    */
  var navigationControl: js.UndefOr[NavigationControl] = js.native
  /** Fires before loading the map.
    */
  var onLoad: js.UndefOr[js.Function1[/* e */ OnLoadEventArgs, Unit]] = js.native
  /** Triggers once map render completed.
    */
  var onRenderComplete: js.UndefOr[js.Function1[/* e */ OnRenderCompleteEventArgs, Unit]] = js.native
  /** Triggers when map panning ends.
    */
  var panned: js.UndefOr[js.Function1[/* e */ PannedEventArgs, Unit]] = js.native
  /** Triggers after refreshing the map items.
    */
  var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, Unit]] = js.native
  /** Fires, on right clicking the map.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Triggered while rendering the each shapes in maps.
    */
  var shapeRendering: js.UndefOr[js.Function1[/* e */ ShapeRenderingEventArgs, Unit]] = js.native
  /** Triggered on selecting the map shapes.
    */
  var shapeSelected: js.UndefOr[js.Function1[/* e */ ShapeSelectedEventArgs, Unit]] = js.native
  /** Enables or Disables the Zooming for map.
    */
  var zoomSettings: js.UndefOr[ZoomSettings] = js.native
  /** Triggered when map is zoomed-in.
    */
  var zoomedIn: js.UndefOr[js.Function1[/* e */ ZoomedInEventArgs, Unit]] = js.native
  /** Triggers when map is zoomed out.
    */
  var zoomedOut: js.UndefOr[js.Function1[/* e */ ZoomedOutEventArgs, Unit]] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: /* e */ ClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
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
    def withBaseMapIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseMapIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseMapIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseMapIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleRendering(value: /* e */ BubbleRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBubbleRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTextRendering(value: /* e */ DisplayTextRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTextRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisplayTextRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTextRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggingOnSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingOnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggingOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingOnSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLayerChangeAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLayerChangeAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLayerChangeAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLayerChangeAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePan")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemClick(value: /* e */ LegendItemClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendItemRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerEnter(value: /* e */ MarkerEnterEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMarkerEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerLeave(value: /* e */ MarkerLeaveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMarkerLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerSelected(value: /* e */ MarkerSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMarkerSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseleave(value: /* e */ MouseleaveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationControl(value: NavigationControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationControl")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* e */ OnLoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderComplete(value: /* e */ OnRenderCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRenderComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withPanned(value: /* e */ PannedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panned")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPanned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panned")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshed(value: /* e */ RefreshedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefreshed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshed")(js.undefined)
        ret
    }
    @scala.inline
    def withRightClick(value: /* e */ RightClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeRendering(value: /* e */ ShapeRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShapeRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeSelected(value: /* e */ ShapeSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShapeSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomSettings(value: ZoomSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomedIn(value: /* e */ ZoomedInEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomedIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomedIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomedIn")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomedOut(value: /* e */ ZoomedOutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomedOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomedOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomedOut")(js.undefined)
        ret
    }
  }
  
}

