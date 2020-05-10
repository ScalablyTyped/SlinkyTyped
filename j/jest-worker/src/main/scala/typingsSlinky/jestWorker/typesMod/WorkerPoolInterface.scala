package typingsSlinky.jestWorker.typesMod

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerPoolInterface extends js.Object {
  def createWorker(options: WorkerOptions): WorkerInterface = js.native
  def end(): Unit = js.native
  def getStderr(): ReadableStream = js.native
  def getStdout(): ReadableStream = js.native
  def getWorkers(): js.Array[WorkerInterface] = js.native
  def send(workerId: Double, request: ChildMessage, onStart: OnStart, onEnd: OnEnd): Unit = js.native
}

object WorkerPoolInterface {
  @scala.inline
  def apply(
    createWorker: WorkerOptions => WorkerInterface,
    end: () => Unit,
    getStderr: () => ReadableStream,
    getStdout: () => ReadableStream,
    getWorkers: () => js.Array[WorkerInterface],
    send: (Double, ChildMessage, OnStart, OnEnd) => Unit
  ): WorkerPoolInterface = {
    val __obj = js.Dynamic.literal(createWorker = js.Any.fromFunction1(createWorker), end = js.Any.fromFunction0(end), getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkers = js.Any.fromFunction0(getWorkers), send = js.Any.fromFunction4(send))
    __obj.asInstanceOf[WorkerPoolInterface]
  }
  @scala.inline
  implicit class WorkerPoolInterfaceOps[Self <: WorkerPoolInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGetWorkers(value: () => js.Array[WorkerInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSend(value: (Double, ChildMessage, OnStart, OnEnd) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

