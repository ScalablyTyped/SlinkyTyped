package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.pdfmake.pdfmakeStrings.auto
  - typingsSlinky.pdfmake.pdfmakeStrings.Asterisk
  - java.lang.String
*/
trait Size extends js.Object

object Size {
  @scala.inline
  def auto: typingsSlinky.pdfmake.pdfmakeStrings.auto = "auto".asInstanceOf[typingsSlinky.pdfmake.pdfmakeStrings.auto]
  @scala.inline
  def Asterisk: typingsSlinky.pdfmake.pdfmakeStrings.Asterisk = "*".asInstanceOf[typingsSlinky.pdfmake.pdfmakeStrings.Asterisk]
  @scala.inline
  implicit def apply(value: Double): Size = value.asInstanceOf[Size]
  @scala.inline
  implicit def apply(value: String): Size = value.asInstanceOf[Size]
}

