package typingsSlinky.reduxOrm

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.reduxOrm.anon.GetId
import typingsSlinky.reduxOrm.anon.TypeofQuerySet
import typingsSlinky.reduxOrm.databaseMod.QueryClause
import typingsSlinky.reduxOrm.fieldsMod.AttributeWithDefault
import typingsSlinky.reduxOrm.fieldsMod.FieldSpecMap
import typingsSlinky.reduxOrm.fieldsMod.ForeignKey
import typingsSlinky.reduxOrm.fieldsMod.ManyToMany
import typingsSlinky.reduxOrm.fieldsMod.OneToOne_
import typingsSlinky.reduxOrm.helpersMod.KnownKeys
import typingsSlinky.reduxOrm.helpersMod.OptionalKeys
import typingsSlinky.reduxOrm.querySetMod.QuerySet.LookupProps
import typingsSlinky.reduxOrm.querySetMod.QuerySet.LookupSpec
import typingsSlinky.reduxOrm.querySetMod.QuerySet.QueryBuilder
import typingsSlinky.reduxOrm.querySetMod.QuerySet.SortIteratee
import typingsSlinky.reduxOrm.querySetMod.QuerySet.SortOrder
import typingsSlinky.reduxOrm.sessionMod.OrmSession
import typingsSlinky.reduxOrm.tableMod.IdAttribute
import typingsSlinky.reduxOrm.tableMod.ModelTableOpts
import typingsSlinky.reduxOrm.tableMod.TableOpts
import typingsSlinky.std.Exclude
import typingsSlinky.std.Extract
import typingsSlinky.std.InstanceType
import typingsSlinky.std.Omit
import typingsSlinky.std.Partial
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("redux-orm/Model", JSImport.Default)
  @js.native
  class default[MClass /* <: Instantiable0[AnyModel] */, Fields /* <: ModelFieldMap */] protected () extends Model[MClass, Fields] {
    /**
      * Creates a Model instance from it's properties.
      * Don't use this to create a new record; Use the static method {@link Model#create}.
      * @param props - the properties to instantiate with
      */
    def this(props: Fields) = this()
  }
  /* static members */
  object default {
    
    @JSImport("redux-orm/Model", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @see {@link QuerySet.all}
      */
    @JSImport("redux-orm/Model", "default.all")
    @js.native
    def all(): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
    
    /**
      * @see {@link QuerySet.at}
      */
    @JSImport("redux-orm/Model", "default.at")
    @js.native
    def at(index: Double): js.UndefOr[SessionBoundModel[_, js.Object]] = js.native
    
    /**
      * @see {@link QuerySet.count}
      */
    @JSImport("redux-orm/Model", "default.count")
    @js.native
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
    @JSImport("redux-orm/Model", "default.create")
    @js.native
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
    @JSImport("redux-orm/Model", "default.delete")
    @js.native
    def delete(): Unit = js.native
    
    /**
      * @see {@link QuerySet.exclude}
      */
    @JSImport("redux-orm/Model", "default.exclude")
    @js.native
    def exclude(props: LookupSpec[Model[Instantiable0[AnyModel], _]]): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
    
    /**
      * Returns a boolean indicating if an entity
      * with the given props exists in the state.
      *
      * @param  props - a key-value that {@link Model} instances should have to be considered as existing.
      * @return a boolean indicating if entity with `props` exists in the state
      */
    @JSImport("redux-orm/Model", "default.exists")
    @js.native
    def exists(props: Partial[Ref[Model[Instantiable0[AnyModel], _]]]): Boolean = js.native
    
    /**
      * Model field descriptors.
      * @see {@link Attribute}
      * @see {@link OneToOne}
      * @see {@link ForeignKey}
      * @see {@link ManyToMany}
      */
    @JSImport("redux-orm/Model", "default.fields")
    @js.native
    def fields: FieldSpecMap = js.native
    @scala.inline
    def fields_=(x: FieldSpecMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
    
    /**
      * @see {@link QuerySet.filter}
      */
    @JSImport("redux-orm/Model", "default.filter")
    @js.native
    def filter(props: LookupSpec[Model[Instantiable0[AnyModel], _]]): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
    
    /**
      * @see {@link QuerySet.first}
      */
    @JSImport("redux-orm/Model", "default.first")
    @js.native
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
    @JSImport("redux-orm/Model", "default.get")
    @js.native
    def get[M /* <: AnyModel */](lookupObj: LookupSpec[M]): (SessionBoundModel[M, js.Object]) | Null = js.native
    
    /**
      * Returns an instance of the model's `querySetClass` field.
      * By default, this will be an empty {@link QuerySet}.
      *
      * @return An instance of the model's `querySetClass`.
      */
    @JSImport("redux-orm/Model", "default.getQuerySet")
    @js.native
    def getQuerySet(): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
    
    /**
      * The key of Model's identifier property
      */
    @JSImport("redux-orm/Model", "default.idAttribute")
    @js.native
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
    @JSImport("redux-orm/Model", "default.idExists")
    @js.native
    def idExists(id: String): Boolean = js.native
    @JSImport("redux-orm/Model", "default.idExists")
    @js.native
    def idExists(id: Double): Boolean = js.native
    
    /**
      * @see {@link QuerySet.last}
      */
    @JSImport("redux-orm/Model", "default.last")
    @js.native
    def last(): js.UndefOr[SessionBoundModel[_, js.Object]] = js.native
    
    /**
      * Manually mark individual instances as accessed.
      * This allows invalidating selector memoization within mutable sessions.
      *
      * @param ids - Array of primary key values
      */
    @JSImport("redux-orm/Model", "default.markAccessed")
    @js.native
    def markAccessed(ids: js.Array[String | Double]): Unit = js.native
    
    /**
      * Manually mark this model's table as scanned.
      * This allows invalidating selector memoization within mutable sessions.
      *
      */
    @JSImport("redux-orm/Model", "default.markFullTableScanned")
    @js.native
    def markFullTableScanned(): Unit = js.native
    
    /**
      * A string constant identifying specific Model, necessary to retain the shape of state and relations through transpilation steps
      */
    @JSImport("redux-orm/Model", "default.modelName")
    @js.native
    def modelName: String = js.native
    @scala.inline
    def modelName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modelName")(x.asInstanceOf[js.Any])
    
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
    @JSImport("redux-orm/Model", "default.options")
    @js.native
    def options: js.Function0[TableOpts] | TableOpts = js.native
    @scala.inline
    def options_=(x: js.Function0[TableOpts] | TableOpts): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    /**
      * @see {@link QuerySet.orderBy}
      */
    @JSImport("redux-orm/Model", "default.orderBy")
    @js.native
    def orderBy(iteratees: js.Array[SortIteratee[Model[Instantiable0[AnyModel], _]]]): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
    @JSImport("redux-orm/Model", "default.orderBy")
    @js.native
    def orderBy(iteratees: js.Array[SortIteratee[Model[Instantiable0[AnyModel], _]]], orders: js.Array[SortOrder]): typingsSlinky.reduxOrm.querySetMod.default[_, js.Object] = js.native
    
    /**
      * @see {@link Model.getQuerySet}
      */
    @JSImport("redux-orm/Model", "default.query")
    @js.native
    val query: typingsSlinky.reduxOrm.querySetMod.default[js.Any, js.Object] = js.native
    
    /**
      * {@link QuerySet} class associated with this Model class.
      *
      * Defaults to base {@link QuerySet}
      */
    @JSImport("redux-orm/Model", "default.querySetClass")
    @js.native
    def querySetClass: (Instantiable3[
        /* modelClass */ ModelClass[/* import warning: RewrittenClass.unapply cls was tparam M */ js.Any], 
        /* clauses */ js.Array[QueryClause[js.Object]], 
        /* opts */ js.UndefOr[js.Object], 
        typingsSlinky.reduxOrm.querySetMod.default[AnyModel, js.Object]
      ]) with TypeofQuerySet = js.native
    @scala.inline
    def querySetClass_=(
      x: (Instantiable3[
          /* modelClass */ ModelClass[/* import warning: RewrittenClass.unapply cls was tparam M */ js.Any], 
          /* clauses */ js.Array[QueryClause[js.Object]], 
          /* opts */ js.UndefOr[js.Object], 
          typingsSlinky.reduxOrm.querySetMod.default[AnyModel, js.Object]
        ]) with TypeofQuerySet
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("querySetClass")(x.asInstanceOf[js.Any])
    
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
    @JSImport("redux-orm/Model", "default.reducer")
    @js.native
    def reducer(action: js.Any, modelType: ModelType[_], session: OrmSession[_]): Unit = js.native
    
    /**
      * @see {@link QuerySet.update}
      */
    @JSImport("redux-orm/Model", "default.update")
    @js.native
    def update(props: UpdateProps[Model[Instantiable0[AnyModel], _]]): Unit = js.native
    
    /**
      * Creates a new or update existing record in the database, instantiates a {@link Model} and returns it.
      *
      * If you pass values for many-to-many fields, instances are created on the through
      * model as well.
      *
      * @param  userProps - the upserted {@link Model}'s properties.
      * @return a {@link SessionBoundModel} instance.
      */
    @JSImport("redux-orm/Model", "default.upsert")
    @js.native
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
    @JSImport("redux-orm/Model", "default.withId")
    @js.native
    def withId[M /* <: AnyModel */](id: IdType[M]): (SessionBoundModel[M, js.Object]) | Null = js.native
  }
  
  @JSImport("redux-orm/Model", "AnyModel")
  @js.native
  class AnyModel ()
    extends Model[Instantiable0[AnyModel], js.Any]
  
  @js.native
  trait BlueprintProps[M /* <: AnyModel */, ReqKeys /* <: /* keyof redux-orm.redux-orm/Model.ModelBlueprint<M, std.Required<redux-orm.redux-orm/Model.ModelFields<M>>> */ String */, OptKeys /* <: /* keyof redux-orm.redux-orm/Model.ModelBlueprint<M, std.Required<redux-orm.redux-orm/Model.ModelFields<M>>> */ String */] extends StObject
  
  type CreateProps[M /* <: AnyModel */, Fields /* <: ModelFields[M] */, MQsKeys /* <: /* keyof redux-orm.redux-orm/helpers.PickByValue<Fields, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String */, OptAttrKeys /* <: FieldSpecKeys[M, AttributeWithDefault] */, OptKeys /* <: MQsKeys | OptionalKeys[Fields] | OptAttrKeys | IdKeyOpt[M] */] = BlueprintProps[M, Exclude[/* keyof Fields */ String, OptKeys], OptKeys]
  
  type CustomInstanceProps[M /* <: AnyModel */, Props /* <: js.Object */] = Omit[
    Props, 
    Extract[/* keyof Props */ String, KnownKeys[ModelBlueprint[M, Required[ModelFields[M]]]]]
  ]
  
  type FieldSpecKeys[M /* <: AnyModel */, TField] = Extract[
    /* keyof redux-orm.redux-orm/Model.ModelFields<M> */ String, 
    /* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelClass<M>['fields'], TField> */ String
  ]
  
  type IdKey[M /* <: AnyModel */] = IdAttribute[ModelClass[M]]
  
  type IdKeyOpt[M /* <: AnyModel */] = IdKey[M]
  
  type IdOrModelLike[M /* <: Model[Instantiable0[AnyModel], _] */] = IdType[M] | GetId[M]
  
  type IdType[M /* <: Model[Instantiable0[AnyModel], _] */] = Double | (/* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[any] */ js.Any)
  
  @js.native
  trait Model[MClass /* <: Instantiable0[AnyModel] */, Fields /* <: ModelFieldMap */] extends StObject {
    
    /**
      * Deletes the record for this {@link Model} instance.
      * Fields and values on the instance are still accessible after the call.
      */
    def delete(): Unit = js.native
    
    /**
      * Returns a boolean indicating if `otherModel` equals this {@link Model} instance.
      * Equality is determined by shallow comparing their attributes.
      *
      * This equality is used when you call {@link Model#update}.
      * You can prevent model updates by returning `true` here.
      * However, a model will always be updated if its relationships are changed.
      *
      * @param  otherModel - a {@link Model} instance to compare
      * @return a boolean indicating if the {@link Model} instance's are equal.
      */
    def equals(otherModel: Model[Instantiable0[AnyModel], _]): Boolean = js.native
    
    /**
      * Gets the id value of the current instance by looking up the id attribute.
      * @return The id value of the current instance.
      */
    def getId[Id /* <: /* import warning: importer.ImportType#apply Failed type conversion: Fields[redux-orm.redux-orm/db/Table.IdAttribute<MClass>] */ js.Any */](): Id | Double = js.native
    
    /**
      * Returns a reference to the plain JS object in the store.
      * Make sure to not mutate this.
      *
      * @return a reference to the plain JS object in the store
      */
    val ref: Ref[this.type] = js.native
    
    /**
      * Updates {@link Model} instance attributes to reflect the
      * database state in the current session.
      */
    def refreshFromState(): Unit = js.native
    
    /**
      * Updates a property name to given value for this {@link Model} instance.
      * The values are immediately committed to the database.
      *
      * @param  propertyName - name of the property to set
      * @param value - value assigned to the property
      */
    def set[K /* <: String */](propertyName: K, value: RefPropOrSimple[this.type, K]): Unit = js.native
    
    /**
      * Assigns multiple fields and corresponding values to this {@link Model} instance.
      * The updates are immediately committed to the database.
      *
      * @param userMergeObj - an object that will be merged with this instance.
      */
    def update(userMergeObj: UpdateProps[InstanceType[MClass]]): Unit = js.native
  }
  
  type ModelBlueprint[M /* <: AnyModel */, Fields /* <: Required[ModelFields[M]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Fields ]: Fields[K] extends redux-orm.redux-orm/Model.AnyModel? redux-orm.redux-orm/Model.IdOrModelLike<Fields[K]> : Fields[K] extends redux-orm.redux-orm/QuerySet.MutableQuerySet<infer RM, {}>? std.ReadonlyArray<redux-orm.redux-orm/Model.IdOrModelLike<any>> : Fields[K]}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.ModelBlueprint with TopLevel[js.Any]
  
  type ModelClass[M /* <: AnyModel */] = ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: M['getClass'] */ js.Any
  ]
  
  type ModelField = (typingsSlinky.reduxOrm.querySetMod.default[js.Any, js.Object]) | (SessionBoundModel[js.Any, js.Object]) | Serializable
  
  @js.native
  trait ModelFieldMap extends /* K */ StringDictionary[ModelField]
  object ModelFieldMap {
    
    @scala.inline
    def apply(): ModelFieldMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelFieldMap]
    }
  }
  
  type ModelFields[M /* <: Model[Instantiable0[AnyModel], _] */] = js.Any
  
  @js.native
  trait ModelType[M /* <: AnyModel */]
    extends QueryBuilder[M, js.Object] {
    
    /**
      * @see {@link Model#create}
      */
    def create[T /* <: CreateProps[
        M, 
        ModelFields[M], 
        /* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelFields<M>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String, 
        FieldSpecKeys[M, AttributeWithDefault], 
        (/* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelFields<M>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String) | OptionalKeys[ModelFields[M]] | (FieldSpecKeys[M, AttributeWithDefault]) | IdKeyOpt[M]
      ] */](props: T): SessionBoundModel[M, CustomInstanceProps[M, T]] = js.native
    
    /**
      * @see {@link Model#exists}
      */
    def exists(props: LookupProps[M]): Boolean = js.native
    
    var fields: /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelClass<M>['fields'] */ js.Any = js.native
    
    /**
      * @see {@link Model#get}
      */
    def get(lookupSpec: LookupSpec[M]): (SessionBoundModel[M, js.Object]) | Null = js.native
    
    /**
      * @see {@link Model#idExists}
      */
    def idExists(id: IdType[M]): Boolean = js.native
    
    var modelName: /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelClass<M>['modelName'] */ js.Any = js.native
    
    var options: ModelTableOpts[ModelClass[M]] = js.native
    
    /**
      * @see {@link Model#upsert}
      */
    def upsert[T /* <: UpsertProps[M] */](props: T): SessionBoundModel[M, CustomInstanceProps[M, T]] = js.native
    
    /**
      * @see {@link Model#withId}
      */
    def withId(id: IdType[M]): (SessionBoundModel[M, js.Object]) | Null = js.native
  }
  
  type NonBlueprintKeys[M /* <: AnyModel */] = Exclude[
    /* keyof redux-orm.redux-orm/helpers.PickByValue<std.Required<redux-orm.redux-orm/Model.ModelFields<M>>, redux-orm.redux-orm/Model.AnyModel | redux-orm.redux-orm/QuerySet.default<any, {}>> */ String, 
    (FieldSpecKeys[M, OneToOne_ | ForeignKey]) | (/* keyof redux-orm.redux-orm/helpers.PickByValue<std.Required<redux-orm.redux-orm/Model.ModelFields<M>>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String)
  ]
  
  type Primitive = Double | String | Boolean
  
  type Ref[M /* <: AnyModel */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof redux-orm.redux-orm/Model.RefFields<M, keyof redux-orm.redux-orm/Model.ModelFields<M>> ]: redux-orm.redux-orm/Model.ModelFields<M>[K] extends redux-orm.redux-orm/Model.AnyModel? redux-orm.redux-orm/Model.IdType<redux-orm.redux-orm/Model.ModelFields<M>[K]> : redux-orm.redux-orm/Model.RefFields<M, keyof redux-orm.redux-orm/Model.ModelFields<M>>[K]}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.Ref with TopLevel[js.Any]
  
  type RefFields[M /* <: AnyModel */, K /* <: /* keyof redux-orm.redux-orm/Model.ModelFields<M> */ String */] = Omit[ModelFields[M], Extract[K, FieldSpecKeys[M, ManyToMany]]]
  
  type RefPropOrSimple[M /* <: AnyModel */, K /* <: String */] = Serializable | (/* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.Ref<M>[K] */ js.Any)
  
  type Serializable = js.UndefOr[
    Primitive | js.Array[Primitive] | (StringDictionary[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux-orm.redux-orm/Model.Serializable */ js.Object) | (js.Array[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux-orm.redux-orm/Model.Serializable */ js.Object
      ])
    ])
  ]
  
  type SessionBoundModel[M /* <: Model[Instantiable0[AnyModel], _] */, InstanceProps /* <: js.Object */] = M with typingsSlinky.reduxOrm.reduxOrmStrings.SessionBoundModel with TopLevel[js.Any] with InstanceProps
  
  type SessionBoundModelField[M /* <: AnyModel */, K /* <: /* keyof redux-orm.redux-orm/Model.ModelFields<M> */ String */] = (/* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[K] */ js.Any) | (SessionBoundModel[
    /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[K] */ js.Any, 
    js.Object
  ])
  
  type UpdateProps[M /* <: AnyModel */] = BlueprintProps[
    M, 
    scala.Nothing, 
    Exclude[
      /* keyof redux-orm.redux-orm/Model.ModelBlueprint<M, std.Required<redux-orm.redux-orm/Model.ModelFields<M>>> */ String, 
      IdKey[M]
    ]
  ]
  
  type UpsertProps[M /* <: AnyModel */] = BlueprintProps[
    M, 
    IdKey[M], 
    Exclude[
      /* keyof redux-orm.redux-orm/Model.ModelBlueprint<M, std.Required<redux-orm.redux-orm/Model.ModelFields<M>>> */ String, 
      IdKey[M]
    ]
  ]
}
