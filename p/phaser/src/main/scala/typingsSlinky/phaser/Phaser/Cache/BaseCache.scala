package typingsSlinky.phaser.Phaser.Cache

import typingsSlinky.phaser.Phaser.Events.EventEmitter
import typingsSlinky.phaser.Phaser.Structs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The BaseCache is a base Cache class that can be used for storing references to any kind of data.
  * 
  * Data can be added, retrieved and removed based on the given keys.
  * 
  * Keys are string-based.
  */
@js.native
trait BaseCache extends js.Object {
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
    * Adds an item to this cache. The item is referenced by a unique string, which you are responsible
    * for setting and keeping track of. The item can only be retrieved by using this string.
    * @param key The unique key by which the data added to the cache will be referenced.
    * @param data The data to be stored in the cache.
    */
  def add(key: String, data: js.Any): BaseCache = js.native
  /**
    * Destroys this cache and all items within it.
    */
  def destroy(): Unit = js.native
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
  def remove(key: String): BaseCache = js.native
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
  implicit class BaseCacheOps[Self <: BaseCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, js.Any) => BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEntries(value: Map[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: EventEmitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetKeys(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => BaseCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

