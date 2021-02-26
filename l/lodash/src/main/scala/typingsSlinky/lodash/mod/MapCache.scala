package typingsSlinky.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a cache object to store key/value pairs.
  */
@js.native
trait MapCache extends StObject {
  
  /**
    * Removes all key-value entries from the map.
    */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Removes `key` and its value from the cache.
    * @param key The key of the value to remove.
    * @return Returns `true` if the entry was removed successfully, else `false`.
    */
  def delete(key: js.Any): Boolean = js.native
  
  /**
    * Gets the cached value for `key`.
    * @param key The key of the value to get.
    * @return Returns the cached value.
    */
  def get(key: js.Any): js.Any = js.native
  
  /**
    * Checks if a cached value for `key` exists.
    * @param key The key of the entry to check.
    * @return Returns `true` if an entry for `key` exists, else `false`.
    */
  def has(key: js.Any): Boolean = js.native
  
  /**
    * Sets `value` to `key` of the cache.
    * @param key The key of the value to cache.
    * @param value The value to cache.
    * @return Returns the cache object.
    */
  def set(key: js.Any, value: js.Any): this.type = js.native
}
object MapCache {
  
  @scala.inline
  def apply(
    delete: js.Any => Boolean,
    get: js.Any => js.Any,
    has: js.Any => Boolean,
    set: (js.Any, js.Any) => MapCache
  ): MapCache = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[MapCache]
  }
  
  @scala.inline
  implicit class MapCacheMutableBuilder[Self <: MapCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setDelete(value: js.Any => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: js.Any => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: js.Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (js.Any, js.Any) => MapCache): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
