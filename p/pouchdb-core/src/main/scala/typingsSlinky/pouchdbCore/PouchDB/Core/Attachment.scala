package typingsSlinky.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pouchdbCore.PouchDB.Core.StubAttachment
  - typingsSlinky.pouchdbCore.PouchDB.Core.FullAttachment
*/
trait Attachment extends js.Object

object Attachment {
  @scala.inline
  implicit def apply(value: FullAttachment): Attachment = value.asInstanceOf[Attachment]
  @scala.inline
  implicit def apply(value: StubAttachment): Attachment = value.asInstanceOf[Attachment]
}

