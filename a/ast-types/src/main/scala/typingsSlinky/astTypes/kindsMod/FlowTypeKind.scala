package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
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
*/
trait FlowTypeKind extends StObject
object FlowTypeKind {
  
  @scala.inline
  def AnyTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.AnyTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation]
  }
  
  @scala.inline
  def ArrayTypeAnnotation(elementType: FlowTypeKind, `type`: typingsSlinky.astTypes.astTypesStrings.ArrayTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation]
  }
  
  @scala.inline
  def BigIntLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.BigIntLiteralTypeAnnotation,
    value: Null
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation]
  }
  
  @scala.inline
  def BigIntTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.BigIntTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation]
  }
  
  @scala.inline
  def BooleanLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.BooleanLiteralTypeAnnotation,
    value: Boolean
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation]
  }
  
  @scala.inline
  def BooleanTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.BooleanTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation]
  }
  
  @scala.inline
  def EmptyTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.EmptyTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation]
  }
  
  @scala.inline
  def ExistentialTypeParam(`type`: typingsSlinky.astTypes.astTypesStrings.ExistentialTypeParam): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam]
  }
  
  @scala.inline
  def ExistsTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.ExistsTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation]
  }
  
  @scala.inline
  def FunctionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionTypeAnnotation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation]
  }
  
  @scala.inline
  def GenericTypeAnnotation(
    id: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.GenericTypeAnnotation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation]
  }
  
  @scala.inline
  def InterfaceTypeAnnotation(
    body: ObjectTypeAnnotationKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.InterfaceTypeAnnotation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation]
  }
  
  @scala.inline
  def IntersectionTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.IntersectionTypeAnnotation,
    types: js.Array[FlowTypeKind]
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation]
  }
  
  @scala.inline
  def MemberTypeAnnotation(
    `object`: IdentifierKind,
    property: MemberTypeAnnotationKind | GenericTypeAnnotationKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.MemberTypeAnnotation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation]
  }
  
  @scala.inline
  def MixedTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.MixedTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation]
  }
  
  @scala.inline
  def NullLiteralTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.NullLiteralTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation]
  }
  
  @scala.inline
  def NullTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.NullTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation]
  }
  
  @scala.inline
  def NullableTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.NullableTypeAnnotation,
    typeAnnotation: FlowTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation]
  }
  
  @scala.inline
  def NumberLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.NumberLiteralTypeAnnotation,
    value: Double
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation]
  }
  
  @scala.inline
  def NumberTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.NumberTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation]
  }
  
  @scala.inline
  def NumericLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.NumericLiteralTypeAnnotation,
    value: Double
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation]
  }
  
  @scala.inline
  def ObjectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeAnnotation
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation]
  }
  
  @scala.inline
  def StringLiteralTypeAnnotation(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.StringLiteralTypeAnnotation,
    value: String
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation]
  }
  
  @scala.inline
  def StringTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.StringTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation]
  }
  
  @scala.inline
  def SymbolTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.SymbolTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation]
  }
  
  @scala.inline
  def ThisTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.ThisTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation]
  }
  
  @scala.inline
  def TupleTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.TupleTypeAnnotation, types: js.Array[FlowTypeKind]): typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation]
  }
  
  @scala.inline
  def TypeParameter(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameter): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeParameter]
  }
  
  @scala.inline
  def TypeofTypeAnnotation(argument: FlowTypeKind, `type`: typingsSlinky.astTypes.astTypesStrings.TypeofTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation]
  }
  
  @scala.inline
  def UnionTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.UnionTypeAnnotation, types: js.Array[FlowTypeKind]): typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation]
  }
  
  @scala.inline
  def VoidTypeAnnotation(`type`: typingsSlinky.astTypes.astTypesStrings.VoidTypeAnnotation): typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation]
  }
}
