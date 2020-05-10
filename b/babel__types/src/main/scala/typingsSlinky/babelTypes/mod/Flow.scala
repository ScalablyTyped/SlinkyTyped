package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.AnyTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.BooleanTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ClassImplements
import typingsSlinky.babelTypes.babelTypesStrings.DeclareClass
import typingsSlinky.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.DeclareExportDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.DeclareFunction
import typingsSlinky.babelTypes.babelTypesStrings.DeclareInterface
import typingsSlinky.babelTypes.babelTypesStrings.DeclareModule
import typingsSlinky.babelTypes.babelTypesStrings.DeclareModuleExports
import typingsSlinky.babelTypes.babelTypesStrings.DeclareOpaqueType
import typingsSlinky.babelTypes.babelTypesStrings.DeclareTypeAlias
import typingsSlinky.babelTypes.babelTypesStrings.DeclareVariable
import typingsSlinky.babelTypes.babelTypesStrings.DeclaredPredicate
import typingsSlinky.babelTypes.babelTypesStrings.EmptyTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ExistsTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.FunctionTypeParam
import typingsSlinky.babelTypes.babelTypesStrings.GenericTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.InferredPredicate
import typingsSlinky.babelTypes.babelTypesStrings.InterfaceDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.InterfaceExtends
import typingsSlinky.babelTypes.babelTypesStrings.InterfaceTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.MixedTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NullLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NullableTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NumberLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NumberTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeIndexer
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeInternalSlot
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeProperty
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeSpreadProperty
import typingsSlinky.babelTypes.babelTypesStrings.OpaqueType
import typingsSlinky.babelTypes.babelTypesStrings.QualifiedTypeIdentifier
import typingsSlinky.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.StringTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.SymbolTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ThisTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.TupleTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.TypeAlias
import typingsSlinky.babelTypes.babelTypesStrings.TypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.TypeCastExpression
import typingsSlinky.babelTypes.babelTypesStrings.TypeParameter
import typingsSlinky.babelTypes.babelTypesStrings.TypeParameterDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.TypeParameterInstantiation
import typingsSlinky.babelTypes.babelTypesStrings.TypeofTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.UnionTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.Variance
import typingsSlinky.babelTypes.babelTypesStrings.VoidTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.init
import typingsSlinky.babelTypes.babelTypesStrings.minus
import typingsSlinky.babelTypes.babelTypesStrings.plus
import typingsSlinky.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.AnyTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ArrayTypeAnnotation_
  - typingsSlinky.babelTypes.mod.BooleanTypeAnnotation_
  - typingsSlinky.babelTypes.mod.BooleanLiteralTypeAnnotation_
  - typingsSlinky.babelTypes.mod.NullLiteralTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ClassImplements_
  - typingsSlinky.babelTypes.mod.DeclareClass_
  - typingsSlinky.babelTypes.mod.DeclareFunction_
  - typingsSlinky.babelTypes.mod.DeclareInterface_
  - typingsSlinky.babelTypes.mod.DeclareModule_
  - typingsSlinky.babelTypes.mod.DeclareModuleExports_
  - typingsSlinky.babelTypes.mod.DeclareTypeAlias_
  - typingsSlinky.babelTypes.mod.DeclareOpaqueType_
  - typingsSlinky.babelTypes.mod.DeclareVariable_
  - typingsSlinky.babelTypes.mod.DeclareExportDeclaration_
  - typingsSlinky.babelTypes.mod.DeclareExportAllDeclaration_
  - typingsSlinky.babelTypes.mod.DeclaredPredicate_
  - typingsSlinky.babelTypes.mod.ExistsTypeAnnotation_
  - typingsSlinky.babelTypes.mod.FunctionTypeAnnotation_
  - typingsSlinky.babelTypes.mod.FunctionTypeParam_
  - typingsSlinky.babelTypes.mod.GenericTypeAnnotation_
  - typingsSlinky.babelTypes.mod.InferredPredicate_
  - typingsSlinky.babelTypes.mod.InterfaceExtends_
  - typingsSlinky.babelTypes.mod.InterfaceDeclaration_
  - typingsSlinky.babelTypes.mod.InterfaceTypeAnnotation_
  - typingsSlinky.babelTypes.mod.IntersectionTypeAnnotation_
  - typingsSlinky.babelTypes.mod.MixedTypeAnnotation_
  - typingsSlinky.babelTypes.mod.EmptyTypeAnnotation_
  - typingsSlinky.babelTypes.mod.NullableTypeAnnotation_
  - typingsSlinky.babelTypes.mod.NumberLiteralTypeAnnotation_
  - typingsSlinky.babelTypes.mod.NumberTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ObjectTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ObjectTypeInternalSlot_
  - typingsSlinky.babelTypes.mod.ObjectTypeCallProperty_
  - typingsSlinky.babelTypes.mod.ObjectTypeIndexer_
  - typingsSlinky.babelTypes.mod.ObjectTypeProperty_
  - typingsSlinky.babelTypes.mod.ObjectTypeSpreadProperty_
  - typingsSlinky.babelTypes.mod.OpaqueType_
  - typingsSlinky.babelTypes.mod.QualifiedTypeIdentifier_
  - typingsSlinky.babelTypes.mod.StringLiteralTypeAnnotation_
  - typingsSlinky.babelTypes.mod.StringTypeAnnotation_
  - typingsSlinky.babelTypes.mod.SymbolTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ThisTypeAnnotation_
  - typingsSlinky.babelTypes.mod.TupleTypeAnnotation_
  - typingsSlinky.babelTypes.mod.TypeofTypeAnnotation_
  - typingsSlinky.babelTypes.mod.TypeAlias_
  - typingsSlinky.babelTypes.mod.TypeAnnotation_
  - typingsSlinky.babelTypes.mod.TypeCastExpression_
  - typingsSlinky.babelTypes.mod.TypeParameter_
  - typingsSlinky.babelTypes.mod.TypeParameterDeclaration_
  - typingsSlinky.babelTypes.mod.TypeParameterInstantiation_
  - typingsSlinky.babelTypes.mod.UnionTypeAnnotation_
  - typingsSlinky.babelTypes.mod.Variance_
  - typingsSlinky.babelTypes.mod.VoidTypeAnnotation_
