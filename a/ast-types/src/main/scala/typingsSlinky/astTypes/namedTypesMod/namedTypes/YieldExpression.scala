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
trait YieldExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var argument: ExpressionKind | Null = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var delegate: js.UndefOr[Boolean] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.YieldExpression = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.YieldExpression")
@js.native
object YieldExpression extends TopLevel[Type[YieldExpression]]

