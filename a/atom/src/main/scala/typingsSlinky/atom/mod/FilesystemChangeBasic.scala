package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.created
import typingsSlinky.atom.atomStrings.deleted
import typingsSlinky.atom.atomStrings.modified
import typingsSlinky.atom.atomStrings.renamed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesystemChangeBasic[Action /* <: created | modified | deleted | renamed */] extends FilesystemChange {
  /** A string describing the filesystem action that occurred. */
  var action: Action = js.native
  /** The absolute path to the filesystem entry that was acted upon. */
  var path: String = js.native
}

object FilesystemChangeBasic {
  @scala.inline
  def apply[Action](action: Action, path: String): FilesystemChangeBasic[Action] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesystemChangeBasic[Action]]
  }
  @scala.inline
  implicit class FilesystemChangeBasicOps[Self[action] <: FilesystemChangeBasic[action], Action] (val x: Self[Action]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Action] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Action]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Action] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Action] with Other]
    @scala.inline
    def withAction(value: Action): Self[Action] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self[Action] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

