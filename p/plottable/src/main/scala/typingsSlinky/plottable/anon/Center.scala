package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.center
import typingsSlinky.plottable.plottableStrings.left
import typingsSlinky.plottable.plottableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Center extends js.Object {
  
  var center: typingsSlinky.plottable.plottableStrings.center = js.native
  
  var left: typingsSlinky.plottable.plottableStrings.left = js.native
  
  var right: typingsSlinky.plottable.plottableStrings.right = js.native
}
object Center {
  
  @scala.inline
  def apply(center: center, left: left, right: right): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit class CenterOps[Self <: Center] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: center): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: left): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: right): Self = this.set("right", value.asInstanceOf[js.Any])
  }
}
