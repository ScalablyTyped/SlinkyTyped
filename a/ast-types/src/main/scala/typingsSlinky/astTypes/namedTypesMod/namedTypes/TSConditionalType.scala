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
trait TSConditionalType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var checkType: TSTypeKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var extendsType: TSTypeKind = js.native
  var falseType: TSTypeKind = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var trueType: TSTypeKind = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSConditionalType = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSConditionalType")
@js.native
object TSConditionalType extends TopLevel[Type[TSConditionalType]]

