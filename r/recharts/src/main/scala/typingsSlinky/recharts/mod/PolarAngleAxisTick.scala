package typingsSlinky.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolarAngleAxisTick extends js.Object {
  
  var coordinate: Double = js.native
  
  var value: js.Any = js.native
}
object PolarAngleAxisTick {
  
  @scala.inline
  def apply(coordinate: Double, value: js.Any): PolarAngleAxisTick = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarAngleAxisTick]
  }
  
  @scala.inline
  implicit class PolarAngleAxisTickOps[Self <: PolarAngleAxisTick] (val x: Self) extends AnyVal {
    
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
    def setCoordinate(value: Double): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
