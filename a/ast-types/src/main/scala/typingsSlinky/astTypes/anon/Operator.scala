package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.astTypesStrings.Exclamationmark
import typingsSlinky.astTypes.astTypesStrings.Plussign
import typingsSlinky.astTypes.astTypesStrings.Tilde
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.astTypesStrings.delete
import typingsSlinky.astTypes.astTypesStrings.typeof
import typingsSlinky.astTypes.astTypesStrings.void
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operator extends js.Object {
  var argument: ExpressionKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete = js.native
  var prefix: js.UndefOr[Boolean] = js.native
}

object Operator {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  ): Operator = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator]
  }
  @scala.inline
  implicit class OperatorOps[Self <: Operator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgument(value: ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
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
    def withCommentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(null)
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
    def withLocNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(null)
        ret
    }
    @scala.inline
    def withPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

