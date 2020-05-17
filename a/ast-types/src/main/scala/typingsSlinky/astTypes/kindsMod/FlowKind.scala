package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
import typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
*/
trait FlowKind extends js.Object

object FlowKind {
  @scala.inline
  implicit def apply(value: AnyTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: ArrayTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: BooleanLiteralTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: BooleanTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: DeclaredPredicate): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: EmptyTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: ExistentialTypeParam): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: ExistsTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: FunctionTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: GenericTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: InferredPredicate): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: InterfaceTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: IntersectionTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: MemberTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: MixedTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: NullLiteralTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: NullTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: NullableTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: NumberLiteralTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: NumberTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: NumericLiteralTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: ObjectTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: StringLiteralTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: StringTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: ThisTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: TupleTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: TypeParameter): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: TypeofTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: UnionTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
  @scala.inline
  implicit def apply(value: VoidTypeAnnotation): FlowKind = value.asInstanceOf[FlowKind]
}

