package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
trait ContinueStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var label: js.UndefOr[IdentifierKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.ContinueStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ContinueStatement")
@js.native
object ContinueStatement extends TopLevel[Type[ContinueStatement]]

