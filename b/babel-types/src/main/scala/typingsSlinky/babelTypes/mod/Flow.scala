package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.AnyTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.BooleanTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ClassImplements
import typingsSlinky.babelTypes.babelTypesStrings.ClassProperty
import typingsSlinky.babelTypes.babelTypesStrings.DeclareClass
import typingsSlinky.babelTypes.babelTypesStrings.DeclareFunction
import typingsSlinky.babelTypes.babelTypesStrings.DeclareInterface
import typingsSlinky.babelTypes.babelTypesStrings.DeclareModule
import typingsSlinky.babelTypes.babelTypesStrings.DeclareTypeAlias
import typingsSlinky.babelTypes.babelTypesStrings.DeclareVariable
import typingsSlinky.babelTypes.babelTypesStrings.ExistentialTypeParam
import typingsSlinky.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.FunctionTypeParam
import typingsSlinky.babelTypes.babelTypesStrings.GenericTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.InterfaceDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.InterfaceExtends
import typingsSlinky.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.MixedTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NullableTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NumberTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NumericLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeIndexer
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeProperty
import typingsSlinky.babelTypes.babelTypesStrings.QualifiedTypeIdentifier
import typingsSlinky.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.StringTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ThisTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.TupleTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.TypeAlias
import typingsSlinky.babelTypes.babelTypesStrings.TypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.TypeCastExpression
import typingsSlinky.babelTypes.babelTypesStrings.TypeParameterDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.TypeParameterInstantiation
import typingsSlinky.babelTypes.babelTypesStrings.TypeofTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.UnionTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.VoidTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.AnyTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ArrayTypeAnnotation_
  - typingsSlinky.babelTypes.mod.BooleanTypeAnnotation_
  - typingsSlinky.babelTypes.mod.BooleanLiteralTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ClassImplements_
  - typingsSlinky.babelTypes.mod.ClassProperty_
  - typingsSlinky.babelTypes.mod.DeclareClass_
  - typingsSlinky.babelTypes.mod.DeclareFunction_
  - typingsSlinky.babelTypes.mod.DeclareInterface_
  - typingsSlinky.babelTypes.mod.DeclareModule_
  - typingsSlinky.babelTypes.mod.DeclareTypeAlias_
  - typingsSlinky.babelTypes.mod.DeclareVariable_
  - typingsSlinky.babelTypes.mod.ExistentialTypeParam_
  - typingsSlinky.babelTypes.mod.FunctionTypeAnnotation_
  - typingsSlinky.babelTypes.mod.FunctionTypeParam_
  - typingsSlinky.babelTypes.mod.GenericTypeAnnotation_
  - typingsSlinky.babelTypes.mod.InterfaceExtends_
  - typingsSlinky.babelTypes.mod.InterfaceDeclaration_
  - typingsSlinky.babelTypes.mod.IntersectionTypeAnnotation_
  - typingsSlinky.babelTypes.mod.MixedTypeAnnotation_
  - typingsSlinky.babelTypes.mod.NullableTypeAnnotation_
  - typingsSlinky.babelTypes.mod.NumericLiteralTypeAnnotation_
  - typingsSlinky.babelTypes.mod.NumberTypeAnnotation_
  - typingsSlinky.babelTypes.mod.StringLiteralTypeAnnotation_
  - typingsSlinky.babelTypes.mod.StringTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ThisTypeAnnotation_
  - typingsSlinky.babelTypes.mod.TupleTypeAnnotation_
  - typingsSlinky.babelTypes.mod.TypeofTypeAnnotation_
  - typingsSlinky.babelTypes.mod.TypeAlias_
  - typingsSlinky.babelTypes.mod.TypeAnnotation_
  - typingsSlinky.babelTypes.mod.TypeCastExpression_
  - typingsSlinky.babelTypes.mod.TypeParameterDeclaration_
  - typingsSlinky.babelTypes.mod.TypeParameterInstantiation_
  - typingsSlinky.babelTypes.mod.ObjectTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ObjectTypeCallProperty_
  - typingsSlinky.babelTypes.mod.ObjectTypeIndexer_
  - typingsSlinky.babelTypes.mod.ObjectTypeProperty_
  - typingsSlinky.babelTypes.mod.QualifiedTypeIdentifier_
  - typingsSlinky.babelTypes.mod.UnionTypeAnnotation_
  - typingsSlinky.babelTypes.mod.VoidTypeAnnotation_
