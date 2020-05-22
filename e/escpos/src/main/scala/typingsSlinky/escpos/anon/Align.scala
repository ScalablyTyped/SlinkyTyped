package typingsSlinky.escpos.anon

import typingsSlinky.escpos.escposStrings.CENTER
import typingsSlinky.escpos.escposStrings.LEFT
import typingsSlinky.escpos.escposStrings.RIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var align: LEFT | CENTER | RIGHT
  var text: String
  var width: Double
}

object Align {
  @scala.inline
  def apply(align: LEFT | CENTER | RIGHT, text: String, width: Double): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

