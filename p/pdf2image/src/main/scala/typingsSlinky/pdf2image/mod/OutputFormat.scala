package typingsSlinky.pdf2image.mod

import typingsSlinky.pdf2image.anon.TypeofimportedVm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function7[
/ * pageNum * / scala.Double, 
/ * pageIndex * / scala.Double, 
/ * totalPagesProcessed * / scala.Double, 
/ * totalPDFPages * / scala.Double, 
/ * name * / java.lang.String, 
/ * path * / java.lang.String, 
/ * vm * / typingsSlinky.pdf2image.anon.TypeofimportedVm, 
java.lang.String]
  - java.lang.String
*/
trait OutputFormat extends js.Object

object OutputFormat {
  @scala.inline
  implicit def apply(
    value: js.Function7[
      /* pageNum */ Double, 
      /* pageIndex */ Double, 
      /* totalPagesProcessed */ Double, 
      /* totalPDFPages */ Double, 
      /* name */ String, 
      /* path */ String, 
      /* vm */ TypeofimportedVm, 
      String
    ]
  ): OutputFormat = value.asInstanceOf[OutputFormat]
  @scala.inline
  implicit def apply(value: String): OutputFormat = value.asInstanceOf[OutputFormat]
}

