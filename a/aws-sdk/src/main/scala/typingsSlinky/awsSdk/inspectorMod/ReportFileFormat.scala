package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.HTML
  - typingsSlinky.awsSdk.awsSdkStrings.PDF
  - java.lang.String
*/
trait ReportFileFormat extends js.Object

object ReportFileFormat {
  @scala.inline
  def HTML: typingsSlinky.awsSdk.awsSdkStrings.HTML = "HTML".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTML]
  @scala.inline
  def PDF: typingsSlinky.awsSdk.awsSdkStrings.PDF = "PDF".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PDF]
  @scala.inline
  implicit def apply(value: String): ReportFileFormat = value.asInstanceOf[ReportFileFormat]
}

