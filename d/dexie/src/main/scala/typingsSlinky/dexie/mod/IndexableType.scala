package typingsSlinky.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dexie.mod.IndexableTypePart
  - typingsSlinky.dexie.mod.IndexableTypeArrayReadonly
*/
trait IndexableType extends js.Object

object IndexableType {
  @scala.inline
  implicit def apply(value: IndexableTypeArrayReadonly): IndexableType = value.asInstanceOf[IndexableType]
  @scala.inline
  implicit def apply(value: IndexableTypePart): IndexableType = value.asInstanceOf[IndexableType]
}

