package typingsSlinky.figma.figmaMod._Global_

import typingsSlinky.figma.figmaStrings.X
import typingsSlinky.figma.figmaStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guide extends js.Object {
  val axis: X | Y
  val offset: Double
}

object Guide {
  @scala.inline
  def apply(axis: X | Y, offset: Double): Guide = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Guide]
  }
}

