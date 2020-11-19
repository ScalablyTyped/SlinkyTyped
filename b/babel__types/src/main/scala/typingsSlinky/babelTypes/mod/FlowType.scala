package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.AnyTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.BooleanTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.EmptyTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ExistsTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.GenericTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.InterfaceTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.MixedTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NullLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NullableTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NumberLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.NumberTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.StringTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.SymbolTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.ThisTypeAnnotation
import typingsSlinky.babelTypes.babelTypesStrings.TupleTypeAnnotation
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
  - typingsSlinky.babelTypes.mod.NullLiteralTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ExistsTypeAnnotation_
  - typingsSlinky.babelTypes.mod.FunctionTypeAnnotation_
  - typingsSlinky.babelTypes.mod.GenericTypeAnnotation_
  - typingsSlinky.babelTypes.mod.InterfaceTypeAnnotation_
  - typingsSlinky.babelTypes.mod.IntersectionTypeAnnotation_
  - typingsSlinky.babelTypes.mod.MixedTypeAnnotation_
  - typingsSlinky.babelTypes.mod.EmptyTypeAnnotation_
  - typingsSlinky.babelTypes.mod.NullableTypeAnnotation_
  - typingsSlinky.babelTypes.mod.NumberLiteralTypeAnnotation_
  - typingsSlinky.babelTypes.mod.NumberTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ObjectTypeAnnotation_
  - typingsSlinky.babelTypes.mod.StringLiteralTypeAnnotation_
  - typingsSlinky.babelTypes.mod.StringTypeAnnotation_
  - typingsSlinky.babelTypes.mod.SymbolTypeAnnotation_
  - typingsSlinky.babelTypes.mod.ThisTypeAnnotation_
  - typingsSlinky.babelTypes.mod.TupleTypeAnnotation_
  - typingsSlinky.babelTypes.mod.TypeofTypeAnnotation_
  - typingsSlinky.babelTypes.mod.UnionTypeAnnotation_
  - typingsSlinky.babelTypes.mod.VoidTypeAnnotation_
*/
trait FlowType extends _Node
object FlowType {
  
  @scala.inline
  def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_, `type`: InterfaceTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def NullableTypeAnnotation_(`type`: NullableTypeAnnotation, typeAnnotation: FlowType): FlowType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def NullLiteralTypeAnnotation_(`type`: NullLiteralTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def SymbolTypeAnnotation_(`type`: SymbolTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def ObjectTypeAnnotation_(
    exact: Boolean,
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
    `type`: ObjectTypeAnnotation
  ): FlowType = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def BooleanTypeAnnotation_(`type`: BooleanTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def ArrayTypeAnnotation_(elementType: FlowType, `type`: ArrayTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def TypeofTypeAnnotation_(argument: FlowType, `type`: TypeofTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def AnyTypeAnnotation_(`type`: AnyTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def UnionTypeAnnotation_(`type`: UnionTypeAnnotation, types: js.Array[FlowType]): FlowType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def VoidTypeAnnotation_(`type`: VoidTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def NumberTypeAnnotation_(`type`: NumberTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def StringLiteralTypeAnnotation_(`type`: StringLiteralTypeAnnotation, value: String): FlowType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_, `type`: GenericTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def NumberLiteralTypeAnnotation_(`type`: NumberLiteralTypeAnnotation, value: Double): FlowType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def IntersectionTypeAnnotation_(`type`: IntersectionTypeAnnotation, types: js.Array[FlowType]): FlowType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def StringTypeAnnotation_(`type`: StringTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def BooleanLiteralTypeAnnotation_(`type`: BooleanLiteralTypeAnnotation, value: Boolean): FlowType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def MixedTypeAnnotation_(`type`: MixedTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def ExistsTypeAnnotation_(`type`: ExistsTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def ThisTypeAnnotation_(`type`: ThisTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType, `type`: FunctionTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def TupleTypeAnnotation_(`type`: TupleTypeAnnotation, types: js.Array[FlowType]): FlowType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  
  @scala.inline
  def EmptyTypeAnnotation_(`type`: EmptyTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
}
