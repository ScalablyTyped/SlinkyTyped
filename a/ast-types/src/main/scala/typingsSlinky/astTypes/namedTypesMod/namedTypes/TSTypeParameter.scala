package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Identifier, 'type' | 'name'> */
@js.native
trait TSTypeParameter
  extends ASTNode
     with ExpressionKind
     with IdentifierKind
     with NodeKind
     with PatternKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var constraint: js.UndefOr[TSTypeKind] = js.native
  var default: js.UndefOr[TSTypeKind] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var name: String = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameter = js.native
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeParameter")
@js.native
object TSTypeParameter extends TopLevel[Type[TSTypeParameter]]

