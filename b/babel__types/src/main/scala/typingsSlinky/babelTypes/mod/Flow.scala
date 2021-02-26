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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def AnyTypeAnnotation_(`type`: AnyTypeAnnotation): typingsSlinky.babelTypes.mod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.AnyTypeAnnotation_]
  }
  
  @scala.inline
  def ArrayTypeAnnotation_(elementType: FlowType, `type`: ArrayTypeAnnotation): typingsSlinky.babelTypes.mod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ArrayTypeAnnotation_]
  }
  
  @scala.inline
  def BooleanLiteralTypeAnnotation_(`type`: BooleanLiteralTypeAnnotation, value: Boolean): typingsSlinky.babelTypes.mod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.BooleanLiteralTypeAnnotation_]
  }
  
  @scala.inline
  def BooleanTypeAnnotation_(`type`: BooleanTypeAnnotation): typingsSlinky.babelTypes.mod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.BooleanTypeAnnotation_]
  }
  
  @scala.inline
  def ClassImplements_(id: Identifier_, `type`: ClassImplements): typingsSlinky.babelTypes.mod.ClassImplements_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ClassImplements_]
  }
  
  @scala.inline
  def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareClass): typingsSlinky.babelTypes.mod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclareClass_]
  }
  
  @scala.inline
  def DeclareExportAllDeclaration_(source: StringLiteral_, `type`: DeclareExportAllDeclaration): typingsSlinky.babelTypes.mod.DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclareExportAllDeclaration_]
  }
  
  @scala.inline
  def DeclareExportDeclaration_(`type`: DeclareExportDeclaration): typingsSlinky.babelTypes.mod.DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclareExportDeclaration_]
  }
  
  @scala.inline
  def DeclareFunction_(id: Identifier_, `type`: DeclareFunction): typingsSlinky.babelTypes.mod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclareFunction_]
  }
  
  @scala.inline
  def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareInterface): typingsSlinky.babelTypes.mod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclareInterface_]
  }
  
  @scala.inline
  def DeclareModuleExports_(`type`: DeclareModuleExports, typeAnnotation: TypeAnnotation_): typingsSlinky.babelTypes.mod.DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclareModuleExports_]
  }
  
  @scala.inline
  def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_, `type`: DeclareModule): typingsSlinky.babelTypes.mod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclareModule_]
  }
  
  @scala.inline
  def DeclareOpaqueType_(id: Identifier_, `type`: DeclareOpaqueType): typingsSlinky.babelTypes.mod.DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclareOpaqueType_]
  }
  
  @scala.inline
  def DeclareTypeAlias_(id: Identifier_, right: FlowType, `type`: DeclareTypeAlias): typingsSlinky.babelTypes.mod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclareTypeAlias_]
  }
  
  @scala.inline
  def DeclareVariable_(id: Identifier_, `type`: DeclareVariable): typingsSlinky.babelTypes.mod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclareVariable_]
  }
  
  @scala.inline
  def DeclaredPredicate_(`type`: DeclaredPredicate, value: Flow): typingsSlinky.babelTypes.mod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclaredPredicate_]
  }
  
  @scala.inline
  def EmptyTypeAnnotation_(`type`: EmptyTypeAnnotation): typingsSlinky.babelTypes.mod.EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.EmptyTypeAnnotation_]
  }
  
  @scala.inline
  def ExistsTypeAnnotation_(`type`: ExistsTypeAnnotation): typingsSlinky.babelTypes.mod.ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ExistsTypeAnnotation_]
  }
  
  @scala.inline
  def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType, `type`: FunctionTypeAnnotation): typingsSlinky.babelTypes.mod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.FunctionTypeAnnotation_]
  }
  
  @scala.inline
  def FunctionTypeParam_(`type`: FunctionTypeParam, typeAnnotation: FlowType): typingsSlinky.babelTypes.mod.FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.FunctionTypeParam_]
  }
  
  @scala.inline
  def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_, `type`: GenericTypeAnnotation): typingsSlinky.babelTypes.mod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.GenericTypeAnnotation_]
  }
  
  @scala.inline
  def InferredPredicate_(`type`: InferredPredicate): typingsSlinky.babelTypes.mod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.InferredPredicate_]
  }
  
  @scala.inline
  def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: InterfaceDeclaration): typingsSlinky.babelTypes.mod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.InterfaceDeclaration_]
  }
  
  @scala.inline
  def InterfaceExtends_(id: Identifier_ | QualifiedTypeIdentifier_, `type`: InterfaceExtends): typingsSlinky.babelTypes.mod.InterfaceExtends_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.InterfaceExtends_]
  }
  
  @scala.inline
  def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_, `type`: InterfaceTypeAnnotation): typingsSlinky.babelTypes.mod.InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.InterfaceTypeAnnotation_]
  }
  
  @scala.inline
  def IntersectionTypeAnnotation_(`type`: IntersectionTypeAnnotation, types: js.Array[FlowType]): typingsSlinky.babelTypes.mod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.IntersectionTypeAnnotation_]
  }
  
  @scala.inline
  def MixedTypeAnnotation_(`type`: MixedTypeAnnotation): typingsSlinky.babelTypes.mod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.MixedTypeAnnotation_]
  }
  
  @scala.inline
  def NullLiteralTypeAnnotation_(`type`: NullLiteralTypeAnnotation): typingsSlinky.babelTypes.mod.NullLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.NullLiteralTypeAnnotation_]
  }
  
  @scala.inline
  def NullableTypeAnnotation_(`type`: NullableTypeAnnotation, typeAnnotation: FlowType): typingsSlinky.babelTypes.mod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.NullableTypeAnnotation_]
  }
  
  @scala.inline
  def NumberLiteralTypeAnnotation_(`type`: NumberLiteralTypeAnnotation, value: Double): typingsSlinky.babelTypes.mod.NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.NumberLiteralTypeAnnotation_]
  }
  
  @scala.inline
  def NumberTypeAnnotation_(`type`: NumberTypeAnnotation): typingsSlinky.babelTypes.mod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.NumberTypeAnnotation_]
  }
  
  @scala.inline
  def ObjectTypeAnnotation_(
    exact: Boolean,
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
    `type`: ObjectTypeAnnotation
  ): typingsSlinky.babelTypes.mod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ObjectTypeAnnotation_]
  }
  
  @scala.inline
  def ObjectTypeCallProperty_(static: Boolean, `type`: ObjectTypeCallProperty, value: FlowType): typingsSlinky.babelTypes.mod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ObjectTypeCallProperty_]
  }
  
  @scala.inline
  def ObjectTypeIndexer_(key: FlowType, static: Boolean, `type`: ObjectTypeIndexer, value: FlowType): typingsSlinky.babelTypes.mod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ObjectTypeIndexer_]
  }
  
  @scala.inline
  def ObjectTypeInternalSlot_(
    id: Identifier_,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: ObjectTypeInternalSlot,
    value: FlowType
  ): typingsSlinky.babelTypes.mod.ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ObjectTypeInternalSlot_]
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
  ): typingsSlinky.babelTypes.mod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ObjectTypeProperty_]
  }
  
  @scala.inline
  def ObjectTypeSpreadProperty_(argument: FlowType, `type`: ObjectTypeSpreadProperty): typingsSlinky.babelTypes.mod.ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ObjectTypeSpreadProperty_]
  }
  
  @scala.inline
  def OpaqueType_(id: Identifier_, impltype: FlowType, `type`: OpaqueType): typingsSlinky.babelTypes.mod.OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.OpaqueType_]
  }
  
  @scala.inline
  def QualifiedTypeIdentifier_(
    id: Identifier_,
    qualification: Identifier_ | typingsSlinky.babelTypes.mod.QualifiedTypeIdentifier_,
    `type`: QualifiedTypeIdentifier
  ): typingsSlinky.babelTypes.mod.QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.QualifiedTypeIdentifier_]
  }
  
  @scala.inline
  def StringLiteralTypeAnnotation_(`type`: StringLiteralTypeAnnotation, value: String): typingsSlinky.babelTypes.mod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.StringLiteralTypeAnnotation_]
  }
  
  @scala.inline
  def StringTypeAnnotation_(`type`: StringTypeAnnotation): typingsSlinky.babelTypes.mod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.StringTypeAnnotation_]
  }
  
  @scala.inline
  def SymbolTypeAnnotation_(`type`: SymbolTypeAnnotation): typingsSlinky.babelTypes.mod.SymbolTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.SymbolTypeAnnotation_]
  }
  
  @scala.inline
  def ThisTypeAnnotation_(`type`: ThisTypeAnnotation): typingsSlinky.babelTypes.mod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ThisTypeAnnotation_]
  }
  
  @scala.inline
  def TupleTypeAnnotation_(`type`: TupleTypeAnnotation, types: js.Array[FlowType]): typingsSlinky.babelTypes.mod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.TupleTypeAnnotation_]
  }
  
  @scala.inline
  def TypeAlias_(id: Identifier_, right: FlowType, `type`: TypeAlias): typingsSlinky.babelTypes.mod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.TypeAlias_]
  }
  
  @scala.inline
  def TypeAnnotation_(`type`: TypeAnnotation, typeAnnotation: FlowType): typingsSlinky.babelTypes.mod.TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.TypeAnnotation_]
  }
  
  @scala.inline
  def TypeCastExpression_(expression: Expression, `type`: TypeCastExpression, typeAnnotation: TypeAnnotation_): typingsSlinky.babelTypes.mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.TypeCastExpression_]
  }
  
  @scala.inline
  def TypeParameterDeclaration_(params: js.Array[TypeParameter_], `type`: TypeParameterDeclaration): typingsSlinky.babelTypes.mod.TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.TypeParameterDeclaration_]
  }
  
  @scala.inline
  def TypeParameterInstantiation_(params: js.Array[FlowType], `type`: TypeParameterInstantiation): typingsSlinky.babelTypes.mod.TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.TypeParameterInstantiation_]
  }
  
  @scala.inline
  def TypeParameter_(name: String, `type`: TypeParameter): typingsSlinky.babelTypes.mod.TypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.TypeParameter_]
  }
  
  @scala.inline
  def TypeofTypeAnnotation_(argument: FlowType, `type`: TypeofTypeAnnotation): typingsSlinky.babelTypes.mod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.TypeofTypeAnnotation_]
  }
  
  @scala.inline
  def UnionTypeAnnotation_(`type`: UnionTypeAnnotation, types: js.Array[FlowType]): typingsSlinky.babelTypes.mod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.UnionTypeAnnotation_]
  }
  
  @scala.inline
  def Variance_(kind: minus | plus, `type`: Variance): typingsSlinky.babelTypes.mod.Variance_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.Variance_]
  }
  
  @scala.inline
  def VoidTypeAnnotation_(`type`: VoidTypeAnnotation): typingsSlinky.babelTypes.mod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.VoidTypeAnnotation_]
  }
}
