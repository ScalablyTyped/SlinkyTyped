package typingsSlinky.meteor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.meteor.Meteor.LiveQueryHandle
import typingsSlinky.meteor.anon.And
import typingsSlinky.meteor.anon.ArrayFilters
import typingsSlinky.meteor.anon.CaseSensitive
import typingsSlinky.meteor.anon.CurrentDate
import typingsSlinky.meteor.anon.Id
import typingsSlinky.meteor.anon.IdGeneration
import typingsSlinky.meteor.anon.Insert
import typingsSlinky.meteor.anon.InsertedId
import typingsSlinky.meteor.anon.Multi
import typingsSlinky.meteor.meteorStrings._id
import typingsSlinky.meteor.meteorStrings.limit
import typingsSlinky.std.Number
import typingsSlinky.std.Omit
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mongo {
  
  @js.native
  trait AllowDenyOptions extends StObject {
    
    var fetch: js.UndefOr[js.Array[String]] = js.native
    
    var insert: js.UndefOr[js.Function2[/* userId */ String, /* doc */ js.Any, Boolean]] = js.native
    
    var remove: js.UndefOr[js.Function2[/* userId */ String, /* doc */ js.Any, Boolean]] = js.native
    
    var transform: js.UndefOr[js.Function | Null] = js.native
    
    var update: js.UndefOr[
        js.Function4[
          /* userId */ String, 
          /* doc */ js.Any, 
          /* fieldNames */ js.Array[String], 
          /* modifier */ js.Any, 
          Boolean
        ]
      ] = js.native
  }
  object AllowDenyOptions {
    
    @scala.inline
    def apply(): AllowDenyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowDenyOptions]
    }
    
    @scala.inline
    implicit class AllowDenyOptionsMutableBuilder[Self <: AllowDenyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: js.Array[String]): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setFetchVarargs(value: String*): Self = StObject.set(x, "fetch", js.Array(value :_*))
      
      @scala.inline
      def setInsert(value: (/* userId */ String, /* doc */ js.Any) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setRemove(value: (/* userId */ String, /* doc */ js.Any) => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformNull: Self = StObject.set(x, "transform", null)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setUpdate(
        value: (/* userId */ String, /* doc */ js.Any, /* fieldNames */ js.Array[String], /* modifier */ js.Any) => Boolean
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  type ArraysOrEach[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each :T[P]}}
    */ typingsSlinky.meteor.meteorStrings.ArraysOrEach with TopLevel[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.meteor.meteorNumbers.`1`
    - typingsSlinky.meteor.meteorNumbers.`2`
    - typingsSlinky.meteor.meteorNumbers.`3`
    - typingsSlinky.meteor.meteorNumbers.`4`
    - typingsSlinky.meteor.meteorNumbers.`5`
    - typingsSlinky.meteor.meteorNumbers.`6`
    - typingsSlinky.meteor.meteorNumbers.`7`
    - typingsSlinky.meteor.meteorNumbers.`8`
    - typingsSlinky.meteor.meteorNumbers.`9`
    - typingsSlinky.meteor.meteorNumbers.`10`
    - typingsSlinky.meteor.meteorNumbers.`11`
    - typingsSlinky.meteor.meteorNumbers.`12`
    - typingsSlinky.meteor.meteorNumbers.`13`
    - typingsSlinky.meteor.meteorNumbers.`14`
    - typingsSlinky.meteor.meteorNumbers.`15`
    - typingsSlinky.meteor.meteorNumbers.`16`
    - typingsSlinky.meteor.meteorNumbers.`17`
    - typingsSlinky.meteor.meteorNumbers.`18`
    - typingsSlinky.meteor.meteorNumbers.`19`
    - typingsSlinky.meteor.meteorNumbers.`-1`
    - typingsSlinky.meteor.meteorNumbers.`127`
    - typingsSlinky.meteor.meteorStrings.double
    - typingsSlinky.meteor.meteorStrings.string
    - typingsSlinky.meteor.meteorStrings.`object`
    - typingsSlinky.meteor.meteorStrings.array
    - typingsSlinky.meteor.meteorStrings.binData
    - typingsSlinky.meteor.meteorStrings.undefined
    - typingsSlinky.meteor.meteorStrings.objectId
    - typingsSlinky.meteor.meteorStrings.bool
    - typingsSlinky.meteor.meteorStrings.date
    - typingsSlinky.meteor.meteorStrings.`null`
    - typingsSlinky.meteor.meteorStrings.regex
    - typingsSlinky.meteor.meteorStrings.dbPointer
    - typingsSlinky.meteor.meteorStrings.javascript
    - typingsSlinky.meteor.meteorStrings.symbol
    - typingsSlinky.meteor.meteorStrings.javascriptWithScope
    - typingsSlinky.meteor.meteorStrings.int
    - typingsSlinky.meteor.meteorStrings.timestamp
    - typingsSlinky.meteor.meteorStrings.long
    - typingsSlinky.meteor.meteorStrings.decimal
    - typingsSlinky.meteor.meteorStrings.minKey
    - typingsSlinky.meteor.meteorStrings.maxKey
    - typingsSlinky.meteor.meteorStrings.number
  */
  trait BsonType extends StObject
  object BsonType {
    
    @scala.inline
    def `-1`: typingsSlinky.meteor.meteorNumbers.`-1` = -1.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`-1`]
    
    @scala.inline
    def `1`: typingsSlinky.meteor.meteorNumbers.`1` = 1.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`1`]
    
    @scala.inline
    def `10`: typingsSlinky.meteor.meteorNumbers.`10` = 10.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`10`]
    
    @scala.inline
    def `11`: typingsSlinky.meteor.meteorNumbers.`11` = 11.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`11`]
    
    @scala.inline
    def `12`: typingsSlinky.meteor.meteorNumbers.`12` = 12.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`12`]
    
    @scala.inline
    def `127`: typingsSlinky.meteor.meteorNumbers.`127` = 127.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`127`]
    
    @scala.inline
    def `13`: typingsSlinky.meteor.meteorNumbers.`13` = 13.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`13`]
    
    @scala.inline
    def `14`: typingsSlinky.meteor.meteorNumbers.`14` = 14.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`14`]
    
    @scala.inline
    def `15`: typingsSlinky.meteor.meteorNumbers.`15` = 15.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`15`]
    
    @scala.inline
    def `16`: typingsSlinky.meteor.meteorNumbers.`16` = 16.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`16`]
    
    @scala.inline
    def `17`: typingsSlinky.meteor.meteorNumbers.`17` = 17.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`17`]
    
    @scala.inline
    def `18`: typingsSlinky.meteor.meteorNumbers.`18` = 18.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`18`]
    
    @scala.inline
    def `19`: typingsSlinky.meteor.meteorNumbers.`19` = 19.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`19`]
    
    @scala.inline
    def `2`: typingsSlinky.meteor.meteorNumbers.`2` = 2.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.meteor.meteorNumbers.`3` = 3.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`3`]
    
    @scala.inline
    def `4`: typingsSlinky.meteor.meteorNumbers.`4` = 4.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`4`]
    
    @scala.inline
    def `5`: typingsSlinky.meteor.meteorNumbers.`5` = 5.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`5`]
    
    @scala.inline
    def `6`: typingsSlinky.meteor.meteorNumbers.`6` = 6.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`6`]
    
    @scala.inline
    def `7`: typingsSlinky.meteor.meteorNumbers.`7` = 7.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`7`]
    
    @scala.inline
    def `8`: typingsSlinky.meteor.meteorNumbers.`8` = 8.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`8`]
    
    @scala.inline
    def `9`: typingsSlinky.meteor.meteorNumbers.`9` = 9.asInstanceOf[typingsSlinky.meteor.meteorNumbers.`9`]
    
    @scala.inline
    def array: typingsSlinky.meteor.meteorStrings.array = "array".asInstanceOf[typingsSlinky.meteor.meteorStrings.array]
    
    @scala.inline
    def binData: typingsSlinky.meteor.meteorStrings.binData = "binData".asInstanceOf[typingsSlinky.meteor.meteorStrings.binData]
    
    @scala.inline
    def bool: typingsSlinky.meteor.meteorStrings.bool = "bool".asInstanceOf[typingsSlinky.meteor.meteorStrings.bool]
    
    @scala.inline
    def date: typingsSlinky.meteor.meteorStrings.date = "date".asInstanceOf[typingsSlinky.meteor.meteorStrings.date]
    
    @scala.inline
    def dbPointer: typingsSlinky.meteor.meteorStrings.dbPointer = "dbPointer".asInstanceOf[typingsSlinky.meteor.meteorStrings.dbPointer]
    
    @scala.inline
    def decimal: typingsSlinky.meteor.meteorStrings.decimal = "decimal".asInstanceOf[typingsSlinky.meteor.meteorStrings.decimal]
    
    @scala.inline
    def double: typingsSlinky.meteor.meteorStrings.double = "double".asInstanceOf[typingsSlinky.meteor.meteorStrings.double]
    
    @scala.inline
    def int: typingsSlinky.meteor.meteorStrings.int = "int".asInstanceOf[typingsSlinky.meteor.meteorStrings.int]
    
    @scala.inline
    def javascript: typingsSlinky.meteor.meteorStrings.javascript = "javascript".asInstanceOf[typingsSlinky.meteor.meteorStrings.javascript]
    
    @scala.inline
    def javascriptWithScope: typingsSlinky.meteor.meteorStrings.javascriptWithScope = "javascriptWithScope".asInstanceOf[typingsSlinky.meteor.meteorStrings.javascriptWithScope]
    
    @scala.inline
    def long: typingsSlinky.meteor.meteorStrings.long = "long".asInstanceOf[typingsSlinky.meteor.meteorStrings.long]
    
    @scala.inline
    def maxKey: typingsSlinky.meteor.meteorStrings.maxKey = "maxKey".asInstanceOf[typingsSlinky.meteor.meteorStrings.maxKey]
    
    @scala.inline
    def minKey: typingsSlinky.meteor.meteorStrings.minKey = "minKey".asInstanceOf[typingsSlinky.meteor.meteorStrings.minKey]
    
    @scala.inline
    def `null`: typingsSlinky.meteor.meteorStrings.`null` = "null".asInstanceOf[typingsSlinky.meteor.meteorStrings.`null`]
    
    @scala.inline
    def number: typingsSlinky.meteor.meteorStrings.number = "number".asInstanceOf[typingsSlinky.meteor.meteorStrings.number]
    
    @scala.inline
    def `object`: typingsSlinky.meteor.meteorStrings.`object` = "object".asInstanceOf[typingsSlinky.meteor.meteorStrings.`object`]
    
    @scala.inline
    def objectId: typingsSlinky.meteor.meteorStrings.objectId = "objectId".asInstanceOf[typingsSlinky.meteor.meteorStrings.objectId]
    
    @scala.inline
    def regex: typingsSlinky.meteor.meteorStrings.regex = "regex".asInstanceOf[typingsSlinky.meteor.meteorStrings.regex]
    
    @scala.inline
    def string: typingsSlinky.meteor.meteorStrings.string = "string".asInstanceOf[typingsSlinky.meteor.meteorStrings.string]
    
    @scala.inline
    def symbol: typingsSlinky.meteor.meteorStrings.symbol = "symbol".asInstanceOf[typingsSlinky.meteor.meteorStrings.symbol]
    
    @scala.inline
    def timestamp: typingsSlinky.meteor.meteorStrings.timestamp = "timestamp".asInstanceOf[typingsSlinky.meteor.meteorStrings.timestamp]
    
    @scala.inline
    def undefined: typingsSlinky.meteor.meteorStrings.undefined = "undefined".asInstanceOf[typingsSlinky.meteor.meteorStrings.undefined]
  }
  
  @js.native
  trait Collection[T, U] extends StObject {
    
    def _dropIndex(keys: String): Unit = js.native
    def _dropIndex(keys: StringDictionary[Double | String]): Unit = js.native
    
    def _ensureIndex(keys: String): Unit = js.native
    def _ensureIndex(keys: String, options: StringDictionary[js.Any]): Unit = js.native
    def _ensureIndex(keys: StringDictionary[Double | String]): Unit = js.native
    def _ensureIndex(keys: StringDictionary[Double | String], options: StringDictionary[js.Any]): Unit = js.native
    
    def allow[Fn /* <: Transform[T] */](options: Insert[Fn, T, U]): Boolean = js.native
    
    def deny[Fn /* <: Transform[T] */](options: Insert[Fn, T, U]): Boolean = js.native
    
    def find(): Cursor[T, U] = js.native
    def find(selector: String): Cursor[T, U] = js.native
    def find(selector: ObjectID): Cursor[T, U] = js.native
    def find(selector: Selector[T]): Cursor[T, U] = js.native
    def find[O /* <: Options[T] */](selector: js.UndefOr[Selector[T]], options: O): Cursor[
        T, 
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    def find[O /* <: Options[T] */](selector: String, options: O): Cursor[
        T, 
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    def find[O /* <: Options[T] */](selector: ObjectID, options: O): Cursor[
        T, 
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    
    def findOne(): js.UndefOr[U] = js.native
    def findOne(selector: String): js.UndefOr[U] = js.native
    def findOne(selector: ObjectID): js.UndefOr[U] = js.native
    def findOne(selector: Selector[T]): js.UndefOr[U] = js.native
    def findOne[O /* <: Omit[Options[T], limit] */](selector: js.UndefOr[Selector[T]], options: O): js.UndefOr[
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    def findOne[O /* <: Omit[Options[T], limit] */](selector: String, options: O): js.UndefOr[
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    def findOne[O /* <: Omit[Options[T], limit] */](selector: ObjectID, options: O): js.UndefOr[
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    @JSName("findOne")
    def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](): js.UndefOr[
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    @JSName("findOne")
    def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](selector: String): js.UndefOr[
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    @JSName("findOne")
    def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](selector: ObjectID): js.UndefOr[
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    @JSName("findOne")
    def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](selector: Selector[T]): js.UndefOr[
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    
    @JSName("find")
    def find_O_OptionsT[O /* <: Options[T] */](): Cursor[
        T, 
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    @JSName("find")
    def find_O_OptionsT[O /* <: Options[T] */](selector: String): Cursor[
        T, 
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    @JSName("find")
    def find_O_OptionsT[O /* <: Options[T] */](selector: ObjectID): Cursor[
        T, 
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    @JSName("find")
    def find_O_OptionsT[O /* <: Options[T] */](selector: Selector[T]): Cursor[
        T, 
        DispatchTransform[
          /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
          T, 
          U
        ]
      ] = js.native
    
    def insert(doc: OptionalId[T]): String = js.native
    def insert(doc: OptionalId[T], callback: js.Function): String = js.native
    
    def rawCollection(): js.Any = js.native
    
    def rawDatabase(): js.Any = js.native
    
    def remove(selector: String): Double = js.native
    def remove(selector: String, callback: js.Function): Double = js.native
    def remove(selector: ObjectID): Double = js.native
    def remove(selector: ObjectID, callback: js.Function): Double = js.native
    def remove(selector: Selector[T]): Double = js.native
    def remove(selector: Selector[T], callback: js.Function): Double = js.native
    
    def update(selector: String, modifier: Modifier[T]): Double = js.native
    def update(selector: String, modifier: Modifier[T], options: js.UndefOr[scala.Nothing], callback: js.Function): Double = js.native
    def update(selector: String, modifier: Modifier[T], options: ArrayFilters): Double = js.native
    def update(selector: String, modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T]): Double = js.native
    def update(
      selector: ObjectID,
      modifier: Modifier[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T], options: ArrayFilters): Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T]): Double = js.native
    def update(
      selector: Selector[T],
      modifier: Modifier[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T], options: ArrayFilters): Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
    
    def upsert(selector: String, modifier: Modifier[T]): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier[T], options: js.UndefOr[scala.Nothing], callback: js.Function): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier[T], options: Multi): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier[T]): InsertedId = js.native
    def upsert(
      selector: ObjectID,
      modifier: Modifier[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier[T], options: Multi): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
    def upsert(selector: Selector[T], modifier: Modifier[T]): InsertedId = js.native
    def upsert(
      selector: Selector[T],
      modifier: Modifier[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): InsertedId = js.native
    def upsert(selector: Selector[T], modifier: Modifier[T], options: Multi): InsertedId = js.native
    def upsert(selector: Selector[T], modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
  }
  
  @js.native
  trait CollectionStatic
    extends Instantiable0[Collection[js.Object, js.Object]]
       with Instantiable1[/* name */ String, Collection[js.Object, js.Object]]
       with Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ IdGeneration[js.Object, js.Object], 
          Collection[js.Object, js.Object]
        ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.meteor.anon.Type
    - typingsSlinky.meteor.meteorBooleans.`true`
  */
  trait CurrentDateModifier extends StObject
  
  @js.native
  trait Cursor[T, U] extends StObject {
    
    def count(): Double = js.native
    def count(applySkipLimit: Boolean): Double = js.native
    
    def fetch(): js.Array[U] = js.native
    
    def forEach(callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def map[M](callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], M]): js.Array[M] = js.native
    def map[M](
      callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], M],
      thisArg: js.Any
    ): js.Array[M] = js.native
    
    def observe(callbacks: ObserveCallbacks[U]): LiveQueryHandle = js.native
    
    def observeChanges(callbacks: ObserveChangesCallbacks[T]): LiveQueryHandle = js.native
  }
  
  @js.native
  trait CursorStatic
    extends Instantiable0[Cursor[js.Object, js.Object]]
  
  type Dictionary[T] = StringDictionary[T]
  
  type DispatchTransform[Transform, T, U] = U | T | ReturnType[Transform]
  
  type ElementsOf[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]>}
    */ typingsSlinky.meteor.meteorStrings.ElementsOf with TopLevel[T]
  
  @js.native
  trait FieldExpression[T] extends StObject {
    
    @JSName("$all")
    var $all: js.UndefOr[js.Array[T]] = js.native
    
    @JSName("$bitsAllClear")
    var $bitsAllClear: js.UndefOr[js.Any] = js.native
    
    @JSName("$bitsAllSet")
    var $bitsAllSet: js.UndefOr[js.Any] = js.native
    
    @JSName("$bitsAnyClear")
    var $bitsAnyClear: js.UndefOr[js.Any] = js.native
    
    @JSName("$bitsAnySet")
    var $bitsAnySet: js.UndefOr[js.Any] = js.native
    
    @JSName("$comment")
    var $comment: js.UndefOr[String] = js.native
    
    @JSName("$elemMatch")
    var $elemMatch: js.UndefOr[FieldExpression[T] | Query[T]] = js.native
    
    @JSName("$eq")
    var $eq: js.UndefOr[T] = js.native
    
    @JSName("$exists")
    var $exists: js.UndefOr[Boolean] = js.native
    
    @JSName("$expr")
    var $expr: js.UndefOr[FieldExpression[T]] = js.native
    
    @JSName("$geoIntersects")
    var $geoIntersects: js.UndefOr[js.Any] = js.native
    
    @JSName("$geoWithin")
    var $geoWithin: js.UndefOr[js.Any] = js.native
    
    @JSName("$gt")
    var $gt: js.UndefOr[T] = js.native
    
    @JSName("$gte")
    var $gte: js.UndefOr[T] = js.native
    
    @JSName("$in")
    var $in: js.UndefOr[js.Array[T]] = js.native
    
    @JSName("$jsonSchema")
    var $jsonSchema: js.UndefOr[js.Any] = js.native
    
    @JSName("$lt")
    var $lt: js.UndefOr[T] = js.native
    
    @JSName("$lte")
    var $lte: js.UndefOr[T] = js.native
    
    @JSName("$mod")
    var $mod: js.UndefOr[js.Array[Double]] = js.native
    
    @JSName("$ne")
    var $ne: js.UndefOr[T] = js.native
    
    @JSName("$near")
    var $near: js.UndefOr[js.Any] = js.native
    
    @JSName("$nearSphere")
    var $nearSphere: js.UndefOr[js.Any] = js.native
    
    @JSName("$nin")
    var $nin: js.UndefOr[js.Array[T]] = js.native
    
    @JSName("$not")
    var $not: js.UndefOr[FieldExpression[T]] = js.native
    
    @JSName("$options")
    var $options: js.UndefOr[String] = js.native
    
    @JSName("$regex")
    var $regex: js.UndefOr[js.RegExp | String] = js.native
    
    @JSName("$size")
    var $size: js.UndefOr[Double] = js.native
    
    @JSName("$text")
    var $text: js.UndefOr[CaseSensitive] = js.native
    
    @JSName("$type")
    var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.native
    
    @JSName("$where")
    var $where: js.UndefOr[String | js.Function] = js.native
  }
  object FieldExpression {
    
    @scala.inline
    def apply[T](): FieldExpression[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldExpression[T]]
    }
    
    @scala.inline
    implicit class FieldExpressionMutableBuilder[Self <: FieldExpression[_], T] (val x: Self with FieldExpression[T]) extends AnyVal {
      
      @scala.inline
      def set$all(value: js.Array[T]): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
      
      @scala.inline
      def set$allVarargs(value: T*): Self = StObject.set(x, "$all", js.Array(value :_*))
      
      @scala.inline
      def set$bitsAllClear(value: js.Any): Self = StObject.set(x, "$bitsAllClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$bitsAllClearUndefined: Self = StObject.set(x, "$bitsAllClear", js.undefined)
      
      @scala.inline
      def set$bitsAllSet(value: js.Any): Self = StObject.set(x, "$bitsAllSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$bitsAllSetUndefined: Self = StObject.set(x, "$bitsAllSet", js.undefined)
      
      @scala.inline
      def set$bitsAnyClear(value: js.Any): Self = StObject.set(x, "$bitsAnyClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$bitsAnyClearUndefined: Self = StObject.set(x, "$bitsAnyClear", js.undefined)
      
      @scala.inline
      def set$bitsAnySet(value: js.Any): Self = StObject.set(x, "$bitsAnySet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$bitsAnySetUndefined: Self = StObject.set(x, "$bitsAnySet", js.undefined)
      
      @scala.inline
      def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
      
      @scala.inline
      def set$elemMatch(value: FieldExpression[T] | Query[T]): Self = StObject.set(x, "$elemMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$elemMatchUndefined: Self = StObject.set(x, "$elemMatch", js.undefined)
      
      @scala.inline
      def set$eq(value: T): Self = StObject.set(x, "$eq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$eqUndefined: Self = StObject.set(x, "$eq", js.undefined)
      
      @scala.inline
      def set$exists(value: Boolean): Self = StObject.set(x, "$exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$existsUndefined: Self = StObject.set(x, "$exists", js.undefined)
      
      @scala.inline
      def set$expr(value: FieldExpression[T]): Self = StObject.set(x, "$expr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$exprUndefined: Self = StObject.set(x, "$expr", js.undefined)
      
      @scala.inline
      def set$geoIntersects(value: js.Any): Self = StObject.set(x, "$geoIntersects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$geoIntersectsUndefined: Self = StObject.set(x, "$geoIntersects", js.undefined)
      
      @scala.inline
      def set$geoWithin(value: js.Any): Self = StObject.set(x, "$geoWithin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$geoWithinUndefined: Self = StObject.set(x, "$geoWithin", js.undefined)
      
      @scala.inline
      def set$gt(value: T): Self = StObject.set(x, "$gt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$gtUndefined: Self = StObject.set(x, "$gt", js.undefined)
      
      @scala.inline
      def set$gte(value: T): Self = StObject.set(x, "$gte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$gteUndefined: Self = StObject.set(x, "$gte", js.undefined)
      
      @scala.inline
      def set$in(value: js.Array[T]): Self = StObject.set(x, "$in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$inUndefined: Self = StObject.set(x, "$in", js.undefined)
      
      @scala.inline
      def set$inVarargs(value: T*): Self = StObject.set(x, "$in", js.Array(value :_*))
      
      @scala.inline
      def set$jsonSchema(value: js.Any): Self = StObject.set(x, "$jsonSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$jsonSchemaUndefined: Self = StObject.set(x, "$jsonSchema", js.undefined)
      
      @scala.inline
      def set$lt(value: T): Self = StObject.set(x, "$lt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$ltUndefined: Self = StObject.set(x, "$lt", js.undefined)
      
      @scala.inline
      def set$lte(value: T): Self = StObject.set(x, "$lte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$lteUndefined: Self = StObject.set(x, "$lte", js.undefined)
      
      @scala.inline
      def set$mod(value: js.Array[Double]): Self = StObject.set(x, "$mod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$modUndefined: Self = StObject.set(x, "$mod", js.undefined)
      
      @scala.inline
      def set$modVarargs(value: Double*): Self = StObject.set(x, "$mod", js.Array(value :_*))
      
      @scala.inline
      def set$ne(value: T): Self = StObject.set(x, "$ne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$neUndefined: Self = StObject.set(x, "$ne", js.undefined)
      
      @scala.inline
      def set$near(value: js.Any): Self = StObject.set(x, "$near", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$nearSphere(value: js.Any): Self = StObject.set(x, "$nearSphere", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$nearSphereUndefined: Self = StObject.set(x, "$nearSphere", js.undefined)
      
      @scala.inline
      def set$nearUndefined: Self = StObject.set(x, "$near", js.undefined)
      
      @scala.inline
      def set$nin(value: js.Array[T]): Self = StObject.set(x, "$nin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$ninUndefined: Self = StObject.set(x, "$nin", js.undefined)
      
      @scala.inline
      def set$ninVarargs(value: T*): Self = StObject.set(x, "$nin", js.Array(value :_*))
      
      @scala.inline
      def set$not(value: FieldExpression[T]): Self = StObject.set(x, "$not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$notUndefined: Self = StObject.set(x, "$not", js.undefined)
      
      @scala.inline
      def set$options(value: String): Self = StObject.set(x, "$options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$optionsUndefined: Self = StObject.set(x, "$options", js.undefined)
      
      @scala.inline
      def set$regex(value: js.RegExp | String): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$regexRegExp(value: js.RegExp): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$regexUndefined: Self = StObject.set(x, "$regex", js.undefined)
      
      @scala.inline
      def set$size(value: Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
      
      @scala.inline
      def set$text(value: CaseSensitive): Self = StObject.set(x, "$text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$textUndefined: Self = StObject.set(x, "$text", js.undefined)
      
      @scala.inline
      def set$type(value: js.Array[BsonType] | BsonType): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
      
      @scala.inline
      def set$typeVarargs(value: BsonType*): Self = StObject.set(x, "$type", js.Array(value :_*))
      
      @scala.inline
      def set$where(value: String | js.Function): Self = StObject.set(x, "$where", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$whereUndefined: Self = StObject.set(x, "$where", js.undefined)
    }
  }
  
  type FieldSpecifier = StringDictionary[Number]
  
  type Flatten[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  
  type Modifier[T] = T | CurrentDate[T]
  
  @js.native
  trait ObjectID extends StObject {
    
    def equals(otherID: ObjectID): Boolean = js.native
    
    def toHexString(): String = js.native
  }
  object ObjectID {
    
    @scala.inline
    def apply(equals_ : ObjectID => Boolean, toHexString: () => String): ObjectID = {
      val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[ObjectID]
    }
    
    @scala.inline
    implicit class ObjectIDMutableBuilder[Self <: ObjectID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: ObjectID => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ObjectIDStatic
    extends Instantiable0[ObjectID]
       with Instantiable1[/* hexString */ String, ObjectID]
  
  @js.native
  trait ObserveCallbacks[T] extends StObject {
    
    var added: js.UndefOr[js.Function1[/* document */ T, Unit]] = js.native
    
    var addedAt: js.UndefOr[
        js.Function3[/* document */ T, /* atIndex */ Double, /* before */ T | Null, Unit]
      ] = js.native
    
    var changed: js.UndefOr[js.Function2[/* newDocument */ T, /* oldDocument */ T, Unit]] = js.native
    
    var changedAt: js.UndefOr[
        js.Function3[/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double, Unit]
      ] = js.native
    
    var movedTo: js.UndefOr[
        js.Function4[
          /* document */ T, 
          /* fromIndex */ Double, 
          /* toIndex */ Double, 
          /* before */ T | Null, 
          Unit
        ]
      ] = js.native
    
    var removed: js.UndefOr[js.Function1[/* oldDocument */ T, Unit]] = js.native
    
    var removedAt: js.UndefOr[js.Function2[/* oldDocument */ T, /* atIndex */ Double, Unit]] = js.native
  }
  object ObserveCallbacks {
    
    @scala.inline
    def apply[T](): ObserveCallbacks[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObserveCallbacks[T]]
    }
    
    @scala.inline
    implicit class ObserveCallbacksMutableBuilder[Self <: ObserveCallbacks[_], T] (val x: Self with ObserveCallbacks[T]) extends AnyVal {
      
      @scala.inline
      def setAdded(value: /* document */ T => Unit): Self = StObject.set(x, "added", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddedAt(value: (/* document */ T, /* atIndex */ Double, /* before */ T | Null) => Unit): Self = StObject.set(x, "addedAt", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddedAtUndefined: Self = StObject.set(x, "addedAt", js.undefined)
      
      @scala.inline
      def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
      
      @scala.inline
      def setChanged(value: (/* newDocument */ T, /* oldDocument */ T) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChangedAt(value: (/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double) => Unit): Self = StObject.set(x, "changedAt", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChangedAtUndefined: Self = StObject.set(x, "changedAt", js.undefined)
      
      @scala.inline
      def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
      
      @scala.inline
      def setMovedTo(
        value: (/* document */ T, /* fromIndex */ Double, /* toIndex */ Double, /* before */ T | Null) => Unit
      ): Self = StObject.set(x, "movedTo", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMovedToUndefined: Self = StObject.set(x, "movedTo", js.undefined)
      
      @scala.inline
      def setRemoved(value: /* oldDocument */ T => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemovedAt(value: (/* oldDocument */ T, /* atIndex */ Double) => Unit): Self = StObject.set(x, "removedAt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemovedAtUndefined: Self = StObject.set(x, "removedAt", js.undefined)
      
      @scala.inline
      def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    }
  }
  
  @js.native
  trait ObserveChangesCallbacks[T] extends StObject {
    
    var added: js.UndefOr[js.Function2[/* id */ String, /* fields */ Partial[T], Unit]] = js.native
    
    var addedBefore: js.UndefOr[
        js.Function3[/* id */ String, /* fields */ Partial[T], /* before */ T | Null, Unit]
      ] = js.native
    
    var changed: js.UndefOr[js.Function2[/* id */ String, /* fields */ Partial[T], Unit]] = js.native
    
    var movedBefore: js.UndefOr[js.Function2[/* id */ String, /* before */ T | Null, Unit]] = js.native
    
    var removed: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
  }
  object ObserveChangesCallbacks {
    
    @scala.inline
    def apply[T](): ObserveChangesCallbacks[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObserveChangesCallbacks[T]]
    }
    
    @scala.inline
    implicit class ObserveChangesCallbacksMutableBuilder[Self <: ObserveChangesCallbacks[_], T] (val x: Self with ObserveChangesCallbacks[T]) extends AnyVal {
      
      @scala.inline
      def setAdded(value: (/* id */ String, /* fields */ Partial[T]) => Unit): Self = StObject.set(x, "added", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddedBefore(value: (/* id */ String, /* fields */ Partial[T], /* before */ T | Null) => Unit): Self = StObject.set(x, "addedBefore", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddedBeforeUndefined: Self = StObject.set(x, "addedBefore", js.undefined)
      
      @scala.inline
      def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
      
      @scala.inline
      def setChanged(value: (/* id */ String, /* fields */ Partial[T]) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
      
      @scala.inline
      def setMovedBefore(value: (/* id */ String, /* before */ T | Null) => Unit): Self = StObject.set(x, "movedBefore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMovedBeforeUndefined: Self = StObject.set(x, "movedBefore", js.undefined)
      
      @scala.inline
      def setRemoved(value: /* id */ String => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    }
  }
  
  type OnlyArrays[T] = T
  
  type OnlyElementsOfArrays[T] = Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ]
  
  type OptionalId[TSchema] = (UnionOmit[TSchema, _id]) with Id
  
  @js.native
  trait Options[T] extends StObject {
    
    var fields: js.UndefOr[FieldSpecifier] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var reactive: js.UndefOr[Boolean] = js.native
    
    var skip: js.UndefOr[Double] = js.native
    
    var sort: js.UndefOr[SortSpecifier] = js.native
    
    var transform: js.UndefOr[Transform[T]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
      
      @scala.inline
      def setFields(value: FieldSpecifier): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
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
      def setTransform(value: T => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformNull: Self = StObject.set(x, "transform", null)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type PartialMapTo[T, M] = Partial[Record[/* keyof T */ String, M]]
  
  type PushModifier[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each :T[P] | undefined,   $position :number | undefined,   $slice :number | undefined,   $sort :1 | -1 | meteor.Mongo.Dictionary<number> | undefined}}
    */ typingsSlinky.meteor.meteorStrings.PushModifier with TopLevel[js.Any]
  
  type Query[T] = typingsSlinky.meteor.meteorStrings.Query with TopLevel[js.Any] with And with Dictionary[_]
  
  @js.native
  trait QueryWithModifiers[T] extends StObject {
    
    @JSName("$comment")
    var $comment: js.UndefOr[String] = js.native
    
    @JSName("$explain")
    var $explain: js.UndefOr[js.Any] = js.native
    
    @JSName("$hint")
    var $hint: js.UndefOr[js.Any] = js.native
    
    @JSName("$max")
    var $max: js.UndefOr[js.Any] = js.native
    
    @JSName("$maxScan")
    var $maxScan: js.UndefOr[js.Any] = js.native
    
    @JSName("$maxTimeMS")
    var $maxTimeMS: js.UndefOr[js.Any] = js.native
    
    @JSName("$min")
    var $min: js.UndefOr[js.Any] = js.native
    
    @JSName("$natural")
    var $natural: js.UndefOr[js.Any] = js.native
    
    @JSName("$orderby")
    var $orderby: js.UndefOr[js.Any] = js.native
    
    @JSName("$query")
    var $query: Query[T] = js.native
    
    @JSName("$returnKey")
    var $returnKey: js.UndefOr[js.Any] = js.native
    
    @JSName("$showDiskLoc")
    var $showDiskLoc: js.UndefOr[js.Any] = js.native
  }
  object QueryWithModifiers {
    
    @scala.inline
    def apply[T]($query: Query[T]): QueryWithModifiers[T] = {
      val __obj = js.Dynamic.literal($query = $query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryWithModifiers[T]]
    }
    
    @scala.inline
    implicit class QueryWithModifiersMutableBuilder[Self <: QueryWithModifiers[_], T] (val x: Self with QueryWithModifiers[T]) extends AnyVal {
      
      @scala.inline
      def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
      
      @scala.inline
      def set$explain(value: js.Any): Self = StObject.set(x, "$explain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$explainUndefined: Self = StObject.set(x, "$explain", js.undefined)
      
      @scala.inline
      def set$hint(value: js.Any): Self = StObject.set(x, "$hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$hintUndefined: Self = StObject.set(x, "$hint", js.undefined)
      
      @scala.inline
      def set$max(value: js.Any): Self = StObject.set(x, "$max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxScan(value: js.Any): Self = StObject.set(x, "$maxScan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxScanUndefined: Self = StObject.set(x, "$maxScan", js.undefined)
      
      @scala.inline
      def set$maxTimeMS(value: js.Any): Self = StObject.set(x, "$maxTimeMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxTimeMSUndefined: Self = StObject.set(x, "$maxTimeMS", js.undefined)
      
      @scala.inline
      def set$maxUndefined: Self = StObject.set(x, "$max", js.undefined)
      
      @scala.inline
      def set$min(value: js.Any): Self = StObject.set(x, "$min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$minUndefined: Self = StObject.set(x, "$min", js.undefined)
      
      @scala.inline
      def set$natural(value: js.Any): Self = StObject.set(x, "$natural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$naturalUndefined: Self = StObject.set(x, "$natural", js.undefined)
      
      @scala.inline
      def set$orderby(value: js.Any): Self = StObject.set(x, "$orderby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$orderbyUndefined: Self = StObject.set(x, "$orderby", js.undefined)
      
      @scala.inline
      def set$query(value: Query[T]): Self = StObject.set(x, "$query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$returnKey(value: js.Any): Self = StObject.set(x, "$returnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$returnKeyUndefined: Self = StObject.set(x, "$returnKey", js.undefined)
      
      @scala.inline
      def set$showDiskLoc(value: js.Any): Self = StObject.set(x, "$showDiskLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$showDiskLocUndefined: Self = StObject.set(x, "$showDiskLoc", js.undefined)
    }
  }
  
  type Selector[T] = Query[T] | QueryWithModifiers[T]
  
  @js.native
  trait SortSpecifier extends StObject
  
  type Transform[T] = js.UndefOr[(js.Function1[/* doc */ T, js.Any]) | Null]
}
