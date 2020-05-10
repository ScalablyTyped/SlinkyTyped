package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.AnonBorderColorSaturation
import typingsSlinky.echarts.AnonBottom
import typingsSlinky.echarts.AnonChildrenVisibleMin
import typingsSlinky.echarts.AnonEllipsis
import typingsSlinky.echarts.AnonExtraCssText
import typingsSlinky.echarts.AnonLink
import typingsSlinky.echarts.AnonTextShadowOffsetX
import typingsSlinky.echarts.AnonUpperLabel
import typingsSlinky.echarts.echarts.EChartOption.SeriesTreemap.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Treemap](https://en.wikipedia.org/wiki/Treemapping)
  * is a common way to present "hierarchical data" or "tree data".It
  * primarily highlights the important nodes at all hierarchies in 『Tree』with
  * area.
  *
  * **Example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-treemap)
  *
  * **Visual Mapping:**
  *
  * treemap maps the numerical values to area.
  *
  * Moreover, it is able to map some dimensions of data to other visual
  * channel, like colors, lightness of colors and etc.
  *
  * About visual encoding, see details in
  * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
  * .
  *
  * **Drill Down:**
  *
  * The feature `drill down` means: when clicking a tree node, this node
  * will be set as root and its children will be shown. When
  * [leafDepth](https://echarts.apache.org/en/option.html#series-treemap.leafDepth)
  * is set, this feature is enabled.
  *
  * **An example about drill down:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-treemap)
  *
  * Notice: There are some difference in treemap configuration between
  * ECharts3 and ECharts2.
  * Some immature configuration ways are no longer supported:
  *
  * + The position method using `center/size` is no longer supported,
  * and `left/top/bottom/right/width/height` are used to position treemap,
  * as other components do.
  *
  * + The configuration item `breadcrumb` is moved outside `itemStyle/itemStyle.emphasis`,
  * and it is in the same level with `itemStyle` now.
  *
  * + The configuration item `root` is not avaliable temporarily.User
  * can zoom treemap to see some tiny or deep descendants, or using
  * [leafDepth](https://echarts.apache.org/en/option.html#series-treemap.leafDepth)
  * to enable the feature of "drill down".
  *
  * + The configuration item `label` is moved outside the `itemStyle/itemStyle.emphasis`,
  * and it is in the same level with `itemStyle` now.
  *
  * + The configuration items `itemStyle.childBorderWidth`
  * and `itemStyle.childBorderColor`
  * are not supported anymore (because in this way only 2 levels can
  * be defined).
  * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
  * is used to define all levels now.
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-treemap
  */
@js.native
trait SeriesTreemap_ extends js.Object {
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    *
    * @default
    * 1500
    * @see https://echarts.apache.org/en/option.html#series-treemap.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "quinticInOut"
    * @see https://echarts.apache.org/en/option.html#series-treemap.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Distance between treemap component and the bottom side of the
    * container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-treemap.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * breadcrumb, showing the path of the current node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb
    */
  var breadcrumb: js.UndefOr[AnonBottom] = js.native
  /**
    * Children will not be shown when area size of a node is smaller
    * than this value (unit: px square).
    *
    * This can hide the details of nodes when the rectangular area
    * is not large enough.
    * When users zoom nodes, the child node would show if the area
    * is larger than this threshold.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `childrenVisibleMin` attribute could appear
    * in more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.childrenVisibleMin
    */
  var childrenVisibleMin: js.UndefOr[Double] = js.native
  /**
    * It indicates the range of tranparent rate (color alpha) of the
    * series. The range of values is 0 ~ 1.
    *
    * For example, `colorAlpha` can be `[0.3, 1]`.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorAlpha` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.colorAlpha
    */
  var colorAlpha: js.UndefOr[js.Array[_]] = js.native
  /**
    * Specify the rule according to which each node obtain color from
    * [color list](https://echarts.apache.org/en/option.html#series-treemap.levels.color)
    * . Optional values:
    *
    * + `'value'`:
    *
    * Map
    * [series-treemap.data.value](https://echarts.apache.org/en/option.html#series-treemap.data.value)
    * to color.
    *
    * In this way, the color of each node indicate its value.
    *
    * [visualDimension](https://echarts.apache.org/en/option.html#series-treemap.levels.visualDimension)
    * can be used to specify which dimension of
    * [data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * is used to perform visual mapping.
    *
    * + `'index'`:
    *
    * Map the `index` (ordinal number) of nodes to color.
    * Namely, in a level, the first node is mapped to the first color
    * of
    * [color list](https://echarts.apache.org/en/option.html#series-treemap.levels.color)
    * , and the second node gets the second color.
    *
    * In this way, adjacent nodes are distinguished by color.
    *
    * + `'id'`:
    *
    * Map
    * [series-treemap.data.id](https://echarts.apache.org/en/option.html#series-treemap.data.id)
    * to color.
    *
    * Since `id` is used to identify node, if user call `setOption`
    * to modify the tree, each node will remain the original color
    * before and after `setOption` called. See this
    * [example](https://echarts.apache.org/examples/en/editor.html?c=treemap-obama&edit=1&reset=1)
    * .
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorMappingBy` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @default
    * "index"
    * @see https://echarts.apache.org/en/option.html#series-treemap.colorMappingBy
    */
  var colorMappingBy: js.UndefOr[String] = js.native
  /**
    * It indicates the range of saturation (color alpha) of the series.
    * The range of values is 0 ~ 1.
    *
    * For example, `colorSaturation` can be `[0.3, 1]`.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorSaturation` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.colorSaturation
    */
  var colorSaturation: js.UndefOr[Double] = js.native
  /**
    * the the data format of
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * is a forest. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data
    */
  var data: js.UndefOr[js.Array[DataObject]] = js.native
  /**
    * Marker when the node is able to be drilled down.
    *
    *
    * @default
    * '▶'
    * @see https://echarts.apache.org/en/option.html#series-treemap.drillDownIcon
    */
  var drillDownIcon: js.UndefOr[String] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.emphasis
    */
  var emphasis: js.UndefOr[AnonUpperLabel] = js.native
  /**
    * Height of treemap component.
    *
    *
    * @default
    * 80%
    * @see https://echarts.apache.org/en/option.html#series-treemap.height
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * > Tps: In treemap, `itemStyle` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorSaturation] = js.native
  /**
    * `label` decribes the style of the label in each node.
    *
    * > Tps: In treemap, `label` attribute could appear in more than
    * one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.label
    */
  var label: js.UndefOr[AnonEllipsis] = js.native
  /**
    * When `leafDepth` is set, the feature "drill down" is enabled,
    * which means when clicking a tree node, this node will be set
    * as root and its children will be shown.
    *
    * `leafDepth` represents how many levels are shown at most.
    * For example, when `leafDepth` is set to `1`, only one level will
    * be shown.
    *
    * `leafDepth` is `null`/`undefined` by default, which means that
    * "drill down" is disabled.
    *
    * **An example about drill down:**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.leafDepth
    */
  var leafDepth: js.UndefOr[Double] = js.native
  /**
    * Distance between treemap component and the left side of the container.
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
    * "center"
    * @see https://echarts.apache.org/en/option.html#series-treemap.left
    */
  var left: js.UndefOr[Double | String] = js.native
  /**
    * **Multiple Levels Configuration**
    *
    * treemap adopts 4-level configuration:
    *
    * ```
    * "each node" --> "each level" --> "each series".
    *
    * ```
    *
    * That is, we can configurate each node, can also configurate each
    * level of the tree, or set overall configurations on each series.
    * The highest priority is node configuration.
    *
    * `levels` is configurations on each levels, which is used most.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    * **The Rules about Visual Mapping**
    *
    * When designing a treemap, we primarily focus on how to visually
    * distinguish "different levels", "different categories in the
    * same level", which requires appropriate settings of "rectangular
    * color", "border thickness", "border color" and even "color saturation
    * of rectangular" and so on on each level.
    *
    * See
    * [example](https://echarts.apache.org/examples/en/editor.html?c=treemap-disk&edit=1&reset=1)
    *
    * The top level is divided into several parts by colors "red",
    * "green", "blue", and etc
    *
    *
    *
    * In each color block, `colorSaturation` is used to distinguish
    * nodes in sublevel.
    * The border color of the top level is "white", while the border
    * color of the sublevel is the color that based on the current
    * block color and processed by `borderColorSaturation`.
    *
    * `treemap` uses this rule of visual configuration: each level
    * computes its visual value based on the configurations (`color`,
    * `colorSaturation`, `borderColor`, `colorSaturation`) on this
    * level.
    * If there is no certain configuration in a node, it inherits the
    * configuration from its parent.
    *
    * In this way, this effect can be configured: set a `color` list
    * on the parent level, and set `colorSaturation` on the child level,
    * and then each node in the parent level would obtain a color from
    * the `color` list, and each node in the child level would obtain
    * a value from `colorSaturation` and compound it with the color
    * inherited from its parent node to get its final color.
    *
    * **Dimensions and "Extra Visual Mapping"**
    *
    * See the example below: every `value` field is set as an Array,
    * in which each item in the array represents a dimension respectively.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    * `treemap` will map the first dimension (the first item of the
    * array) to "area".
    * If we want to express more information, we could map another
    * dimension (specified by
    * [series-treemap.visualDimension](https://echarts.apache.org/en/option.html#series-treemap.viusalDimension)
    * ) to another visual types, such as `colorSaturation` and so on.
    * See the
    * [example](https://echarts.apache.org/examples/en/editor.html?c=treemap-obama&edit=1&reset=1)
    * and select the legend 'Growth'.
    *
    * **How to avoid confusion by setting border/gap of node**
    *
    * If all of the border/gaps are set with the same color, confusion
    * might occur when rectangulars in different levels display at
    * the same time.
    *
    * See the
    * [example](https://echarts.apache.org/examples/en/editor.html?c=doc-example/treemap-borderColor&edit=1&reset=1)
    *
    * Noticed that the child rectangles in the red area are in the
    * deeper level than rectangles that are saparated by white gap.
    * So in the red area, basically we set gap color with red, and
    * use `borderColorSaturation` to lift the saturation.
    *
    * **Explanation about borderWidth, gapWidth, borderColor**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    *
    * @default
    * []
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels
    */
  var levels: js.UndefOr[AnonChildrenVisibleMin] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The behaviour when clicking a node. Optional values are:
    *
    * + `false`: Do nothing after clicked.
    * + `'zoomToNode'`: Zoom to clicked node.
    * + `'link'`: If there is
    * [link](https://echarts.apache.org/en/option.html#series-treemap.data.link)
    * in node data, do hyperlink jump after clicked.
    *
    *
    * @default
    * "zoomToNode"
    * @see https://echarts.apache.org/en/option.html#series-treemap.nodeClick
    */
  var nodeClick: js.UndefOr[Boolean | String] = js.native
  /**
    * Distance between treemap component and the right side of the
    * container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-treemap.right
    */
  var right: js.UndefOr[Double | String] = js.native
  /**
    * Whether to enable dragging roam (move and zoom).
    * Optional values are:
    *
    * + `false`: roam is disabled.
    * + `'scale'` or `'zoom'`: zoom only.
    * + `'move'` or `'pan'`: move (translation) only.
    * + `true`: both zoom and move (translation) are avaliable.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-treemap.roam
    */
  var roam: js.UndefOr[Boolean | String] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent
    */
  var silent: js.UndefOr[AnonLink] = js.native
  /**
    * The expected square ratio.
    * Layout would approach the ratio as close as possible.
    *
    * It defaults to be the golden ratio: `0.5
    * * (1 + Math.sqrt(5))`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.squareRatio
    */
  var squareRatio: js.UndefOr[Double] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.native
  /**
    * Distance between treemap component and the top side of the container.
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
    * "middle"
    * @see https://echarts.apache.org/en/option.html#series-treemap.top
    */
  var top: js.UndefOr[Double | String] = js.native
  /**
    * @default
    * "treemap"
    * @see https://echarts.apache.org/en/option.html#series-treemap.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * `upperLabel` is used to specify whether show label when the node
    * has children. When
    * [upperLabel.show](https://echarts.apache.org/en/option.html#series-treemap.upperLabel.show)
    * is set as `true`, the feature that "show parent label" is enabled.
    *
    * The same as
    * [series-treemap.label](https://echarts.apache.org/en/option.html#series-treemap.label)
    * , the option `upperLabel` can be placed at the root of
    * [series-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * directly, or in
    * [series-treemap.level](https://echarts.apache.org/en/option.html#series-treemap.level)
    * , or in each item of
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * .
    *
    * Specifically,
    * [series-treemap.label](https://echarts.apache.org/en/option.html#series-treemap.label)
    * specifies the style when a node is a leaf, while `upperLabel`
    * specifies the style when a node has children, in which case the
    * label is displayed in the inner top of the node.
    *
    * See:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    * > Tps: In treemap, `label` attribute could appear in more than
    * one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.upperLabel
    */
  var upperLabel: js.UndefOr[AnonTextShadowOffsetX] = js.native
  /**
    * A node will not be shown when its area size is smaller than this
    * value (unit: px square).
    *
    * In this way, tiny nodes will be hidden, otherwise they will huddle
    * together.
    * When user zoom the treemap, the area size will increase and the
    * rectangle will be shown if the area size is larger than this
    * threshold.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `visibleMin` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-treemap.visibleMin
    */
  var visibleMin: js.UndefOr[Double] = js.native
  /**
    * `treemap` is able to map any dimensions of data to visual.
    *
    * The value of
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * can be an array.
    * And each item of the array represents a "dimension".
    * `visualDimension` specifies the dimension on which visual mapping
    * will be performed.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `visualDimension` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.visualDimension
    */
  var visualDimension: js.UndefOr[Double] = js.native
  /**
    * The maximal value of current level.
    * Auto-statistics by default.
    *
    * When
    * [colorMappingBy](https://echarts.apache.org/en/option.html#series-treemap.levels.colorMappingBy)
    * is set to `'value'`, you are able to specify extent manually
    * for visual mapping by specifying `visualMin` or `visualMax`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.visualMax
    */
  var visualMax: js.UndefOr[Double] = js.native
  /**
    * The minimal value of current level.
    * Auto-statistics by default.
    *
    * When
    * [colorMappingBy](https://echarts.apache.org/en/option.html#series-treemap.levels.colorMappingBy)
    * is set to `'value'`, you are able to specify extent manually
    * for visual mapping by specifying `visualMin` or `visualMax`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.visualMin
    */
  var visualMin: js.UndefOr[Double] = js.native
  /**
    * Width of treemap component.
    *
    *
    * @default
    * 80%
    * @see https://echarts.apache.org/en/option.html#series-treemap.width
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.z
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
  /**
    * The treemap will be auto zoomed to a appropriate ratio when a
    * node is clicked (when
    * [nodeClick](https://echarts.apache.org/en/option.html#series-treemap.nodeClick)
    * is set as `'zoomToNode'` and no drill down happens).
    * This configuration item indicates the ratio.
    *
    *
    * @default
    * 0.32*0.32
    * @see https://echarts.apache.org/en/option.html#series-treemap.zoomToNodeRatio
    */
  var zoomToNodeRatio: js.UndefOr[Double] = js.native
}

object SeriesTreemap_ {
  @scala.inline
  def apply(): SeriesTreemap_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesTreemap_]
  }
  @scala.inline
  implicit class SeriesTreemap_Ops[Self <: SeriesTreemap_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBreadcrumb(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreadcrumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumb")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenVisibleMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenVisibleMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenVisibleMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenVisibleMin")(js.undefined)
        ret
    }
    @scala.inline
    def withColorAlpha(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMappingBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMappingBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMappingBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMappingBy")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSaturation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSaturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSaturation")(js.undefined)
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
    def withDrillDownIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillDownIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withEmphasis(value: AnonUpperLabel): Self = {
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
    def withItemStyle(value: AnonBorderColorSaturation): Self = {
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
    def withLabel(value: AnonEllipsis): Self = {
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
    def withLeafDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leafDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeafDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leafDepth")(js.undefined)
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
    def withLevels(value: AnonChildrenVisibleMin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
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
    def withNodeClick(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClick")(js.undefined)
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
    def withSilent(value: AnonLink): Self = {
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
    def withSquareRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squareRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquareRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squareRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: AnonExtraCssText): Self = {
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
    def withUpperLabel(value: AnonTextShadowOffsetX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleMin")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualDimension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualMax")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualMin")(js.undefined)
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
    @scala.inline
    def withZoomToNodeRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToNodeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomToNodeRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToNodeRatio")(js.undefined)
        ret
    }
  }
  
}

