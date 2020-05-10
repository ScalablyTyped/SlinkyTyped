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
@js.native
trait DoWhileStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: StatementKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var test: ExpressionKind = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.DoWhileStatement = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DoWhileStatement")
@js.native
object DoWhileStatement extends TopLevel[Type[DoWhileStatement]]

