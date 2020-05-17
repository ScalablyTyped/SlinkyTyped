package typingsSlinky.fastGlob.typesEntriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.fastGlob.typesEntriesMod.IEntry
*/
trait EntryItem extends js.Object

object EntryItem {
  @scala.inline
  implicit def apply(value: IEntry): EntryItem = value.asInstanceOf[EntryItem]
  @scala.inline
  implicit def apply(value: String): EntryItem = value.asInstanceOf[EntryItem]
}

