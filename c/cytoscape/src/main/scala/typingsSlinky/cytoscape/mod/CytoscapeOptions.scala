package typingsSlinky.cytoscape.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.cytoscape.cytoscapeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CytoscapeOptions extends js.Object {
  /**
    * Whether nodes should be locked (not draggable at all) by default (if true, overrides individual node state).
    *
    * The default value is false.
    */
  var autolock: js.UndefOr[Boolean] = js.native
  /**
    * Whether nodes should be ungrabified (not grabbable by user) by default (if true, overrides individual node state).
    *
    * The default value is false.
    */
  var autoungrabify: js.UndefOr[Boolean] = js.native
  /**
    * Whether nodes should be unselectified (immutable selection state) by default (if true, overrides individual element state).
    *
    * The default value is false.
    */
  var autounselectify: js.UndefOr[Boolean] = js.native
  /**
    * Whether box selection (i.e. drag a box overlay around, and release it to select) is enabled. If enabled, the user must taphold to pan the graph.
    *
    * The default value is false.
    */
  var boxSelectionEnabled: js.UndefOr[Boolean] = js.native
  ///////////////////////////////////////
  // very commonly used options:
  /**
    * A HTML DOM element in which the graph should be rendered.
    * This is optional if Cytoscape.js is run headlessly or if you initialise using jQuery (in which case your jQuery object already has an associated DOM element).
    *
    * The default is undefined.
    */
  var container: js.UndefOr[HTMLElement | Null] = js.native
  /**
    * A nonnegative integer that indicates the maximum allowable distance that a user may move during a tap gesture,
    * on touch devices and desktop devices respectively.
    *
    * This makes tapping easier for users.
    * These values have sane defaults,
    * so it is not advised to change these options unless you have very good reason for doing so.
    * Larger values will almost certainly have undesirable consequences.
    *
    * The default value is 4.
    */
  var desktopTapThreshold: js.UndefOr[Double] = js.native
  /**
    * An array of [[Elements]] specified as plain objects. For convenience, this option can alternatively be specified as a promise that resolves to the elements JSON.
    */
  var elements: js.UndefOr[
    ElementsDefinition | js.Array[ElementDefinition] | (js.Promise[js.Array[ElementDefinition] | ElementsDefinition])
  ] = js.native
  ///////////////////////////////////////
  // rendering options:
  /**
    * A convenience option that initialises the Core to run headlessly.
    * You do not need to set this in environments that are implicitly headless (e.g. Node.js).
    * However, it is handy to set headless: true if you want a headless Core in a browser.
    *
    * The default value is false.
    */
  var headless: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, the renderer does not render edges while the viewport is being manipulated.
    * This makes panning, zooming, dragging, et cetera more responsive for large graphs.
    *
    * The default value is false.
    */
  var hideEdgesOnViewport: js.UndefOr[Boolean] = js.native
  /**
    * when set to true, the renderer does not render labels while the viewport is being manipulated.
    * This makes panning, zooming, dragging, et cetera more responsive for large graphs.
    *
    * The default value is false.
    */
  var hideLabelsOnViewport: js.UndefOr[Boolean] = js.native
  /**
    * A plain object that specifies layout options.
    * Which layout is initially run is specified by the name field.
    * Refer to a layout's documentation for the options it supports.
    * If you want to specify your node positions yourself in your elements JSON,
    * you can use the preset layout — by default it does not set any positions,
    * leaving your nodes in their current positions
    * (e.g. specified in options.elements at initialisation time)
    */
  var layout: js.UndefOr[LayoutOptions] = js.native
  /**
    * A maximum bound on the zoom level of the graph. The viewport can not be scaled larger than this zoom level.
    *
    * The default value is 1e50.
    */
  var maxZoom: js.UndefOr[Double] = js.native
  ///////////////////////////////////////
  // interaction options?:
  /**
    * A minimum bound on the zoom level of the graph. The viewport can not be scaled smaller than this zoom level.
    *
    * The default value is 1e-50.
    */
  var minZoom: js.UndefOr[Double] = js.native
  /**
    * When set to true, the renderer will use a motion blur effect to make the transition between frames seem smoother.
    * This can significantly increase the perceived performance for a large graphs.
    *
    * The default value is false.
    */
  var motionBlur: js.UndefOr[Boolean] = js.native
  /**
    * When motionBlur: true, this value controls the opacity of motion blur frames.
    * Higher values make the motion blur effect more pronounced.
    *
    * The default value is 0.2.
    */
  var motionBlurOpacity: js.UndefOr[Double] = js.native
  /**
    * The initial panning position of the graph. Make sure to disable viewport manipulation options, such as fit,
    * in your layout so that it is not overridden when the layout is applied.
    */
  var pan: js.UndefOr[Position] = js.native
  /**
    * Whether panning the graph is enabled, both by user events and programmatically.
    *
    * The default value is true.
    */
  var panningEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the screen pixel ratio with a manually set value (1.0 or 0.666 recommended, if set).
    * This can be used to increase performance on high density displays by reducing the effective area that needs to be rendered.
    * If you want to use the hardware's actual pixel ratio at the expense of performance, you can set pixelRatio: 'auto'.
    *
    * The default value is 1.
    */
  var pixelRatio: js.UndefOr[Double | auto] = js.native
  /**
    * A string indicating the selection behaviour from user input.
    * By default, this is set automatically for you based on the type of input device detected.
    * On touch devices, 'additive' is default — a new selection made by the user adds to the set of currenly selected elements.
    * On mouse-input devices, 'single' is default — a new selection made by the user becomes the entire set of currently selected elements (i.e. the previous elements are unselected).
    *
    * The default value is (isTouchDevice ? 'additive' : 'single').
    */
  var selectionType: js.UndefOr[SelectionType] = js.native
  /**
    * The [[Stylesheet]] used to style the graph. For convenience, this option can alternatively be specified as a promise that resolves to the stylesheet.
    */
  var style: js.UndefOr[js.Array[Stylesheet] | js.Promise[js.Array[Stylesheet]]] = js.native
  /**
    * A boolean that indicates whether styling should be used.
    * For headless (i.e. outside the browser) environments,
    * display is not necessary and so neither is styling necessary — thereby speeding up your code.
    * You can manually enable styling in headless environments if you require it for a special case.
    * Note that it does not make sense to disable style if you plan on rendering the graph.
    *
    * The default value is true.
    */
  var styleEnabled: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, the renderer uses a texture (if supported) during panning and zooming instead of drawing the elements,
    * making large graphs more responsive.
    *
    * The default value is false.
    */
  var textureOnViewport: js.UndefOr[Boolean] = js.native
  /**
    * A nonnegative integer that indicates the maximum allowable distance that a user may move during a tap gesture,
    * on touch devices and desktop devices respectively.
    *
    * This makes tapping easier for users.
    * These values have sane defaults, so it is not advised to change these options unless you have very good reason for doing so.
    * Larger values will almost certainly have undesirable consequences.
    *
    * The default value is is 8.
    */
  var touchTapThreshold: js.UndefOr[Double] = js.native
  /**
    * Whether user events (e.g. dragging the graph background) are allowed to pan the graph. Programmatic changes to pan are unaffected by this option.
    *
    * The default value is true.
    */
  var userPanningEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether user events (e.g. mouse wheel, pinch-to-zoom) are allowed to zoom the graph. Programmatic changes to zoom are unaffected by this option.
    *
    * The default value is true.
    */
  var userZoomingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Changes the scroll wheel sensitivity when zooming. This is a multiplicative modifier.
    * So, a value between 0 and 1 reduces the sensitivity (zooms slower), and a value greater than 1 increases the sensitivity (zooms faster).
    *
    * The default value is 1.
    */
  var wheelSensitivity: js.UndefOr[Double] = js.native
  ///////////////////////////////////////
  // initial viewport state:
  /**
    * The initial zoom level of the graph.
    * Make sure to disable viewport manipulation options, such as fit, in your layout so that it is not overridden when the layout is applied.
    * You can set options.minZoom and options.maxZoom to set restrictions on the zoom level.
    *
    * The default value is 1.
    */
  var zoom: js.UndefOr[Double] = js.native
  /**
    * Whether zooming the graph is enabled, both by user events and programmatically.
    *
    * The default value is true.
    */
  var zoomingEnabled: js.UndefOr[Boolean] = js.native
}

