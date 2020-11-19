package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `01` extends js.Object {
  
  /**
    * Data of the starting point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.0
    */
  var `0`: js.UndefOr[Symbol] = js.native
  
  /**
    * Data of the ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1
    */
  var `1`: js.UndefOr[Symbol] = js.native
}
object `01` {
  
  @scala.inline
  def apply(): `01` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`01`]
  }
  
  @scala.inline
  implicit class `01Ops`[Self <: `01`] (val x: Self) extends AnyVal {
    
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
    def set0(value: Symbol): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete0: Self = this.set("0", js.undefined)
    
    @scala.inline
    def set1(value: Symbol): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete1: Self = this.set("1", js.undefined)
  }
}
