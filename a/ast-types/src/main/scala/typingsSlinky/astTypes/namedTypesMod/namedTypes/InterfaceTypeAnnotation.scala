package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> */
@js.native
trait InterfaceTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  var body: ObjectTypeAnnotationKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var `extends`: js.UndefOr[js.Array[InterfaceExtendsKind] | Null] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.InterfaceTypeAnnotation = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.InterfaceTypeAnnotation")
@js.native
object InterfaceTypeAnnotation extends TopLevel[Type[InterfaceTypeAnnotation]]

