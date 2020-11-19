package typingsSlinky.reduxOrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object modelMod {
  
  type CreateProps[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */, Fields /* <: typingsSlinky.reduxOrm.modelMod.ModelFields[M] */, MQsKeys /* <: /* keyof redux-orm.redux-orm/helpers.PickByValue<Fields, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ java.lang.String */, OptAttrKeys /* <: typingsSlinky.reduxOrm.modelMod.FieldSpecKeys[M, typingsSlinky.reduxOrm.fieldsMod.AttributeWithDefault] */, OptKeys /* <: MQsKeys | typingsSlinky.reduxOrm.helpersMod.OptionalKeys[Fields] | OptAttrKeys | typingsSlinky.reduxOrm.modelMod.IdKeyOpt[M] */] = typingsSlinky.reduxOrm.modelMod.BlueprintProps[M, typingsSlinky.std.Exclude[/* keyof Fields */ java.lang.String, OptKeys], OptKeys]
  
  type CustomInstanceProps[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */, Props /* <: js.Object */] = typingsSlinky.std.Omit[
    Props, 
    typingsSlinky.std.Extract[
      /* keyof Props */ java.lang.String, 
      typingsSlinky.reduxOrm.helpersMod.KnownKeys[
        typingsSlinky.reduxOrm.modelMod.ModelBlueprint[M, typingsSlinky.std.Required[typingsSlinky.reduxOrm.modelMod.ModelFields[M]]]
      ]
    ]
  ]
  
  type FieldSpecKeys[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */, TField] = typingsSlinky.std.Extract[
    /* keyof redux-orm.redux-orm/Model.ModelFields<M> */ java.lang.String, 
    /* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelClass<M>['fields'], TField> */ java.lang.String
  ]
  
  type IdKey[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */] = typingsSlinky.reduxOrm.tableMod.IdAttribute[typingsSlinky.reduxOrm.modelMod.ModelClass[M]]
  
  type IdKeyOpt[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */] = typingsSlinky.reduxOrm.modelMod.IdKey[M]
  
  type IdOrModelLike[M /* <: typingsSlinky.reduxOrm.modelMod.Model[
    org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel], 
    _
  ] */] = typingsSlinky.reduxOrm.modelMod.IdType[M] | typingsSlinky.reduxOrm.anon.GetId[M]
  
  type IdType[M /* <: typingsSlinky.reduxOrm.modelMod.Model[
    org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel], 
    _
  ] */] = scala.Double | (/* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[any] */ js.Any)
  
  type ModelBlueprint[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */, Fields /* <: typingsSlinky.std.Required[typingsSlinky.reduxOrm.modelMod.ModelFields[M]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Fields ]: Fields[K] extends redux-orm.redux-orm/Model.AnyModel? redux-orm.redux-orm/Model.IdOrModelLike<Fields[K]> : Fields[K] extends redux-orm.redux-orm/QuerySet.MutableQuerySet<infer RM, {}>? std.ReadonlyArray<redux-orm.redux-orm/Model.IdOrModelLike<any>> : Fields[K]}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.ModelBlueprint with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type ModelClass[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */] = typingsSlinky.std.ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: M['getClass'] */ js.Any
  ]
  
  type ModelField = (typingsSlinky.reduxOrm.querySetMod.default[js.Any, js.Object]) | (typingsSlinky.reduxOrm.modelMod.SessionBoundModel[js.Any, js.Object]) | typingsSlinky.reduxOrm.modelMod.Serializable
  
  type ModelFields[M /* <: typingsSlinky.reduxOrm.modelMod.Model[
    org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel], 
    _
  ] */] = js.Any
  
  type NonBlueprintKeys[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */] = typingsSlinky.std.Exclude[
    /* keyof redux-orm.redux-orm/helpers.PickByValue<std.Required<redux-orm.redux-orm/Model.ModelFields<M>>, redux-orm.redux-orm/Model.AnyModel | redux-orm.redux-orm/QuerySet.default<any, {}>> */ java.lang.String, 
    (typingsSlinky.reduxOrm.modelMod.FieldSpecKeys[
      M, 
      typingsSlinky.reduxOrm.fieldsMod.OneToOne_ | typingsSlinky.reduxOrm.fieldsMod.ForeignKey
    ]) | (/* keyof redux-orm.redux-orm/helpers.PickByValue<std.Required<redux-orm.redux-orm/Model.ModelFields<M>>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ java.lang.String)
  ]
  
  type Primitive = scala.Double | java.lang.String | scala.Boolean
  
  type Ref[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof redux-orm.redux-orm/Model.RefFields<M, keyof redux-orm.redux-orm/Model.ModelFields<M>> ]: redux-orm.redux-orm/Model.ModelFields<M>[K] extends redux-orm.redux-orm/Model.AnyModel? redux-orm.redux-orm/Model.IdType<redux-orm.redux-orm/Model.ModelFields<M>[K]> : redux-orm.redux-orm/Model.RefFields<M, keyof redux-orm.redux-orm/Model.ModelFields<M>>[K]}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.Ref with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type RefFields[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */, K /* <: /* keyof redux-orm.redux-orm/Model.ModelFields<M> */ java.lang.String */] = typingsSlinky.std.Omit[
    typingsSlinky.reduxOrm.modelMod.ModelFields[M], 
    typingsSlinky.std.Extract[
      K, 
      typingsSlinky.reduxOrm.modelMod.FieldSpecKeys[M, typingsSlinky.reduxOrm.fieldsMod.ManyToMany]
    ]
  ]
  
  type RefPropOrSimple[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */, K /* <: java.lang.String */] = typingsSlinky.reduxOrm.modelMod.Serializable | (/* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.Ref<M>[K] */ js.Any)
  
  type Serializable = js.UndefOr[
    typingsSlinky.reduxOrm.modelMod.Primitive | js.Array[typingsSlinky.reduxOrm.modelMod.Primitive] | (org.scalablytyped.runtime.StringDictionary[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux-orm.redux-orm/Model.Serializable */ js.Object) | (js.Array[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux-orm.redux-orm/Model.Serializable */ js.Object
      ])
    ])
  ]
  
  type SessionBoundModel[M /* <: typingsSlinky.reduxOrm.modelMod.Model[
    org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel], 
    _
  ] */, InstanceProps /* <: js.Object */] = M with typingsSlinky.reduxOrm.reduxOrmStrings.SessionBoundModel with org.scalablytyped.runtime.TopLevel[js.Any] with InstanceProps
  
  type SessionBoundModelField[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */, K /* <: /* keyof redux-orm.redux-orm/Model.ModelFields<M> */ java.lang.String */] = (/* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[K] */ js.Any) | (typingsSlinky.reduxOrm.modelMod.SessionBoundModel[
    /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[K] */ js.Any, 
    js.Object
  ])
  
  type UpdateProps[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */] = typingsSlinky.reduxOrm.modelMod.BlueprintProps[
    M, 
    scala.Nothing, 
    typingsSlinky.std.Exclude[
      /* keyof redux-orm.redux-orm/Model.ModelBlueprint<M, std.Required<redux-orm.redux-orm/Model.ModelFields<M>>> */ java.lang.String, 
      typingsSlinky.reduxOrm.modelMod.IdKey[M]
    ]
  ]
  
  type UpsertProps[M /* <: typingsSlinky.reduxOrm.modelMod.AnyModel */] = typingsSlinky.reduxOrm.modelMod.BlueprintProps[
    M, 
    typingsSlinky.reduxOrm.modelMod.IdKey[M], 
    typingsSlinky.std.Exclude[
      /* keyof redux-orm.redux-orm/Model.ModelBlueprint<M, std.Required<redux-orm.redux-orm/Model.ModelFields<M>>> */ java.lang.String, 
      typingsSlinky.reduxOrm.modelMod.IdKey[M]
    ]
  ]
}
