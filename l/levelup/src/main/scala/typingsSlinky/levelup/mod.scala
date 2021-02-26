package typingsSlinky.levelup

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.abstractLeveldown.mod.AbstractBatch
import typingsSlinky.abstractLeveldown.mod.AbstractGetOptions
import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractIteratorOptions
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.abstractLeveldown.mod.AbstractOptions
import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import typingsSlinky.abstractLeveldown.mod.ErrorValueCallback
import typingsSlinky.levelup.levelupStrings.batch
import typingsSlinky.levelup.levelupStrings.clear
import typingsSlinky.levelup.levelupStrings.closed
import typingsSlinky.levelup.levelupStrings.closing
import typingsSlinky.levelup.levelupStrings.del
import typingsSlinky.levelup.levelupStrings.open
import typingsSlinky.levelup.levelupStrings.opening
import typingsSlinky.levelup.levelupStrings.put
import typingsSlinky.levelup.levelupStrings.ready
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  // ? level-errors is not in DT
  @JSImport("levelup", JSImport.Default)
  @js.native
  val default: LevelUpConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("levelup", JSImport.Default)
  @js.native
  class defaultCls[DB /* <: AbstractLevelDOWN[_, _] */] protected ()
    extends LevelUp[DB, AbstractIterator[js.Any, js.Any]] {
    def this(db: DB) = this()
    def this(db: DB, cb: ErrorCallback) = this()
    def this(db: DB, options: js.Any) = this()
    def this(db: DB, options: js.Any, cb: ErrorCallback) = this()
  }
  
  @JSImport("levelup", "errors")
  @js.native
  val errors: /*typeof levelerrors*/ js.Any = js.native
  
  @js.native
  trait AbstractClearOptions[K] extends AbstractOptions {
    
    var gt: js.UndefOr[K] = js.native
    
    var gte: js.UndefOr[K] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var lt: js.UndefOr[K] = js.native
    
    var lte: js.UndefOr[K] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
  }
  object AbstractClearOptions {
    
    @scala.inline
    def apply[K](): AbstractClearOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractClearOptions[K]]
    }
    
    @scala.inline
    implicit class AbstractClearOptionsMutableBuilder[Self <: AbstractClearOptions[_], K] (val x: Self with AbstractClearOptions[K]) extends AnyVal {
      
      @scala.inline
      def setGt(value: K): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
      
      @scala.inline
      def setGte(value: K): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLt(value: K): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      @scala.inline
      def setLte(value: K): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  type InferDBClear[DB] = LevelUpClear[AbstractClearOptions[js.Any] | js.Any]
  
  type InferDBDel[DB] = LevelUpDel[js.Any, AbstractOptions | js.Any]
  
  type InferDBGet[DB] = LevelUpGet[js.Any, js.Any, AbstractGetOptions | js.Any]
  
  type InferDBPut[DB] = LevelUpPut[js.Any, js.Any, AbstractOptions | js.Any]
  
  @js.native
  trait LevelUp[DB, Iterator] extends EventEmitter {
    
    def batch(): LevelUpChain[_, _] = js.native
    def batch(array: js.Array[AbstractBatch[_, _]]): js.Promise[Unit] = js.native
    def batch(array: js.Array[AbstractBatch[_, _]], callback: js.Function1[/* err */ js.UndefOr[js.Any], _]): Unit = js.native
    def batch(array: js.Array[AbstractBatch[_, _]], options: js.Any): js.Promise[Unit] = js.native
    def batch(
      array: js.Array[AbstractBatch[_, _]],
      options: js.Any,
      callback: js.Function1[/* err */ js.UndefOr[js.Any], _]
    ): Unit = js.native
    
    var clear: InferDBClear[DB] = js.native
    
    def close(): Unit = js.native
    def close(callback: ErrorCallback): Unit = js.native
    @JSName("close")
    def close_Promise(): js.Promise[Unit] = js.native
    
    def createKeyStream(): ReadableStream = js.native
    def createKeyStream(options: AbstractIteratorOptions[_]): ReadableStream = js.native
    
    def createReadStream(): ReadableStream = js.native
    def createReadStream(options: AbstractIteratorOptions[_]): ReadableStream = js.native
    
    def createValueStream(): ReadableStream = js.native
    def createValueStream(options: AbstractIteratorOptions[_]): ReadableStream = js.native
    
    var del: InferDBDel[DB] = js.native
    
    var get: InferDBGet[DB] = js.native
    
    def isClosed(): Boolean = js.native
    
    def isOpen(): Boolean = js.native
    
    def iterator(): Iterator = js.native
    def iterator(options: AbstractIteratorOptions[_]): Iterator = js.native
    
    /*
      emitted when a batch operation has executed
      */
    @JSName("on")
    def on_batch(event: batch, cb: js.Function1[/* ary */ js.Array[_], Unit]): this.type = js.native
    /*
      emitted when clear is called
      */
    @JSName("on")
    def on_clear(event: clear, cb: js.Function1[/* opts */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_closed(event: closed, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_closing(event: closing, cb: js.Function0[Unit]): this.type = js.native
    /*
      emitted when a value is deleted
      */
    @JSName("on")
    def on_del(event: del, cb: js.Function1[/* key */ js.Any, Unit]): this.type = js.native
    /*
      emitted on given event
      */
    @JSName("on")
    def on_open(event: open, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_opening(event: opening, cb: js.Function0[Unit]): this.type = js.native
    /*
      emitted when a new value is 'put'
      */
    @JSName("on")
    def on_put(event: put, cb: js.Function2[/* key */ js.Any, /* value */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, cb: js.Function0[Unit]): this.type = js.native
    
    def open(): Unit = js.native
    def open(callback: ErrorCallback): Unit = js.native
    @JSName("open")
    def open_Promise(): js.Promise[Unit] = js.native
    
    var put: InferDBPut[DB] = js.native
  }
  
  type LevelUpBatch[K, O] = (js.Function2[/* key */ K, /* callback */ ErrorCallback, Unit]) with (js.Function3[/* key */ K, /* options */ O, /* callback */ ErrorCallback, Unit]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[Unit]])
  
  @js.native
  trait LevelUpChain[K, V] extends StObject {
    
    def clear(): this.type = js.native
    
    def del(key: K): this.type = js.native
    
    val length: Double = js.native
    
    def put(key: K, value: V): this.type = js.native
    
    def write(): js.Promise[this.type] = js.native
    def write(callback: ErrorCallback): this.type = js.native
  }
  
  type LevelUpClear[O] = (js.Function1[/* callback */ ErrorCallback, Unit]) with (js.Function2[/* options */ O, /* callback */ ErrorCallback, Unit]) with (js.Function1[/* options */ js.UndefOr[O], js.Promise[Unit]])
  
  @js.native
  trait LevelUpConstructor
    extends Instantiable1[
          /* db */ AbstractLevelDOWN[js.Any, js.Any], 
          LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]]
        ]
       with Instantiable2[
          /* db */ AbstractLevelDOWN[js.Any, js.Any], 
          (/* options */ js.Any) | (/* cb */ ErrorCallback), 
          LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]]
        ]
       with Instantiable3[
          /* db */ AbstractLevelDOWN[js.Any, js.Any], 
          /* options */ js.Any, 
          /* cb */ ErrorCallback, 
          LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]]
        ] {
    
    def apply[DB /* <: AbstractLevelDOWN[_, _] */](db: DB): LevelUp[DB, AbstractIterator[_, _]] = js.native
    def apply[DB /* <: AbstractLevelDOWN[_, _] */](db: DB, cb: ErrorCallback): LevelUp[DB, AbstractIterator[_, _]] = js.native
    def apply[DB /* <: AbstractLevelDOWN[_, _] */](db: DB, options: js.Any): LevelUp[DB, AbstractIterator[_, _]] = js.native
    def apply[DB /* <: AbstractLevelDOWN[_, _] */](db: DB, options: js.Any, cb: ErrorCallback): LevelUp[DB, AbstractIterator[_, _]] = js.native
    
    var errors: /*typeof levelerrors*/ js.Any = js.native
  }
  
  type LevelUpDel[K, O] = (js.Function2[/* key */ K, /* callback */ ErrorCallback, Unit]) with (js.Function3[/* key */ K, /* options */ O, /* callback */ ErrorCallback, Unit]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[Unit]])
  
  type LevelUpGet[K, V, O] = (js.Function2[/* key */ K, /* callback */ ErrorValueCallback[V], Unit]) with (js.Function3[/* key */ K, /* options */ O, /* callback */ ErrorValueCallback[V], Unit]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[V]])
  
  type LevelUpPut[K, V, O] = (js.Function3[/* key */ K, /* value */ V, /* callback */ ErrorCallback, Unit]) with (js.Function4[/* key */ K, /* value */ V, /* options */ O, /* callback */ ErrorCallback, Unit]) with (js.Function3[/* key */ K, /* value */ V, /* options */ js.UndefOr[O], js.Promise[Unit]])
  
  type _To = LevelUpConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: LevelUpConstructor = default
}
