package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateZTransform extends js.Object {
  
  var rotateZ: String = js.native
}
object RotateZTransform {
  
  @scala.inline
  def apply(rotateZ: String): RotateZTransform = {
    val __obj = js.Dynamic.literal(rotateZ = rotateZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateZTransform]
  }
  
  @scala.inline
  implicit class RotateZTransformOps[Self <: RotateZTransform] (val x: Self) extends AnyVal {
    
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
    def setRotateZ(value: String): Self = this.set("rotateZ", value.asInstanceOf[js.Any])
  }
}
