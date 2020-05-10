package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.AnonFlags
import typingsSlinky.astTypes.AnonRawString
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
trait BigIntLiteral
  extends ASTNode
     with ExpressionKind
     with LiteralKind
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var extra: js.UndefOr[AnonRawString] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var regex: js.UndefOr[AnonFlags] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.BigIntLiteral = js.native
  var value: String | Double = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BigIntLiteral")
@js.native
object BigIntLiteral extends TopLevel[Type[BigIntLiteral]]

