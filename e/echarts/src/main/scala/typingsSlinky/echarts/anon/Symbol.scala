package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol extends js.Object {
  
  /**
    * Coordinates of the starting point or ending point,
    * whose format depends on the coordinate of the series.
    * It can be `x`, and `y` for
    * [rectangular coordinates](https://echarts.apache.org/en/option.html#grid)
    * , or `radius`, and `angle` for
    * [polar coordinates](https://echarts.apache.org/en/option.html#polar)
    * .
    *
    * **Notice:** For axis with
    * [axis.type](https://echarts.apache.org/en/option.html#xAixs.type)
    * `'category'`:
    *
    * + If coord value is `number`, it represents index
    * of
    * [axis.data](https://echarts.apache.org/en/option.html#xAxis.data)
    * .
    * + If coord value is `string`, it represents concrete
    * value in
    * [axis.data](https://echarts.apache.org/en/option.html#xAxis.data)
    *
    *
    * Please notice that in this case `xAxis.data`
    * must not be written as \[number, number,
    *
    *
    *
    * \], but can only be written \[string, string,
    *
    *
    *
    * \].
    * Otherwise it is not able to be located by markPoint
    * / markLine.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot.markLine.data.1)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.coord
    */
  var coord: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Label of this data item, which will be merged with
    * `label` of starting point and ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.label
    */
  var label: js.UndefOr[Position] = js.native
  
  /**
    * Line style of this data item, which will be merged
    * with `lineStyle` of starting point and ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowOffsetX] = js.native
  
  /**
    * Name of the marker, which will display as a label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.markLine.data.1.name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Symbol of ending point.
    *
    * Icon types provided by ECharts includes `'circle'`,
    * `'rect'`, `'roundRect'`, `'triangle'`, `'diamond'`,
    * `'pin'`, `'arrow'`, `'none'`
    *
    * It can be set to an image with `'image://url'` ,
    * in which URL is the link to an image, or `dataURI`
    * of an image.
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
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot.markLine.data.1)
    *
    * Icons can be set to arbitrary vector path via `'path://'`
    * in ECharts.
    * As compared with raster image, vector paths prevent
    * from jagging and blurring when scaled, and have a
    * better control over changing colors.
    * Size of vectoer icon will be adapted automatically.
    * Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe
    * Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot.markLine.data.1)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.symbol
    */
  var symbol: js.UndefOr[String] = js.native
  
  /**
    * Whether to keep aspect for symbols in the form of
    * `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.native
  
  /**
    * Offset of ending point symbol relative to original
    * position.
    * By default, symbol will be put in the center position
    * of data.
    * But if symbol is from user-defined vector path or
    * image, you may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset
    * to default position.
    * It can be in absolute pixel value, or in relative
    * percentage value.
    *
    * For example, `[0, '50%']` means to move upside side
    * position of symbol height.
    * It can be used to make the arrow in the bottom to
    * be at data position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Rotate degree of ending point symbol.
    * Note that when `symbol` is set to be `'arrow'` in
    * `markLine`, `symbolRotate` value will be ignored,
    * and compulsively use tangent angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.native
  
  /**
    * ending point symbol size.
    * It can be set to single numbers like `10`, or use
    * an array to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`,
    * and height is`10`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.native
  
  /**
    * Special label types, are used to label maximum value,
    * minimum value and so on.
    *
    * **Options are:**
    *
    * + `'min'` maximum value.
    * + `'max'` minimum value.
    * + `'average'` average value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.type
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Label value, which can be ignored.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.value
    */
  var value: js.UndefOr[Double] = js.native
  
  /**
    * Works only when
    * [type](https://echarts.apache.org/en/option.html#series-.markLine.data.type)
    * is assigned.
    * It is used to state the dimension used to calculate
    * maximum value or minimum value.
    * It may be the direct name of a dimension, like `x`,
    * or `angle` for line charts, or `open`, or `close`
    * for candlestick charts.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.valueDim
    */
  var valueDim: js.UndefOr[String] = js.native
  
  /**
    * Works only when
    * [type](https://echarts.apache.org/en/option.html#series-.markLine.data.type)
    * is assigned.
    * It is used to state the dimension used to calculate
    * maximum value or minimum value.
    * It may be `0` (for xAxis, or radiusAxis), or `1`
    * (for yAxis, or angleAxis).
    * Dimension of the first numeric axis is used by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.valueIndex
    */
  var valueIndex: js.UndefOr[Double] = js.native
  
  /**
    * X position according to container, in pixel.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.x
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * Position according to X-Axis value.
    * For a line parallel to Y-Axis
    *
    */
  var xAxis: js.UndefOr[Double] = js.native
  
  /**
    * Y position according to container, in pixel.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1.y
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * Position according to Y-Axis value
    * For a line parallel to X-Axis
    *
    */
  var yAxis: js.UndefOr[Double] = js.native
}
object Symbol {
  
  @scala.inline
  def apply(): Symbol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Symbol]
  }
  
  @scala.inline
  implicit class SymbolOps[Self <: Symbol] (val x: Self) extends AnyVal {
    
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
    def setCoordVarargs(value: js.Any*): Self = this.set("coord", js.Array(value :_*))
    
    @scala.inline
    def setCoord(value: js.Array[_]): Self = this.set("coord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoord: Self = this.set("coord", js.undefined)
    
    @scala.inline
    def setLabel(value: Position): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLineStyle(value: ShadowOffsetX): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setSymbolKeepAspect(value: Boolean): Self = this.set("symbolKeepAspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolKeepAspect: Self = this.set("symbolKeepAspect", js.undefined)
    
    @scala.inline
    def setSymbolOffsetVarargs(value: js.Any*): Self = this.set("symbolOffset", js.Array(value :_*))
    
    @scala.inline
    def setSymbolOffset(value: js.Array[_]): Self = this.set("symbolOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolOffset: Self = this.set("symbolOffset", js.undefined)
    
    @scala.inline
    def setSymbolRotate(value: Double): Self = this.set("symbolRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolRotate: Self = this.set("symbolRotate", js.undefined)
    
    @scala.inline
    def setSymbolSizeVarargs(value: js.Any*): Self = this.set("symbolSize", js.Array(value :_*))
    
    @scala.inline
    def setSymbolSize(value: js.Array[_] | Double): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueDim(value: String): Self = this.set("valueDim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueDim: Self = this.set("valueDim", js.undefined)
    
    @scala.inline
    def setValueIndex(value: Double): Self = this.set("valueIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueIndex: Self = this.set("valueIndex", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXAxis(value: Double): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYAxis(value: Double): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
}
