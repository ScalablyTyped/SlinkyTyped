package typingsSlinky.ionicStorage

import typingsSlinky.angularCore.mod.InjectionToken
import typingsSlinky.ionicStorage.anon.DbKey
import typingsSlinky.localforage.LocalForage
import typingsSlinky.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  @JSImport("@ionic/storage/storage", "Storage")
  @js.native
  class Storage protected () extends StObject {
    /**
      * Create a new Storage instance using the order of drivers and any additional config
      * options to pass to LocalForage.
      *
      * Possible driver options are: ['sqlite', 'indexeddb', 'websql', 'localstorage'] and the
      * default is that exact ordering.
      */
    def this(config: StorageConfig, platformId: js.Object) = this()
    
    var _dbPromise: js.Any = js.native
    
    var _driver: js.Any = js.native
    
    /** @hidden */
    var _getDriverOrder: js.Any = js.native
    
    /**
      * Clear the entire key value store. WARNING: HOT!
      * @returns Returns a promise that resolves when the store is cleared
      */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Get the name of the driver being used.
      * @returns Name of the driver
      */
    def driver: String | Null = js.native
    
    /**
      * Iterate through each key,value pair.
      * @param iteratorCallback a callback of the form (value, key, iterationNumber)
      * @returns Returns a promise that resolves when the iteration has finished.
      */
    def forEach(
      iteratorCallback: js.Function3[/* value */ js.Any, /* key */ String, /* iterationNumber */ Number, _]
    ): js.Promise[Unit] = js.native
    
    /**
      * Get the value associated with the given key.
      * @param key the key to identify this value
      * @returns Returns a promise with the value of the given key
      */
    def get(key: String): js.Promise[_] = js.native
    
    /**
      * @returns Returns a promise that resolves with the keys in the store.
      */
    def keys(): js.Promise[js.Array[String]] = js.native
    
    /**
      * @returns Returns a promise that resolves with the number of keys stored.
      */
    def length(): js.Promise[Double] = js.native
    
    var platformId: js.Any = js.native
    
    /**
      * Reflect the readiness of the store.
      * @returns Returns a promise that resolves when the store is ready
      */
    def ready(): js.Promise[LocalForage] = js.native
    
    /**
      * Remove any value associated with this key.
      * @param key the key to identify this value
      * @returns Returns a promise that resolves when the value is removed
      */
    def remove(key: String): js.Promise[_] = js.native
    
    /**
      * Set the value for the given key.
      * @param key the key to identify this value
      * @param value the value for this key
      * @returns Returns a promise that resolves when the key and value are set
      */
    def set(key: String, value: js.Any): js.Promise[_] = js.native
  }
  
  @JSImport("@ionic/storage/storage", "StorageConfigToken")
  @js.native
  val StorageConfigToken: InjectionToken[js.Any] = js.native
  
  @JSImport("@ionic/storage/storage", "getDefaultConfig")
  @js.native
  def getDefaultConfig(): DbKey = js.native
  
  @JSImport("@ionic/storage/storage", "provideStorage")
  @js.native
  def provideStorage(storageConfig: StorageConfig, platformID: js.Object): Storage = js.native
  
  @js.native
  trait StorageConfig extends StObject {
    
    var dbKey: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var driverOrder: js.UndefOr[js.Array[String]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var storeName: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object StorageConfig {
    
    @scala.inline
    def apply(): StorageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageConfig]
    }
    
    @scala.inline
    implicit class StorageConfigMutableBuilder[Self <: StorageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbKey(value: String): Self = StObject.set(x, "dbKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbKeyUndefined: Self = StObject.set(x, "dbKey", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDriverOrder(value: js.Array[String]): Self = StObject.set(x, "driverOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriverOrderUndefined: Self = StObject.set(x, "driverOrder", js.undefined)
      
      @scala.inline
      def setDriverOrderVarargs(value: String*): Self = StObject.set(x, "driverOrder", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
