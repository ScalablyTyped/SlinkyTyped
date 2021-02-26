package typingsSlinky.backboneFetchCache

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.CollectionFetchOptions
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelFetchOptions
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object backboneAugmentingMod {
    
    @JSImport("backbone", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("backbone", "fetchCache")
    @js.native
    def fetchCache: Static = js.native
    @scala.inline
    def fetchCache_=(x: Static): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fetchCache")(x.asInstanceOf[js.Any])
    
    @js.native
    trait CollectionFetchWithCacheOptions extends ModelFetchWithCacheOptions {
      
      @JSName("prefillSuccess")
      var prefillSuccess_CollectionFetchWithCacheOptions: js.UndefOr[js.Function1[/* self */ js.Any, Unit]] = js.native
    }
    object CollectionFetchWithCacheOptions {
      
      @scala.inline
      def apply(): CollectionFetchWithCacheOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CollectionFetchWithCacheOptions]
      }
      
      @scala.inline
      implicit class CollectionFetchWithCacheOptionsMutableBuilder[Self <: CollectionFetchWithCacheOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPrefillSuccess(value: /* self */ js.Any => Unit): Self = StObject.set(x, "prefillSuccess", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPrefillSuccessUndefined: Self = StObject.set(x, "prefillSuccess", js.undefined)
      }
    }
    
    @js.native
    trait CollectionWithCache
      extends Collection[Model[js.Any, ModelSetOptions, js.Object]] {
      
      def fetch(options: CollectionFetchWithCacheOptions): JQueryXHR = js.native
    }
    
    /**
      * The most used API hook for Backbone Fetch Cache is the Model and
      * Collection #.fetch() method. Here are the options you can pass into that
      * method to get behaviour particular to Backbone Fetch Cache.
      */
    @js.native
    trait ModelFetchWithCacheOptions extends ModelFetchOptions {
      
      /**
        * Calls to modelInstance.fetch or collectionInstance.fetch will be
        * fulfilled from the cache (if possible) when cache: true is set in
        * the options hash.
        */
      var cache: js.UndefOr[Boolean] = js.native
      
      var context: js.UndefOr[js.Any] = js.native
      
      /**
        * Cache values expire after 5 minutes by default. You can adjust this
        * by passing expires: <seconds> to the fetch call. Set to false to
        * never expire.
        */
      var expires: js.UndefOr[Double] = js.native
      
      /**
        * This option allows the model/collection to be populated from the
        * cache immediately and then be updated once the call to fetch has
        * completed. The initial cache hit calls the prefillSuccess callback
        * and then the AJAX success/error callbacks are called as normal when
        * the request is complete. This allows the page to render something
        * immediately and then update it after the request completes. (Note:
        * the prefillSuccess callback will not fire if the data is not found
        * in the cache.)
        *
        * prefill and prefillExpires options can be used with the promises
        * interface like so (note: the progress event will not fire if the
        * data is not found in the cache.).
        *
        * prefillExpires affects prefill in the following ways:
        *
        * 1. If the cache doesn't hold the requested data, just fetch it
        *  (usual behaviour)
        * 2. If the cache holds an expired version of the requested data, just
        *  fetch it (usual behaviour)
        * 3. If the cache holds requested data that is neither expired nor
        *  prefill expired, just return it and don't do a fetch / prefill
        *  callback (usual cache behavior, unusual prefill behaviour)
        * 4. If the cache holds requested data that isn't expired but is
        *  prefill expired, use the prefill callback and do a fetch (usual
        *  prefill behaviour)
        */
      var prefill: js.UndefOr[Boolean] = js.native
      
      var prefillExpires: js.UndefOr[Double] = js.native
      
      var prefillSuccess: js.UndefOr[
            js.Function3[/* self */ js.Any, /* attributes */ js.Any, /* opts */ this.type, Unit]
          ] = js.native
    }
    object ModelFetchWithCacheOptions {
      
      @scala.inline
      def apply(): ModelFetchWithCacheOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModelFetchWithCacheOptions]
      }
      
      @scala.inline
      implicit class ModelFetchWithCacheOptionsMutableBuilder[Self <: ModelFetchWithCacheOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
        
        @scala.inline
        def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        @scala.inline
        def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        @scala.inline
        def setPrefill(value: Boolean): Self = StObject.set(x, "prefill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefillExpires(value: Double): Self = StObject.set(x, "prefillExpires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefillExpiresUndefined: Self = StObject.set(x, "prefillExpires", js.undefined)
        
        @scala.inline
        def setPrefillSuccess(value: (/* self */ js.Any, /* attributes */ js.Any, ModelFetchWithCacheOptions) => Unit): Self = StObject.set(x, "prefillSuccess", js.Any.fromFunction3(value))
        
        @scala.inline
        def setPrefillSuccessUndefined: Self = StObject.set(x, "prefillSuccess", js.undefined)
        
        @scala.inline
        def setPrefillUndefined: Self = StObject.set(x, "prefill", js.undefined)
      }
    }
    
    @js.native
    trait ModelWithCache
      extends Model[js.Any, ModelSetOptions, js.Object] {
      
      def fetch(options: ModelFetchWithCacheOptions): JQueryXHR = js.native
    }
  }
  
  @js.native
  trait Cache extends StObject {
    
    var expires: Double = js.native
    
    var lastSync: Double = js.native
    
    var prefillExpires: Double = js.native
    
    var value: js.Any = js.native
  }
  object Cache {
    
    @scala.inline
    def apply(expires: Double, lastSync: Double, prefillExpires: Double, value: js.Any): Cache = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], lastSync = lastSync.asInstanceOf[js.Any], prefillExpires = prefillExpires.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastSync(value: Double): Self = StObject.set(x, "lastSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefillExpires(value: Double): Self = StObject.set(x, "prefillExpires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetCacheKeyObject extends _GetCacheKeyOptions {
    
    var getCacheKey: js.UndefOr[js.Function1[/* opts */ js.UndefOr[GetCacheOptions], String]] = js.native
    
    var url: js.UndefOr[js.Function0[String]] = js.native
  }
  object GetCacheKeyObject {
    
    @scala.inline
    def apply(): GetCacheKeyObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCacheKeyObject]
    }
    
    @scala.inline
    implicit class GetCacheKeyObjectMutableBuilder[Self <: GetCacheKeyObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCacheKey(value: /* opts */ js.UndefOr[GetCacheOptions] => String): Self = StObject.set(x, "getCacheKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCacheKeyUndefined: Self = StObject.set(x, "getCacheKey", js.undefined)
      
      @scala.inline
      def setUrl(value: () => String): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.backboneFetchCache.anon.Url
    - typingsSlinky.backboneFetchCache.mod.GetCacheKeyObject
  */
  type GetCacheKeyOptions = _GetCacheKeyOptions | String
  
  @js.native
  trait GetCacheOptions extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object GetCacheOptions {
    
    @scala.inline
    def apply(): GetCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCacheOptions]
    }
    
    @scala.inline
    implicit class GetCacheOptionsMutableBuilder[Self <: GetCacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait SetCacheOptions extends GetCacheOptions {
    
    var cache: Boolean = js.native
    
    var expires: Boolean | Double = js.native
    
    var prefill: Boolean = js.native
    
    var prefillExpires: Boolean | Double = js.native
  }
  object SetCacheOptions {
    
    @scala.inline
    def apply(cache: Boolean, expires: Boolean | Double, prefill: Boolean, prefillExpires: Boolean | Double): SetCacheOptions = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any], prefillExpires = prefillExpires.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetCacheOptions]
    }
    
    @scala.inline
    implicit class SetCacheOptionsMutableBuilder[Self <: SetCacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: Boolean | Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefill(value: Boolean): Self = StObject.set(x, "prefill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefillExpires(value: Boolean | Double): Self = StObject.set(x, "prefillExpires", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    var _superMethods: SuperMethods = js.native
    
    /**
      * Sometimes you just need to clear a cached item manually.
      * Backbone.fetchCache.clearItem() can be called safely from anywhere
      * in your application. It will take your backbone Model or Collection,
      * a function that returns the key String, or the key String itself. If
      * you pass in a Model or Collection, the .getCacheKey() method will be
      * checked before the url property.
      */
    def clearItem(args: js.Any*): js.Any = js.native
    
    /**
      * Global flag to enable/disable caching
      */
    var enabled: Boolean = js.native
    
    /**
      * You can explicitly fetch a cached item, without having to call the
      * models/collection fetch. This might be useful for debugging and
      * testing.
      */
    def getCache(key: js.Function0[String]): Cache = js.native
    def getCache(key: js.Function0[String], opts: GetCacheOptions): Cache = js.native
    def getCache(key: GetCacheKeyOptions): Cache = js.native
    def getCache(key: GetCacheKeyOptions, opts: GetCacheOptions): Cache = js.native
    
    def getCacheKey(key: js.Function0[String]): String = js.native
    def getCacheKey(key: js.Function0[String], opts: GetCacheOptions): String = js.native
    def getCacheKey(key: GetCacheKeyOptions): String = js.native
    def getCacheKey(key: GetCacheKeyOptions, opts: GetCacheOptions): String = js.native
    
    /**
      * If you want to know when was the last (server) sync of a given key, you can use.
      */
    def getLastSync(key: js.Function0[String]): Double = js.native
    def getLastSync(key: js.Function0[String], opts: GetCacheOptions): Double = js.native
    def getLastSync(key: GetCacheKeyOptions): Double = js.native
    def getLastSync(key: GetCacheKeyOptions, opts: GetCacheOptions): Double = js.native
    
    def getLocalStorage(): Unit = js.native
    
    def getLocalStorageKey(): String = js.native
    
    /**
      * By default the cache is persisted in localStorage (if available).
      * Set Backbone.fetchCache.localStorage = false to disable this.
      */
    var localStorage: Boolean = js.native
    
    /**
      * When setting items in localStorage, the browser may throw a
      * QUOTA_EXCEEDED_ERR, meaning the store is full. Backbone.fetchCache
      * tries to work around this problem by deleting what it considers the
      * most stale item to make space for the new data. The staleness of
      * data is determined by the sorting function priorityFn, which by
      * default returns the oldest item.
      */
    def priorityFn(a: Cache, b: Cache): Double = js.native
    
    def reset(): Unit = js.native
    
    def setCache(instance: js.Function0[String]): Unit = js.native
    def setCache(instance: js.Function0[String], opts: js.UndefOr[scala.Nothing], attrs: js.Any): Unit = js.native
    def setCache(instance: js.Function0[String], opts: SetCacheOptions): Unit = js.native
    def setCache(instance: js.Function0[String], opts: SetCacheOptions, attrs: js.Any): Unit = js.native
    def setCache(instance: GetCacheKeyOptions): Unit = js.native
    def setCache(instance: GetCacheKeyOptions, opts: js.UndefOr[scala.Nothing], attrs: js.Any): Unit = js.native
    def setCache(instance: GetCacheKeyOptions, opts: SetCacheOptions): Unit = js.native
    def setCache(instance: GetCacheKeyOptions, opts: SetCacheOptions, attrs: js.Any): Unit = js.native
    
    def setLocalStorage(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  trait SuperMethods extends StObject {
    
    def collectionFetch(): JQueryXHR = js.native
    def collectionFetch(options: CollectionFetchOptions): JQueryXHR = js.native
    
    def modelFetch(): JQueryXHR = js.native
    def modelFetch(options: ModelFetchOptions): JQueryXHR = js.native
    
    def modelSync(arg: js.Any*): JQueryXHR = js.native
  }
  
  trait _GetCacheKeyOptions extends StObject
  object _GetCacheKeyOptions {
    
    @scala.inline
    def GetCacheKeyObject(): typingsSlinky.backboneFetchCache.mod.GetCacheKeyObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.backboneFetchCache.mod.GetCacheKeyObject]
    }
    
    @scala.inline
    def Url(url: String): typingsSlinky.backboneFetchCache.anon.Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.backboneFetchCache.anon.Url]
    }
  }
}
