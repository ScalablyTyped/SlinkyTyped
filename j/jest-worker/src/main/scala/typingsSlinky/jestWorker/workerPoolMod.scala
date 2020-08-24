package typingsSlinky.jestWorker

import typingsSlinky.jestWorker.typesMod.WorkerInterface
import typingsSlinky.jestWorker.typesMod.WorkerOptions
import typingsSlinky.jestWorker.typesMod.WorkerPoolInterface
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-worker/build/WorkerPool", JSImport.Namespace)
@js.native
object workerPoolMod extends js.Object {
  @js.native
  trait WorkerPool
    extends typingsSlinky.jestWorker.baseWorkerPoolMod.default
       with WorkerPoolInterface {
    /* InferMemberOverrides */
    override def createWorker(_workerOptions: WorkerOptions): WorkerInterface = js.native
    /* InferMemberOverrides */
    override def end(): Unit = js.native
    /* InferMemberOverrides */
    override def getStderr(): ReadableStream = js.native
    /* InferMemberOverrides */
    override def getStdout(): ReadableStream = js.native
    /* InferMemberOverrides */
    override def getWorkers(): js.Array[WorkerInterface] = js.native
  }
  
  @js.native
  class default () extends WorkerPool
  
}

