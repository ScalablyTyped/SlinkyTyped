package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.VarianceKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait ObjectTypeProperty
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var key: LiteralKind | IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var optional: Boolean
  var `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeProperty
  var value: FlowTypeKind
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeProperty")
@js.native
object ObjectTypeProperty extends TopLevel[Type[ObjectTypeProperty]]