object CytoscapeOptions {
  @scala.inline
  def apply(): CytoscapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CytoscapeOptions]
  }
  @scala.inline
  implicit class CytoscapeOptionsOps[Self <: CytoscapeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutolock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autolock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutolock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autolock")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoungrabify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoungrabify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoungrabify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoungrabify")(js.undefined)
        ret
    }
    @scala.inline
    def withAutounselectify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autounselectify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutounselectify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autounselectify")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxSelectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxSelectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxSelectionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxSelectionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
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
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
    @scala.inline
    def withDesktopTapThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopTapThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopTapThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopTapThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withElements(
      value: ElementsDefinition | js.Array[ElementDefinition] | (js.Promise[js.Array[ElementDefinition] | ElementsDefinition])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEdgesOnViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEdgesOnViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEdgesOnViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEdgesOnViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withHideLabelsOnViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLabelsOnViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideLabelsOnViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLabelsOnViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: LayoutOptions): Self = {
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
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionBlurOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionBlurOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionBlurOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionBlurOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPan(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.undefined)
        ret
    }
    @scala.inline
    def withPanningEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panningEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanningEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panningEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionType(value: SelectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Array[Stylesheet] | js.Promise[js.Array[Stylesheet]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTextureOnViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureOnViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextureOnViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureOnViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchTapThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchTapThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchTapThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchTapThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPanningEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPanningEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPanningEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPanningEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withUserZoomingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userZoomingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserZoomingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userZoomingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelSensitivity")(js.undefined)
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
    def withZoomingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomingEnabled")(js.undefined)
        ret
    }
  }
  
}

