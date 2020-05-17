package typingsSlinky.awsSdk.iamMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.iamMod.Blob
  - java.lang.String
*/
trait ReportContentType extends js.Object

object ReportContentType {
  @scala.inline
  implicit def apply(value: Blob): ReportContentType = value.asInstanceOf[ReportContentType]
  @scala.inline
  implicit def apply(value: Buffer): ReportContentType = value.asInstanceOf[ReportContentType]
  @scala.inline
  implicit def apply(value: String): ReportContentType = value.asInstanceOf[ReportContentType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ReportContentType = value.asInstanceOf[ReportContentType]
}

