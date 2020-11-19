package typingsSlinky.reactEasyChart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarData extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var x: Double | js.Date | String = js.native
  
  var y: Double = js.native
}
object BarData {
  
  @scala.inline
  def apply(x: Double | js.Date | String, y: Double): BarData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarData]
  }
  
  @scala.inline
  implicit class BarDataOps[Self <: BarData] (val x: Self) extends AnyVal {
    
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
    def setXDate(value: js.Date): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double | js.Date | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
}
