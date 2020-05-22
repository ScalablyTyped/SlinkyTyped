package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends Printable {
  var comments: js.Array[CommentKind] | Null
  var `type`: String
}

object Node {
  @scala.inline
  def apply(`type`: String, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): Node = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

