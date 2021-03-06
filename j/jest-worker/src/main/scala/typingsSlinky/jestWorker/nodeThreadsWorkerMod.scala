package typingsSlinky.jestWorker

import typingsSlinky.jestWorker.typesMod.ChildMessage
import typingsSlinky.jestWorker.typesMod.OnEnd
import typingsSlinky.jestWorker.typesMod.OnStart
import typingsSlinky.jestWorker.typesMod.ParentMessage
import typingsSlinky.jestWorker.typesMod.WorkerInterface
import typingsSlinky.jestWorker.typesMod.WorkerOptions
import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeThreadsWorkerMod {
  
  @JSImport("jest-worker/build/workers/NodeThreadsWorker", JSImport.Default)
  @js.native
  class default protected () extends ExperimentalWorker {
    def this(options: WorkerOptions) = this()
  }
  
  @js.native
  trait ExperimentalWorker extends WorkerInterface {
    
    var _fakeStream: js.Any = js.native
    
    var _getFakeStream: js.Any = js.native
    
    var _onProcessEnd: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _request: js.Any = js.native
    
    var _retries: js.Any = js.native
    
    var _shutdown: js.Any = js.native
    
    var _stderr: js.Any = js.native
    
    var _stdout: js.Any = js.native
    
    var _worker: js.Any = js.native
    
    def initialize(): Unit = js.native
  }
  object ExperimentalWorker {
    
    @scala.inline
    def apply(
      _fakeStream: js.Any,
      _getFakeStream: js.Any,
      _onProcessEnd: js.Any,
      _options: js.Any,
      _request: js.Any,
      _retries: js.Any,
      _shutdown: js.Any,
      _stderr: js.Any,
      _stdout: js.Any,
      _worker: js.Any,
      getStderr: () => ReadableStream | Null,
      getStdout: () => ReadableStream | Null,
      getWorkerId: () => Double,
      initialize: () => Unit,
      onExit: Double => Unit,
      onMessage: ParentMessage => Unit,
      send: (ChildMessage, OnStart, OnEnd) => Unit
    ): ExperimentalWorker = {
      val __obj = js.Dynamic.literal(_fakeStream = _fakeStream.asInstanceOf[js.Any], _getFakeStream = _getFakeStream.asInstanceOf[js.Any], _onProcessEnd = _onProcessEnd.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _request = _request.asInstanceOf[js.Any], _retries = _retries.asInstanceOf[js.Any], _shutdown = _shutdown.asInstanceOf[js.Any], _stderr = _stderr.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any], _worker = _worker.asInstanceOf[js.Any], getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkerId = js.Any.fromFunction0(getWorkerId), initialize = js.Any.fromFunction0(initialize), onExit = js.Any.fromFunction1(onExit), onMessage = js.Any.fromFunction1(onMessage), send = js.Any.fromFunction3(send))
      __obj.asInstanceOf[ExperimentalWorker]
    }
    
    @scala.inline
    implicit class ExperimentalWorkerMutableBuilder[Self <: ExperimentalWorker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_fakeStream(value: js.Any): Self = StObject.set(x, "_fakeStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getFakeStream(value: js.Any): Self = StObject.set(x, "_getFakeStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onProcessEnd(value: js.Any): Self = StObject.set(x, "_onProcessEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_request(value: js.Any): Self = StObject.set(x, "_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_retries(value: js.Any): Self = StObject.set(x, "_retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_shutdown(value: js.Any): Self = StObject.set(x, "_shutdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stderr(value: js.Any): Self = StObject.set(x, "_stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stdout(value: js.Any): Self = StObject.set(x, "_stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_worker(value: js.Any): Self = StObject.set(x, "_worker", value.asInstanceOf[js.Any])
    }
  }
}
