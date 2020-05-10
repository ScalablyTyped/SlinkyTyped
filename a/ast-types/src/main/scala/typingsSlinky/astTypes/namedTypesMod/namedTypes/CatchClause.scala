package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
@js.native
trait CatchClause
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var body: BlockStatementKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var guard: js.UndefOr[ExpressionKind | Null] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var param: js.UndefOr[PatternKind | Null] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.CatchClause = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CatchClause")
@js.native
object CatchClause extends TopLevel[Type[CatchClause]]

