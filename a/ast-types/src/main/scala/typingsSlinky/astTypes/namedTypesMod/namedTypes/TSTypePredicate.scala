package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSThisTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSTypeAnnotation, 'type' | 'typeAnnotation'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> */
@js.native
trait TSTypePredicate
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeAnnotationKind
     with TSTypeKind {
  
  var asserts: js.UndefOr[Boolean] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var parameterName: IdentifierKind | TSThisTypeKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTypePredicate = js.native
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotationKind | Null] = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypePredicate")
@js.native
object TSTypePredicate extends TopLevel[Type[TSTypePredicate]]
