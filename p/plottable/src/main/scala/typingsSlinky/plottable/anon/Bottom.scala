package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.bottom
import typingsSlinky.plottable.plottableStrings.left
import typingsSlinky.plottable.plottableStrings.right
import typingsSlinky.plottable.plottableStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bottom extends js.Object {
  
  var bottom: typingsSlinky.plottable.plottableStrings.bottom = js.native
  
  var left: typingsSlinky.plottable.plottableStrings.left = js.native
  
  var right: typingsSlinky.plottable.plottableStrings.right = js.native
  
  var top: typingsSlinky.plottable.plottableStrings.top = js.native
}
object Bottom {
  
  @scala.inline
  def apply(bottom: bottom, left: left, right: right, top: top): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit class BottomOps[Self <: Bottom] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: bottom): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: left): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: right): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: top): Self = this.set("top", value.asInstanceOf[js.Any])
  }
}
