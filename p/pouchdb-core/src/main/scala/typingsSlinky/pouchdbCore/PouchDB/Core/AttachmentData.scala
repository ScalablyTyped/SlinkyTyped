package typingsSlinky.pouchdbCore.PouchDB.Core

import typingsSlinky.pouchdbCore.Blob
import typingsSlinky.pouchdbCore.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.pouchdbCore.Blob
  - typingsSlinky.pouchdbCore.Buffer
*/
trait AttachmentData extends js.Object

object AttachmentData {
  @scala.inline
  implicit def apply(value: Blob): AttachmentData = value.asInstanceOf[AttachmentData]
  @scala.inline
  implicit def apply(value: Buffer): AttachmentData = value.asInstanceOf[AttachmentData]
  @scala.inline
  implicit def apply(value: String): AttachmentData = value.asInstanceOf[AttachmentData]
}

