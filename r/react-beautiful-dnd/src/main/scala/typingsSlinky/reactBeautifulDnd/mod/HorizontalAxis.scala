package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.bottom
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.height
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.horizontal
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.left
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.right
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.top
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.width
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.x
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorizontalAxis extends Axis {
  
  var crossAxisEnd: bottom = js.native
  
  var crossAxisLine: y = js.native
  
  var crossAxisSize: height = js.native
  
  var crossAxisStart: top = js.native
  
  var direction: horizontal = js.native
  
  var end: right = js.native
  
  var line: x = js.native
  
  var size: width = js.native
  
  var start: left = js.native
}
object HorizontalAxis {
  
  @scala.inline
  def apply(
    crossAxisEnd: bottom,
    crossAxisLine: y,
    crossAxisSize: height,
    crossAxisStart: top,
    direction: horizontal,
    end: right,
    line: x,
    size: width,
    start: left
  ): HorizontalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = crossAxisEnd.asInstanceOf[js.Any], crossAxisLine = crossAxisLine.asInstanceOf[js.Any], crossAxisSize = crossAxisSize.asInstanceOf[js.Any], crossAxisStart = crossAxisStart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalAxis]
  }
  
  @scala.inline
  implicit class HorizontalAxisOps[Self <: HorizontalAxis] (val x: Self) extends AnyVal {
    
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
    def setCrossAxisEnd(value: bottom): Self = this.set("crossAxisEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisLine(value: y): Self = this.set("crossAxisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisSize(value: height): Self = this.set("crossAxisSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisStart(value: top): Self = this.set("crossAxisStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: horizontal): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: right): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.x): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: width): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: left): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
