package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.AnonFlags
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> */
@js.native
trait JSXText
  extends ASTNode
     with ExpressionKind
     with LiteralKind
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var regex: js.UndefOr[AnonFlags] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.JSXText = js.native
  var value: String = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXText")
@js.native
object JSXText extends TopLevel[Type[JSXText]]

