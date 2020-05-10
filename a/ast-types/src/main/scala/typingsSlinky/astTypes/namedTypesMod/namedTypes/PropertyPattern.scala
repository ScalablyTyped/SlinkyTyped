package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
@js.native
trait PropertyPattern
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var computed: js.UndefOr[Boolean] = js.native
  var key: LiteralKind | IdentifierKind | ExpressionKind = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var pattern: PatternKind = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.PropertyPattern = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.PropertyPattern")
@js.native
object PropertyPattern extends TopLevel[Type[PropertyPattern]]

