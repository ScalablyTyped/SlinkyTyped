package typingsSlinky.reactEasyChart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterplotData extends js.Object {
  
  var `type`: String | Double = js.native
  
  var x: Double | js.Date | String = js.native
  
  var y: Double | js.Date | String = js.native
  
  var z: js.UndefOr[Double] = js.native
}
object ScatterplotData {
  
  @scala.inline
  def apply(`type`: String | Double, x: Double | js.Date | String, y: Double | js.Date | String): ScatterplotData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterplotData]
  }
  
  @scala.inline
  implicit class ScatterplotDataOps[Self <: ScatterplotData] (val x: Self) extends AnyVal {
    
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
    def setType(value: String | Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDate(value: js.Date): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double | js.Date | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYDate(value: js.Date): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double | js.Date | String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
}
