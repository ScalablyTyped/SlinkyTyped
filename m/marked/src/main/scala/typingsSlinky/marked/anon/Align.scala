package typingsSlinky.marked.anon

import typingsSlinky.marked.markedStrings.center
import typingsSlinky.marked.markedStrings.left
import typingsSlinky.marked.markedStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var align: center | left | right | Null
  var header: Boolean
}

object Align {
  @scala.inline
  def apply(header: Boolean, align: center | left | right = null): Align = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], align = align.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

