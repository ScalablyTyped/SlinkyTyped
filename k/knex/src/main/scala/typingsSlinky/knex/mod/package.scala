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
  // If T is an array, get the type of member, else fall back to never
  type ArrayMember[T] = js.Any
  // # Type-aliases for common type combinations
  type Callback = js.Function
  type Client = js.Function
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
  type DeferredKeySelection[// The base of selection. In intermediate stages this may be unknown.
  // If it remains unknown at the point of resolution, the selection will fall back to any
  TBase, // Union of keys to be selected
  // In intermediate stages this may be never.
  TKeys /* <: java.lang.String */, // Changes how the resolution should behave if TKeys is never.
  // If true, then we assume that some keys were selected, and if TKeys is never, we will fall back to any.
  // If false, and TKeys is never, then we select TBase in its entirity
  THasSelect /* <: typingsSlinky.knex.knexBooleans.`true` | typingsSlinky.knex.knexBooleans.`false` */, // Mapping of aliases <key in result> -> <key in TBase>
  TAliasMapping /* <: js.Object */, // If enabled, then instead of extracting a partial, during resolution
  // we will pick just a single property.
  TSingle /* <: scala.Boolean */, // Extra props which will be intersected with the result
  TIntersectProps /* <: js.Object */, // Extra props which will be unioned with the result
  TUnionProps] = typingsSlinky.knex.mod.DeferredKeySelection_[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps]
  type Dict[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Distinct[TRecord /* <: js.Object */, TResult] = typingsSlinky.knex.mod.ColumnNameQueryBuilder[TRecord, TResult]
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
  // Retain the association of original keys with aliased keys at type level
  // to facilitates type-safe aliasing for object syntax
  type MappedAliasType[TBase, TAliasMapping] = js.Object with typingsSlinky.knex.knexStrings.MappedAliasType with org.scalablytyped.runtime.TopLevel[js.Any]
  type MySqlAlterTableBuilder = typingsSlinky.knex.mod.AlterTableBuilder
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
  type RefBuilder = js.Function1[
    /* src */ java.lang.String, 
    typingsSlinky.knex.mod.Ref[
      java.lang.String, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in string ]: string}
    */ typingsSlinky.knex.knexStrings.RefBuilder with org.scalablytyped.runtime.TopLevel[js.Any]
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
  type SafePick[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, K]
  type StrKey[T] = java.lang.String
  type Union[TRecord, TResult] = typingsSlinky.knex.mod.Intersect[TRecord, TResult]
  // https://stackoverflow.com/a/50375286/476712
  type UnionToIntersection[U] = js.Any
  // If T is unknown then convert to any, else retain original
  type UnknownToAny[T] = T
  // If T is an array, get the type of member, else retain original
  type UnwrapArrayMember[T] = T
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
