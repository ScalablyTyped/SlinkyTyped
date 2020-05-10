package typingsSlinky.jestWorker.baseWorkerPoolMod

import typingsSlinky.jestWorker.typesMod.WorkerInterface
import typingsSlinky.jestWorker.typesMod.WorkerOptions
import typingsSlinky.jestWorker.typesMod.WorkerPoolOptions
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseWorkerPool extends js.Object {
  val _options: WorkerPoolOptions = js.native
  val _stderr: js.Any = js.native
  val _stdout: js.Any = js.native
  val _workers: js.Any = js.native
  def createWorker(_workerOptions: WorkerOptions): WorkerInterface = js.native
  def end(): Unit = js.native
  def getStderr(): ReadableStream = js.native
  def getStdout(): ReadableStream = js.native
  def getWorkerById(workerId: Double): WorkerInterface = js.native
  def getWorkers(): js.Array[WorkerInterface] = js.native
}

object BaseWorkerPool {
  @scala.inline
  def apply(
    _options: WorkerPoolOptions,
    _stderr: js.Any,
    _stdout: js.Any,
    _workers: js.Any,
    createWorker: WorkerOptions => WorkerInterface,
    end: () => Unit,
    getStderr: () => ReadableStream,
    getStdout: () => ReadableStream,
    getWorkerById: Double => WorkerInterface,
    getWorkers: () => js.Array[WorkerInterface]
  ): BaseWorkerPool = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], _stderr = _stderr.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any], _workers = _workers.asInstanceOf[js.Any], createWorker = js.Any.fromFunction1(createWorker), end = js.Any.fromFunction0(end), getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkerById = js.Any.fromFunction1(getWorkerById), getWorkers = js.Any.fromFunction0(getWorkers))
    __obj.asInstanceOf[BaseWorkerPool]
  }
  @scala.inline
  implicit class BaseWorkerPoolOps[Self <: BaseWorkerPool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_options(value: WorkerPoolOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
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
    def with_workers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_workers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateWorker(value: WorkerOptions => WorkerInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWorker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStderr(value: () => ReadableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStderr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStdout(value: () => ReadableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStdout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorkerById(value: Double => WorkerInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkerById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWorkers(value: () => js.Array[WorkerInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkers")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

