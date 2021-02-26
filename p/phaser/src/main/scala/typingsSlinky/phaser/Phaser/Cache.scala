package typingsSlinky.phaser.Phaser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phaser.Phaser.Events.EventEmitter
import typingsSlinky.phaser.Phaser.Structs.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cache {
  
  /**
    * The BaseCache is a base Cache class that can be used for storing references to any kind of data.
    * 
    * Data can be added, retrieved and removed based on the given keys.
    * 
    * Keys are string-based.
    */
  @js.native
  trait BaseCache extends StObject {
    
    /**
      * Adds an item to this cache. The item is referenced by a unique string, which you are responsible
      * for setting and keeping track of. The item can only be retrieved by using this string.
      * @param key The unique key by which the data added to the cache will be referenced.
      * @param data The data to be stored in the cache.
      */
    def add(key: String, data: js.Any): this.type = js.native
    
    /**
      * Destroys this cache and all items within it.
      */
    def destroy(): Unit = js.native
    
    /**
      * The Map in which the cache objects are stored.
      * 
      * You can query the Map directly or use the BaseCache methods.
      */
    var entries: Map[String, _] = js.native
    
    /**
      * An instance of EventEmitter used by the cache to emit related events.
      */
    var events: EventEmitter = js.native
    
    /**
      * Checks if this cache contains an item matching the given key.
      * This performs the same action as `BaseCache.has` and is called directly by the Loader.
      * @param key The unique key of the item to be checked in this cache.
      */
    def exists(key: String): Boolean = js.native
    
    /**
      * Gets an item from this cache based on the given key.
      * @param key The unique key of the item to be retrieved from this cache.
      */
    def get(key: String): js.Any = js.native
    
    /**
      * Returns all keys in use in this cache.
      */
    def getKeys(): js.Array[String] = js.native
    
    /**
      * Checks if this cache contains an item matching the given key.
      * This performs the same action as `BaseCache.exists`.
      * @param key The unique key of the item to be checked in this cache.
      */
    def has(key: String): Boolean = js.native
    
    /**
      * Removes and item from this cache based on the given key.
      * 
      * If an entry matching the key is found it is removed from the cache and a `remove` event emitted.
      * No additional checks are done on the item removed. If other systems or parts of your game code
      * are relying on this item, it is up to you to sever those relationships prior to removing the item.
      * @param key The unique key of the item to remove from the cache.
      */
    def remove(key: String): this.type = js.native
  }
  object BaseCache {
    
    @scala.inline
    def apply(
      add: (String, js.Any) => BaseCache,
      destroy: () => Unit,
      entries: Map[String, _],
      events: EventEmitter,
      exists: String => Boolean,
      get: String => js.Any,
      getKeys: () => js.Array[String],
      has: String => Boolean,
      remove: String => BaseCache
    ): BaseCache = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), destroy = js.Any.fromFunction0(destroy), entries = entries.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], exists = js.Any.fromFunction1(exists), get = js.Any.fromFunction1(get), getKeys = js.Any.fromFunction0(getKeys), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[BaseCache]
    }
    
    @scala.inline
    implicit class BaseCacheMutableBuilder[Self <: BaseCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (String, js.Any) => BaseCache): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEntries(value: Map[String, _]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExists(value: String => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetKeys(value: () => js.Array[String]): Self = StObject.set(x, "getKeys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: String => BaseCache): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The Cache Manager is the global cache owned and maintained by the Game instance.
    * 
    * Various systems, such as the file Loader, rely on this cache in order to store the files
    * it has loaded. The manager itself doesn't store any files, but instead owns multiple BaseCache
    * instances, one per type of file. You can also add your own custom caches.
    */
  @js.native
  trait CacheManager extends StObject {
    
    /**
      * Add your own custom Cache for storing your own files.
      * The cache will be available under `Cache.custom.key`.
      * The cache will only be created if the key is not already in use.
      * @param key The unique key of your custom cache.
      */
    def addCustom(key: String): BaseCache = js.native
    
    /**
      * A Cache storing all non-streaming audio files, typically added via the Loader.
      */
    var audio: BaseCache = js.native
    
    /**
      * A Cache storing all binary files, typically added via the Loader.
      */
    var binary: BaseCache = js.native
    
    /**
      * A Cache storing all bitmap font data files, typically added via the Loader.
      * Only the font data is stored in this cache, the textures are part of the Texture Manager.
      */
    var bitmapFont: BaseCache = js.native
    
    /**
      * An object that contains your own custom BaseCache entries.
      * Add to this via the `addCustom` method.
      */
    var custom: StringDictionary[BaseCache] = js.native
    
    /**
      * Removes all entries from all BaseCaches and destroys all custom caches.
      */
    def destroy(): Unit = js.native
    
    /**
      * A reference to the Phaser.Game instance that owns this CacheManager.
      */
    var game: Game = js.native
    
    /**
      * A Cache storing all html files, typically added via the Loader.
      */
    var html: BaseCache = js.native
    
    /**
      * A Cache storing all JSON data files, typically added via the Loader.
      */
    var json: BaseCache = js.native
    
    /**
      * A Cache storing all WaveFront OBJ files, typically added via the Loader.
      */
    var obj: BaseCache = js.native
    
    /**
      * A Cache storing all physics data files, typically added via the Loader.
      */
    var physics: BaseCache = js.native
    
    /**
      * A Cache storing all shader source files, typically added via the Loader.
      */
    var shader: BaseCache = js.native
    
    /**
      * A Cache storing all text files, typically added via the Loader.
      */
    var text: BaseCache = js.native
    
    /**
      * A Cache storing all tilemap data files, typically added via the Loader.
      * Only the data is stored in this cache, the textures are part of the Texture Manager.
      */
    var tilemap: BaseCache = js.native
    
    /**
      * A Cache storing all non-streaming video files, typically added via the Loader.
      */
    var video: BaseCache = js.native
    
    /**
      * A Cache storing all xml data files, typically added via the Loader.
      */
    var xml: BaseCache = js.native
  }
  object CacheManager {
    
    @scala.inline
    def apply(
      addCustom: String => BaseCache,
      audio: BaseCache,
      binary: BaseCache,
      bitmapFont: BaseCache,
      custom: StringDictionary[BaseCache],
      destroy: () => Unit,
      game: Game,
      html: BaseCache,
      json: BaseCache,
      obj: BaseCache,
      physics: BaseCache,
      shader: BaseCache,
      text: BaseCache,
      tilemap: BaseCache,
      video: BaseCache,
      xml: BaseCache
    ): CacheManager = {
      val __obj = js.Dynamic.literal(addCustom = js.Any.fromFunction1(addCustom), audio = audio.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], bitmapFont = bitmapFont.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), game = game.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], shader = shader.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tilemap = tilemap.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheManager]
    }
    
    @scala.inline
    implicit class CacheManagerMutableBuilder[Self <: CacheManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCustom(value: String => BaseCache): Self = StObject.set(x, "addCustom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAudio(value: BaseCache): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinary(value: BaseCache): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitmapFont(value: BaseCache): Self = StObject.set(x, "bitmapFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom(value: StringDictionary[BaseCache]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: BaseCache): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: BaseCache): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObj(value: BaseCache): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhysics(value: BaseCache): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShader(value: BaseCache): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: BaseCache): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTilemap(value: BaseCache): Self = StObject.set(x, "tilemap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo(value: BaseCache): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXml(value: BaseCache): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    }
  }
}
