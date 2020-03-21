package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSThisTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParameterName extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var parameterName: IdentifierKind | TSThisTypeKind
  var typeAnnotation: TSTypeAnnotationKind
}

object AnonParameterName {
  @scala.inline
  def apply(
    parameterName: IdentifierKind | TSThisTypeKind,
    typeAnnotation: TSTypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonParameterName = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParameterName]
  }
}

