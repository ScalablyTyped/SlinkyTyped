package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeIndexerKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeInternalSlotKind
import typingsSlinky.astTypes.kindsMod.ObjectTypePropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> */
@js.native
trait ObjectTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  
  var callProperties: js.UndefOr[js.Array[ObjectTypeCallPropertyKind]] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var exact: js.UndefOr[Boolean] = js.native
  
  var indexers: js.UndefOr[js.Array[ObjectTypeIndexerKind]] = js.native
  
  var inexact: js.UndefOr[Boolean] = js.native
  
  var internalSlots: js.UndefOr[js.Array[ObjectTypeInternalSlotKind]] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeAnnotation = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeAnnotation")
@js.native
object ObjectTypeAnnotation extends TopLevel[Type[ObjectTypeAnnotation]]
