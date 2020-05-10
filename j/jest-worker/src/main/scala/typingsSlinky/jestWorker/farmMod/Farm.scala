package typingsSlinky.jestWorker.farmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Farm extends js.Object {
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
  implicit class FarmOps[Self <: Farm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_cacheKeys(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cacheKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_callback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_computeWorkerKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_computeWorkerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_enqueue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enqueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_getNextTask(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getNextTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_isLocked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_last(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lock(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_locks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_locks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_numOfWorkers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numOfWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_offset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_process(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_push(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_queue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_unlock(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_unlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoWork(value: (String, /* repeated */ js.Any) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doWork")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

