package typingsSlinky.jestWorker.childProcessWorkerMod

import typingsSlinky.jestWorker.typesMod.ChildMessage
import typingsSlinky.jestWorker.typesMod.OnEnd
import typingsSlinky.jestWorker.typesMod.OnStart
import typingsSlinky.jestWorker.typesMod.ParentMessage
import typingsSlinky.jestWorker.typesMod.WorkerInterface
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcessWorker extends WorkerInterface {
  var _child: js.Any = js.native
  var _fakeStream: js.Any = js.native
  var _getFakeStream: js.Any = js.native
  var _onProcessEnd: js.Any = js.native
  var _options: js.Any = js.native
  var _request: js.Any = js.native
  var _retries: js.Any = js.native
  var _shutdown: js.Any = js.native
  var _stderr: js.Any = js.native
  var _stdout: js.Any = js.native
  def initialize(): Unit = js.native
}

object ChildProcessWorker {
  @scala.inline
  def apply(
    _child: js.Any,
    _fakeStream: js.Any,
    _getFakeStream: js.Any,
    _onProcessEnd: js.Any,
    _options: js.Any,
    _request: js.Any,
    _retries: js.Any,
    _shutdown: js.Any,
    _stderr: js.Any,
    _stdout: js.Any,
    getStderr: () => ReadableStream | Null,
    getStdout: () => ReadableStream | Null,
    getWorkerId: () => Double,
    initialize: () => Unit,
    onExit: Double => Unit,
    onMessage: ParentMessage => Unit,
    send: (ChildMessage, OnStart, OnEnd) => Unit
  ): ChildProcessWorker = {
    val __obj = js.Dynamic.literal(_child = _child.asInstanceOf[js.Any], _fakeStream = _fakeStream.asInstanceOf[js.Any], _getFakeStream = _getFakeStream.asInstanceOf[js.Any], _onProcessEnd = _onProcessEnd.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _request = _request.asInstanceOf[js.Any], _retries = _retries.asInstanceOf[js.Any], _shutdown = _shutdown.asInstanceOf[js.Any], _stderr = _stderr.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any], getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkerId = js.Any.fromFunction0(getWorkerId), initialize = js.Any.fromFunction0(initialize), onExit = js.Any.fromFunction1(onExit), onMessage = js.Any.fromFunction1(onMessage), send = js.Any.fromFunction3(send))
    __obj.asInstanceOf[ChildProcessWorker]
  }
  @scala.inline
  implicit class ChildProcessWorkerOps[Self <: ChildProcessWorker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_child(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_fakeStream(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fakeStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_getFakeStream(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getFakeStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onProcessEnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onProcessEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_options(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_request(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_retries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_shutdown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_shutdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_stderr(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_stdout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

