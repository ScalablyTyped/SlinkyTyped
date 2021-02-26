package typingsSlinky.meteorAstronomy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.meteor.Mongo.Collection
import typingsSlinky.meteor.Mongo.Cursor
import typingsSlinky.meteor.Mongo.FieldSpecifier
import typingsSlinky.meteor.Mongo.Modifier
import typingsSlinky.meteor.Mongo.ObjectID
import typingsSlinky.meteor.Mongo.Selector
import typingsSlinky.meteor.Mongo.SortSpecifier
import typingsSlinky.meteorAstronomy.anon.Copy
import typingsSlinky.meteorAstronomy.anon.GetIdentifier
import typingsSlinky.meteorAstronomy.anon.Insert
import typingsSlinky.meteorAstronomy.meteorAstronomyStrings._id
import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.DateConstructor
import typingsSlinky.std.Exclude
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.ObjectConstructor
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MeteorAstronomy {
  
  @js.native
  trait Class[T]
    extends Instantiable0[Model[T]]
       with Instantiable1[/* data */ Partial[T], Model[T]] {
    
    def find(): Cursor[Model[T], Model[T]] = js.native
    def find(selector: js.UndefOr[MongoQuery[T]], options: FindOptions): Cursor[Model[T], Model[T]] = js.native
    def find(selector: MongoQuery[T]): Cursor[Model[T], Model[T]] = js.native
    
    def findOne(): Model[T] = js.native
    def findOne(selector: js.UndefOr[MongoQuery[T]], options: FindOneOptions): Model[T] = js.native
    def findOne(selector: MongoQuery[T]): Model[T] = js.native
    
    def insert(doc: T): String = js.native
    def insert(doc: T, callback: js.Function0[Unit]): String = js.native
    
    def remove(selector: MongoQuery[T]): Double = js.native
    def remove(selector: MongoQuery[T], callback: js.Function0[Unit]): Double = js.native
    
    def update(selector: MongoQuery[T], modifier: Modifier[T]): Double = js.native
    def update(
      selector: MongoQuery[T],
      modifier: Modifier[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function0[Unit]
    ): Double = js.native
    def update(selector: MongoQuery[T], modifier: Modifier[T], options: UpdateOptions): Double = js.native
    def update(
      selector: MongoQuery[T],
      modifier: Modifier[T],
      options: UpdateOptions,
      callback: js.Function0[Unit]
    ): Double = js.native
    
    def upsert(selector: MongoQuery[T], modifier: Modifier[T]): Double = js.native
    def upsert(
      selector: MongoQuery[T],
      modifier: Modifier[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function0[Unit]
    ): Double = js.native
    def upsert(selector: MongoQuery[T], modifier: Modifier[T], options: UpsertOptions): Double = js.native
    def upsert(
      selector: MongoQuery[T],
      modifier: Modifier[T],
      options: UpsertOptions,
      callback: js.Function0[Unit]
    ): Double = js.native
  }
  
  @js.native
  trait ClassModel[T] extends StObject {
    
    var behaviors: js.UndefOr[js.Object] = js.native
    
    var collection: js.UndefOr[Collection[T, T]] = js.native
    
    var events: js.UndefOr[js.Object] = js.native
    
    var fields: Fields[Omit[T, _id]] = js.native
    
    var helpers: js.UndefOr[Helpers[T]] = js.native
    
    var indexes: js.UndefOr[js.Object] = js.native
    
    var meteorMethods: js.UndefOr[js.Object] = js.native
    
    var name: String = js.native
    
    var secured: js.UndefOr[Insert | Boolean] = js.native
  }
  object ClassModel {
    
    @scala.inline
    def apply[T](fields: Fields[Omit[T, _id]], name: String): ClassModel[T] = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassModel[T]]
    }
    
    @scala.inline
    implicit class ClassModelMutableBuilder[Self <: ClassModel[_], T] (val x: Self with ClassModel[T]) extends AnyVal {
      
      @scala.inline
      def setBehaviors(value: js.Object): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
      
      @scala.inline
      def setCollection(value: Collection[T, T]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setFields(value: Fields[Omit[T, _id]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpers(value: Helpers[T]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      @scala.inline
      def setIndexes(value: js.Object): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
      
      @scala.inline
      def setMeteorMethods(value: js.Object): Self = StObject.set(x, "meteorMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeteorMethodsUndefined: Self = StObject.set(x, "meteorMethods", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecured(value: Insert | Boolean): Self = StObject.set(x, "secured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecuredUndefined: Self = StObject.set(x, "secured", js.undefined)
    }
  }
  
  type Enum[T] = T with GetIdentifier
  
  @js.native
  trait EnumModel[T] extends StObject {
    
    var identifiers: js.Array[String] | T = js.native
    
    var name: String = js.native
  }
  object EnumModel {
    
    @scala.inline
    def apply[T](identifiers: js.Array[String] | T, name: String): EnumModel[T] = {
      val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnumModel[T]]
    }
    
    @scala.inline
    implicit class EnumModelMutableBuilder[Self <: EnumModel[_], T] (val x: Self with EnumModel[T]) extends AnyVal {
      
      @scala.inline
      def setIdentifiers(value: js.Array[String] | T): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifiersVarargs(value: String*): Self = StObject.set(x, "identifiers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Fields[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.NonFunctionProperties<T> ]: meteor-astronomy.MeteorAstronomy.ModelField<T[P], T>}
    */ typingsSlinky.meteorAstronomy.meteorAstronomyStrings.Fields with TopLevel[T]
  
  @js.native
  trait FindOneOptions extends StObject {
    
    var children: js.UndefOr[Double] = js.native
    
    var defaults: js.UndefOr[Boolean] = js.native
    
    var disableEvents: js.UndefOr[Boolean] = js.native
    
    var fields: js.UndefOr[FieldSpecifier] = js.native
    
    var reactive: js.UndefOr[Boolean] = js.native
    
    var skip: js.UndefOr[Double] = js.native
    
    var sort: js.UndefOr[SortSpecifier] = js.native
    
    var transform: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  }
  object FindOneOptions {
    
    @scala.inline
    def apply(): FindOneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOneOptions]
    }
    
    @scala.inline
    implicit class FindOneOptionsMutableBuilder[Self <: FindOneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Double): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setDisableEvents(value: Boolean): Self = StObject.set(x, "disableEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEventsUndefined: Self = StObject.set(x, "disableEvents", js.undefined)
      
      @scala.inline
      def setFields(value: FieldSpecifier): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setReactive(value: Boolean): Self = StObject.set(x, "reactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactiveUndefined: Self = StObject.set(x, "reactive", js.undefined)
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSort(value: SortSpecifier): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setTransform(value: /* repeated */ js.Any => _): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait FindOptions extends FindOneOptions {
    
    var limit: js.UndefOr[Double] = js.native
  }
  object FindOptions {
    
    @scala.inline
    def apply(): FindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions]
    }
    
    @scala.inline
    implicit class FindOptionsMutableBuilder[Self <: FindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  // tslint:disable-line:ban-types
  type FunctionProperties[T] = Pick[T, FunctionPropertyNames[T]]
  
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  
  type Helpers[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.FunctionProperties<T> ]: (this : T, args : ...any): any}
    */ typingsSlinky.meteorAstronomy.meteorAstronomyStrings.Helpers with TopLevel[js.Any]
  
  type Model[T] = T with Copy[T]
  
  type ModelField[Field, Doc] = (ModelFullField[Field, Doc]) | TypeOptions
  
  @js.native
  trait ModelFullField[Field, Doc] extends StObject {
    
    var default: js.UndefOr[js.Function0[Field]] = js.native
    
    var immutable: js.UndefOr[Boolean] = js.native
    
    var index: js.UndefOr[String | Double] = js.native
    
    var optional: js.UndefOr[Boolean] = js.native
    
    var resolve: js.UndefOr[js.Function1[/* doc */ Doc, Field]] = js.native
    
    var transient: js.UndefOr[Boolean] = js.native
    
    var `type`: TypeOptions = js.native
    
    var validators: js.UndefOr[js.Array[Validator]] = js.native
  }
  object ModelFullField {
    
    @scala.inline
    def apply[Field, Doc](`type`: TypeOptions): ModelFullField[Field, Doc] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelFullField[Field, Doc]]
    }
    
    @scala.inline
    implicit class ModelFullFieldMutableBuilder[Self <: ModelFullField[_, _], Field, Doc] (val x: Self with (ModelFullField[Field, Doc])) extends AnyVal {
      
      @scala.inline
      def setDefault(value: () => Field): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
      
      @scala.inline
      def setIndex(value: String | Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setResolve(value: /* doc */ Doc => Field): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      @scala.inline
      def setTransient(value: Boolean): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
      
      @scala.inline
      def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(value: TypeOptionsPrimitives*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setValidators(value: js.Array[Validator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
      
      @scala.inline
      def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "validators", js.Array(value :_*))
    }
  }
  
  type MongoQuery[T] = Selector[T] | ObjectID | String
  
  // tslint:disable-line:ban-types
  type NonFunctionProperties[T] = Pick[T, NonFunctionPropertyNames[T]]
  
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type RemoveCallback = js.Function2[/* err */ js.Any, /* result */ js.Any, Unit]
  
  type SaveAndValidateCallback = js.Function2[/* err */ js.Any, /* id */ js.Any, Unit]
  
  @js.native
  trait SaveAndValidateOptions[K] extends StObject {
    
    var cast: js.UndefOr[Boolean] = js.native
    
    var fields: js.UndefOr[js.Array[K]] = js.native
    
    var simulation: js.UndefOr[Boolean] = js.native
    
    var stopOnFirstError: js.UndefOr[Boolean] = js.native
  }
  object SaveAndValidateOptions {
    
    @scala.inline
    def apply[K](): SaveAndValidateOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveAndValidateOptions[K]]
    }
    
    @scala.inline
    implicit class SaveAndValidateOptionsMutableBuilder[Self <: SaveAndValidateOptions[_], K] (val x: Self with SaveAndValidateOptions[K]) extends AnyVal {
      
      @scala.inline
      def setCast(value: Boolean): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      @scala.inline
      def setFields(value: js.Array[K]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: K*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setSimulation(value: Boolean): Self = StObject.set(x, "simulation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimulationUndefined: Self = StObject.set(x, "simulation", js.undefined)
      
      @scala.inline
      def setStopOnFirstError(value: Boolean): Self = StObject.set(x, "stopOnFirstError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnFirstErrorUndefined: Self = StObject.set(x, "stopOnFirstError", js.undefined)
    }
  }
  
  type TypeOptions = TypeOptionsPrimitives | js.Array[TypeOptionsPrimitives] | Class[js.Any] | Enum[js.Any]
  
  type TypeOptionsPrimitives = StringConstructor | DateConstructor | BooleanConstructor | ObjectConstructor | NumberConstructor
  
  @js.native
  trait UpdateOptions extends UpsertOptions {
    
    var upsert: js.UndefOr[Boolean] = js.native
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
  
  @js.native
  trait UpsertOptions extends StObject {
    
    var multi: js.UndefOr[Boolean] = js.native
  }
  object UpsertOptions {
    
    @scala.inline
    def apply(): UpsertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpsertOptions]
    }
    
    @scala.inline
    implicit class UpsertOptionsMutableBuilder[Self <: UpsertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    }
  }
  
  @js.native
  trait Validator extends StObject {
    
    var param: js.Any = js.native
    
    var `type`: String = js.native
  }
  object Validator {
    
    @scala.inline
    def apply(param: js.Any, `type`: String): Validator = {
      val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Validator]
    }
    
    @scala.inline
    implicit class ValidatorMutableBuilder[Self <: Validator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParam(value: js.Any): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
