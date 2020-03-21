package typingsSlinky.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type As[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function1[/* alias */ java.lang.String, typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]]
  type BluebirdMapper[T, Result] = js.Function2[/* item */ T, /* index */ scala.Double, Result]
  type ColumnRef = java.lang.String | typingsSlinky.objection.mod.Raw_ | typingsSlinky.objection.mod.Reference | (typingsSlinky.objection.mod.QueryBuilder[
    js.Any, 
    js.Array[js.Any], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
  ])
  type DeepPartialGraph[T] = T | typingsSlinky.objection.mod.DeepPartialGraphModel[T] | (typingsSlinky.objection.mod.DeepPartialGraphArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  type DeepPartialGraphModel[T] = (typingsSlinky.objection.mod.GraphModel[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in objection.objection.NonFunctionPropertyNames<T> ]:? objection.objection.DeepPartialGraph<T[P]>}
    */ typingsSlinky.objection.objectionStrings.DeepPartialGraphModel with T
  ]) | typingsSlinky.std.Partial[T]
  type Distinct[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = typingsSlinky.objection.mod.ColumnNamesMethod[QM, RM, RV]
  type ErrorHash = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.objection.mod.ValidationErrorItem]]
  /**
    * @see http://vincit.github.io/objection.js/#fieldexpression
    */
  type FieldExpression = java.lang.String
  type FilterExpression[QM /* <: typingsSlinky.objection.mod.Model */] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.objection.mod.FilterFunction[QM]]
  type FilterFunction[QM /* <: typingsSlinky.objection.mod.Model */] = js.ThisFunction1[
    /* this */ typingsSlinky.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    /* queryBuilder */ typingsSlinky.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    scala.Unit
  ]
  type Filters[QM /* <: typingsSlinky.objection.mod.Model */] = org.scalablytyped.runtime.StringDictionary[
    js.ThisFunction1[
      /* this */ typingsSlinky.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      /* queryBuilder */ typingsSlinky.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ]
  ]
  type GraphModel[T] = (typingsSlinky.objection.AnonId with T) | (typingsSlinky.objection.AnonRef with typingsSlinky.objection.objectionStrings.GraphModel with js.Any) | (typingsSlinky.objection.AnonDbRef with typingsSlinky.objection.objectionStrings.GraphModel with js.Any)
  type Id = java.lang.String | scala.Double
  type IdOrIds = typingsSlinky.objection.mod.Id | typingsSlinky.objection.mod.Ids
  type Ids = js.Array[typingsSlinky.objection.mod.Id]
  type JoinRaw[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function2[
    /* sql */ java.lang.String, 
    /* bindings */ js.UndefOr[js.Any], 
    typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type JoinRelation = js.Function2[
    /* expr */ typingsSlinky.objection.mod.RelationExpression, 
    /* opt */ js.UndefOr[typingsSlinky.objection.mod.RelationOptions], 
    typingsSlinky.objection.mod.QueryBuilder[
      typingsSlinky.objection.mod.Model, 
      js.Array[typingsSlinky.objection.mod.Model], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ]
  ]
  type JsonObjectOrFieldExpression = js.Object | js.Array[js.Object] | typingsSlinky.objection.mod.FieldExpression
  type Literal = typingsSlinky.objection.mod.Castable
  type LiteralBuilder = js.Function1[
    /* value */ typingsSlinky.objection.mod.Value | typingsSlinky.objection.mod.LiteralObject, 
    typingsSlinky.objection.mod.Literal
  ]
  type LiteralObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.objection.mod.Value]
  type Modifiers = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* builder */ typingsSlinky.objection.mod.QueryBuilder[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ]
  ]
  type NodeStyleCallback = js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Any], scala.Unit]
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type PartialUpdate[QM /* <: typingsSlinky.objection.mod.Model */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof QM ]:? QM[P] | objection.objection.Raw | objection.objection.Reference | objection.objection.QueryBuilder<any, std.Array<any>, / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV * / any>}
    */ typingsSlinky.objection.objectionStrings.PartialUpdate with QM
  type Plugin = js.Function1[
    /* modelClass */ typingsSlinky.objection.TypeofModel, 
    typingsSlinky.objection.TypeofModel
  ]
  type Pojo = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Properties = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type QBOrCallback[QM /* <: typingsSlinky.objection.mod.Model */] = (typingsSlinky.objection.mod.QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
  ]) | (js.ThisFunction1[
    /* this */ typingsSlinky.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    /* queryBuilder */ typingsSlinky.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    scala.Unit
  ])
  type QueryBuilderYieldingOne[QM /* <: typingsSlinky.objection.mod.Model */] = typingsSlinky.objection.mod.QueryBuilder[QM, QM, QM]
  type QueryBuilderYieldingOneOrNone[QM /* <: typingsSlinky.objection.mod.Model */] = typingsSlinky.objection.mod.QueryBuilder[QM, QM, js.UndefOr[QM]]
  type Raw_ = typingsSlinky.knex.mod.Raw[js.Any]
  type Reference = typingsSlinky.objection.mod.Castable
  type ReferenceBuilder = js.Function1[/* expression */ java.lang.String, typingsSlinky.objection.mod.Reference]
  /**
    * @see http://vincit.github.io/objection.js/#relationexpression
    */
  type RelationExpression = java.lang.String | js.Object
  type RelationExpressionMethod[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function1[
    /* relationExpression */ typingsSlinky.objection.mod.RelationExpression, 
    typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type RelationMappings = org.scalablytyped.runtime.StringDictionary[typingsSlinky.objection.mod.RelationMapping]
  type Select[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = typingsSlinky.objection.mod.ColumnNamesMethod[QM, RM, RV]
  type TableName = java.lang.String | typingsSlinky.objection.mod.Raw_ | typingsSlinky.objection.mod.Reference | (typingsSlinky.objection.mod.QueryBuilder[
    js.Any, 
    js.Array[js.Any], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
  ])
  type TraverserFunction = js.Function3[
    /* model */ typingsSlinky.objection.mod.Model, 
    /* parentModel */ typingsSlinky.objection.mod.Model, 
    /* relationName */ java.lang.String, 
    scala.Unit
  ]
  type ValidatorContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  //
  // Partial revision of
  // https://raw.githubusercontent.com/DefinitelyTyped/DefinitelyTyped/master/types/knex/index.d.ts,
  // to change the signatures to return Objection's typed QueryBuilder wrapper:
  //
  type Value = java.lang.String | scala.Double | scala.Boolean | js.Date | (js.Array[scala.Boolean | js.Date | scala.Double | java.lang.String]) | scala.Null | typingsSlinky.node.Buffer | typingsSlinky.objection.mod.Raw_ | typingsSlinky.objection.mod.Literal
  type WhereBetween[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function2[
    /* column */ typingsSlinky.objection.mod.ColumnRef, 
    /* range */ js.Tuple2[typingsSlinky.objection.mod.Value, typingsSlinky.objection.mod.Value], 
    typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereFieldExpression[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function1[
    /* fieldExpression */ typingsSlinky.objection.mod.FieldExpression, 
    typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereJson[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function2[
    /* fieldExpression */ typingsSlinky.objection.mod.FieldExpression, 
    /* jsonObjectOrFieldExpression */ typingsSlinky.objection.mod.JsonObjectOrFieldExpression, 
    typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereJsonExpression[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function2[
    /* fieldExpression */ typingsSlinky.objection.mod.FieldExpression, 
    /* keys */ java.lang.String | js.Array[java.lang.String], 
    typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereJsonField[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function3[
    /* fieldExpression */ typingsSlinky.objection.mod.FieldExpression, 
    /* operator */ java.lang.String, 
    /* value */ scala.Boolean | scala.Double | java.lang.String | scala.Null, 
    typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereNull[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function1[
    /* column */ typingsSlinky.objection.mod.ColumnRef, 
    typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereWrapped[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function1[
    /* callback */ js.Function1[
      /* queryBuilder */ typingsSlinky.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ], 
    typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WithWrapped[QM /* <: typingsSlinky.objection.mod.Model */, RM, RV] = js.Function2[
    /* alias */ java.lang.String, 
    /* callback */ js.Function1[
      /* queryBuilder */ typingsSlinky.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      js.Any
    ], 
    typingsSlinky.objection.mod.QueryBuilder[QM, RM, RV]
  ]
}
