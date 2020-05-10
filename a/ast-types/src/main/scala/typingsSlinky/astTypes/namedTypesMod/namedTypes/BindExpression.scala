package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait BindExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var callee: ExpressionKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var `object`: ExpressionKind | Null = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.BindExpression = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BindExpression")
@js.native
object BindExpression extends TopLevel[Type[BindExpression]]

