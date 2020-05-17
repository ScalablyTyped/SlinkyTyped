package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pdfmake.interfacesMod.PredefinedPageSize
  - typingsSlinky.pdfmake.interfacesMod.CustomPageSize
*/
trait PageSize extends js.Object

object PageSize {
  @scala.inline
  implicit def apply(value: CustomPageSize): PageSize = value.asInstanceOf[PageSize]
  @scala.inline
  implicit def apply(value: PredefinedPageSize): PageSize = value.asInstanceOf[PageSize]
}

