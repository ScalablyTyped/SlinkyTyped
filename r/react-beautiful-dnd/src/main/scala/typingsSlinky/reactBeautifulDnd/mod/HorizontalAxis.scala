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
import scala.scalajs.js.annotation._

trait HorizontalAxis extends Axis {
  var crossAxisEnd: bottom
  var crossAxisLine: y
  var crossAxisSize: height
  var crossAxisStart: top
  var direction: horizontal
  var end: right
  var line: x
  var size: width
  var start: left
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
}

