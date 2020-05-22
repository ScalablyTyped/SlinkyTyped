package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CatchClauseKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
trait TryStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var block: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var finalizer: js.UndefOr[BlockStatementKind | Null] = js.undefined
  var guardedHandlers: js.UndefOr[js.Array[CatchClauseKind]] = js.undefined
  var handler: js.UndefOr[CatchClauseKind | Null] = js.undefined
  var handlers: js.UndefOr[js.Array[CatchClauseKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.TryStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TryStatement")
@js.native
object TryStatement extends TopLevel[Type[TryStatement]]

