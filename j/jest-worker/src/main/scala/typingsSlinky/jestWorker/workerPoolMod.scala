package typingsSlinky.jestWorker

import typingsSlinky.jestWorker.typesMod.WorkerInterface
import typingsSlinky.jestWorker.typesMod.WorkerOptions
import typingsSlinky.jestWorker.typesMod.WorkerPoolInterface
import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerPoolMod {
  
  @JSImport("jest-worker/build/WorkerPool", JSImport.Default)
  @js.native
  class default () extends WorkerPool
  
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
}
