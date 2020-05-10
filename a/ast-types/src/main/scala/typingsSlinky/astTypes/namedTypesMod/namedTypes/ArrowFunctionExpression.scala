package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.astTypesBooleans.`false`
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.FunctionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'id' | 'body' | 'generator'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait ArrowFunctionExpression
  extends ASTNode
     with ExpressionKind
     with FunctionKind
     with NodeKind
     with PrintableKind {
  var async: js.UndefOr[Boolean] = js.native
  var body: BlockStatementKind | ExpressionKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.native
  var expression: js.UndefOr[Boolean] = js.native
  var generator: js.UndefOr[`false`] = js.native
  var id: js.UndefOr[Null] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var params: js.Array[PatternKind] = js.native
  var rest: js.UndefOr[IdentifierKind] = js.native
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.ArrowFunctionExpression = js.native
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind] = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ArrowFunctionExpression")
@js.native
object ArrowFunctionExpression extends TopLevel[Type[ArrowFunctionExpression]]