*/
trait Flow extends js.Object
object Flow {
  
  @scala.inline
  def NullableTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: NullableTypeAnnotation,
    typeAnnotation: FlowTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def ObjectTypeCallProperty_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeCallProperty,
    value: FlowTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def InterfaceDeclaration_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: InterfaceDeclaration,
    typeParameters: TypeParameterDeclaration_
  ): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def ObjectTypeAnnotation_(
    callProperties: js.Array[ObjectTypeCallProperty_],
    end: Double,
    indexers: js.Array[ObjectTypeIndexer_],
    loc: SourceLocation,
    properties: js.Array[ObjectTypeProperty_],
    start: Double,
    `type`: ObjectTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def BooleanTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: BooleanTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def ArrayTypeAnnotation_(
    elementType: FlowTypeAnnotation,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ArrayTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def TypeofTypeAnnotation_(
    argument: FlowTypeAnnotation,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: TypeofTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def AnyTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: AnyTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def UnionTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: UnionTypeAnnotation,
    types: js.Array[FlowTypeAnnotation]
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def DeclareModule_(
    body: BlockStatement_,
    end: Double,
    id: StringLiteral_ | Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: DeclareModule
  ): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def DeclareTypeAlias_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    `type`: DeclareTypeAlias,
    typeParameters: TypeParameterDeclaration_
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def InterfaceExtends_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: InterfaceExtends,
    typeParameters: TypeParameterInstantiation_
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def ExistentialTypeParam_(end: Double, loc: SourceLocation, start: Double, `type`: ExistentialTypeParam): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def DeclareVariable_(end: Double, id: Identifier_, loc: SourceLocation, start: Double, `type`: DeclareVariable): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def TypeParameterDeclaration_(
    end: Double,
    loc: SourceLocation,
    params: js.Array[Identifier_],
    start: Double,
    `type`: TypeParameterDeclaration
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def VoidTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: VoidTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def DeclareInterface_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: DeclareInterface,
    typeParameters: TypeParameterDeclaration_
  ): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def NumberTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: NumberTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def TypeParameterInstantiation_(
    end: Double,
    loc: SourceLocation,
    params: js.Array[FlowTypeAnnotation],
    start: Double,
    `type`: TypeParameterInstantiation
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def StringLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: StringLiteralTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def GenericTypeAnnotation_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: GenericTypeAnnotation,
    typeParameters: TypeParameterInstantiation_
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def FunctionTypeParam_(
    end: Double,
    loc: SourceLocation,
    name: Identifier_,
    start: Double,
    `type`: FunctionTypeParam,
    typeAnnotation: FlowTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def ObjectTypeProperty_(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeProperty,
    value: FlowTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def IntersectionTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: IntersectionTypeAnnotation,
    types: js.Array[FlowTypeAnnotation]
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def StringTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: StringTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def BooleanLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: BooleanLiteralTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def MixedTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: MixedTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def DeclareFunction_(end: Double, id: Identifier_, loc: SourceLocation, start: Double, `type`: DeclareFunction): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def QualifiedTypeIdentifier_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    qualification: Identifier_ | typingsSlinky.babelTypes.mod.QualifiedTypeIdentifier_,
    start: Double,
    `type`: QualifiedTypeIdentifier
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def ThisTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: ThisTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def TypeAlias_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    `type`: TypeAlias,
    typeParameters: TypeParameterDeclaration_
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def ClassProperty_(
    end: Double,
    key: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ClassProperty,
    value: Expression
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def FunctionTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    params: js.Array[FunctionTypeParam_],
    rest: FunctionTypeParam_,
    returnType: FlowTypeAnnotation,
    start: Double,
    `type`: FunctionTypeAnnotation,
    typeParameters: TypeParameterDeclaration_
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def DeclareClass_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: DeclareClass,
    typeParameters: TypeParameterDeclaration_
  ): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def TupleTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: TupleTypeAnnotation,
    types: js.Array[FlowTypeAnnotation]
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def ClassImplements_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ClassImplements,
    typeParameters: TypeParameterInstantiation_
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def TypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: TypeAnnotation,
    typeAnnotation: FlowTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def TypeCastExpression_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: TypeCastExpression,
    typeAnnotation: FlowTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def ObjectTypeIndexer_(
    end: Double,
    id: Expression,
    key: FlowTypeAnnotation,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeIndexer,
    value: FlowTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  def NumericLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, `type`: NumericLiteralTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
}
