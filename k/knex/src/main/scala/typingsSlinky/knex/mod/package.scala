package typingsSlinky.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AggregationQueryResult[TResult, TIntersectProps2] = typingsSlinky.knex.mod.ArrayIfAlready[
    TResult, 
    TIntersectProps2 | (typingsSlinky.knex.mod.DeferredKeySelection[
      js.Any | js.Object, 
      js.Any | scala.Nothing, 
      typingsSlinky.knex.knexBooleans.`true` | js.Any, 
      js.Any | js.Object, 
      typingsSlinky.knex.knexBooleans.`false` | js.Any, 
      (js.Any with TIntersectProps2) | TIntersectProps2, 
      js.Any | scala.Nothing
    ])
  ]
  type AliasDict = typingsSlinky.knex.mod.Dict[java.lang.String]
  type AlterColumnBuilder = typingsSlinky.knex.mod.ColumnBuilder
  type AlterTableBuilder = typingsSlinky.knex.mod.TableBuilder
  type AnyToUnknown[T] = T | js.Any
  type ArrayIfAlready[T1, T2] = T2 | js.Array[T2]
  // If T is an array, get the type of member, else fall back to never
  type ArrayMember[T] = js.Any
  // Intersection conditionally applied only when TParams is non-empty
  // This is primarily to keep the signatures more intuitive.
  type AugmentParams[TTarget, TParams] = TTarget | (js.Object with TTarget with TParams)
  // # Type-aliases for common type combinations
  type Callback = js.Function
  type Client = js.Function
  type ColumnDescriptor[TRecord, TResult] = java.lang.String | typingsSlinky.knex.mod.Raw[js.Any] | (typingsSlinky.knex.mod.QueryBuilder[TRecord, TResult]) | typingsSlinky.knex.mod.Dict[java.lang.String]
  type CreateTableBuilder = typingsSlinky.knex.mod.TableBuilder
  // Convenience alias and associated companion namespace for working
  // with DeferredSelection having TSingle=true.
  //
  // When TSingle=true in DeferredSelection, then we are effectively
  // deferring an index access operation (TBase[TKey]) over a potentially
  // unknown initial type of TBase and potentially never initial type of TKey
  type DeferredIndex[TBase, TKey /* <: java.lang.String */] = typingsSlinky.knex.mod.DeferredKeySelection[
    TBase, 
    TKey, 
    typingsSlinky.knex.knexBooleans.`false`, 
    js.Object, 
    typingsSlinky.knex.knexBooleans.`true`, 
    js.Object, 
    scala.Nothing
  ]
  type Dict[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Distinct[TRecord /* <: js.Object */, TResult] = typingsSlinky.knex.mod.ColumnNameQueryBuilder[TRecord, TResult]
  // If T can't be assigned to TBase fallback to an alternate type TAlt
  type IncompatibleToAlt[T, TBase, TAlt] = TAlt | T
  type InferrableColumnDescriptor[TRecord /* <: js.Object */] = java.lang.String | (typingsSlinky.knex.mod.Ref[js.Any, js.Any]) | typingsSlinky.knex.mod.Dict[java.lang.String]
  type IntersectAliases[AliasUT] = typingsSlinky.knex.mod.UnionToIntersection[
    typingsSlinky.knex.mod.IncompatibleToAlt[js.Any, typingsSlinky.knex.mod.Dict[js.Any], js.Object]
  ]
  type JoinCallback = js.ThisFunction1[
    /* this */ typingsSlinky.knex.mod.JoinClause, 
    /* join */ typingsSlinky.knex.mod.JoinClause, 
    scala.Unit
  ]
  type JoinRaw[TRecord, TResult] = js.Function2[
    /* tableName */ java.lang.String, 
    /* binding */ js.UndefOr[typingsSlinky.knex.mod.Value | typingsSlinky.knex.mod.ValueDict], 
    typingsSlinky.knex.mod.QueryBuilder[TRecord, TResult]
  ]
  type LogFn = js.Function1[/* message */ java.lang.String, scala.Unit]
  type Lookup[TRegistry /* <: js.Object */, TKey /* <: java.lang.String */, TDefault] = TDefault | (/* import warning: importer.ImportType#apply Failed type conversion: TRegistry[TKey] */ js.Any)
  // Retain the association of original keys with aliased keys at type level
  // to facilitates type-safe aliasing for object syntax
  type MappedAliasType[TBase, TAliasMapping] = js.Object with typingsSlinky.knex.knexStrings.MappedAliasType with js.Any
  type MaybeArray[T] = T | js.Array[T]
  type MySqlAlterTableBuilder = typingsSlinky.knex.mod.AlterTableBuilder
  // Boxing is necessary to prevent distribution of conditional types:
  // https://lorefnon.tech/2019/05/02/using-boxing-to-prevent-distribution-of-conditional-types/
  type PartialOrAny[TBase, TKeys] = (typingsSlinky.knex.mod.SafePick[TBase, TKeys with java.lang.String]) | js.Object
  type PostgreSqlAlterTableBuilder = typingsSlinky.knex.mod.AlterTableBuilder
  //
  // QueryBuilder
  //
  type QueryCallback[TRecord, TResult] = js.ThisFunction1[
    /* this */ typingsSlinky.knex.mod.QueryBuilder[TRecord, TResult], 
    /* builder */ typingsSlinky.knex.mod.QueryBuilder[TRecord, TResult], 
    scala.Unit
  ]
  type QueryCallbackWithArgs[TRecord, TResult] = js.ThisFunction2[
    /* this */ typingsSlinky.knex.mod.QueryBuilder[TRecord, TResult], 
    /* builder */ typingsSlinky.knex.mod.QueryBuilder[TRecord, TResult], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type RawBinding = typingsSlinky.knex.mod.Value | (typingsSlinky.knex.mod.QueryBuilder[js.Any, js.Any])
  type RefBuilder = js.Function1[
    /* src */ java.lang.String, 
    typingsSlinky.knex.mod.Ref[
      java.lang.String, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in string ]: string}
    */ typingsSlinky.knex.knexStrings.RefBuilder with js.Any
    ]
  ]
  // If we have more categories of deferred selection in future,
  // this will combine all of them
  type ResolveResult[S] = typingsSlinky.knex.mod.DeferredKeySelection.Resolve[S]
  // # Generic type-level utilities
  // If T is object then make it a partial otherwise fallback to any
  //
  // This is primarily to prevent type incompatibilities where target can be unknown.
  // While unknown can be assigned to any, Partial<unknown> can't be.
  type SafePartial[T] = typingsSlinky.std.Partial[T]
  type SafePick[T, K /* <: java.lang.String */] = typingsSlinky.std.Pick[T, K]
  type StrKey[T] = java.lang.String
  type TableDescriptor = java.lang.String | typingsSlinky.knex.mod.Raw[js.Any] | (typingsSlinky.knex.mod.QueryBuilder[js.Any, js.Array[typingsSlinky.knex.mod.SafePartial[js.Any]]])
  type Union[TRecord, TResult] = typingsSlinky.knex.mod.Intersect[TRecord, TResult]
  // https://stackoverflow.com/a/50375286/476712
  type UnionToIntersection[U] = js.Any
  // If T is unknown then convert to any, else retain original
  type UnknownToAny[T] = T
  // If T is an array, get the type of member, else retain original
  type UnwrapArrayMember[T] = T
  //
  // Utility Types
  //
  type Value = java.lang.String | scala.Double | scala.Boolean | js.Date | (js.Array[scala.Boolean | js.Date | scala.Double | java.lang.String]) | typingsSlinky.node.Buffer | typingsSlinky.knex.mod.Raw[js.Any]
  type ValueDict = typingsSlinky.knex.mod.Dict[
    typingsSlinky.knex.mod.Value | (typingsSlinky.knex.mod.QueryBuilder[js.Any, js.Array[typingsSlinky.knex.mod.SafePartial[js.Any]]])
  ]
  type WhereWrapped[TRecord, TResult] = js.Function1[
    /* callback */ typingsSlinky.knex.mod.QueryCallback[js.Any, js.Array[js.Any]], 
    typingsSlinky.knex.mod.QueryBuilder[TRecord, TResult]
  ]
  type WithSchema[TRecord, TResult] = js.Function1[
    /* schema */ java.lang.String, 
    typingsSlinky.knex.mod.QueryBuilder[TRecord, TResult]
  ]
}
