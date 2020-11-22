package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.OpaqueTypeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.OpaqueType, 'type' | 'impltype'> */
@js.native
trait DeclareOpaqueType
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with OpaqueTypeKind
     with PrintableKind
     with StatementKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var id: IdentifierKind = js.native
  
  var impltype: FlowTypeKind | Null = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var supertype: js.UndefOr[FlowTypeKind | Null] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclareOpaqueType = js.native
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | Null] = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareOpaqueType")
@js.native
object DeclareOpaqueType extends TopLevel[Type[DeclareOpaqueType]]
