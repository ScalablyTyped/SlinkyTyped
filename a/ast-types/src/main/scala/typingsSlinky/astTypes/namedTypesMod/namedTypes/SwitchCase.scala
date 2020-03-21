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

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait SwitchCase
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var consequent: js.Array[StatementKind]
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var test: ExpressionKind | Null
  var `type`: typingsSlinky.astTypes.astTypesStrings.SwitchCase
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.SwitchCase")
@js.native
object SwitchCase extends TopLevel[Type[SwitchCase]]

