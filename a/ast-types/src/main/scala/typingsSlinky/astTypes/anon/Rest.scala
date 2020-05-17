package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.FunctionTypeParamKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rest extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var params: js.Array[FunctionTypeParamKind] = js.native
  var rest: FunctionTypeParamKind | Null = js.native
  var returnType: FlowTypeKind = js.native
  var typeParameters: TypeParameterDeclarationKind | Null = js.native
}

object Rest {
  @scala.inline
  def apply(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind): Rest = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rest]
  }
  @scala.inline
  implicit class RestOps[Self <: Rest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: js.Array[FunctionTypeParamKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnType(value: FlowTypeKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(value.asInstanceOf[js.Any])
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
    def withRest(value: FunctionTypeParamKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(null)
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

