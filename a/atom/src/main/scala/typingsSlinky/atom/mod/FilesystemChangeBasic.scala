package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.created
import typingsSlinky.atom.atomStrings.deleted
import typingsSlinky.atom.atomStrings.modified
import typingsSlinky.atom.atomStrings.renamed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesystemChangeBasic[Action /* <: created | modified | deleted | renamed */] extends js.Object {
  /** A string describing the filesystem action that occurred. */
  var action: Action
  /** The absolute path to the filesystem entry that was acted upon. */
  var path: String
}

object FilesystemChangeBasic {
  @scala.inline
  def apply[Action /* <: created | modified | deleted | renamed */](action: Action, path: String): FilesystemChangeBasic[Action] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilesystemChangeBasic[Action]]
  }
}

