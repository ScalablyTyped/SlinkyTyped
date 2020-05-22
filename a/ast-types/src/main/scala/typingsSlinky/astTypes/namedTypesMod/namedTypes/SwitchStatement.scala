package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.SwitchCaseKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
trait SwitchStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var cases: js.Array[SwitchCaseKind]
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var discriminant: ExpressionKind
  var lexical: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.SwitchStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.SwitchStatement")
@js.native
object SwitchStatement extends TopLevel[Type[SwitchStatement]]

