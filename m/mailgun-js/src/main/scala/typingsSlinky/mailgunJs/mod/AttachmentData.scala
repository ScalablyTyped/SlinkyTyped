package typingsSlinky.mailgunJs.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.NodeJS.ReadWriteStream
  - typingsSlinky.mailgunJs.mod.Attachment
*/
trait AttachmentData extends js.Object

object AttachmentData {
  @scala.inline
  implicit def apply(value: Attachment): AttachmentData = value.asInstanceOf[AttachmentData]
  @scala.inline
  implicit def apply(value: Buffer): AttachmentData = value.asInstanceOf[AttachmentData]
  @scala.inline
  implicit def apply(value: ReadWriteStream): AttachmentData = value.asInstanceOf[AttachmentData]
  @scala.inline
  implicit def apply(value: String): AttachmentData = value.asInstanceOf[AttachmentData]
}

