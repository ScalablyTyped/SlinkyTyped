package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DirectiveKind
import typingsSlinky.astTypes.kindsMod.InterpreterDirectiveKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait Program
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var body: js.Array[StatementKind]
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var directives: js.UndefOr[js.Array[DirectiveKind]] = js.undefined
  var interpreter: js.UndefOr[InterpreterDirectiveKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.Program
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Program")
@js.native
object Program extends TopLevel[Type[Program]]

