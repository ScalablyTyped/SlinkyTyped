package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
@js.native
trait ForAwaitStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var body: StatementKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var left: VariableDeclarationKind | ExpressionKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var right: ExpressionKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.ForAwaitStatement = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.ForAwaitStatement")
@js.native
object ForAwaitStatement extends TopLevel[Type[ForAwaitStatement]]
