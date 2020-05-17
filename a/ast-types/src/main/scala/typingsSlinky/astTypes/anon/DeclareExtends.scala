package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSExpressionWithTypeArgumentsKind
import typingsSlinky.astTypes.kindsMod.TSInterfaceBodyKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareExtends extends js.Object {
  var body: TSInterfaceBodyKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var declare: js.UndefOr[Boolean] = js.native
  var `extends`: js.UndefOr[js.Array[TSExpressionWithTypeArgumentsKind] | Null] = js.native
  var id: IdentifierKind | TSQualifiedNameKind = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.native
}

object DeclareExtends {
  @scala.inline
  def apply(body: TSInterfaceBodyKind, id: IdentifierKind | TSQualifiedNameKind): DeclareExtends = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExtends]
  }
  @scala.inline
  implicit class DeclareExtendsOps[Self <: DeclareExtends] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: TSInterfaceBodyKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: IdentifierKind | TSQualifiedNameKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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
    def withDeclare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declare")(js.undefined)
        ret
    }
    @scala.inline
    def withExtends(value: js.Array[TSExpressionWithTypeArgumentsKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(null)
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
    def withTypeParameters(value: TSTypeParameterDeclarationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(null)
        ret
    }
  }
  
}

