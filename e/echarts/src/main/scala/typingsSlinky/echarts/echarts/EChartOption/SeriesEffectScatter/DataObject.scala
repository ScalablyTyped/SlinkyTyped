package typingsSlinky.echarts.echarts.EChartOption.SeriesEffectScatter

import typingsSlinky.echarts.anon.BorderType
import typingsSlinky.echarts.anon.Distance
import typingsSlinky.echarts.anon.`4`
import typingsSlinky.echarts.echarts.EChartOption.BaseTooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataObject extends js.Object {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.data.emphasis
    */
  var emphasis: js.UndefOr[`4`] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.data.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.data.label
    */
  var label: js.UndefOr[Distance] = js.native
  
  /**
    * Symbol of single data.
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which
    * URL is the link to an image, or `dataURI` of an image.
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
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter.data)
    *
    * Icons can be set to arbitrary vector path via `'path://'`
    * in ECharts.
    * As compared with raster image, vector paths prevent from
    * jagging and blurring when scaled, and have a better control
    * over changing colors.
    * Size of vectoer icon will be adapted automatically.
    * Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter.data)
    *
    *
    * @default
    * "circle"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.data.symbol
    */
  var symbol: js.UndefOr[String] = js.native
  
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.data.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.native
  
  /**
    * Offset of single data symbol relative to original position.
    * By default, symbol will be put in the center position of
    * data.
    * But if symbol is from user-defined vector path or image,
    * you may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset to
    * default position.
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
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.data.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Rotate degree of single data symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use
    * tangent angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.data.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.native
  
  /**
    * single data symbol size.
    * It can be set to single numbers like `10`, or use an array
    * to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    *
    * @default
    * 4
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.data.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.native
  
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.data.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmphasis(value: `4`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    
    @scala.inline
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: Distance): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
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
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
