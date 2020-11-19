package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Quaternion
import typingsSlinky.babylonjs.BABYLON.RuntimeAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationsOriginalValue extends js.Object {
  
  var animations: js.Array[RuntimeAnimation] = js.native
  
  var originalValue: Quaternion = js.native
  
  var totalWeight: Double = js.native
}
object AnimationsOriginalValue {
  
  @scala.inline
  def apply(animations: js.Array[RuntimeAnimation], originalValue: Quaternion, totalWeight: Double): AnimationsOriginalValue = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationsOriginalValue]
  }
  
  @scala.inline
  implicit class AnimationsOriginalValueOps[Self <: AnimationsOriginalValue] (val x: Self) extends AnyVal {
    
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
    def setAnimationsVarargs(value: RuntimeAnimation*): Self = this.set("animations", js.Array(value :_*))
    
    @scala.inline
    def setAnimations(value: js.Array[RuntimeAnimation]): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValue(value: Quaternion): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalWeight(value: Double): Self = this.set("totalWeight", value.asInstanceOf[js.Any])
  }
}
