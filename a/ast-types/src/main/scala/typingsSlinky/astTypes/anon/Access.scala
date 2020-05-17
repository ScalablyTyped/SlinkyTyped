package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.astTypesStrings.`private`
import typingsSlinky.astTypes.astTypesStrings.`protected`
import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.astTypesStrings.public
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.VarianceKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Access extends js.Object {
  var access: js.UndefOr[public | `private` | `protected`] = js.native
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var computed: js.UndefOr[Boolean] = js.native
  var key: LiteralKind | IdentifierKind | ExpressionKind = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var static: js.UndefOr[Boolean] = js.native
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.native
  var value: ExpressionKind | Null = js.native
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.native
}

object Access {
  @scala.inline
  def apply(key: LiteralKind | IdentifierKind | ExpressionKind): Access = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Access]
  }
  @scala.inline
  implicit class AccessOps[Self <: Access] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: LiteralKind | IdentifierKind | ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccess(value: public | `private` | `protected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
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
    def withComputed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(js.undefined)
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
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: TypeAnnotationKind | TSTypeAnnotationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAnnotationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(null)
        ret
    }
    @scala.inline
    def withValue(value: ExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
    @scala.inline
    def withVariance(value: VarianceKind | plus | minus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(js.undefined)
        ret
    }
    @scala.inline
    def withVarianceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(null)
        ret
    }
  }
  
}

