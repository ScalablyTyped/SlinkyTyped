package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ComprehensionBlockKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
trait GeneratorExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var blocks: js.Array[ComprehensionBlockKind]
  var body: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var filter: ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.GeneratorExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.GeneratorExpression")
@js.native
object GeneratorExpression extends TopLevel[Type[GeneratorExpression]]

