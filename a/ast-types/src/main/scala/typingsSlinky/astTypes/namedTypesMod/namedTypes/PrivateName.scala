package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
trait PrivateName
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PatternKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.PrivateName
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.PrivateName")
@js.native
object PrivateName extends TopLevel[Type[PrivateName]]

