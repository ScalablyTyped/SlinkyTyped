package typingsSlinky.firebaseFirestore.remoteWatchChangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.remoteWatchChangeMod.DocumentWatchChange
  - typingsSlinky.firebaseFirestore.remoteWatchChangeMod.WatchTargetChange
  - typingsSlinky.firebaseFirestore.remoteWatchChangeMod.ExistenceFilterChange
*/
trait WatchChange extends js.Object

object WatchChange {
  @scala.inline
  implicit def apply(value: DocumentWatchChange): WatchChange = value.asInstanceOf[WatchChange]
  @scala.inline
  implicit def apply(value: ExistenceFilterChange): WatchChange = value.asInstanceOf[WatchChange]
  @scala.inline
  implicit def apply(value: WatchTargetChange): WatchChange = value.asInstanceOf[WatchChange]
}

