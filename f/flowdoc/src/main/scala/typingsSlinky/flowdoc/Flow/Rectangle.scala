package typingsSlinky.flowdoc.Flow

import typingsSlinky.flowdoc.Shape
import typingsSlinky.flowdoc.flowdocStrings.RECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends Shape {
  @JSName("type")
  var type_Rectangle: RECT
}

object Rectangle {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    `type`: RECT,
    connections: js.Array[Connection] = null
  ): Rectangle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
}

