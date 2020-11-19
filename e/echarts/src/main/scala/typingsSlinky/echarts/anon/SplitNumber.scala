package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitNumber extends js.Object {
  
  /**
    * The length of tick line, can be a pecentage value relative
    * to radius.
    *
    *
    * @default
    * 8
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.length
    */
  var length: js.UndefOr[Double | String] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
  
  /**
    * Whether to show the scale.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.show
    */
  var show: js.UndefOr[Boolean] = js.native
  
  /**
    * The split scale number between split line.
    *
    *
    * @default
    * 5
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.native
}
object SplitNumber {
  
  @scala.inline
  def apply(): SplitNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitNumber]
  }
  
  @scala.inline
  implicit class SplitNumberOps[Self <: SplitNumber] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double | String): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setLineStyle(value: ShadowBlur): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSplitNumber(value: Double): Self = this.set("splitNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitNumber: Self = this.set("splitNumber", js.undefined)
  }
}
