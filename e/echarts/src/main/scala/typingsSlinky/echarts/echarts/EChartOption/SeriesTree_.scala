package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.anon.BorderRadius
import typingsSlinky.echarts.anon.BorderType
import typingsSlinky.echarts.anon.CurvenessShadowBlur
import typingsSlinky.echarts.anon.EmphasisItemStyle
import typingsSlinky.echarts.anon.ExtraCssText
import typingsSlinky.echarts.anon.LineStyleCurvenessShadowBlur
import typingsSlinky.echarts.echarts.EChartOption.SeriesTree.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Tree Diagram**
  *
  * The tree diagram is mainly used to visualize the tree data structure,
  * which is a special hierarchical type with a unique root node, left
  * subtree, and right subtree.
  *
  * **Note: Forests are not currently supported directly in a single
  * series, and can be implemented by configuring multiple series in
  * an option**
  *
  * **Tree example：**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-tree)
  *
  * **Multiple series are combined into forest：**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-tree)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-tree
  */
@js.native
trait SeriesTree_ extends js.Object {
  /**
    * Distance between tree component and the bottom side of the container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 12%
    * @see https://echarts.apache.org/en/option.html#series-tree.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * [series-tree.data](https://echarts.apache.org/en/option.html#series-tree.data)
    * the data format is a tree structure，for example：
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data
    */
  var data: js.UndefOr[js.Array[DataObject]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis
    */
  var emphasis: js.UndefOr[LineStyleCurvenessShadowBlur] = js.native
  /**
    * Subtree collapses and expands interaction, `default true`.
    * As the drawing area is limited, and usually the nodes of a tree
    * may be more, so there will be hidden between the nodes.
    * In order to avoid this problem, you can put a temporary unrelated
    * subtree folded away, until you need to start when necessary.
    * Such as the above radial layout tree example, the center of the
    * node is filled with blue is the folded away subtree, you can
    * click to expand it.
    *
    * **Note: If you configure a custom image as the tag for a node,
    * it is not possible to distinguish whether the current node has
    * a collapsed subtree by the fill color.
    * And currently do not support, upload two pictures, respectively
    * represent the collapsing and expansion state of the node.
    * So, if you want to explicitly show the two states of the node,
    * it is recommended to use `ECharts` regular tag types, such as
    * `emptyCircle`.**
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-tree.expandAndCollapse
    */
  var expandAndCollapse: js.UndefOr[Boolean] = js.native
  /**
    * Height of tree component.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.height
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The initial level (depth) of the tree.
    * The root node is the 0th layer, then the first layer, the second
    * layer,
    *
    *
    *
    * , until the leaf node.
    * This configuration item is primarily used in conjunction with
    * `collapsing and expansion` interactions.
    * The purpose is to prevent the nodes from obscuring each other.
    * If set as -1 or `null` or `undefined`, all nodes are expanded.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-tree.initialTreeDepth
    */
  var initialTreeDepth: js.UndefOr[Double] = js.native
  /**
    * The style of each node in the tree, where \[itemStyle.color\]
    * (~ series-tree.itemStyle.color)
    * represents the fill color of the node, to distinguish the state
    * of the subtree corresponding to `collapsing` or `expansion`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * `label` describes the style of the text corresponding to each
    * node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.label
    */
  var label: js.UndefOr[BorderRadius] = js.native
  /**
    * The layout of the tree, which can be `orthogonal` and `radial`
    * 。Here the `orthogonal` layout is what we usually refer to the
    * `horizontal` and `vertical` direction, the corresponding parameter
    * value is `orthogonal`.
    * The `radial` layout refers to the view that the root node as
    * the center and each layer of nodes as the ring, the corresponding
    * parameter value is `radial`.
    *
    * **Orthogonal Example：**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree)
    *
    * **Radial Example：**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree)
    *
    *
    * @default
    * "orthogonal"
    * @see https://echarts.apache.org/en/option.html#series-tree.layout
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Leaf node special configuration, such as the above tree diagram
    * example, the leaf node and non-leaf node label location is different.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves
    */
  var leaves: js.UndefOr[EmphasisItemStyle] = js.native
  /**
    * Distance between tree component and the left side of the container.
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
    * 12%
    * @see https://echarts.apache.org/en/option.html#series-tree.left
    */
  var left: js.UndefOr[Double | String] = js.native
  /**
    * Defines the style of the tree edge.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.lineStyle
    */
  var lineStyle: js.UndefOr[CurvenessShadowBlur] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The direction of the `orthogonal` layout in the tree diagram.
    * That means this configuration takes effect only if `layout =
    * 'orthogonal'`.
    * The corresponding directions are `from left to right`, `from
    * right to left`, `from top to bottom`, `from bottom to top`, with
    * shorthand values `'LR'`, `'RL'`, `'TB'`, `'BT'`.
    * **Note: The previous configuration value `'horizontal'` is equivalent
    * to `'LR'`, `'vertical'` is equivalent to `'TB'`.**
    *
    *
    * @default
    * "LR"
    * @see https://echarts.apache.org/en/option.html#series-tree.orient
    */
  var orient: js.UndefOr[String] = js.native
  /**
    * Distance between tree component and the right side of the container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 12%
    * @see https://echarts.apache.org/en/option.html#series-tree.right
    */
  var right: js.UndefOr[Double | String] = js.native
  /**
    * Whether to enable mouse zooming and translating.
    * `false` by default.
    * If either zooming or translating is wanted, it can be set to
    * `'scale'` or `'move'`.
    * Otherwise, set it to be `true` to enable both.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.roam
    */
  var roam: js.UndefOr[Boolean | String] = js.native
  /**
    * Symbol of .
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which URL
    * is the link to an image, or `dataURI` of an image.
    *
    * An image URL example:
    *
    * ```
    * 'image://http://xxx.xxx.xxx/a/b.png'
    *
    * ```
    *
    * A `dataURI` example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree)
    *
    * Icons can be set to arbitrary vector path via `'path://'` in
    * ECharts.
    * As compared with raster image, vector paths prevent from jagging
    * and blurring when scaled, and have a better control over changing
    * colors.
    * Size of vectoer icon will be adapted automatically. Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree)
    *
    *
    * @default
    * "emptyCircle"
    * @see https://echarts.apache.org/en/option.html#series-tree.symbol
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.native
  /**
    * Offset of symbol relative to original position.
    * By default, symbol will be put in the center position of data.
    * But if symbol is from user-defined vector path or image, you
    * may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset to default
    * position.
    * It can be in absolute pixel value, or in relative percentage
    * value.
    *
    * For example, `[0, '50%']` means to move upside side position
    * of symbol height.
    * It can be used to make the arrow in the bottom to be at data
    * position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-tree.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.native
  /**
    * Rotate degree of symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use tangent
    * angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.native
  /**
    * symbol size.
    * It can be set to single numbers like `10`, or use an array to
    * represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    * If size of symbols needs to be different, you can set with callback
    * function in the following format:
    *
    * ```
    * (value: Array|number, params: Object) => number|Array
    *
    * ```
    *
    * The first parameter `value` is the value in
    * [data](https://echarts.apache.org/en/option.html#series-tree.data)
    * , and the second parameter `params` is the rest parameters of
    * data item.
    *
    *
    * @default
    * 7
    * @see https://echarts.apache.org/en/option.html#series-tree.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | js.Function | Double] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.tooltip
    */
  var tooltip: js.UndefOr[ExtraCssText] = js.native
  /**
    * Distance between tree component and the top side of the container.
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
    * 12%
    * @see https://echarts.apache.org/en/option.html#series-tree.top
    */
  var top: js.UndefOr[Double | String] = js.native
  /**
    * @default
    * "tree"
    * @see https://echarts.apache.org/en/option.html#series-tree.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Width of tree component.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.width
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
    * @see https://echarts.apache.org/en/option.html#series-tree.z
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
    * @see https://echarts.apache.org/en/option.html#series-tree.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesTree_ {
  @scala.inline
  def apply(): SeriesTree_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesTree_]
  }
  @scala.inline
  implicit class SeriesTree_Ops[Self <: SeriesTree_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withData(value: js.Array[DataObject]): Self = {
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
    def withEmphasis(value: LineStyleCurvenessShadowBlur): Self = {
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
    def withExpandAndCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAndCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandAndCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAndCollapse")(js.undefined)
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
    def withInitialTreeDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTreeDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialTreeDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTreeDepth")(js.undefined)
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
    def withLayout(value: String): Self = {
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
    def withLeaves(value: EmphasisItemStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaves")(js.undefined)
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
    def withLineStyle(value: CurvenessShadowBlur): Self = {
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
    def withRoam(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roam")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolKeepAspect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolKeepAspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolKeepAspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolKeepAspect")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolOffset(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSize(value: js.Array[_] | js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(js.undefined)
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