*/
trait Flow extends _Node

object Flow {
  @scala.inline
  def DeclareExportAllDeclaration_(source: StringLiteral_, `type`: DeclareExportAllDeclaration): Flow = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_, `type`: InterfaceTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def NullableTypeAnnotation_(`type`: NullableTypeAnnotation, typeAnnotation: FlowType): Flow = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def NullLiteralTypeAnnotation_(`type`: NullLiteralTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def SymbolTypeAnnotation_(`type`: SymbolTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeCallProperty_(static: Boolean, `type`: ObjectTypeCallProperty, value: FlowType): Flow = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: InterfaceDeclaration): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeAnnotation_(
    exact: Boolean,
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
    `type`: ObjectTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def BooleanTypeAnnotation_(`type`: BooleanTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclaredPredicate_(`type`: DeclaredPredicate, value: Flow): Flow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ArrayTypeAnnotation_(elementType: FlowType, `type`: ArrayTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeofTypeAnnotation_(argument: FlowType, `type`: TypeofTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def AnyTypeAnnotation_(`type`: AnyTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def UnionTypeAnnotation_(`type`: UnionTypeAnnotation, types: js.Array[FlowType]): Flow = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_, `type`: DeclareModule): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def Variance_(kind: minus | plus, `type`: Variance): Flow = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareTypeAlias_(id: Identifier_, right: FlowType, `type`: DeclareTypeAlias): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def InterfaceExtends_(id: Identifier_ | QualifiedTypeIdentifier_, `type`: InterfaceExtends): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareModuleExports_(`type`: DeclareModuleExports, typeAnnotation: TypeAnnotation_): Flow = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareVariable_(id: Identifier_, `type`: DeclareVariable): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeParameterDeclaration_(params: js.Array[TypeParameter_], `type`: TypeParameterDeclaration): Flow = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def VoidTypeAnnotation_(`type`: VoidTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareInterface): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def NumberTypeAnnotation_(`type`: NumberTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeParameter_(name: String, `type`: TypeParameter): Flow = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeParameterInstantiation_(params: js.Array[FlowType], `type`: TypeParameterInstantiation): Flow = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def StringLiteralTypeAnnotation_(`type`: StringLiteralTypeAnnotation, value: String): Flow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_, `type`: GenericTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def NumberLiteralTypeAnnotation_(`type`: NumberLiteralTypeAnnotation, value: Double): Flow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def FunctionTypeParam_(`type`: FunctionTypeParam, typeAnnotation: FlowType): Flow = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeProperty_(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    `type`: ObjectTypeProperty,
    value: FlowType
  ): Flow = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def IntersectionTypeAnnotation_(`type`: IntersectionTypeAnnotation, types: js.Array[FlowType]): Flow = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def StringTypeAnnotation_(`type`: StringTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def BooleanLiteralTypeAnnotation_(`type`: BooleanLiteralTypeAnnotation, value: Boolean): Flow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def MixedTypeAnnotation_(`type`: MixedTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def InferredPredicate_(`type`: InferredPredicate): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareFunction_(id: Identifier_, `type`: DeclareFunction): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ExistsTypeAnnotation_(`type`: ExistsTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def OpaqueType_(id: Identifier_, impltype: FlowType, `type`: OpaqueType): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def QualifiedTypeIdentifier_(
    id: Identifier_,
    qualification: Identifier_ | typingsSlinky.babelTypes.mod.QualifiedTypeIdentifier_,
    `type`: QualifiedTypeIdentifier
  ): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ThisTypeAnnotation_(`type`: ThisTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareOpaqueType_(id: Identifier_, `type`: DeclareOpaqueType): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeAlias_(id: Identifier_, right: FlowType, `type`: TypeAlias): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeInternalSlot_(
    id: Identifier_,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: ObjectTypeInternalSlot,
    value: FlowType
  ): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType, `type`: FunctionTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareClass): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TupleTypeAnnotation_(`type`: TupleTypeAnnotation, types: js.Array[FlowType]): Flow = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ClassImplements_(id: Identifier_, `type`: ClassImplements): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeAnnotation_(`type`: TypeAnnotation, typeAnnotation: FlowType): Flow = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareExportDeclaration_(`type`: DeclareExportDeclaration): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeCastExpression_(expression: Expression, `type`: TypeCastExpression, typeAnnotation: TypeAnnotation_): Flow = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeIndexer_(key: FlowType, static: Boolean, `type`: ObjectTypeIndexer, value: FlowType): Flow = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def EmptyTypeAnnotation_(`type`: EmptyTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeSpreadProperty_(argument: FlowType, `type`: ObjectTypeSpreadProperty): Flow = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
}

