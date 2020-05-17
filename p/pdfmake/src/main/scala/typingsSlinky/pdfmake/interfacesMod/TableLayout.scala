package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.pdfmake.interfacesMod.PredefinedTableLayout
  - typingsSlinky.pdfmake.interfacesMod.CustomTableLayout
*/
trait TableLayout extends js.Object

object TableLayout {
  @scala.inline
  implicit def apply(value: CustomTableLayout): TableLayout = value.asInstanceOf[TableLayout]
  @scala.inline
  implicit def apply(value: PredefinedTableLayout): TableLayout = value.asInstanceOf[TableLayout]
  @scala.inline
  implicit def apply(value: String): TableLayout = value.asInstanceOf[TableLayout]
}

