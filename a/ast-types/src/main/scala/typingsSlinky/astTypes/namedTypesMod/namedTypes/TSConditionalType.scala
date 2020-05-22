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
trait TSConditionalType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var checkType: TSTypeKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var extendsType: TSTypeKind
  var falseType: TSTypeKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var trueType: TSTypeKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSConditionalType
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSConditionalType")
@js.native
object TSConditionalType extends TopLevel[Type[TSConditionalType]]

