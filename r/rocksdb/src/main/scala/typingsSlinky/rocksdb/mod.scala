package typingsSlinky.rocksdb

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.abstractLeveldown.mod.AbstractBatch
import typingsSlinky.abstractLeveldown.mod.AbstractChainedBatch
import typingsSlinky.abstractLeveldown.mod.AbstractGetOptions
import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractIteratorOptions
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.abstractLeveldown.mod.AbstractOpenOptions
import typingsSlinky.abstractLeveldown.mod.AbstractOptions
import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import typingsSlinky.abstractLeveldown.mod.ErrorKeyValueCallback
import typingsSlinky.abstractLeveldown.mod.ErrorValueCallback
import typingsSlinky.node.Buffer
import typingsSlinky.rocksdb.mod.RocksDB.BatchOptions
import typingsSlinky.rocksdb.mod.RocksDB.Bytes
import typingsSlinky.rocksdb.mod.RocksDB.Constructor
import typingsSlinky.rocksdb.mod.RocksDB.DelOptions
import typingsSlinky.rocksdb.mod.RocksDB.ErrorSizeCallback
import typingsSlinky.rocksdb.mod.RocksDB.GetOptions
import typingsSlinky.rocksdb.mod.RocksDB.Iterator
import typingsSlinky.rocksdb.mod.RocksDB.IteratorOptions
import typingsSlinky.rocksdb.mod.RocksDB.PutOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rocksdb", JSImport.Default)
    @js.native
    class ^ protected () extends RocksDB {
      def this(location: String) = this()
    }
    
    @JSImport("rocksdb", JSImport.Default)
    @js.native
    val ^ : Constructor = js.native
    
    type _To = Constructor
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Constructor = ^
  }
  
  @js.native
  trait RocksDB extends AbstractLevelDOWN[Bytes, Bytes] {
    
    def approximateSize(start: Bytes, end: Bytes, cb: ErrorSizeCallback): Unit = js.native
    
    def batch(array: js.Array[AbstractBatch[_, _]], options: BatchOptions, cb: ErrorCallback): AbstractChainedBatch[Bytes, Bytes] = js.native
    
    def compactRange(start: Bytes, end: Bytes, cb: ErrorCallback): Unit = js.native
    
    def del(key: Bytes, options: DelOptions, cb: ErrorCallback): Unit = js.native
    
    def destroy(location: String, cb: ErrorCallback): Unit = js.native
    
    def get(key: Bytes, options: GetOptions, cb: ErrorValueCallback[Bytes]): Unit = js.native
    
    def getProperty(property: String): String = js.native
    
    def iterator(options: IteratorOptions): Iterator = js.native
    
    def put(key: Bytes, value: Bytes, options: PutOptions, cb: ErrorCallback): Unit = js.native
    
    def repair(location: String, cb: ErrorCallback): Unit = js.native
  }
  object RocksDB {
    
    @js.native
    trait BatchOptions extends AbstractOptions {
      
      var sync: js.UndefOr[Boolean] = js.native
    }
    object BatchOptions {
      
      @scala.inline
      def apply(): BatchOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchOptions]
      }
      
      @scala.inline
      implicit class BatchOptionsMutableBuilder[Self <: BatchOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      }
    }
    
    type Bytes = String | Buffer
    
    @js.native
    trait Constructor extends Instantiable1[/* location */ String, RocksDB] {
      
      def apply(location: String): RocksDB = js.native
    }
    
    @js.native
    trait DelOptions extends AbstractOptions {
      
      var sync: js.UndefOr[Boolean] = js.native
    }
    object DelOptions {
      
      @scala.inline
      def apply(): DelOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DelOptions]
      }
      
      @scala.inline
      implicit class DelOptionsMutableBuilder[Self <: DelOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      }
    }
    
    type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* size */ Double, Unit]
    
    @js.native
    trait GetOptions extends AbstractGetOptions {
      
      var fillCache: js.UndefOr[Boolean] = js.native
    }
    object GetOptions {
      
      @scala.inline
      def apply(): GetOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetOptions]
      }
      
      @scala.inline
      implicit class GetOptionsMutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
      }
    }
    
    @js.native
    trait Iterator extends AbstractIterator[Bytes, Bytes] {
      
      var binding: js.Any = js.native
      
      var cache: js.Any = js.native
      
      var fastFuture: js.Any = js.native
      
      var finished: js.Any = js.native
      
      def seek(key: Bytes): Unit = js.native
    }
    object Iterator {
      
      @scala.inline
      def apply(
        binding: js.Any,
        cache: js.Any,
        db: AbstractLevelDOWN[Bytes, Bytes],
        end: ErrorCallback => Unit,
        fastFuture: js.Any,
        finished: js.Any,
        next: ErrorKeyValueCallback[Bytes, Bytes] => Iterator,
        seek: Bytes => Unit
      ): Iterator = {
        val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), fastFuture = fastFuture.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], next = js.Any.fromFunction1(next), seek = js.Any.fromFunction1(seek))
        __obj.asInstanceOf[Iterator]
      }
      
      @scala.inline
      implicit class IteratorMutableBuilder[Self <: Iterator] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBinding(value: js.Any): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFastFuture(value: js.Any): Self = StObject.set(x, "fastFuture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFinished(value: js.Any): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeek(value: Bytes => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait IteratorOptions extends AbstractIteratorOptions[Bytes] {
      
      var fillCache: js.UndefOr[Boolean] = js.native
    }
    object IteratorOptions {
      
      @scala.inline
      def apply(): IteratorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IteratorOptions]
      }
      
      @scala.inline
      implicit class IteratorOptionsMutableBuilder[Self <: IteratorOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
      }
    }
    
    // tslint:disable-next-line:no-empty-interface
    type OpenOptions = AbstractOpenOptions
    
    @js.native
    trait PutOptions extends AbstractOptions {
      
      var sync: js.UndefOr[Boolean] = js.native
    }
    object PutOptions {
      
      @scala.inline
      def apply(): PutOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PutOptions]
      }
      
      @scala.inline
      implicit class PutOptionsMutableBuilder[Self <: PutOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      }
    }
  }
}
