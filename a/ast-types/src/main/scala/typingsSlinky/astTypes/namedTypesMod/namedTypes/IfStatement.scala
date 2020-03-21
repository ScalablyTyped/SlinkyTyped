package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
trait IfStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var alternate: js.UndefOr[StatementKind | Null] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var consequent: StatementKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var test: ExpressionKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.IfStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.IfStatement")
@js.native
object IfStatement extends TopLevel[Type[IfStatement]]

