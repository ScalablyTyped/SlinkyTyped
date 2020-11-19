package typingsSlinky.betterScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WheelOption extends js.Object {
  
  var adjustTime: Double = js.native
  
  var rotate: Double = js.native
  
  var selectedIndex: Double = js.native
  
  var wheelItemClass: String = js.native
  
  var wheelWrapperClass: String = js.native
}
object WheelOption {
  
  @scala.inline
  def apply(
    adjustTime: Double,
    rotate: Double,
    selectedIndex: Double,
    wheelItemClass: String,
    wheelWrapperClass: String
  ): WheelOption = {
    val __obj = js.Dynamic.literal(adjustTime = adjustTime.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], wheelItemClass = wheelItemClass.asInstanceOf[js.Any], wheelWrapperClass = wheelWrapperClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelOption]
  }
  
  @scala.inline
  implicit class WheelOptionOps[Self <: WheelOption] (val x: Self) extends AnyVal {
    
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
    def setAdjustTime(value: Double): Self = this.set("adjustTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelItemClass(value: String): Self = this.set("wheelItemClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelWrapperClass(value: String): Self = this.set("wheelWrapperClass", value.asInstanceOf[js.Any])
  }
}
