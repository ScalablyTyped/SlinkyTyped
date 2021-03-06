package typingsSlinky.jestWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object farmMod {
  
  @JSImport("jest-worker/build/Farm", JSImport.Default)
  @js.native
  class default protected () extends Farm {
    def this(numOfWorkers: Double, callback: js.Function) = this()
    def this(
      numOfWorkers: Double,
      callback: js.Function,
      computeWorkerKey: js.UndefOr[js.Function2[/* method */ String, /* repeated */ js.Any, String | Null]]
    ) = this()
  }
  
  @js.native
  trait Farm extends StObject {
    
    var _cacheKeys: js.Any = js.native
    
    var _callback: js.Any = js.native
    
    var _computeWorkerKey: js.Any = js.native
    
    var _enqueue: js.Any = js.native
    
    var _getNextTask: js.Any = js.native
    
    var _isLocked: js.Any = js.native
    
    var _last: js.Any = js.native
    
    var _lock: js.Any = js.native
    
    var _locks: js.Any = js.native
    
    var _numOfWorkers: js.Any = js.native
    
    var _offset: js.Any = js.native
    
    var _process: js.Any = js.native
    
    var _push: js.Any = js.native
    
    var _queue: js.Any = js.native
    
    var _unlock: js.Any = js.native
    
    def doWork(method: String, args: js.Any*): js.Promise[_] = js.native
  }
  object Farm {
    
    @scala.inline
    def apply(
      _cacheKeys: js.Any,
      _callback: js.Any,
      _computeWorkerKey: js.Any,
      _enqueue: js.Any,
      _getNextTask: js.Any,
      _isLocked: js.Any,
      _last: js.Any,
      _lock: js.Any,
      _locks: js.Any,
      _numOfWorkers: js.Any,
      _offset: js.Any,
      _process: js.Any,
      _push: js.Any,
      _queue: js.Any,
      _unlock: js.Any,
      doWork: (String, /* repeated */ js.Any) => js.Promise[_]
    ): Farm = {
      val __obj = js.Dynamic.literal(_cacheKeys = _cacheKeys.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _computeWorkerKey = _computeWorkerKey.asInstanceOf[js.Any], _enqueue = _enqueue.asInstanceOf[js.Any], _getNextTask = _getNextTask.asInstanceOf[js.Any], _isLocked = _isLocked.asInstanceOf[js.Any], _last = _last.asInstanceOf[js.Any], _lock = _lock.asInstanceOf[js.Any], _locks = _locks.asInstanceOf[js.Any], _numOfWorkers = _numOfWorkers.asInstanceOf[js.Any], _offset = _offset.asInstanceOf[js.Any], _process = _process.asInstanceOf[js.Any], _push = _push.asInstanceOf[js.Any], _queue = _queue.asInstanceOf[js.Any], _unlock = _unlock.asInstanceOf[js.Any], doWork = js.Any.fromFunction2(doWork))
      __obj.asInstanceOf[Farm]
    }
    
    @scala.inline
    implicit class FarmMutableBuilder[Self <: Farm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoWork(value: (String, /* repeated */ js.Any) => js.Promise[_]): Self = StObject.set(x, "doWork", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_cacheKeys(value: js.Any): Self = StObject.set(x, "_cacheKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_callback(value: js.Any): Self = StObject.set(x, "_callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_computeWorkerKey(value: js.Any): Self = StObject.set(x, "_computeWorkerKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_enqueue(value: js.Any): Self = StObject.set(x, "_enqueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getNextTask(value: js.Any): Self = StObject.set(x, "_getNextTask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isLocked(value: js.Any): Self = StObject.set(x, "_isLocked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_last(value: js.Any): Self = StObject.set(x, "_last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_lock(value: js.Any): Self = StObject.set(x, "_lock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_locks(value: js.Any): Self = StObject.set(x, "_locks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_numOfWorkers(value: js.Any): Self = StObject.set(x, "_numOfWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_offset(value: js.Any): Self = StObject.set(x, "_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_process(value: js.Any): Self = StObject.set(x, "_process", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_push(value: js.Any): Self = StObject.set(x, "_push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_queue(value: js.Any): Self = StObject.set(x, "_queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unlock(value: js.Any): Self = StObject.set(x, "_unlock", value.asInstanceOf[js.Any])
    }
  }
}
