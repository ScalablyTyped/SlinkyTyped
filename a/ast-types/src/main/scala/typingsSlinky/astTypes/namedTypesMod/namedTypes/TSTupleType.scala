package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> */
@js.native
trait TSTupleType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var elementTypes: js.Array[TSTypeKind] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTupleType = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTupleType")
@js.native
object TSTupleType extends TopLevel[Type[TSTupleType]]

