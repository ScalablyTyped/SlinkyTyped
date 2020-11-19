package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceMax extends js.Object {
  
  var distance: Double = js.native
  
  var max: Vector3 = js.native
  
  var min: Vector3 = js.native
}
object DistanceMax {
  
  @scala.inline
  def apply(distance: Double, max: Vector3, min: Vector3): DistanceMax = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMax]
  }
  
  @scala.inline
  implicit class DistanceMaxOps[Self <: DistanceMax] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Vector3): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Vector3): Self = this.set("min", value.asInstanceOf[js.Any])
  }
}
