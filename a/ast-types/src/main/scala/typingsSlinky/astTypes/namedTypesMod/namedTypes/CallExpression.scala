package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CallExpressionKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.kindsMod.TypeParameterInstantiationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait CallExpression
  extends ASTNode
     with CallExpressionKind
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var arguments: js.Array[ExpressionKind | SpreadElementKind] = js.native
  var callee: ExpressionKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.CallExpression = js.native
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CallExpression")
@js.native
object CallExpression extends TopLevel[Type[CallExpression]]

