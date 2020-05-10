package typingsSlinky.echarts.echarts.EChartOption.SeriesTreemap

import typingsSlinky.echarts.AnonBorderColorSaturation
import typingsSlinky.echarts.AnonEllipsis
import typingsSlinky.echarts.AnonTextShadowOffsetX
import typingsSlinky.echarts.AnonUpperLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObject extends js.Object {
  var children: js.UndefOr[js.Array[DataObject]] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.childrenVisibleMin
    */
  var childrenVisibleMin: js.UndefOr[Double] = js.native
  /**
    * A color list for a level.
    * Each node in the level will obtain a color from the color
    * list (the rule see
    * [colorMappingBy](https://echarts.apache.org/en/option.html#series-treemap.levels.colorMappingBy)
    * ).
    * It is empty by default, which means the global color list
    * will be used.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `color` attribute could appear in more
    * than one places:
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.color
    */
  var color: js.UndefOr[js.Array[_]] = js.native
  /**
    * It indicates the range of tranparent rate (color alpha) for
    * nodes in a level . The range of values is 0 ~ 1.
    *
    * For example, `colorAlpha` can be `[0.3, 1]`.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorAlpha` attribute could appear in
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.colorAlpha
    */
  var colorAlpha: js.UndefOr[js.Array[_]] = js.native
  /**
    * Specify the rule according to which each node obtain color
    * from
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
    * Namely, in a level, the first node is mapped to the first
    * color of
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
    * > Tps: In treemap, `colorMappingBy` attribute could appear
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
    * @default
    * "index"
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.colorMappingBy
    */
  var colorMappingBy: js.UndefOr[String] = js.native
  /**
    * It indicates the range of saturation (color alpha) for nodes
    * in a level . The range of values is 0 ~ 1.
    *
    * For example, `colorSaturation` can be `[0.3, 1]`.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorSaturation` attribute could appear
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.colorSaturation
    */
  var colorSaturation: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis
    */
  var emphasis: js.UndefOr[AnonUpperLabel] = js.native
  /**
    * `id` is not mandatory.
    * But if using API, id is used to locate node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * > Tps: In treemap, `itemStyle` attribute could appear in
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorSaturation] = js.native
  /**
    * `label` decribes the style of the label in each node.
    *
    * > Tps: In treemap, `label` attribute could appear in more
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.label
    */
  var label: js.UndefOr[AnonEllipsis] = js.native
  /**
    * Show the description text in rectangle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * `upperLabel` is used to specify whether show label when the
    * node has children. When
    * [upperLabel.show](https://echarts.apache.org/en/option.html#series-treemap.upperLabel.show)
    * is set as `true`, the feature that "show parent label" is
    * enabled.
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
    * specifies the style when a node has children, in which case
    * the label is displayed in the inner top of the node.
    *
    * See:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.data)
    *
    * > Tps: In treemap, `label` attribute could appear in more
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.upperLabel
    */
  var upperLabel: js.UndefOr[AnonTextShadowOffsetX] = js.native
  /**
    * The value of this node, indicating the area size.
    *
    * It could also be an array, such as \[2323, 43, 55\], in which
    * the first item of array indicates the area size.
    *
    * The other items of the array can be used for extra visual
    * mapping. See details in series-treemp.levels.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.value
    */
  var value: js.UndefOr[js.Array[_] | Double] = js.native
  /**
    * A node will not be shown when its area size is smaller than
    * this value (unit: px square).
    *
    * In this way, tiny nodes will be hidden, otherwise they will
    * huddle together.
    * When user zoom the treemap, the area size will increase and
    * the rectangle will be shown if the area size is larger than
    * this threshold.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `visibleMin` attribute could appear in
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
    * 10
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.visibleMin
    */
  var visibleMin: js.UndefOr[Double] = js.native
  /**
    * `treemap` is able to map any dimensions of data to visual.
    *
    * The value of
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * can be an array.
    * And each item of the array represents a "dimension".
    * `visualDimension` specifies the dimension on which visual
    * mapping will be performed.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `visualDimension` attribute could appear
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.visualDimension
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.visualMax
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.visualMin
    */
  var visualMin: js.UndefOr[Double] = js.native
}

object DataObject {
  @scala.inline
  def apply(): DataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataObject]
  }
  @scala.inline
  implicit class DataObjectOps[Self <: DataObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[DataObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withColor(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
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
    def withValue(value: js.Array[_] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
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
  }
  
}

