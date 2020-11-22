package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.anon.Flags
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> */
@js.native
trait RegExpLiteral
  extends ASTNode
     with ExpressionKind
     with LiteralKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var flags: String = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var pattern: String = js.native
  
  var regex: js.UndefOr[Flags | Null] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.RegExpLiteral = js.native
  
  var value: js.UndefOr[js.RegExp] = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.RegExpLiteral")
@js.native
object RegExpLiteral extends TopLevel[Type[RegExpLiteral]]
