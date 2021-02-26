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
  def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_, `type`: GenericTypeAnnotation): typingsSlinky.babelTypes.mod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.GenericTypeAnnotation_]
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
  def VoidTypeAnnotation_(`type`: VoidTypeAnnotation): typingsSlinky.babelTypes.mod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.VoidTypeAnnotation_]
  }
}
