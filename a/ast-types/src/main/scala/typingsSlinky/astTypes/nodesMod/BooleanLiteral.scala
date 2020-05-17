package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.anon.Flags
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> */
@js.native
trait BooleanLiteral extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var regex: js.UndefOr[Flags] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.BooleanLiteral = js.native
  var value: Boolean = js.native
}

object BooleanLiteral {
  @scala.inline
  def apply(`type`: typingsSlinky.astTypes.astTypesStrings.BooleanLiteral, value: Boolean): BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanLiteral]
  }
  @scala.inline
  implicit class BooleanLiteralOps[Self <: BooleanLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.astTypes.astTypesStrings.BooleanLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[CommentKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc(value: SourceLocationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: Flags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
  }
  
}

