package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.anon.BorderRadius
import typingsSlinky.echarts.anon.BorderType
import typingsSlinky.echarts.anon.CurvenessOpacity
import typingsSlinky.echarts.anon.ExtraCssText
import typingsSlinky.echarts.anon.ItemStyleLabelLineStyle
import typingsSlinky.echarts.anon.Source
import typingsSlinky.echarts.echarts.EChartOption.SeriesSankey.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Sankey Graphs**
  *
  * Sankey diagram is a specific type of streamgraphs(can also be seen
  * as a directed acyclic graph).
  * In which the width of each branch is shown proportionally to the
  * flow quantity.
  * These graphs are typically used to visualize energy or material or
  * cost transfers between processes.
  * They can also visualize the energy accounts, material flow accounts
  * on a regional or national level, and also the breakdown of cost of
  * item or services.
  *
  * **Example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-sankey)
  *
  * **Visual Encoding:**
  *
  * The sankey graphs encodes each `node` of the raw data into a small
  * rectangular.
  * And different nodes are presented in different colors as far as possible.
  * The `label` next to the small rectangular, which encoding the name
  * of the node.
  *
  * In addition, the edge between two small rectangulars in the graph
  * encoding the `link` of the raw data.
  * The width of edge is shown proportionally to the `value` of `link`.
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-sankey
  */
