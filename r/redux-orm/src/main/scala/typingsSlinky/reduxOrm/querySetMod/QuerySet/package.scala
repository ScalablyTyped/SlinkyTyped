package typingsSlinky.reduxOrm.querySetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object QuerySet {
  
  /**
    * Lookup clause as predicate accepting plain object Model representation stored in the database.
    * {@see QuerySet.exclude}
    * {@see QuerySet.filter}
    */
  type LookupPredicate[M /* <: typingsSlinky.reduxOrm.modelMod.default[
    org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel], 
    _
  ] */] = js.Function1[/* row */ typingsSlinky.reduxOrm.modelMod.Ref[M], scala.Boolean]
  
  /**
    * Lookup clause as an object specifying props to match with plain object Model representation stored in the database.
    * {@see QuerySet.exclude}
    * {@see QuerySet.filter}
    */
  type LookupProps[M /* <: typingsSlinky.reduxOrm.modelMod.default[
    org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel], 
    _
  ] */] = typingsSlinky.std.Partial[typingsSlinky.reduxOrm.modelMod.Ref[M]] with (typingsSlinky.std.Record[java.lang.String, typingsSlinky.reduxOrm.modelMod.Serializable])
  
  /**
    * A union of lookup clauses.
    * {@see QuerySet.exclude}
    * {@see QuerySet.filter}
    */
  type LookupSpec[M /* <: typingsSlinky.reduxOrm.modelMod.default[
    org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel], 
    _
  ] */] = typingsSlinky.reduxOrm.querySetMod.QuerySet.LookupProps[M] | typingsSlinky.reduxOrm.querySetMod.QuerySet.LookupPredicate[M]
  
  /**
    * Ordering clause.
    *
    * Either a key of SessionBoundModel or a evaluator function accepting plain object Model representation stored in the database.
    *
    * {@see QuerySet.orderBy}
    */
  type SortIteratee[M /* <: typingsSlinky.reduxOrm.modelMod.default[
    org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel], 
    _
  ] */] = (/* keyof redux-orm.redux-orm/Model.Ref<M> */ java.lang.String) | (js.Function1[/* row */ typingsSlinky.reduxOrm.modelMod.Ref[M], js.Any])
}
