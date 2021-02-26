package typingsSlinky.hashmap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hashmap", JSImport.Namespace)
  @js.native
  /**
    * Creates an empty hashmap.
    */
  class ^[TKey, TValue] () extends HashMap[TKey, TValue] {
    def this(data: js.Array[js.Tuple2[TKey, TValue]]) = this()
    /**
      * Creates a hashmap with the key-value pairs of map or from an array of key-values.
      *
      * @param data A hashmap to copy from or a set or key-value pairs for the initialization.
      */
    def this(data: HashMap[TKey, TValue]) = this()
    /**
      * Creates a hashmap with several key-value pairs.
      *
      * @param keysAndValues key1, value1, key2, value2...
      */
    def this(keysAndValues: (TKey | TValue)*) = this()
  }
  
  @js.native
  trait HashMap[TKey, TValue] extends StObject {
    
    /**
      * Clears hashmap.
      *
      * @return Self.
      */
    def clear(): HashMap[TKey, TValue] = js.native
    
    /**
      * Copy all key-value pairs from other to this instance.
      *
      * @param map Other map.
      * @return Self.
      */
    def copy(map: HashMap[TKey, TValue]): HashMap[TKey, TValue] = js.native
    
    /**
      * Returns size of hashmap (number of entries).
      *
      * @return Number of entries in hashmap.
      */
    def count(): Double = js.native
    
    /**
      * Removes given key from hashmap.
      *
      * @param key Key.
      * @return Self.
      */
    def delete(key: TKey): HashMap[TKey, TValue] = js.native
    
    /**
      * Returns all key-value pairs.
      *
      * @return List of key-value pairs.
      * @since 2.3.0
      */
    def entries(): js.Array[js.Tuple2[TKey, TValue]] = js.native
    
    /**
      * Iterates over hashmap.
      *
      * @param callback Function to be invoked for every hashmap entry.
      * @return Self.
      */
    def forEach(callback: js.Function2[/* value */ TValue, /* key */ TKey, Unit]): HashMap[TKey, TValue] = js.native
    
    /**
      * Return value from hashmap.
      *
      * @param key Key.
      * @return Value stored under given key.
      */
    def get(key: TKey): TValue = js.native
    
    /**
      * Checks if given key exists in hashmap.
      *
      * @param key Key.
      * @return Whether given key exists in hashmap.
      */
    def has(key: TKey): Boolean = js.native
    
    /**
      * Returns all contained keys.
      *
      * @return List of keys.
      */
    def keys(): js.Array[TKey] = js.native
    
    /**
      * Store several key-value pairs.
      *
      * @param keysAndValues key1, value1, key2, value2...
      * @return Self.
      */
    def multi(keysAndValues: (TKey | TValue)*): HashMap[TKey, TValue] = js.native
    
    /**
      * Removes given key from hashmap.
      *
      * @param key Key.
      * @return Self.
      * @deprecated Since 2.3.0
      */
    def remove(key: TKey): HashMap[TKey, TValue] = js.native
    
    /**
      * Returns key under which given value is stored.
      *
      * @param value Value.
      * @return Key which is assigned to value stored.
      */
    def search(value: TValue): TKey = js.native
    
    /**
      * Store value in hashmap.
      *
      * @param key Key.
      * @param value Value.
      * @return Self.
      */
    def set(key: TKey, value: TValue): HashMap[TKey, TValue] = js.native
    
    /**
      * Returns all container values.
      *
      * @return List of values.
      */
    def values(): js.Array[TValue] = js.native
  }
  object HashMap {
    
    @scala.inline
    def apply[TKey, TValue](
      clear: () => HashMap[TKey, TValue],
      copy: HashMap[TKey, TValue] => HashMap[TKey, TValue],
      count: () => Double,
      delete: TKey => HashMap[TKey, TValue],
      entries: () => js.Array[js.Tuple2[TKey, TValue]],
      forEach: js.Function2[/* value */ TValue, /* key */ TKey, Unit] => HashMap[TKey, TValue],
      get: TKey => TValue,
      has: TKey => Boolean,
      keys: () => js.Array[TKey],
      multi: /* repeated */ TKey | TValue => HashMap[TKey, TValue],
      remove: TKey => HashMap[TKey, TValue],
      search: TValue => TKey,
      set: (TKey, TValue) => HashMap[TKey, TValue],
      values: () => js.Array[TValue]
    ): HashMap[TKey, TValue] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), copy = js.Any.fromFunction1(copy), count = js.Any.fromFunction0(count), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), multi = js.Any.fromFunction1(multi), remove = js.Any.fromFunction1(remove), search = js.Any.fromFunction1(search), set = js.Any.fromFunction2(set), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[HashMap[TKey, TValue]]
    }
    
    @scala.inline
    implicit class HashMapMutableBuilder[Self <: HashMap[_, _], TKey, TValue] (val x: Self with (HashMap[TKey, TValue])) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => HashMap[TKey, TValue]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCopy(value: HashMap[TKey, TValue] => HashMap[TKey, TValue]): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDelete(value: TKey => HashMap[TKey, TValue]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEntries(value: () => js.Array[js.Tuple2[TKey, TValue]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setForEach(value: js.Function2[/* value */ TValue, /* key */ TKey, Unit] => HashMap[TKey, TValue]): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: TKey => TValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: TKey => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeys(value: () => js.Array[TKey]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMulti(value: /* repeated */ TKey | TValue => HashMap[TKey, TValue]): Self = StObject.set(x, "multi", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: TKey => HashMap[TKey, TValue]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSearch(value: TValue => TKey): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (TKey, TValue) => HashMap[TKey, TValue]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValues(value: () => js.Array[TValue]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
}
