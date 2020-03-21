package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocParameters extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var parameters: js.Array[IdentifierKind]
  var readonly: js.UndefOr[Boolean] = js.undefined
  var typeAnnotation: js.UndefOr[TSTypeAnnotationKind | Null] = js.undefined
}

object AnonLocParameters {
  @scala.inline
  def apply(
    parameters: js.Array[IdentifierKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    typeAnnotation: TSTypeAnnotationKind = null
  ): AnonLocParameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocParameters]
  }
}

