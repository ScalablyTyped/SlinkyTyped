package typingsSlinky.immutable

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.immutable.Immutable.Collection
import typingsSlinky.immutable.Immutable.Collection.Indexed
import typingsSlinky.immutable.Immutable.Collection.Keyed
import typingsSlinky.immutable.Immutable.Collection.Set
import typingsSlinky.immutable.Immutable.Record
import typingsSlinky.immutable.Immutable.Record.Factory
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Immutable {
    
    object Collection {
      
      @JSGlobal("Immutable.Collection")
      @js.native
      def apply[I /* <: typingsSlinky.immutable.Immutable.Collection[_, _] */](collection: I): I = js.native
      @JSGlobal("Immutable.Collection")
      @js.native
      def apply[T](collection: js.Iterable[T]): Indexed[T] = js.native
      @JSGlobal("Immutable.Collection")
      @js.native
      def apply[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
      
      @JSGlobal("Immutable.Collection.Indexed")
      @js.native
      def Indexed[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Collection.Indexed[T] = js.native
      
      @JSGlobal("Immutable.Collection.Keyed")
      @js.native
      def Keyed[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.Collection.Keyed[String, V] = js.native
      @JSGlobal("Immutable.Collection.Keyed")
      @js.native
      def Keyed[K, V](collection: js.Iterable[js.Tuple2[K, V]]): typingsSlinky.immutable.Immutable.Collection.Keyed[K, V] = js.native
      
      @JSGlobal("Immutable.Collection.Set")
      @js.native
      def Set[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Collection.Set[T] = js.native
      
      /**
        * @deprecated use `const { isAssociative } = require('immutable')`
        */
      @JSGlobal("Immutable.Collection.isAssociative")
      @js.native
      def isAssociative(maybeAssociative: js.Any): Boolean = js.native
      
      /**
        * @deprecated use `const { isIndexed } = require('immutable')`
        */
      @JSGlobal("Immutable.Collection.isIndexed")
      @js.native
      def isIndexed(maybeIndexed: js.Any): /* is immutable.Immutable.Collection.Indexed<any> */ Boolean = js.native
      
      /**
        * @deprecated use `const { isKeyed } = require('immutable')`
        */
      @JSGlobal("Immutable.Collection.isKeyed")
      @js.native
      def isKeyed(maybeKeyed: js.Any): /* is immutable.Immutable.Collection.Keyed<any, any> */ Boolean = js.native
      
      /**
        * @deprecated use `const { isOrdered } = require('immutable')`
        */
      @JSGlobal("Immutable.Collection.isOrdered")
      @js.native
      def isOrdered(maybeOrdered: js.Any): Boolean = js.native
    }
    
    object List {
      
      @JSGlobal("Immutable.List")
      @js.native
      def apply(): typingsSlinky.immutable.Immutable.List[_] = js.native
      @JSGlobal("Immutable.List")
      @js.native
      def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.List[T] = js.native
      
      /**
        * True if the provided value is a List
        *
        * <!-- runkit:activate -->
        * ```js
        * const { List } = require('immutable');
        * List.isList([]); // false
        * List.isList(List()); // true
        * ```
        */
      @JSGlobal("Immutable.List.isList")
      @js.native
      def isList(maybeList: js.Any): /* is immutable.Immutable.List<any> */ Boolean = js.native
      
      /**
        * Creates a new List containing `values`.
        *
        * <!-- runkit:activate -->
        * ```js
        * const { List } = require('immutable');
        * List.of(1, 2, 3, 4)
        * // List [ 1, 2, 3, 4 ]
        * ```
        *
        * Note: Values are not altered or converted in any way.
        *
        * <!-- runkit:activate -->
        * ```js
        * const { List } = require('immutable');
        * List.of({x:1}, 2, [3], 4)
        * // List [ { x: 1 }, 2, [ 3 ], 4 ]
        * ```
        */
      @JSGlobal("Immutable.List.of")
      @js.native
      def of[T](values: T*): typingsSlinky.immutable.Immutable.List[T] = js.native
    }
    
    object Map {
      
      @JSGlobal("Immutable.Map")
      @js.native
      def apply(): typingsSlinky.immutable.Immutable.Map[_, _] = js.native
      @JSGlobal("Immutable.Map")
      @js.native
      def apply[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.Map[String, V] = js.native
      @JSGlobal("Immutable.Map")
      @js.native
      def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): typingsSlinky.immutable.Immutable.Map[K, V] = js.native
      
      /**
        * True if the provided value is a Map
        *
        * <!-- runkit:activate -->
        * ```js
        * const { Map } = require('immutable')
        * Map.isMap({}) // false
        * Map.isMap(Map()) // true
        * ```
        */
      @JSGlobal("Immutable.Map.isMap")
      @js.native
      def isMap(maybeMap: js.Any): /* is immutable.Immutable.Map<any, any> */ Boolean = js.native
      
      /**
        * Creates a new Map from alternating keys and values
        *
        * <!-- runkit:activate -->
        * ```js
        * const { Map } = require('immutable')
        * Map.of(
        *   'key', 'value',
        *   'numerical value', 3,
        *    0, 'numerical key'
        * )
        * // Map { 0: "numerical key", "key": "value", "numerical value": 3 }
        * ```
        *
        * @deprecated Use Map([ [ 'k', 'v' ] ]) or Map({ k: 'v' })
        */
      @JSGlobal("Immutable.Map.of")
      @js.native
      def of(keyValues: js.Any*): typingsSlinky.immutable.Immutable.Map[_, _] = js.native
    }
    
    object OrderedMap {
      
      @JSGlobal("Immutable.OrderedMap")
      @js.native
      def apply(): typingsSlinky.immutable.Immutable.OrderedMap[_, _] = js.native
      @JSGlobal("Immutable.OrderedMap")
      @js.native
      def apply[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.OrderedMap[String, V] = js.native
      @JSGlobal("Immutable.OrderedMap")
      @js.native
      def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): typingsSlinky.immutable.Immutable.OrderedMap[K, V] = js.native
      
      /**
        * True if the provided value is an OrderedMap.
        */
      @JSGlobal("Immutable.OrderedMap.isOrderedMap")
      @js.native
      def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.Immutable.OrderedMap<any, any> */ Boolean = js.native
    }
    
    object OrderedSet {
      
      @JSGlobal("Immutable.OrderedSet")
      @js.native
      def apply(): typingsSlinky.immutable.Immutable.OrderedSet[_] = js.native
      @JSGlobal("Immutable.OrderedSet")
      @js.native
      def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.OrderedSet[T] = js.native
      
      @JSGlobal("Immutable.OrderedSet.fromKeys")
      @js.native
      def fromKeys(obj: StringDictionary[js.Any]): typingsSlinky.immutable.Immutable.OrderedSet[String] = js.native
      /**
        * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
        * the keys from this Collection or JavaScript Object.
        */
      @JSGlobal("Immutable.OrderedSet.fromKeys")
      @js.native
      def fromKeys[T](iter: Collection[T, _]): typingsSlinky.immutable.Immutable.OrderedSet[T] = js.native
      
      /**
        * True if the provided value is an OrderedSet.
        */
      @JSGlobal("Immutable.OrderedSet.isOrderedSet")
      @js.native
      def isOrderedSet(maybeOrderedSet: js.Any): Boolean = js.native
      
      /**
        * Creates a new OrderedSet containing `values`.
        */
      @JSGlobal("Immutable.OrderedSet.of")
      @js.native
      def of[T](values: T*): typingsSlinky.immutable.Immutable.OrderedSet[T] = js.native
    }
    
    @JSGlobal("Immutable.Range")
    @js.native
    def Range(): typingsSlinky.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSGlobal("Immutable.Range")
    @js.native
    def Range(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], step: Double): typingsSlinky.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSGlobal("Immutable.Range")
    @js.native
    def Range(start: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSGlobal("Immutable.Range")
    @js.native
    def Range(start: js.UndefOr[scala.Nothing], end: Double, step: Double): typingsSlinky.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSGlobal("Immutable.Range")
    @js.native
    def Range(start: Double): typingsSlinky.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSGlobal("Immutable.Range")
    @js.native
    def Range(start: Double, end: js.UndefOr[scala.Nothing], step: Double): typingsSlinky.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSGlobal("Immutable.Range")
    @js.native
    def Range(start: Double, end: Double): typingsSlinky.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSGlobal("Immutable.Range")
    @js.native
    def Range(start: Double, end: Double, step: Double): typingsSlinky.immutable.Immutable.Seq.Indexed[Double] = js.native
    
    object Record {
      
      @JSGlobal("Immutable.Record")
      @js.native
      def apply[TProps](defaultValues: TProps): Factory[TProps] = js.native
      @JSGlobal("Immutable.Record")
      @js.native
      def apply[TProps](defaultValues: TProps, name: String): Factory[TProps] = js.native
      
      @JSGlobal("Immutable.Record.Factory")
      @js.native
      def Factory[TProps /* <: js.Object */](): typingsSlinky.immutable.Immutable.Record[TProps] with TProps = js.native
      @JSGlobal("Immutable.Record.Factory")
      @js.native
      def Factory[TProps /* <: js.Object */](values: js.Iterable[js.Tuple2[String, _]]): typingsSlinky.immutable.Immutable.Record[TProps] with TProps = js.native
      @JSGlobal("Immutable.Record.Factory")
      @js.native
      def Factory[TProps /* <: js.Object */](values: Partial[TProps]): typingsSlinky.immutable.Immutable.Record[TProps] with TProps = js.native
      
      @JSGlobal("Immutable.Record.getDescriptiveName")
      @js.native
      def getDescriptiveName(record: typingsSlinky.immutable.Immutable.Record[_]): String = js.native
      
      @JSGlobal("Immutable.Record.isRecord")
      @js.native
      def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
    }
    
    @JSGlobal("Immutable.Repeat")
    @js.native
    def Repeat[T](value: T): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
    @JSGlobal("Immutable.Repeat")
    @js.native
    def Repeat[T](value: T, times: Double): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
    
    object Seq {
      
      @JSGlobal("Immutable.Seq")
      @js.native
      def apply(): typingsSlinky.immutable.Immutable.Seq[_, _] = js.native
      @JSGlobal("Immutable.Seq")
      @js.native
      def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
      @JSGlobal("Immutable.Seq")
      @js.native
      def apply[T](collection: Indexed[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
      @JSGlobal("Immutable.Seq")
      @js.native
      def apply[T](collection: Set[T]): typingsSlinky.immutable.Immutable.Seq.Set[T] = js.native
      @JSGlobal("Immutable.Seq")
      @js.native
      def apply[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.Seq.Keyed[String, V] = js.native
      @JSGlobal("Immutable.Seq")
      @js.native
      def apply[S /* <: typingsSlinky.immutable.Immutable.Seq[_, _] */](seq: S): S = js.native
      @JSGlobal("Immutable.Seq")
      @js.native
      def apply[K, V](collection: Keyed[K, V]): typingsSlinky.immutable.Immutable.Seq.Keyed[K, V] = js.native
      
      /**
        * `Seq` which represents an ordered indexed list of values.
        */
      object Indexed {
        
        @JSGlobal("Immutable.Seq.Indexed")
        @js.native
        def apply(): typingsSlinky.immutable.Immutable.Seq.Indexed[_] = js.native
        @JSGlobal("Immutable.Seq.Indexed")
        @js.native
        def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
        
        /**
          * Provides an Seq.Indexed of the values provided.
          */
        @JSGlobal("Immutable.Seq.Indexed.of")
        @js.native
        def of[T](values: T*): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
      }
      
      @JSGlobal("Immutable.Seq.Keyed")
      @js.native
      def Keyed(): typingsSlinky.immutable.Immutable.Seq.Keyed[_, _] = js.native
      @JSGlobal("Immutable.Seq.Keyed")
      @js.native
      def Keyed[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.Seq.Keyed[String, V] = js.native
      @JSGlobal("Immutable.Seq.Keyed")
      @js.native
      def Keyed[K, V](collection: js.Iterable[js.Tuple2[K, V]]): typingsSlinky.immutable.Immutable.Seq.Keyed[K, V] = js.native
      @JSGlobal("Immutable.Seq.Keyed")
      @js.native
      def Keyed_KV[K, V](): typingsSlinky.immutable.Immutable.Seq.Keyed[K, V] = js.native
      
      object Set {
        
        @JSGlobal("Immutable.Seq.Set")
        @js.native
        def apply(): typingsSlinky.immutable.Immutable.Seq.Set[_] = js.native
        @JSGlobal("Immutable.Seq.Set")
        @js.native
        def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Seq.Set[T] = js.native
        
        /**
          * Returns a Seq.Set of the provided values
          */
        @JSGlobal("Immutable.Seq.Set.of")
        @js.native
        def of[T](values: T*): typingsSlinky.immutable.Immutable.Seq.Set[T] = js.native
      }
      
      /**
        * True if `maybeSeq` is a Seq, it is not backed by a concrete
        * structure such as Map, List, or Set.
        */
      @JSGlobal("Immutable.Seq.isSeq")
      @js.native
      def isSeq(maybeSeq: js.Any): Boolean = js.native
    }
    
    object Set_ {
      
      @JSGlobal("Immutable.Set")
      @js.native
      def apply(): typingsSlinky.immutable.Immutable.Set[_] = js.native
      @JSGlobal("Immutable.Set")
      @js.native
      def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Set[T] = js.native
      
      @JSGlobal("Immutable.Set.fromKeys")
      @js.native
      def fromKeys(obj: StringDictionary[js.Any]): typingsSlinky.immutable.Immutable.Set[String] = js.native
      /**
        * `Set.fromKeys()` creates a new immutable Set containing the keys from
        * this Collection or JavaScript Object.
        */
      @JSGlobal("Immutable.Set.fromKeys")
      @js.native
      def fromKeys[T](iter: Collection[T, _]): typingsSlinky.immutable.Immutable.Set[T] = js.native
      
      /**
        * `Set.intersect()` creates a new immutable Set that is the intersection of
        * a collection of other sets.
        *
        * ```js
        * const { Set } = require('immutable')
        * const intersected = Set.intersect([
        *   Set([ 'a', 'b', 'c' ])
        *   Set([ 'c', 'a', 't' ])
        * ])
        * // Set [ "a", "c"" ]
        * ```
        */
      @JSGlobal("Immutable.Set.intersect")
      @js.native
      def intersect[T](sets: js.Iterable[js.Iterable[T]]): typingsSlinky.immutable.Immutable.Set[T] = js.native
      
      /**
        * True if the provided value is a Set
        */
      @JSGlobal("Immutable.Set.isSet")
      @js.native
      def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
      
      /**
        * Creates a new Set containing `values`.
        */
      @JSGlobal("Immutable.Set.of")
      @js.native
      def of[T](values: T*): typingsSlinky.immutable.Immutable.Set[T] = js.native
      
      /**
        * `Set.union()` creates a new immutable Set that is the union of a
        * collection of other sets.
        *
        * ```js
        * const { Set } = require('immutable')
        * const unioned = Set.union([
        *   Set([ 'a', 'b', 'c' ])
        *   Set([ 'c', 'a', 't' ])
        * ])
        * // Set [ "a", "b", "c", "t"" ]
        * ```
        */
      @JSGlobal("Immutable.Set.union")
      @js.native
      def union[T](sets: js.Iterable[js.Iterable[T]]): typingsSlinky.immutable.Immutable.Set[T] = js.native
    }
    
    object Stack {
      
      @JSGlobal("Immutable.Stack")
      @js.native
      def apply(): typingsSlinky.immutable.Immutable.Stack[_] = js.native
      @JSGlobal("Immutable.Stack")
      @js.native
      def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Stack[T] = js.native
      
      /**
        * True if the provided value is a Stack
        */
      @JSGlobal("Immutable.Stack.isStack")
      @js.native
      def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
      
      /**
        * Creates a new Stack containing `values`.
        */
      @JSGlobal("Immutable.Stack.of")
      @js.native
      def of[T](values: T*): typingsSlinky.immutable.Immutable.Stack[T] = js.native
    }
    
    @JSGlobal("Immutable.fromJS")
    @js.native
    def fromJS(jsValue: js.Any): js.Any = js.native
    @JSGlobal("Immutable.fromJS")
    @js.native
    def fromJS(
      jsValue: js.Any,
      reviver: js.Function3[
          /* key */ String | Double, 
          /* sequence */ (Keyed[String, _]) | Indexed[_], 
          /* path */ js.UndefOr[js.Array[String | Double]], 
          _
        ]
    ): js.Any = js.native
    
    @JSGlobal("Immutable.get")
    @js.native
    def get[V](collection: js.Array[V], key: Double): js.UndefOr[V] = js.native
    @JSGlobal("Immutable.get")
    @js.native
    def get[V](collection: StringDictionary[V], key: String): js.UndefOr[V] = js.native
    @JSGlobal("Immutable.get")
    @js.native
    def get[V, NSV](collection: js.Array[V], key: Double, notSetValue: NSV): V | NSV = js.native
    @JSGlobal("Immutable.get")
    @js.native
    def get[V, NSV](collection: StringDictionary[V], key: String, notSetValue: NSV): V | NSV = js.native
    @JSGlobal("Immutable.get")
    @js.native
    def get[K, V](collection: Collection[K, V], key: K): js.UndefOr[V] = js.native
    @JSGlobal("Immutable.get")
    @js.native
    def get[C /* <: js.Object */, K /* <: /* keyof C */ String */](`object`: C, key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any = js.native
    @JSGlobal("Immutable.get")
    @js.native
    def get[TProps, K /* <: /* keyof TProps */ String */](record: Record[TProps], key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
    @JSGlobal("Immutable.get")
    @js.native
    def get[K, V, NSV](collection: Collection[K, V], key: K, notSetValue: NSV): V | NSV = js.native
    
    @JSGlobal("Immutable.getIn")
    @js.native
    def getIn(collection: js.Any, keyPath: js.Iterable[_], notSetValue: js.Any): js.Any = js.native
    
    @JSGlobal("Immutable.has")
    @js.native
    def has(collection: js.Object, key: js.Any): Boolean = js.native
    
    @JSGlobal("Immutable.hasIn")
    @js.native
    def hasIn(collection: js.Any, keyPath: js.Iterable[_]): Boolean = js.native
    
    @JSGlobal("Immutable.hash")
    @js.native
    def hash(value: js.Any): Double = js.native
    
    @JSGlobal("Immutable.is")
    @js.native
    def is(first: js.Any, second: js.Any): Boolean = js.native
    
    @JSGlobal("Immutable.isAssociative")
    @js.native
    def isAssociative(maybeAssociative: js.Any): Boolean = js.native
    
    @JSGlobal("Immutable.isCollection")
    @js.native
    def isCollection(maybeCollection: js.Any): /* is immutable.Immutable.Collection<any, any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isImmutable")
    @js.native
    def isImmutable(maybeImmutable: js.Any): /* is immutable.Immutable.Collection<any, any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isIndexed")
    @js.native
    def isIndexed(maybeIndexed: js.Any): /* is immutable.Immutable.Collection.Indexed<any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isKeyed")
    @js.native
    def isKeyed(maybeKeyed: js.Any): /* is immutable.Immutable.Collection.Keyed<any, any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isList")
    @js.native
    def isList(maybeList: js.Any): /* is immutable.Immutable.List<any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isMap")
    @js.native
    def isMap(maybeMap: js.Any): /* is immutable.Immutable.Map<any, any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isOrdered")
    @js.native
    def isOrdered(maybeOrdered: js.Any): Boolean = js.native
    
    @JSGlobal("Immutable.isOrderedMap")
    @js.native
    def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.Immutable.OrderedMap<any, any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isOrderedSet")
    @js.native
    def isOrderedSet(maybeOrderedSet: js.Any): /* is immutable.Immutable.OrderedSet<any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isRecord")
    @js.native
    def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isSeq")
    @js.native
    def isSeq(maybeSeq: js.Any): Boolean = js.native
    
    @JSGlobal("Immutable.isSet")
    @js.native
    def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isStack")
    @js.native
    def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
    
    @JSGlobal("Immutable.isValueObject")
    @js.native
    def isValueObject(maybeValue: js.Any): /* is immutable.Immutable.ValueObject */ Boolean = js.native
    
    @JSGlobal("Immutable.merge")
    @js.native
    def merge[C](collection: C, collections: ((js.Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
    
    @JSGlobal("Immutable.mergeDeep")
    @js.native
    def mergeDeep[C](collection: C, collections: ((js.Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
    
    @JSGlobal("Immutable.mergeDeepWith")
    @js.native
    def mergeDeepWith[C](
      merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
      collection: C,
      collections: ((js.Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
    ): C = js.native
    
    @JSGlobal("Immutable.mergeWith")
    @js.native
    def mergeWith[C](
      merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
      collection: C,
      collections: ((js.Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
    ): C = js.native
    
    @JSGlobal("Immutable.remove")
    @js.native
    def remove[C /* <: js.Array[_] */](collection: C, key: Double): C = js.native
    @JSGlobal("Immutable.remove")
    @js.native
    def remove[K, C /* <: Collection[K, _] */](collection: C, key: K): C = js.native
    
    @JSGlobal("Immutable.removeIn")
    @js.native
    def removeIn[C](collection: C, keyPath: js.Iterable[_]): C = js.native
    
    @JSGlobal("Immutable.remove")
    @js.native
    def remove_CK_String[C, K /* <: /* keyof C */ String */](collection: C, key: K): C = js.native
    @JSGlobal("Immutable.remove")
    @js.native
    def remove_C_StringDictionaryAnyK_String[C /* <: StringDictionary[js.Any] */, K /* <: /* keyof C */ String */](collection: C, key: K): C = js.native
    @JSGlobal("Immutable.remove")
    @js.native
    def remove_TPropsC_RecordTPropsK_String[TProps, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */](collection: C, key: K): C = js.native
    
    @JSGlobal("Immutable.set")
    @js.native
    def set[V, C /* <: StringDictionary[V] */](collection: C, key: String, value: V): C = js.native
    @JSGlobal("Immutable.set")
    @js.native
    def set[V, C /* <: js.Array[V] */](collection: C, key: Double, value: V): C = js.native
    @JSGlobal("Immutable.set")
    @js.native
    def set[C, K /* <: /* keyof C */ String */](
      `object`: C,
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ): C = js.native
    @JSGlobal("Immutable.set")
    @js.native
    def set[K, V, C /* <: Collection[K, V] */](collection: C, key: K, value: V): C = js.native
    
    @JSGlobal("Immutable.setIn")
    @js.native
    def setIn[C](collection: C, keyPath: js.Iterable[_], value: js.Any): C = js.native
    
    @JSGlobal("Immutable.set")
    @js.native
    def set_TPropsC_RecordTPropsK_String[TProps, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */](
      record: C,
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ): C = js.native
    
    @JSGlobal("Immutable.update")
    @js.native
    def update[V](collection: js.Array[V], key: Double, updater: js.Function1[/* value */ V, V]): js.Array[V] = js.native
    @JSGlobal("Immutable.update")
    @js.native
    def update[V, NSV](
      collection: js.Array[V],
      key: Double,
      notSetValue: NSV,
      updater: js.Function1[/* value */ V | NSV, V]
    ): js.Array[V] = js.native
    @JSGlobal("Immutable.update")
    @js.native
    def update[C, K /* <: /* keyof C */ String */](
      `object`: C,
      key: K,
      updater: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
        ]
    ): C = js.native
    @JSGlobal("Immutable.update")
    @js.native
    def update[C, K /* <: /* keyof C */ String */, NSV](
      `object`: C,
      key: K,
      notSetValue: NSV,
      updater: js.Function1[
          /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any) | NSV, 
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
        ]
    ): C = js.native
    
    @JSGlobal("Immutable.updateIn")
    @js.native
    def updateIn[C](
      collection: C,
      keyPath: js.Iterable[_],
      notSetValue: js.Any,
      updater: js.Function1[/* value */ js.Any, _]
    ): C = js.native
    @JSGlobal("Immutable.updateIn")
    @js.native
    def updateIn[C](collection: C, keyPath: js.Iterable[_], updater: js.Function1[/* value */ js.Any, _]): C = js.native
    
    @JSGlobal("Immutable.update")
    @js.native
    def update_KVC_CollectionKV[K, V, C /* <: Collection[K, V] */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): C = js.native
    @JSGlobal("Immutable.update")
    @js.native
    def update_KVC_CollectionKVNSV[K, V, C /* <: Collection[K, V] */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): C = js.native
    @JSGlobal("Immutable.update")
    @js.native
    def update_TPropsC_RecordTPropsK_String[TProps, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */](
      record: C,
      key: K,
      updater: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
        ]
    ): C = js.native
    @JSGlobal("Immutable.update")
    @js.native
    def update_TPropsC_RecordTPropsK_StringNSV[TProps, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */, NSV](
      record: C,
      key: K,
      notSetValue: NSV,
      updater: js.Function1[
          /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any) | NSV, 
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
        ]
    ): C = js.native
    @JSGlobal("Immutable.update")
    @js.native
    def update_VC_StringDictionaryVK_StringNSV_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): StringDictionary[V] = js.native
    @JSGlobal("Immutable.update")
    @js.native
    def update_VC_StringDictionaryVK_String_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): StringDictionary[V] = js.native
  }
}
