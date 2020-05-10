package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
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

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
@js.native
trait AssignmentPattern
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var left: PatternKind = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var right: ExpressionKind = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.AssignmentPattern = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.AssignmentPattern")
@js.native
object AssignmentPattern extends TopLevel[Type[AssignmentPattern]]

