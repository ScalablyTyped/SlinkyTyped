package typingsSlinky.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait flowVisitors[V] extends js.Object {
  var AnyTypeAnnotation: js.UndefOr[V] = js.native
  var ArrayTypeAnnotation: js.UndefOr[V] = js.native
  var BooleanLiteralTypeAnnotation: js.UndefOr[V] = js.native
  var BooleanTypeAnnotation: js.UndefOr[V] = js.native
  var ClassImplements: js.UndefOr[V] = js.native
  var DeclareClass: js.UndefOr[V] = js.native
  var DeclareFunction: js.UndefOr[V] = js.native
  var DeclareInterface: js.UndefOr[V] = js.native
  var DeclareModule: js.UndefOr[V] = js.native
  var DeclareTypeAlias: js.UndefOr[V] = js.native
  var DeclareVariable: js.UndefOr[V] = js.native
  var FunctionTypeAnnotation: js.UndefOr[V] = js.native
  var FunctionTypeParam: js.UndefOr[V] = js.native
  var GenericTypeAnnotation: js.UndefOr[V] = js.native
  var InterfaceDeclaration: js.UndefOr[V] = js.native
  var InterfaceExtends: js.UndefOr[V] = js.native
  var IntersectionTypeAnnotation: js.UndefOr[V] = js.native
  var MixedTypeAnnotation: js.UndefOr[V] = js.native
  var NullLiteralTypeAnnotation: js.UndefOr[V] = js.native
  var NullableTypeAnnotation: js.UndefOr[V] = js.native
  var NumberTypeAnnotation: js.UndefOr[V] = js.native
  var ObjectTypeAnnotation: js.UndefOr[V] = js.native
  var ObjectTypeCallProperty: js.UndefOr[V] = js.native
  var ObjectTypeIndexer: js.UndefOr[V] = js.native
  var ObjectTypeProperty: js.UndefOr[V] = js.native
  var QualifiedTypeIdentifier: js.UndefOr[V] = js.native
  var StringLiteralTypeAnnotation: js.UndefOr[V] = js.native
  var StringTypeAnnotation: js.UndefOr[V] = js.native
  var ThisTypeAnnotation: js.UndefOr[V] = js.native
  var TupleTypeAnnotation: js.UndefOr[V] = js.native
  var TypeAlias: js.UndefOr[V] = js.native
  var TypeAnnotation: js.UndefOr[V] = js.native
  var TypeCastExpression: js.UndefOr[V] = js.native
  var TypeParameterDeclaration: js.UndefOr[V] = js.native
  var TypeParameterInstantiation: js.UndefOr[V] = js.native
  var TypeofTypeAnnotation: js.UndefOr[V] = js.native
  var UnionTypeAnnotation: js.UndefOr[V] = js.native
  var VoidTypeAnnotation: js.UndefOr[V] = js.native
}

object flowVisitors {
  @scala.inline
  def apply[V](): flowVisitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[flowVisitors[V]]
  }
  @scala.inline
  implicit class flowVisitorsOps[Self[v] <: flowVisitors[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withAnyTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnyTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnyTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanLiteralTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanLiteralTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withClassImplements(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassImplements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassImplements: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassImplements")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareClass(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareClass: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareFunction(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareFunction: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareInterface(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareInterface: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareModule(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareModule: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareModule")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareTypeAlias(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareTypeAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareTypeAlias: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareTypeAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclareVariable(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclareVariable: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclareVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionTypeParam(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionTypeParam: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGenericTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenericTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenericTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenericTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceDeclaration(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceDeclaration: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceExtends(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceExtends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceExtends: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceExtends")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersectionTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntersectionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersectionTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntersectionTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withMixedTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MixedTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixedTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MixedTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withNullLiteralTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullLiteralTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withNullableTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullableTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullableTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NullableTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypeCallProperty(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeCallProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypeCallProperty: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeCallProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypeIndexer(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeIndexer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypeIndexer: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeIndexer")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypeProperty(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypeProperty: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifiedTypeIdentifier(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualifiedTypeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifiedTypeIdentifier: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualifiedTypeIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withStringLiteralTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringLiteralTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringLiteralTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringLiteralTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withStringTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withThisTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThisTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThisTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTupleTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TupleTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTupleTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TupleTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAlias(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAlias: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeCastExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeCastExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeCastExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeCastExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeParameterDeclaration(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeParameterDeclaration: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeParameterInstantiation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterInstantiation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeParameterInstantiation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterInstantiation")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeofTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeofTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeofTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeofTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withUnionTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnionTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnionTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnionTypeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVoidTypeAnnotation(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoidTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoidTypeAnnotation: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoidTypeAnnotation")(js.undefined)
        ret
    }
  }
  
}

