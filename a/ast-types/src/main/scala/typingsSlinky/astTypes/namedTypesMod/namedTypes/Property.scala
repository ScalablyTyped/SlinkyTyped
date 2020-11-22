package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.init
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DecoratorKind
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
@js.native
trait Property
  extends ASTNode
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var computed: js.UndefOr[Boolean] = js.native
  
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.native
  
  var key: LiteralKind | IdentifierKind | ExpressionKind = js.native
  
  var kind: init | get | set = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var method: js.UndefOr[Boolean] = js.native
  
  var shorthand: js.UndefOr[Boolean] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.Property = js.native
  
  var value: ExpressionKind | PatternKind = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.Property")
@js.native
object Property extends TopLevel[Type[Property]]
