package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.FunctionTypeParamKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRest extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var params: js.Array[FunctionTypeParamKind]
  var rest: FunctionTypeParamKind | Null
  var returnType: FlowTypeKind
  var typeParameters: TypeParameterDeclarationKind | Null
}

object AnonRest {
  @scala.inline
  def apply(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    rest: FunctionTypeParamKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): AnonRest = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRest]
  }
}

