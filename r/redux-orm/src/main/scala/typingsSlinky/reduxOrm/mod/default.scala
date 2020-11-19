package typingsSlinky.reduxOrm.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.reduxOrm.anon.TypeofQuerySet
import typingsSlinky.reduxOrm.databaseMod.QueryClause
import typingsSlinky.reduxOrm.fieldsMod.AttributeWithDefault
import typingsSlinky.reduxOrm.fieldsMod.FieldSpecMap
import typingsSlinky.reduxOrm.helpersMod.OptionalKeys
import typingsSlinky.reduxOrm.modelMod.AnyModel
import typingsSlinky.reduxOrm.modelMod.CreateProps
import typingsSlinky.reduxOrm.modelMod.FieldSpecKeys
import typingsSlinky.reduxOrm.modelMod.IdKeyOpt
import typingsSlinky.reduxOrm.modelMod.IdType
import typingsSlinky.reduxOrm.modelMod.ModelClass
import typingsSlinky.reduxOrm.modelMod.ModelFieldMap
import typingsSlinky.reduxOrm.modelMod.ModelFields
import typingsSlinky.reduxOrm.modelMod.ModelType
import typingsSlinky.reduxOrm.modelMod.Ref
import typingsSlinky.reduxOrm.modelMod.SessionBoundModel
import typingsSlinky.reduxOrm.modelMod.UpdateProps
import typingsSlinky.reduxOrm.modelMod.UpsertProps
import typingsSlinky.reduxOrm.querySetMod.QuerySet.LookupSpec
import typingsSlinky.reduxOrm.querySetMod.QuerySet.SortIteratee
import typingsSlinky.reduxOrm.querySetMod.QuerySet.SortOrder
import typingsSlinky.reduxOrm.sessionMod.OrmSession
import typingsSlinky.reduxOrm.tableMod.TableOpts
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-orm", JSImport.Default)
@js.native
class default[MClass /* <: Instantiable0[AnyModel] */, Fields /* <: ModelFieldMap */] protected ()
  extends typingsSlinky.reduxOrm.modelMod.default[MClass, Fields] {
  /**
    * Creates a Model instance from it's properties.
    * Don't use this to create a new record; Use the static method {@link Model#create}.
    * @param props - the properties to instantiate with
    */
  def this(props: Fields) = this()
}
/* static members */
@JSImport("redux-orm", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * @see {@link QuerySet.all}
    */
  def all(): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
  
  /**
    * @see {@link QuerySet.at}
    */
  def at(index: Double): js.UndefOr[SessionBoundModel[_, js.Object]] = js.native
  
  /**
    * @see {@link QuerySet.count}
    */
  def count(): Double = js.native
  
  /**
    * Creates a new record in the database, instantiates a {@link Model} and returns it.
    *
    * If you pass values for many-to-many fields, instances are created on the through
    * model as well.
    *
    * @param  userProps - the new {@link Model}'s properties.
    * @return a new {@link SessionBoundModel} instance.
    */
  def create[M /* <: AnyModel */, TProps /* <: CreateProps[
    M, 
    ModelFields[M], 
    /* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelFields<M>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String, 
    FieldSpecKeys[M, AttributeWithDefault], 
    (/* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelFields<M>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String) | OptionalKeys[ModelFields[M]] | (FieldSpecKeys[M, AttributeWithDefault]) | IdKeyOpt[M]
  ] */](userProps: TProps): SessionBoundModel[M, TProps] = js.native
  
  /**
    * @see {@link QuerySet.delete}
    */
  def delete(): Unit = js.native
  
  /**
    * @see {@link QuerySet.exclude}
    */
  def exclude(props: LookupSpec[typingsSlinky.reduxOrm.modelMod.Model[Instantiable0[AnyModel], _]]): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
  
  /**
    * Returns a boolean indicating if an entity
    * with the given props exists in the state.
    *
    * @param  props - a key-value that {@link Model} instances should have to be considered as existing.
    * @return a boolean indicating if entity with `props` exists in the state
    */
  def exists(props: Partial[Ref[typingsSlinky.reduxOrm.modelMod.Model[Instantiable0[AnyModel], _]]]): Boolean = js.native
  
  /**
    * Model field descriptors.
    * @see {@link Attribute}
    * @see {@link OneToOne}
    * @see {@link ForeignKey}
    * @see {@link ManyToMany}
    */
  var fields: FieldSpecMap = js.native
  
  /**
    * @see {@link QuerySet.filter}
    */
  def filter(props: LookupSpec[typingsSlinky.reduxOrm.modelMod.Model[Instantiable0[AnyModel], _]]): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
  
  /**
    * @see {@link QuerySet.first}
    */
  def first(): js.UndefOr[SessionBoundModel[_, js.Object]] = js.native
  
  /**
    * Gets the {@link Model} instance that matches properties in `lookupObj`.
    * Throws an error if {@link Model} if multiple records match
    * the properties.
    *
    * @param  lookupObj - the properties used to match a single entity.
    * @throws {Error} If more than one entity matches the properties in `lookupObj`.
    * @return a {@link SessionBoundModel} instance that matches the properties in `lookupObj`.
    */
  def get[M /* <: AnyModel */](lookupObj: LookupSpec[M]): (SessionBoundModel[M, js.Object]) | Null = js.native
  
  /**
    * Returns an instance of the model's `querySetClass` field.
    * By default, this will be an empty {@link QuerySet}.
    *
    * @return An instance of the model's `querySetClass`.
    */
  def getQuerySet(): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
  
  /**
    * The key of Model's identifier property
    */
  val idAttribute: String = js.native
  
  /**
    * Returns a boolean indicating if an entity
    * with the id `id` exists in the state.
    *
    * @param   id - a value corresponding to the id attribute of the {@link Model} class.
    * @return a boolean indicating if entity with `id` exists in the state
    *
    * @since 0.11.0
    */
  def idExists(id: String): Boolean = js.native
  def idExists(id: Double): Boolean = js.native
  
  /**
    * @see {@link QuerySet.last}
    */
  def last(): js.UndefOr[SessionBoundModel[_, js.Object]] = js.native
  
  /**
    * Manually mark individual instances as accessed.
    * This allows invalidating selector memoization within mutable sessions.
    *
    * @param ids - Array of primary key values
    */
  def markAccessed(ids: js.Array[String | Double]): Unit = js.native
  
  /**
    * Manually mark this model's table as scanned.
    * This allows invalidating selector memoization within mutable sessions.
    *
    */
  def markFullTableScanned(): Unit = js.native
  
  /**
    * A string constant identifying specific Model, necessary to retain the shape of state and relations through transpilation steps
    */
  var modelName: String = js.native
  
  /**
    * Returns the options object passed to the database for the table that represents
    * this Model class.
    *
    * Returns an empty object by default, which means the database
    * will use default options. You can either override this function to return the options
    * you want to use, or assign the options object as a static property of the same name to the
    * Model class.
    *
    * @return the options object passed to the database for the table
    *                  representing this Model class.
    */
  var options: js.Function0[TableOpts] | TableOpts = js.native
  
  /**
    * @see {@link QuerySet.orderBy}
    */
  def orderBy(
    iteratees: js.Array[SortIteratee[typingsSlinky.reduxOrm.modelMod.Model[Instantiable0[AnyModel], _]]]
  ): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
  def orderBy(
    iteratees: js.Array[SortIteratee[typingsSlinky.reduxOrm.modelMod.Model[Instantiable0[AnyModel], _]]],
    orders: js.Array[SortOrder]
  ): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
  
  /**
    * @see {@link Model.getQuerySet}
    */
  val query: typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
  
  /**
    * {@link QuerySet} class associated with this Model class.
    *
    * Defaults to base {@link QuerySet}
    */
  var querySetClass: (Instantiable3[
    /* modelClass */ ModelClass[/* import warning: RewrittenClass.unapply cls was tparam M */ js.Any], 
    /* clauses */ js.Array[QueryClause[js.Object]], 
    /* opts */ js.UndefOr[js.Object], 
    typingsSlinky.reduxOrm.querySetMod.default[AnyModel, js.Object]
  ]) with TypeofQuerySet = js.native
  
  /**
    * Model specific reducer function.
    *
    * An alternative to standalone reducer function.
    *
    * @see {@link createReducer}
    *
    * @param action  - store-dispatched action instance
    * @param modelType - a {@link ModelType} parametrized with a
    *                      {@link Model} type that the reducer is being attached to.
    * @param session - an optional parameter, can be used for querying other Models (mutations are not supported)
    */
  def reducer(action: js.Any, modelType: ModelType[_], session: OrmSession[_]): Unit = js.native
  
  /**
    * @see {@link QuerySet.update}
    */
  def update(props: UpdateProps[typingsSlinky.reduxOrm.modelMod.Model[Instantiable0[AnyModel], _]]): Unit = js.native
  
  /**
    * Creates a new or update existing record in the database, instantiates a {@link Model} and returns it.
    *
    * If you pass values for many-to-many fields, instances are created on the through
    * model as well.
    *
    * @param  userProps - the upserted {@link Model}'s properties.
    * @return a {@link SessionBoundModel} instance.
    */
  def upsert[M /* <: AnyModel */, TProps /* <: UpsertProps[M] */](userProps: TProps): SessionBoundModel[M, TProps] = js.native
  
  /**
    * Returns a {@link Model} instance for the object with id `id`.
    * Returns `null` if the model has no instance with id `id`.
    *
    * You can use {@link Model#idExists} to check for existence instead.
    *
    * @param  id - the `id` of the object to get
    * @return a {@link SessionBoundModel} instance with id `id`
    */
  def withId[M /* <: AnyModel */](id: IdType[M]): (SessionBoundModel[M, js.Object]) | Null = js.native
}
