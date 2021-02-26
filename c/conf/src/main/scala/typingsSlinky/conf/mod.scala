package typingsSlinky.conf

import typingsSlinky.conf.typesMod.OnDidAnyChangeCallback
import typingsSlinky.conf.typesMod.OnDidChangeCallback
import typingsSlinky.conf.typesMod.Options
import typingsSlinky.conf.typesMod.Unsubscribe
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.Exclude
import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("conf", JSImport.Default)
  @js.native
  class default[T /* <: Record[String, _] */] () extends Conf[T] {
    def this(partialOptions: Partial[Options[T]]) = this()
  }
  
  @js.native
  trait Conf[T /* <: Record[String, _] */]
    extends Iterable[
          js.Tuple2[
            /* keyof T */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
          ]
        ] {
    
    var _containsReservedKey: js.Any = js.native
    
    val _deserialize: js.Any = js.native
    
    var _encryptData: js.Any = js.native
    
    var _ensureDirectory: js.Any = js.native
    
    var _get: js.Any = js.native
    
    var _handleChange: js.Any = js.native
    
    var _isVersionInRangeFormat: js.Any = js.native
    
    var _migrate: js.Any = js.native
    
    val _serialize: js.Any = js.native
    
    var _set: js.Any = js.native
    
    var _shouldPerformMigration: js.Any = js.native
    
    var _validate: js.Any = js.native
    
    var _watch: js.Any = js.native
    
    var _write: js.Any = js.native
    
    /**
      Delete all items.
      */
    def clear(): Unit = js.native
    
    /**
      Delete an item.
      @param key - The key of the item to delete.
      */
    def delete[Key /* <: /* keyof T */ String */](key: Key): Unit = js.native
    
    val events: EventEmitter = js.native
    
    /**
      Get an item.
      @param key - The key of the item to get.
      @param defaultValue - The default value if the item does not exist.
      */
    def get[Key /* <: /* keyof T */ String */](key: Key): /* import warning: importer.ImportType#apply Failed type conversion: T[Key] */ js.Any = js.native
    def get[Key /* <: /* keyof T */ String */](
      key: Key,
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[Key] */ js.Any
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[Key] */ js.Any = js.native
    def get[Key /* <: String */, Value](key: Exclude[Key, /* keyof T */ String]): Value = js.native
    def get[Key /* <: String */, Value](key: Exclude[Key, /* keyof T */ String], defaultValue: Value): Value = js.native
    
    /**
      Check if an item exists.
      @param key - The key of the item to check.
      */
    def has[Key /* <: /* keyof T */ String */](key: Key): Boolean = js.native
    def has[Key /* <: /* keyof T */ String */](key: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Conf: js.Function0[
        IterableIterator[
          js.Tuple2[
            /* keyof T */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
          ]
        ]
      ] = js.native
    
    /**
      Watches the whole config object, calling `callback` on any changes.
      @param callback - A callback function that is called on any changes. When a `key` is first set `oldValue` will be `undefined`, and when a key is deleted `newValue` will be `undefined`.
      @returns A function, that when called, will unsubscribe.
      */
    def onDidAnyChange(callback: OnDidAnyChangeCallback[T]): Unsubscribe = js.native
    
    /**
      Watches the given `key`, calling `callback` on any changes.
      @param key - The key wo watch.
      @param callback - A callback function that is called on any changes. When a `key` is first set `oldValue` will be `undefined`, and when a key is deleted `newValue` will be `undefined`.
      @returns A function, that when called, will unsubscribe.
      */
    def onDidChange[Key /* <: /* keyof T */ String */](
      key: Key,
      callback: OnDidChangeCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: T[Key] */ js.Any
        ]
    ): Unsubscribe = js.native
    
    val path: String = js.native
    
    var `private`: js.Any = js.native
    
    /**
      Reset items to their default values, as defined by the `defaults` or `schema` option.
      @param keys - The keys of the items to reset.
      */
    def reset[Key /* <: /* keyof T */ String */](keys: Key*): Unit = js.native
    
    def set(key: String, value: js.Any): Unit = js.native
    def set(`object`: Partial[T]): Unit = js.native
    /**
      Set an item or multiple items at once.
      @param {key|object} - You can use [dot-notation](https://github.com/sindresorhus/dot-prop) in a key to access nested properties. Or a hashmap of items to set at once.
      @param value - Must be JSON serializable. Trying to set the type `undefined`, `function`, or `symbol` will result in a `TypeError`.
      */
    def set[Key /* <: /* keyof T */ String */](key: Key): Unit = js.native
    def set[Key /* <: /* keyof T */ String */](
      key: Key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[Key] */ js.Any
    ): Unit = js.native
    
    def size: Double = js.native
    
    def store: T = js.native
    def store_=(value: T): Unit = js.native
  }
}
