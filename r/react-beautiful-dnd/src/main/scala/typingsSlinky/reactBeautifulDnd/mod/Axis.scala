package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.bottom
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.height
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.horizontal
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.left
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.right
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.top
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.vertical
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.width
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.x
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBeautifulDnd.mod.VerticalAxis
  - typingsSlinky.reactBeautifulDnd.mod.HorizontalAxis
*/
trait Axis extends js.Object
object Axis {
  
  @scala.inline
  def VerticalAxis(
    crossAxisEnd: right,
    crossAxisLine: x,
    crossAxisSize: width,
    crossAxisStart: left,
    direction: vertical,
    end: bottom,
    line: y,
    size: height,
    start: top
  ): Axis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = crossAxisEnd.asInstanceOf[js.Any], crossAxisLine = crossAxisLine.asInstanceOf[js.Any], crossAxisSize = crossAxisSize.asInstanceOf[js.Any], crossAxisStart = crossAxisStart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  
  @scala.inline
  def HorizontalAxis(
    crossAxisEnd: bottom,
    crossAxisLine: y,
    crossAxisSize: height,
    crossAxisStart: top,
    direction: horizontal,
    end: right,
    line: x,
    size: width,
    start: left
  ): Axis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = crossAxisEnd.asInstanceOf[js.Any], crossAxisLine = crossAxisLine.asInstanceOf[js.Any], crossAxisSize = crossAxisSize.asInstanceOf[js.Any], crossAxisStart = crossAxisStart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}
