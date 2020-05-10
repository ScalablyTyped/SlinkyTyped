package typingsSlinky.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentLine
  extends Comment
     with ASTNode {
  var `type`: typingsSlinky.astTypes.astTypesStrings.CommentLine = js.native
}

object CommentLine {
  @scala.inline
  def apply(
    leading: Boolean,
    trailing: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.CommentLine,
    value: String
  ): CommentLine = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentLine]
  }
  @scala.inline
  implicit class CommentLineOps[Self <: CommentLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.astTypes.astTypesStrings.CommentLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