@js.native
trait SeriesSankey_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-sankey.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sankey.sankey)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sankey.sankey)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sankey.sankey)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-sankey.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sankey.sankey)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-sankey.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "linear"
    * @see https://echarts.apache.org/en/option.html#series-sankey.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-sankey.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.native
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-sankey.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * Distance between sankey component and the bottom side of the
    * container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 5%
    * @see https://echarts.apache.org/en/option.html#series-sankey.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * Data array of series, which can be a single data value, like:
    *
    * ```
    * [12, 34, 56, 10, 23]
    *
    * ```
    *
    * Or, if need extra dimensions for components like
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * to map to graphic attributes like color, it can also be in the
    * form of array. For example:
    *
    * ```
    * [[12, 14], [34, 50], [56, 30], [10, 15], [23, 10]]
    *
    * ```
    *
    * In this case, we can assgin the second value in each arrary item
    * to
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * component.
    *
    * More likely, we need to assign name to each data item, in which
    * case each item should be an object:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sankey.sankey)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sankey.sankey)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.data
    */
  var data: js.UndefOr[js.Array[(js.Array[Double | DataObject]) | DataObject | Double]] = js.native
  /**
    * The drag-and-drop interaction of the node, which is enabled by
    * default.
    * After opening, the user can drag any node in the Sankey diagram
    * to any position.
    * To turn this interaction off, simply set the value to `false`.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-sankey.draggable
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * Equals to
    * [links](https://echarts.apache.org/en/option.html#series-sankey.links)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.edges
    */
  var edges: js.UndefOr[js.Array[_]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis
    */
  var emphasis: js.UndefOr[ItemStyleLabelLineStyle] = js.native
  /**
    * Support when mouse hovering over a node or an edge, the adjacent
    * nodes and edges are also highlighted.
    * Default off, can be manually opened.
    *
    * Optional values:
    *
    * + `false`: When hovering over a node or an edge, only the hovered
    * node or edge is highlighted.
    * + `true`: the same as `'allEdges'`.
    * + `'allEdges'`: When hovering over a node, all of the adjacent
    * edges and nodes are highlighted.
    * When hovering over an edge, the adjacent nodes are highlighted.
    * + `'outEdges'`: When hovering over a node, the outcoming edges
    * and its adjacent nodes are highlighted.
    * When hovering over an edge, the adjacent nodes are highlighted.
    * + `'inEdges'`: When hovering over a node, the incoming edges
    * and its adjacent nodes are highlighted.
    * When hovering over an edge, the adjacent nodes are highlighted.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.focusNodeAdjacency
    */
  var focusNodeAdjacency: js.UndefOr[Boolean | String] = js.native
  /**
    * Height of sankey component.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.height
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The style of node rectangle in sankey graphs.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * `label` describes the text label style in each rectangular node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.label
    */
  var label: js.UndefOr[BorderRadius] = js.native
  /**
    * The iterations of layout, which is used to continuously optimize
    * the positions of nodes in graph, decreasing the overlapping between
    * nodes and edges.
    *
    * The default iterations of layout: `32`.
    *
    * The test shows that iterations of layout could not be less than
    * the default value.
    *
    *
    * @default
    * 32
    * @see https://echarts.apache.org/en/option.html#series-sankey.layoutIterations
    */
  var layoutIterations: js.UndefOr[Double] = js.native
  /**
    * Distance between sankey component and the left side of the container.
    *
    * `left` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`;
    * and it can also be `'left'`, `'center'`, or `'right'`.
    *
    * If the `left` value is set to be `'left'`, `'center'`, or `'right'`,
    * then the component will be aligned automatically based on position.
    *
    *
    * @default
    * 5%
    * @see https://echarts.apache.org/en/option.html#series-sankey.left
    */
  var left: js.UndefOr[Double | String] = js.native
  /**
    * The line style of sankey graph, in which
    * [lineStyle.color](https://echarts.apache.org/en/option.html#series-sankey.lineStyle.color)
    * can be assigned to the value of `'source'` of `'target'`, then
    * the edge will automatically take the source node or target node
    * color as its own color.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.lineStyle
    */
  var lineStyle: js.UndefOr[CurvenessOpacity] = js.native
  /**
    * The links between nodes.
    * **Notes: The Sankey diagram theoretically only supports Directed
    * Acyclic Graph(DAG), so please make sure that there is no cycle
    * in the links.** For instance:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sankey.sankey)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links
    */
  var links: js.UndefOr[Source] = js.native
  /**
    * The gap between any two rectangles in each column from the graph.
    *
    *
    * @default
    * 8
    * @see https://echarts.apache.org/en/option.html#series-sankey.nodeGap
    */
  var nodeGap: js.UndefOr[Double] = js.native
  /**
    * The node width of rectangle in graph.
    *
    *
    * @default
    * 20
    * @see https://echarts.apache.org/en/option.html#series-sankey.nodeWidth
    */
  var nodeWidth: js.UndefOr[Double] = js.native
  /**
    * Equals to
    * [data](https://echarts.apache.org/en/option.html#series-sankey.data)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.nodes
    */
  var nodes: js.UndefOr[js.Array[_]] = js.native
  /**
    * The layout direction of the nodes in the Sankey diagram, which
    * can be horizontal from left to right or vertical from top to
    * bottom.
    * The corresponding parameter values ​​are `horizontal` or `vertical`.
    *
    *
    * @default
    * "horizontal"
    * @see https://echarts.apache.org/en/option.html#series-sankey.orient
    */
  var orient: js.UndefOr[String] = js.native
  /**
    * Distance between sankey component and the right side of the container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 20%
    * @see https://echarts.apache.org/en/option.html#series-sankey.right
    */
  var right: js.UndefOr[Double | String] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.tooltip
    */
  var tooltip: js.UndefOr[ExtraCssText] = js.native
  /**
    * Distance between sankey component and the top side of the container.
    *
    * `top` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`;
    * and it can also be `'top'`, `'middle'`, or `'bottom'`.
    *
    * If the `left` value is set to be `'top'`, `'middle'`, or `'bottom'`,
    * then the component will be aligned automatically based on position.
    *
    *
    * @default
    * 5%
    * @see https://echarts.apache.org/en/option.html#series-sankey.top
    */
  var top: js.UndefOr[Double | String] = js.native
  /**
    * @default
    * "sankey"
    * @see https://echarts.apache.org/en/option.html#series-sankey.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Width of sankey component.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.width
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * `z` value of all graghical elements in , which controls order
    * of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-sankey.z
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * `zlevel` value of all graghical elements in .
    *
    * `zlevel` is used to make layers with Canvas.
    * Graphical elements with different `zlevel` values will be placed
    * in different Canvases, which is a common optimization technique.
    * We can put those frequently changed elements (like those with
    * animations) to a seperate `zlevel`.
    * Notice that too many Canvases will increase memory cost, and
    * should be used carefully on mobile phones to avoid crash.
    *
    * Canvases with bigger `zlevel` will be placed on Canvases with
    * smaller `zlevel`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesSankey_ {
  @scala.inline
  def apply(): SeriesSankey_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSankey_]
  }
  @scala.inline
  implicit class SeriesSankey_Ops[Self <: SeriesSankey_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDelay(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDelayUpdate(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelayUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelayUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelayUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDurationUpdate(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasingUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasingUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[(js.Array[Double | DataObject]) | DataObject | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEdges(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(js.undefined)
        ret
    }
    @scala.inline
    def withEmphasis(value: ItemStyleLabelLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmphasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusNodeAdjacency(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusNodeAdjacency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusNodeAdjacency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusNodeAdjacency")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: BorderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: BorderRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutIterations")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withLineStyle(value: CurvenessOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeGap")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.undefined)
        ret
    }
    @scala.inline
    def withOrient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: ExtraCssText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
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
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
    @scala.inline
    def withZlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(js.undefined)
        ret
    }
  }
  
}

