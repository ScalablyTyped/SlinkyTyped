package typingsSlinky.cachefactory

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cachefactory", "BinaryHeap")
  @js.native
  class BinaryHeap () extends StObject {
    def this(weightFunc: js.Function) = this()
    def this(weightFunc: js.UndefOr[scala.Nothing], compareFunc: js.Function) = this()
    def this(weightFunc: js.Function, compareFunc: js.Function) = this()
    
    def peek(): js.Any = js.native
    
    def pop(): js.Any = js.native
    
    def push(node: js.Any): Unit = js.native
    
    def remove(node: js.Any): Unit = js.native
    
    def removeAll(): Unit = js.native
    
    def size(): Double = js.native
  }
  
  @JSImport("cachefactory", "Cache")
  @js.native
  class Cache () extends StObject {
    
    def destroy(): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def get(key: String): js.Any = js.native
    def get(key: String, options: GetPutOptions): js.Any = js.native
    def get(key: Double): js.Any = js.native
    def get(key: Double, options: GetPutOptions): js.Any = js.native
    
    var id: String = js.native
    
    def info(key: String): CacheInfo | ItemInfo = js.native
    def info(key: Double): CacheInfo | ItemInfo = js.native
    
    def keySet(): StringDictionary[String | Double] = js.native
    
    def keys(): js.Array[String | Double] = js.native
    
    def put(key: String, value: js.Any): js.Any = js.native
    def put(key: String, value: js.Any, options: GetPutOptions): js.Any = js.native
    def put(key: Double, value: js.Any): js.Any = js.native
    def put(key: Double, value: js.Any, options: GetPutOptions): js.Any = js.native
    
    def remove(key: String): js.Any = js.native
    def remove(key: Double): js.Any = js.native
    
    def removeAll(): Unit = js.native
    
    def removeExpired(): StringDictionary[js.Any] = js.native
    
    def setCacheFlushInterval(cacheFlushInterval: Double): Unit = js.native
    
    def setCapacity(capacity: Double): Unit = js.native
    
    def setDeleteOnExpire(deleteOnExpire: DeleteOnExpire): Unit = js.native
    def setDeleteOnExpire(deleteOnExpire: DeleteOnExpire, setRecycleFreq: Boolean): Unit = js.native
    
    def setMaxAge(maxAge: Double): Unit = js.native
    
    def setOnExpire(onExpire: js.Function): js.Any = js.native
    
    def setOptions(cacheOptions: CacheOptions): Unit = js.native
    def setOptions(cacheOptions: CacheOptions, strict: Boolean): Unit = js.native
    
    def setRecycleFreq(recycleFreq: Boolean): Unit = js.native
    
    def setStorageMode(storageMode: StorageMode): Unit = js.native
    def setStorageMode(storageMode: StorageMode, storageImpl: StorageImpl): Unit = js.native
    
    def touch(key: String): Unit = js.native
    def touch(key: Double): Unit = js.native
    
    def values(): js.Array[_] = js.native
  }
  
  @JSImport("cachefactory", "CacheFactory")
  @js.native
  class CacheFactory () extends StObject {
    
    def clearAll(): Unit = js.native
    
    def createCache(id: String): Cache = js.native
    def createCache(id: String, options: CacheOptions): Cache = js.native
    
    def destroy(id: String): Unit = js.native
    
    def destroyAll(): Unit = js.native
    
    def disableAll(): Unit = js.native
    
    def enabledAll(): Unit = js.native
    
    def exists(id: String): Boolean = js.native
    
    def get(id: String): Cache = js.native
    
    def info(): CacheFactoryInfo = js.native
    
    def keySet(): StringDictionary[String] = js.native
    
    def keys(): js.Array[String] = js.native
    
    def removeExpiredFromAll(): StringDictionary[StringDictionary[js.Any]] = js.native
    
    def touchAll(): Unit = js.native
  }
  
  @JSImport("cachefactory", "defaults")
  @js.native
  val defaults: CacheOptions = js.native
  
  @JSImport("cachefactory", "utils")
  @js.native
  val utils: Utils_ = js.native
  
  @js.native
  trait CacheFactoryInfo extends CacheOptions {
    
    var caches: StringDictionary[CacheInfo] = js.native
    
    var size: Double = js.native
  }
  object CacheFactoryInfo {
    
    @scala.inline
    def apply(caches: StringDictionary[CacheInfo], size: Double): CacheFactoryInfo = {
      val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheFactoryInfo]
    }
    
    @scala.inline
    implicit class CacheFactoryInfoMutableBuilder[Self <: CacheFactoryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaches(value: StringDictionary[CacheInfo]): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CacheInfo extends CacheOptions {
    
    var id: String = js.native
    
    var size: Double = js.native
  }
  object CacheInfo {
    
    @scala.inline
    def apply(id: String, size: Double): CacheInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheInfo]
    }
    
    @scala.inline
    implicit class CacheInfoMutableBuilder[Self <: CacheInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CacheOptions extends StObject {
    
    var cacheFlushInterval: js.UndefOr[Double] = js.native
    
    var capacity: js.UndefOr[Double] = js.native
    
    var deleteOnExpire: js.UndefOr[DeleteOnExpire] = js.native
    
    var enable: js.UndefOr[Boolean] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var onExpire: js.UndefOr[OnExpireCallback] = js.native
    
    var recycleFreq: js.UndefOr[Double] = js.native
    
    var storageImpl: js.UndefOr[StorageImpl] = js.native
    
    var storageMode: js.UndefOr[StorageMode] = js.native
    
    var storagePrefix: js.UndefOr[String] = js.native
    
    var storeOnReject: js.UndefOr[Boolean] = js.native
    
    var storeOnResolve: js.UndefOr[Boolean] = js.native
  }
  object CacheOptions {
    
    @scala.inline
    def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    @scala.inline
    implicit class CacheOptionsMutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheFlushInterval(value: Double): Self = StObject.set(x, "cacheFlushInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheFlushIntervalUndefined: Self = StObject.set(x, "cacheFlushInterval", js.undefined)
      
      @scala.inline
      def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      @scala.inline
      def setDeleteOnExpire(value: DeleteOnExpire): Self = StObject.set(x, "deleteOnExpire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteOnExpireUndefined: Self = StObject.set(x, "deleteOnExpire", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setOnExpire(value: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit): Self = StObject.set(x, "onExpire", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      @scala.inline
      def setRecycleFreq(value: Double): Self = StObject.set(x, "recycleFreq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecycleFreqUndefined: Self = StObject.set(x, "recycleFreq", js.undefined)
      
      @scala.inline
      def setStorageImpl(value: StorageImpl): Self = StObject.set(x, "storageImpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageImplUndefined: Self = StObject.set(x, "storageImpl", js.undefined)
      
      @scala.inline
      def setStorageMode(value: StorageMode): Self = StObject.set(x, "storageMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageModeUndefined: Self = StObject.set(x, "storageMode", js.undefined)
      
      @scala.inline
      def setStoragePrefix(value: String): Self = StObject.set(x, "storagePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoragePrefixUndefined: Self = StObject.set(x, "storagePrefix", js.undefined)
      
      @scala.inline
      def setStoreOnReject(value: Boolean): Self = StObject.set(x, "storeOnReject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreOnRejectUndefined: Self = StObject.set(x, "storeOnReject", js.undefined)
      
      @scala.inline
      def setStoreOnResolve(value: Boolean): Self = StObject.set(x, "storeOnResolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreOnResolveUndefined: Self = StObject.set(x, "storeOnResolve", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cachefactory.cachefactoryStrings.none
    - typingsSlinky.cachefactory.cachefactoryStrings.passive
    - typingsSlinky.cachefactory.cachefactoryStrings.aggressive
  */
  trait DeleteOnExpire extends StObject
  object DeleteOnExpire {
    
    @scala.inline
    def aggressive: typingsSlinky.cachefactory.cachefactoryStrings.aggressive = "aggressive".asInstanceOf[typingsSlinky.cachefactory.cachefactoryStrings.aggressive]
    
    @scala.inline
    def none: typingsSlinky.cachefactory.cachefactoryStrings.none = "none".asInstanceOf[typingsSlinky.cachefactory.cachefactoryStrings.none]
    
    @scala.inline
    def passive: typingsSlinky.cachefactory.cachefactoryStrings.passive = "passive".asInstanceOf[typingsSlinky.cachefactory.cachefactoryStrings.passive]
  }
  
  @js.native
  trait GetPutOptions extends ItemInfo {
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var onExpire: js.UndefOr[OnExpireCallback] = js.native
    
    var storeOnReject: js.UndefOr[Boolean] = js.native
    
    var storeOnResolve: js.UndefOr[Boolean] = js.native
  }
  object GetPutOptions {
    
    @scala.inline
    def apply(): GetPutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPutOptions]
    }
    
    @scala.inline
    implicit class GetPutOptionsMutableBuilder[Self <: GetPutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setOnExpire(value: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit): Self = StObject.set(x, "onExpire", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      @scala.inline
      def setStoreOnReject(value: Boolean): Self = StObject.set(x, "storeOnReject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreOnRejectUndefined: Self = StObject.set(x, "storeOnReject", js.undefined)
      
      @scala.inline
      def setStoreOnResolve(value: Boolean): Self = StObject.set(x, "storeOnResolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreOnResolveUndefined: Self = StObject.set(x, "storeOnResolve", js.undefined)
    }
  }
  
  @js.native
  trait ItemInfo extends StObject {
    
    var accessed: js.UndefOr[Double] = js.native
    
    var created: js.UndefOr[Double] = js.native
    
    var expires: js.UndefOr[Double] = js.native
    
    var isExpired: js.UndefOr[Boolean] = js.native
  }
  object ItemInfo {
    
    @scala.inline
    def apply(): ItemInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemInfo]
    }
    
    @scala.inline
    implicit class ItemInfoMutableBuilder[Self <: ItemInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessed(value: Double): Self = StObject.set(x, "accessed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessedUndefined: Self = StObject.set(x, "accessed", js.undefined)
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setIsExpired(value: Boolean): Self = StObject.set(x, "isExpired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpiredUndefined: Self = StObject.set(x, "isExpired", js.undefined)
    }
  }
  
  type OnExpireCallback = js.Function3[/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function], Unit]
  
  @js.native
  trait StorageImpl extends StObject {
    
    def getItem(key: String): js.Any = js.native
    def getItem(key: Double): js.Any = js.native
    
    def removeItem(key: String): Unit = js.native
    def removeItem(key: Double): Unit = js.native
    
    def setItem(key: String, value: js.Any): Unit = js.native
    def setItem(key: Double, value: js.Any): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cachefactory.cachefactoryStrings.memory
    - typingsSlinky.cachefactory.cachefactoryStrings.localStorage
    - typingsSlinky.cachefactory.cachefactoryStrings.sessionStorage
  */
  trait StorageMode extends StObject
  object StorageMode {
    
    @scala.inline
    def localStorage: typingsSlinky.cachefactory.cachefactoryStrings.localStorage = "localStorage".asInstanceOf[typingsSlinky.cachefactory.cachefactoryStrings.localStorage]
    
    @scala.inline
    def memory: typingsSlinky.cachefactory.cachefactoryStrings.memory = "memory".asInstanceOf[typingsSlinky.cachefactory.cachefactoryStrings.memory]
    
    @scala.inline
    def sessionStorage: typingsSlinky.cachefactory.cachefactoryStrings.sessionStorage = "sessionStorage".asInstanceOf[typingsSlinky.cachefactory.cachefactoryStrings.sessionStorage]
  }
  
  @js.native
  trait Utils_ extends StObject {
    
    var Promise: js.UndefOr[PromiseConstructor] = js.native
    
    def equals(a: js.Any, b: js.Any): Boolean = js.native
    
    def fromJson(value: String): js.Any = js.native
    
    def isFunction(value: js.Any): Boolean = js.native
    
    def isNumber(value: js.Any): Boolean = js.native
    
    def isObject(value: js.Any): Boolean = js.native
    
    def isString(value: js.Any): Boolean = js.native
  }
  object Utils_ {
    
    @scala.inline
    def apply(
      equals_ : (js.Any, js.Any) => Boolean,
      fromJson: String => js.Any,
      isFunction: js.Any => Boolean,
      isNumber: js.Any => Boolean,
      isObject: js.Any => Boolean,
      isString: js.Any => Boolean
    ): Utils_ = {
      val __obj = js.Dynamic.literal(fromJson = js.Any.fromFunction1(fromJson), isFunction = js.Any.fromFunction1(isFunction), isNumber = js.Any.fromFunction1(isNumber), isObject = js.Any.fromFunction1(isObject), isString = js.Any.fromFunction1(isString))
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[Utils_]
    }
    
    @scala.inline
    implicit class Utils_MutableBuilder[Self <: Utils_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFromJson(value: String => js.Any): Self = StObject.set(x, "fromJson", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFunction(value: js.Any => Boolean): Self = StObject.set(x, "isFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsNumber(value: js.Any => Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsObject(value: js.Any => Boolean): Self = StObject.set(x, "isObject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsString(value: js.Any => Boolean): Self = StObject.set(x, "isString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    }
  }
}
