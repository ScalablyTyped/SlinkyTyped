package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.anon.Parenthesized
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
@js.native
trait TSTypeAssertion
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PatternKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var expression: ExpressionKind = js.native
  var extra: js.UndefOr[Parenthesized | Null] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAssertion = js.native
  var typeAnnotation: TSTypeKind = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeAssertion")
@js.native
object TSTypeAssertion extends TopLevel[Type[TSTypeAssertion]]

