package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSThisTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.TSTypeAnnotation, 'type' | 'typeAnnotation'> */
@js.native
trait TSTypePredicate extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var parameterName: IdentifierKind | TSThisTypeKind = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTypePredicate = js.native
  var typeAnnotation: TSTypeAnnotationKind = js.native
}

object TSTypePredicate {
  @scala.inline
  def apply(
    parameterName: IdentifierKind | TSThisTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypePredicate,
    typeAnnotation: TSTypeAnnotationKind
  ): TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypePredicate]
  }
  @scala.inline
  implicit class TSTypePredicateOps[Self <: TSTypePredicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterName(value: IdentifierKind | TSThisTypeKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.astTypes.astTypesStrings.TSTypePredicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: TSTypeAnnotationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(value.asInstanceOf[js.Any])
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
  }
  
}

