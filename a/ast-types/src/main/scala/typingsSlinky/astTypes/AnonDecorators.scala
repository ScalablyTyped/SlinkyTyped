package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DecoratorKind
import typingsSlinky.astTypes.kindsMod.ObjectPropertyKind
import typingsSlinky.astTypes.kindsMod.PropertyKind
import typingsSlinky.astTypes.kindsMod.PropertyPatternKind
import typingsSlinky.astTypes.kindsMod.RestPropertyKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpreadPropertyKind
import typingsSlinky.astTypes.kindsMod.SpreadPropertyPatternKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecorators extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var properties: js.Array[
    PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
  ]
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
}

object AnonDecorators {
  @scala.inline
  def apply(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ],
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): AnonDecorators = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDecorators]
  }
}

