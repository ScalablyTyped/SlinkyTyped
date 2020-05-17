package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.anon.Border
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - typingsSlinky.pdfmake.interfacesMod.Content with typingsSlinky.pdfmake.anon.Border
*/
trait TableCell extends js.Object

object TableCell {
  @scala.inline
  implicit def apply(value: Content with Border): TableCell = value.asInstanceOf[TableCell]
  @scala.inline
  implicit def apply(value: js.Object): TableCell = value.asInstanceOf[TableCell]
}

