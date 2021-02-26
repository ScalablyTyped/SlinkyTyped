package typingsSlinky.reduxOrm

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reduxOrm.databaseMod.QueryClause
import typingsSlinky.reduxOrm.modelMod.AnyModel
import typingsSlinky.reduxOrm.modelMod.IdType
import typingsSlinky.reduxOrm.modelMod.ModelClass
import typingsSlinky.reduxOrm.modelMod.Ref
import typingsSlinky.reduxOrm.modelMod.Serializable
import typingsSlinky.reduxOrm.modelMod.SessionBoundModel
import typingsSlinky.reduxOrm.modelMod.UpdateProps
import typingsSlinky.reduxOrm.querySetMod.QuerySet.QueryBuilder
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object querySetMod {
  
  @JSImport("redux-orm/QuerySet", JSImport.Default)
  @js.native
  class default[M /* <: AnyModel */, InstanceProps /* <: js.Object */] protected () extends QuerySet[M, InstanceProps] {
    /**
      * Creates a `QuerySet`. The constructor is mainly for internal use;
      * Access QuerySet instances from {@link Model}.
      *
      * @param  modelClass - the {@link Model} class of objects in this QuerySet.
      * @param  clauses - query clauses needed to evaluate the set.
      * @param  [opts] - additional options
      */
    def this(modelClass: ModelClass[M], clauses: js.Array[QueryClause[js.Object]]) = this()
    def this(modelClass: ModelClass[M], clauses: js.Array[QueryClause[js.Object]], opts: js.Object) = this()
  }
  object default {
    
    /**
      * Register custom method on a `QuerySet` class specification.
      * QuerySet class may be attached to a {@link Model} class via {@link Model#querySetClass}
      *
      * @param methodName - name of a method to be available on specific QuerySet class instances
      *
      * @example:
      * class CustomQuerySet extends QuerySet<Book> {
      *     static currentYear = 2019
      *     unreleased(): QuerySet<Book> {
      *         return this.filter(book => book.releaseYear > CustomQuerySet.currentYear);
      *     }
      * }
      * CustomQuerySet.addSharedMethod('unreleased');
      * // assign specific QuerySet to a Model class
      * Book.querySetClass = typeof CustomQuerySet;
      * // register models
      * const schema = {Book };
      * const orm = new ORM<typeof schema>();
      * orm.register(Book);
      * const session = orm.session(orm.getEmptyState());
      * // use shared method
      * const unreleased = customQs.unreleased();
      */
    @JSImport("redux-orm/QuerySet", "default.addSharedMethod")
    @js.native
    def addSharedMethod(methodName: String): Unit = js.native
  }
  
  @JSImport("redux-orm/QuerySet", "QuerySet")
  @js.native
  class QuerySet[M /* <: AnyModel */, InstanceProps /* <: js.Object */] protected () extends QueryBuilder[M, InstanceProps] {
    /**
      * Creates a `QuerySet`. The constructor is mainly for internal use;
      * Access QuerySet instances from {@link Model}.
      *
      * @param  modelClass - the {@link Model} class of objects in this QuerySet.
      * @param  clauses - query clauses needed to evaluate the set.
      * @param  [opts] - additional options
      */
    def this(modelClass: ModelClass[M], clauses: js.Array[QueryClause[js.Object]]) = this()
    def this(modelClass: ModelClass[M], clauses: js.Array[QueryClause[js.Object]], opts: js.Object) = this()
    
    /**
      * Checks if the {@link QuerySet} instance has any records matching the query
      * in the database.
      *
      * @return `true` if the {@link QuerySet} instance contains entities, else `false`.
      */
    def exists(): Boolean = js.native
    
    /**
      * Returns an array of {@link SessionBoundModel} instances represented by the QuerySet.
      *
      * @return session bound model instances represented by the QuerySet
      */
    def toModelArray(): js.Array[SessionBoundModel[M, InstanceProps]] = js.native
    
    /**
      * Returns an array of the plain objects represented by the QuerySet.
      * The plain objects are direct references to the store.
      *
      * @return references to the plain JS objects represented by the QuerySet
      */
    def toRefArray(): js.Array[Ref[M] with InstanceProps] = js.native
  }
  object QuerySet {
    
    /**
      * Register custom method on a `QuerySet` class specification.
      * QuerySet class may be attached to a {@link Model} class via {@link Model#querySetClass}
      *
      * @param methodName - name of a method to be available on specific QuerySet class instances
      *
      * @example:
      * class CustomQuerySet extends QuerySet<Book> {
      *     static currentYear = 2019
      *     unreleased(): QuerySet<Book> {
      *         return this.filter(book => book.releaseYear > CustomQuerySet.currentYear);
      *     }
      * }
      * CustomQuerySet.addSharedMethod('unreleased');
      * // assign specific QuerySet to a Model class
      * Book.querySetClass = typeof CustomQuerySet;
      * // register models
      * const schema = {Book };
      * const orm = new ORM<typeof schema>();
      * orm.register(Book);
      * const session = orm.session(orm.getEmptyState());
      * // use shared method
      * const unreleased = customQs.unreleased();
      */
    @JSImport("redux-orm/QuerySet", "QuerySet.addSharedMethod")
    @js.native
    def addSharedMethod(methodName: String): Unit = js.native
    
    /**
      * Lookup clause as predicate accepting plain object Model representation stored in the database.
      * {@see QuerySet.exclude}
      * {@see QuerySet.filter}
      */
    type LookupPredicate[M /* <: typingsSlinky.reduxOrm.modelMod.default[Instantiable0[AnyModel], _] */] = js.Function1[/* row */ Ref[M], Boolean]
    
    /**
      * Lookup clause as an object specifying props to match with plain object Model representation stored in the database.
      * {@see QuerySet.exclude}
      * {@see QuerySet.filter}
      */
    type LookupProps[M /* <: typingsSlinky.reduxOrm.modelMod.default[Instantiable0[AnyModel], _] */] = Partial[Ref[M]] with (Record[String, Serializable])
    
    /**
      * A union of lookup clauses.
      * {@see QuerySet.exclude}
      * {@see QuerySet.filter}
      */
    type LookupSpec[M /* <: typingsSlinky.reduxOrm.modelMod.default[Instantiable0[AnyModel], _] */] = LookupProps[M] | LookupPredicate[M]
    
    /**
      * Interface for building queries in fluent style
      */
    @js.native
    trait QueryBuilder[M /* <: AnyModel */, InstanceProps /* <: js.Object */] extends StObject {
      
      /**
        * Returns a new {@link QuerySet} instance with the same entities.
        * @return a new QuerySet with the same entities.
        */
      def all(): QuerySet[M, InstanceProps] = js.native
      
      /**
        * Returns the {@link SessionBoundModel} instance at index `index` in the {@link QuerySet} instance if
        * `withRefs` flag is set to `false`, or a reference to the plain JavaScript
        * object in the model state if `true`.
        *
        * @param  index - index of the model instance to get
        * @return a {@link Model} derived {@link SessionBoundModel} instance at index
        *                           `index` in the {@link QuerySet} instance,
        *                           or undefined if the index is out of bounds.
        */
      def at(index: Double): js.UndefOr[SessionBoundModel[M, InstanceProps]] = js.native
      
      /**
        * Returns the number of {@link Model} instances represented by the QuerySet.
        *
        * @return length of the QuerySet
        */
      def count(): Double = js.native
      
      /**
        * Records a deletion of all the objects in this {@link QuerySet} instance.
        */
      def delete(): Unit = js.native
      
      /**
        * Returns a new {@link QuerySet} instance with entities that do not match properties in `lookupObj`.
        *
        * @param  lookupObj - the properties to match objects with ({@link LookupProps}).
        * Can also be a function ({@link LookupPredicate}).
        *
        * @return a new {@link QuerySet} instance with objects that passed the filter.
        */
      def exclude(lookupObj: LookupSpec[M]): QuerySet[M, InstanceProps] = js.native
      
      /**
        * Returns a new {@link QuerySet} instance with entities that match properties in `lookupObj`.
        *
        * @param  lookupObj - the properties to match objects with ({@link LookupProps}).
        * Can also be a function ({@link LookupPredicate}).
        *
        * @return a new {@link QuerySet} instance with objects that passed the filter.
        */
      def filter(lookupObj: LookupSpec[M]): QuerySet[M, InstanceProps] = js.native
      
      /**
        * Returns the session bound {@link Model} instance at index 0
        * in the {@link QuerySet} instance or undefined if the instance is empty.
        *
        *  @return a {@link Model} derived {@link SessionBoundModel} instance or undefined.
        */
      def first(): js.UndefOr[SessionBoundModel[M, InstanceProps]] = js.native
      
      /**
        * Returns the session bound {@link Model} instance at index `QuerySet.count() - 1`
        * in the {@link QuerySet} instance or undefined if the instance is empty.
        *
        *  @return a {@link Model} derived {@link SessionBoundModel} instance or undefined.
        */
      def last(): js.UndefOr[SessionBoundModel[M, InstanceProps]] = js.native
      
      def orderBy(iteratees: js.Array[SortIteratee[M]]): QuerySet[M, InstanceProps] = js.native
      def orderBy(iteratees: js.Array[SortIteratee[M]], orders: js.Array[SortOrder]): QuerySet[M, InstanceProps] = js.native
      def orderBy(iteratees: js.Array[SortIteratee[M]], orders: SortOrder): QuerySet[M, InstanceProps] = js.native
      /**
        * Returns a new {@link QuerySet} instance with entities ordered by `iteratees` in ascending
        * order, unless otherwise specified. Delegates to `lodash.orderBy`.
        *
        * @param  iteratees - an array or a single {@link SortIteratee} where each item can be a string or a
        *                                           function. If a string is supplied, it should
        *                                           correspond to property on the entity that will
        *                                           determine the order. If a function is supplied,
        *                                           it should return the value to order by.
        *
        * @param [orders] - the sort orders of `iteratees`. If unspecified, all iteratees
        *                               will be sorted in ascending order. `true` and `'asc'`
        *                               correspond to ascending order, and `false` and `'desc`
        *                               to descending order. Accepts an array or a single {@link SortOrder}.
        *
        * @return a new {@link QuerySet} with objects ordered by `iteratees`.
        */
      def orderBy(iteratees: SortIteratee[M]): QuerySet[M, InstanceProps] = js.native
      def orderBy(iteratees: SortIteratee[M], orders: js.Array[SortOrder]): QuerySet[M, InstanceProps] = js.native
      def orderBy(iteratees: SortIteratee[M], orders: SortOrder): QuerySet[M, InstanceProps] = js.native
      
      /**
        * Records an update specified with `mergeObj` to all the objects
        * in the {@link QuerySet} instance.
        *
        * @param  mergeObj - an object extending {@link UpdateProps}, to be merged with all the objects in this QuerySet.
        */
      def update(mergeObj: UpdateProps[M]): Unit = js.native
    }
    
    /**
      * Ordering clause.
      *
      * Either a key of SessionBoundModel or a evaluator function accepting plain object Model representation stored in the database.
      *
      * {@see QuerySet.orderBy}
      */
    type SortIteratee[M /* <: typingsSlinky.reduxOrm.modelMod.default[Instantiable0[AnyModel], _] */] = (/* keyof redux-orm.redux-orm/Model.Ref<M> */ String) | (js.Function1[/* row */ Ref[M], js.Any])
    
    /**
      * Optional ordering direction.
      *
      * {@see QuerySet.orderBy}
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.reduxOrm.reduxOrmBooleans.`true`
      - typingsSlinky.reduxOrm.reduxOrmBooleans.`false`
      - typingsSlinky.reduxOrm.reduxOrmStrings.asc
      - typingsSlinky.reduxOrm.reduxOrmStrings.desc
    */
    trait SortOrder extends StObject
    object SortOrder {
      
      @scala.inline
      def asc: typingsSlinky.reduxOrm.reduxOrmStrings.asc = "asc".asInstanceOf[typingsSlinky.reduxOrm.reduxOrmStrings.asc]
      
      @scala.inline
      def desc: typingsSlinky.reduxOrm.reduxOrmStrings.desc = "desc".asInstanceOf[typingsSlinky.reduxOrm.reduxOrmStrings.desc]
      
      @scala.inline
      def `false`: typingsSlinky.reduxOrm.reduxOrmBooleans.`false` = false.asInstanceOf[typingsSlinky.reduxOrm.reduxOrmBooleans.`false`]
      
      @scala.inline
      def `true`: typingsSlinky.reduxOrm.reduxOrmBooleans.`true` = true.asInstanceOf[typingsSlinky.reduxOrm.reduxOrmBooleans.`true`]
    }
  }
  
  @js.native
  trait MutableQuerySet[M /* <: AnyModel */, InstanceProps /* <: js.Object */] extends QuerySet[M, InstanceProps] {
    
    def add(entitiesToAdd: (IdType[M] | M)*): Unit = js.native
    
    def clear(): Unit = js.native
    
    def remove(entitiesToRemove: (IdType[M] | M)*): Unit = js.native
  }
}
