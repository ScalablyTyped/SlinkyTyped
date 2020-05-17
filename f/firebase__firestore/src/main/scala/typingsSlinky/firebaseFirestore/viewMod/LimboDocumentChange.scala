package typingsSlinky.firebaseFirestore.viewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.viewMod.AddedLimboDocument
  - typingsSlinky.firebaseFirestore.viewMod.RemovedLimboDocument
*/
trait LimboDocumentChange extends js.Object

object LimboDocumentChange {
  @scala.inline
  implicit def apply(value: AddedLimboDocument): LimboDocumentChange = value.asInstanceOf[LimboDocumentChange]
  @scala.inline
  implicit def apply(value: RemovedLimboDocument): LimboDocumentChange = value.asInstanceOf[LimboDocumentChange]
}

