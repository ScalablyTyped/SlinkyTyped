package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impltype extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var id: IdentifierKind = js.native
  var impltype: FlowTypeKind = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var supertype: FlowTypeKind = js.native
  var typeParameters: TypeParameterDeclarationKind | Null = js.native
}

object Impltype {
  @scala.inline
  def apply(id: IdentifierKind, impltype: FlowTypeKind, supertype: FlowTypeKind): Impltype = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], supertype = supertype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impltype]
  }
  @scala.inline
  implicit class ImpltypeOps[Self <: Impltype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: IdentifierKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpltype(value: FlowTypeKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impltype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupertype(value: FlowTypeKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supertype")(value.asInstanceOf[js.Any])
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
    def withTypeParameters(value: TypeParameterDeclarationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
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

