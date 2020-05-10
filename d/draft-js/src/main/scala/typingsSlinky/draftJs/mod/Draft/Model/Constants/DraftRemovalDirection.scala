package typingsSlinky.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that allows us to avoid passing boolean arguments
  * around to indicate whether a deletion is forward or backward.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.draftJs.draftJsStrings.backward
  - typingsSlinky.draftJs.draftJsStrings.forward
*/
trait DraftRemovalDirection extends js.Object

object DraftRemovalDirection {
  @scala.inline
  def backward: typingsSlinky.draftJs.draftJsStrings.backward = "backward".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.backward]
  @scala.inline
  def forward: typingsSlinky.draftJs.draftJsStrings.forward = "forward".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.forward]
}

