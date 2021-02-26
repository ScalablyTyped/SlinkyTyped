package typingsSlinky.nodeResque

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.nodeResque.anon.Args
import typingsSlinky.nodeResque.anon.RTimestamp
import typingsSlinky.nodeResque.nodeResqueStrings.cleanStuckWorker
import typingsSlinky.nodeResque.nodeResqueStrings.cleaning_worker
import typingsSlinky.nodeResque.nodeResqueStrings.end
import typingsSlinky.nodeResque.nodeResqueStrings.error
import typingsSlinky.nodeResque.nodeResqueStrings.failure
import typingsSlinky.nodeResque.nodeResqueStrings.job
import typingsSlinky.nodeResque.nodeResqueStrings.master
import typingsSlinky.nodeResque.nodeResqueStrings.pause
import typingsSlinky.nodeResque.nodeResqueStrings.ping
import typingsSlinky.nodeResque.nodeResqueStrings.poll
import typingsSlinky.nodeResque.nodeResqueStrings.reEnqueue
import typingsSlinky.nodeResque.nodeResqueStrings.start
import typingsSlinky.nodeResque.nodeResqueStrings.success
import typingsSlinky.nodeResque.nodeResqueStrings.transferredJob
import typingsSlinky.nodeResque.nodeResqueStrings.workingTimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-resque", "Connection")
  @js.native
  class Connection protected () extends EventEmitter {
    def this(options: ConnectionOptions) = this()
    
    def connect(): js.Promise[Unit] = js.native
    
    def end(): js.Promise[Unit] = js.native
  }
  
  @JSImport("node-resque", "Queue")
  @js.native
  class Queue protected () extends EventEmitter {
    def this(options: QueueOptions) = this()
    def this(options: QueueOptions, jobs: JobsHash) = this()
    
    def allDelayed(): js.Promise[js.Array[Double]] = js.native
    
    def allWorkingOn(): js.Promise[StringDictionary[WorkerStatus]] = js.native
    
    def cleanOldWorkers(age: Double): js.Promise[StringDictionary[ErrorPayload] | js.Object] = js.native
    
    def connect(): js.Promise[Unit] = js.native
    
    def del(queue: String, jobName: String): js.Promise[Double] = js.native
    def del(queue: String, jobName: String, args: js.UndefOr[scala.Nothing], count: Double): js.Promise[Double] = js.native
    def del(queue: String, jobName: String, args: js.Array[_]): js.Promise[Double] = js.native
    def del(queue: String, jobName: String, args: js.Array[_], count: Double): js.Promise[Double] = js.native
    
    def delDelayed(queue: String, jobName: String): js.Promise[js.Array[Double]] = js.native
    def delDelayed(queue: String, jobName: String, args: js.UndefOr[scala.Nothing], count: Double): js.Promise[js.Array[Double]] = js.native
    def delDelayed(queue: String, jobName: String, args: js.Array[_]): js.Promise[js.Array[Double]] = js.native
    def delDelayed(queue: String, jobName: String, args: js.Array[_], count: Double): js.Promise[js.Array[Double]] = js.native
    
    def delLock(lockName: String): js.Promise[Double] = js.native
    
    def delQueue(queue: String): js.Promise[Unit] = js.native
    
    def delayedAt(timestamp: Double): js.Promise[RTimestamp] = js.native
    
    def encode(queue: String, jobName: String): String = js.native
    def encode(queue: String, jobName: String, args: js.Array[_]): String = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    def enqueue(queue: String, jobName: String): js.Promise[Unit] = js.native
    def enqueue(queue: String, jobName: String, args: js.Array[_]): js.Promise[Unit] = js.native
    
    def enqueueAt(timestamp: Double, queue: String, jobName: String): js.Promise[Unit] = js.native
    def enqueueAt(timestamp: Double, queue: String, jobName: String, args: js.Array[_]): js.Promise[Unit] = js.native
    
    def enqueueIn(milliseconds: Double, queue: String, jobName: String): js.Promise[Unit] = js.native
    def enqueueIn(milliseconds: Double, queue: String, jobName: String, args: js.Array[_]): js.Promise[Unit] = js.native
    
    def failed(start: Double, stop: Double): js.Promise[js.Array[ErrorPayload]] = js.native
    
    def failedCount(): js.Promise[Double] = js.native
    
    def forceCleanWorker(workerName: String): js.Promise[js.Array[ErrorPayload] | Unit] = js.native
    
    def length(queue: String): js.Promise[Double] = js.native
    
    def locks(): js.Promise[StringDictionary[String]] = js.native
    
    @JSName("on")
    def on_error(event: error, cb: js.Function2[/* error */ js.Error, /* queue */ String, Unit]): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, cb: js.Function2[/* error */ js.Error, /* queue */ String, Unit]): this.type = js.native
    
    def queued(queue: String, start: Double, stop: Double): js.Promise[js.Array[Job[_]]] = js.native
    
    def queues(): js.Promise[js.Array[String]] = js.native
    
    def removeFailed(failedJob: ErrorPayload): js.Promise[Unit] = js.native
    
    def retryAndRemoveFailed(failedJob: ErrorPayload): js.Promise[Unit] = js.native
    
    def scheduledAt(queue: String, jobName: String): js.Promise[js.Array[Double]] = js.native
    def scheduledAt(queue: String, jobName: String, args: js.Array[_]): js.Promise[js.Array[Double]] = js.native
    
    def stats(): js.Promise[_] = js.native
    
    def timestamps(): js.Promise[js.Array[Double]] = js.native
    
    def workers(): js.Promise[StringDictionary[String]] = js.native
    
    def workingOn(workerName: String, queues: js.Array[String]): js.Promise[WorkerStatus] = js.native
  }
  
  @JSImport("node-resque", "Scheduler")
  @js.native
  class Scheduler protected () extends EventEmitter {
    def this(options: SchedulerOptions) = this()
    def this(options: SchedulerOptions, jobs: JobsHash) = this()
    
    def connect(): js.Promise[Unit] = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    @JSName("on")
    def on_cleanStuckWorker(
      event: cleanStuckWorker,
      cb: js.Function3[/* workerName */ String, /* errorPayload */ ErrorPayload, /* delta */ Double, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_end(event: end, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function2[/* error */ js.Error, /* queue */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_master(event: master, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_poll(event: poll, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_transferredJob(event: transferredJob, cb: js.Function2[/* timestamp */ Double, /* job */ Job[_], Unit]): this.type = js.native
    @JSName("on")
    def on_workingTimestamp(event: workingTimestamp, cb: js.Function1[/* timestamp */ Double, Unit]): this.type = js.native
    
    @JSName("once")
    def once_cleanStuckWorker(
      event: cleanStuckWorker,
      cb: js.Function3[/* workerName */ String, /* errorPayload */ ErrorPayload, /* delta */ Double, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_end(event: end, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: js.Function2[/* error */ js.Error, /* queue */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_master(event: master, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_poll(event: poll, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_start(event: start, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_transferredJob(event: transferredJob, cb: js.Function2[/* timestamp */ Double, /* job */ Job[_], Unit]): this.type = js.native
    @JSName("once")
    def once_workingTimestamp(event: workingTimestamp, cb: js.Function1[/* timestamp */ Double, Unit]): this.type = js.native
    
    def removeAllListeners(event: SchedulerEvent): this.type = js.native
    
    def start(): js.Promise[Unit] = js.native
  }
  
  @JSImport("node-resque", "Worker")
  @js.native
  class Worker protected () extends EventEmitter {
    def this(options: WorkerOptions) = this()
    def this(options: WorkerOptions, jobs: JobsHash) = this()
    
    def connect(): js.Promise[Unit] = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    @JSName("on")
    def on_cleaningworker(event: cleaning_worker, cb: js.Function2[/* worker */ String, /* pid */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function3[/* error */ js.Error, /* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
    @JSName("on")
    def on_failure(event: failure, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* failure */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_job(event: job, cb: js.Function2[/* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_ping(event: ping, cb: js.Function1[/* time */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_poll(event: poll, cb: js.Function1[/* queue */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_reEnqueue(
      event: reEnqueue,
      cb: js.Function3[/* queue */ String, /* job */ Job[_], /* plugin */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_success(event: success, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* result */ js.Any, Unit]): this.type = js.native
    
    @JSName("once")
    def once_cleaningworker(event: cleaning_worker, cb: js.Function2[/* worker */ String, /* pid */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: js.Function3[/* error */ js.Error, /* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
    @JSName("once")
    def once_failure(event: failure, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* failure */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_job(event: job, cb: js.Function2[/* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_ping(event: ping, cb: js.Function1[/* time */ Double, Unit]): this.type = js.native
    @JSName("once")
    def once_poll(event: poll, cb: js.Function1[/* queue */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_reEnqueue(
      event: reEnqueue,
      cb: js.Function3[/* queue */ String, /* job */ Job[_], /* plugin */ String, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_start(event: start, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_success(event: success, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* result */ js.Any, Unit]): this.type = js.native
    
    def removeAllListeners(event: WorkerEvent): this.type = js.native
    
    def start(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait ConnectionOptions extends StObject {
    
    var database: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var looping: js.UndefOr[Boolean] = js.native
    
    var namespace: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[js.Any] = js.native
    
    var pkg: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var redis: js.UndefOr[js.Any] = js.native
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: Double): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLooping(value: Boolean): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRedis(value: js.Any): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedisUndefined: Self = StObject.set(x, "redis", js.undefined)
    }
  }
  
  @js.native
  trait ErrorPayload extends StObject {
    
    var backtrace: js.Array[String] | Null = js.native
    
    var error: String = js.native
    
    var exception: String = js.native
    
    var failed_at: String = js.native
    
    var payload: js.Any = js.native
    
    var queue: String = js.native
    
    var worker: String = js.native
  }
  object ErrorPayload {
    
    @scala.inline
    def apply(
      error: String,
      exception: String,
      failed_at: String,
      payload: js.Any,
      queue: String,
      worker: String
    ): ErrorPayload = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], failed_at = failed_at.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorPayload]
    }
    
    @scala.inline
    implicit class ErrorPayloadMutableBuilder[Self <: ErrorPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBacktrace(value: js.Array[String]): Self = StObject.set(x, "backtrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBacktraceNull: Self = StObject.set(x, "backtrace", null)
      
      @scala.inline
      def setBacktraceVarargs(value: String*): Self = StObject.set(x, "backtrace", js.Array(value :_*))
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailed_at(value: String): Self = StObject.set(x, "failed_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Job[TResult] extends StObject {
    
    def perform(args: js.Any*): js.Promise[TResult] = js.native
    
    var pluginOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var plugins: js.UndefOr[js.Array[String]] = js.native
  }
  object Job {
    
    @scala.inline
    def apply[TResult](perform: /* repeated */ js.Any => js.Promise[TResult]): Job[TResult] = {
      val __obj = js.Dynamic.literal(perform = js.Any.fromFunction1(perform))
      __obj.asInstanceOf[Job[TResult]]
    }
    
    @scala.inline
    implicit class JobMutableBuilder[Self <: Job[_], TResult] (val x: Self with Job[TResult]) extends AnyVal {
      
      @scala.inline
      def setPerform(value: /* repeated */ js.Any => js.Promise[TResult]): Self = StObject.set(x, "perform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPluginOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "pluginOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginOptionsUndefined: Self = StObject.set(x, "pluginOptions", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  type JobsHash = StringDictionary[Job[js.Any]]
  
  @js.native
  trait QueueOptions extends StObject {
    
    var connection: js.UndefOr[ConnectionOptions] = js.native
  }
  object QueueOptions {
    
    @scala.inline
    def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    @scala.inline
    implicit class QueueOptionsMutableBuilder[Self <: QueueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: ConnectionOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeResque.nodeResqueStrings.start
    - typingsSlinky.nodeResque.nodeResqueStrings.end
    - typingsSlinky.nodeResque.nodeResqueStrings.poll
    - typingsSlinky.nodeResque.nodeResqueStrings.master
    - typingsSlinky.nodeResque.nodeResqueStrings.cleanStuckWorker
    - typingsSlinky.nodeResque.nodeResqueStrings.error
    - typingsSlinky.nodeResque.nodeResqueStrings.workingTimestamp
    - typingsSlinky.nodeResque.nodeResqueStrings.transferredJob
  */
  trait SchedulerEvent extends StObject
  object SchedulerEvent {
    
    @scala.inline
    def cleanStuckWorker: typingsSlinky.nodeResque.nodeResqueStrings.cleanStuckWorker = "cleanStuckWorker".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.cleanStuckWorker]
    
    @scala.inline
    def end: typingsSlinky.nodeResque.nodeResqueStrings.end = "end".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.end]
    
    @scala.inline
    def error: typingsSlinky.nodeResque.nodeResqueStrings.error = "error".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.error]
    
    @scala.inline
    def master: typingsSlinky.nodeResque.nodeResqueStrings.master = "master".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.master]
    
    @scala.inline
    def poll: typingsSlinky.nodeResque.nodeResqueStrings.poll = "poll".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.poll]
    
    @scala.inline
    def start: typingsSlinky.nodeResque.nodeResqueStrings.start = "start".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.start]
    
    @scala.inline
    def transferredJob: typingsSlinky.nodeResque.nodeResqueStrings.transferredJob = "transferredJob".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.transferredJob]
    
    @scala.inline
    def workingTimestamp: typingsSlinky.nodeResque.nodeResqueStrings.workingTimestamp = "workingTimestamp".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.workingTimestamp]
  }
  
  @js.native
  trait SchedulerOptions extends StObject {
    
    var connection: js.UndefOr[ConnectionOptions] = js.native
    
    var masterLockTimeout: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var stuckWorkerTimeout: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object SchedulerOptions {
    
    @scala.inline
    def apply(): SchedulerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchedulerOptions]
    }
    
    @scala.inline
    implicit class SchedulerOptionsMutableBuilder[Self <: SchedulerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: ConnectionOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setMasterLockTimeout(value: Double): Self = StObject.set(x, "masterLockTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterLockTimeoutUndefined: Self = StObject.set(x, "masterLockTimeout", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStuckWorkerTimeout(value: Double): Self = StObject.set(x, "stuckWorkerTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStuckWorkerTimeoutUndefined: Self = StObject.set(x, "stuckWorkerTimeout", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeResque.nodeResqueStrings.start
    - typingsSlinky.nodeResque.nodeResqueStrings.end
    - typingsSlinky.nodeResque.nodeResqueStrings.cleaning_worker
    - typingsSlinky.nodeResque.nodeResqueStrings.poll
    - typingsSlinky.nodeResque.nodeResqueStrings.ping
    - typingsSlinky.nodeResque.nodeResqueStrings.job
    - typingsSlinky.nodeResque.nodeResqueStrings.reEnqueue
    - typingsSlinky.nodeResque.nodeResqueStrings.success
    - typingsSlinky.nodeResque.nodeResqueStrings.failure
    - typingsSlinky.nodeResque.nodeResqueStrings.error
    - typingsSlinky.nodeResque.nodeResqueStrings.pause
  */
  trait WorkerEvent extends StObject
  object WorkerEvent {
    
    @scala.inline
    def cleaning_worker: typingsSlinky.nodeResque.nodeResqueStrings.cleaning_worker = "cleaning_worker".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.cleaning_worker]
    
    @scala.inline
    def end: typingsSlinky.nodeResque.nodeResqueStrings.end = "end".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.end]
    
    @scala.inline
    def error: typingsSlinky.nodeResque.nodeResqueStrings.error = "error".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.error]
    
    @scala.inline
    def failure: typingsSlinky.nodeResque.nodeResqueStrings.failure = "failure".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.failure]
    
    @scala.inline
    def job: typingsSlinky.nodeResque.nodeResqueStrings.job = "job".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.job]
    
    @scala.inline
    def pause: typingsSlinky.nodeResque.nodeResqueStrings.pause = "pause".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.pause]
    
    @scala.inline
    def ping: typingsSlinky.nodeResque.nodeResqueStrings.ping = "ping".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.ping]
    
    @scala.inline
    def poll: typingsSlinky.nodeResque.nodeResqueStrings.poll = "poll".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.poll]
    
    @scala.inline
    def reEnqueue: typingsSlinky.nodeResque.nodeResqueStrings.reEnqueue = "reEnqueue".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.reEnqueue]
    
    @scala.inline
    def start: typingsSlinky.nodeResque.nodeResqueStrings.start = "start".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.start]
    
    @scala.inline
    def success: typingsSlinky.nodeResque.nodeResqueStrings.success = "success".asInstanceOf[typingsSlinky.nodeResque.nodeResqueStrings.success]
  }
  
  @js.native
  trait WorkerOptions extends StObject {
    
    var connection: js.UndefOr[ConnectionOptions] = js.native
    
    var looping: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var queues: js.Array[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object WorkerOptions {
    
    @scala.inline
    def apply(queues: js.Array[String]): WorkerOptions = {
      val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerOptions]
    }
    
    @scala.inline
    implicit class WorkerOptionsMutableBuilder[Self <: WorkerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: ConnectionOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setLooping(value: Boolean): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setQueues(value: js.Array[String]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueuesVarargs(value: String*): Self = StObject.set(x, "queues", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait WorkerStatus extends StObject {
    
    var payload: Args = js.native
    
    var queue: String = js.native
    
    var run_at: String = js.native
    
    var worker: String = js.native
  }
  object WorkerStatus {
    
    @scala.inline
    def apply(payload: Args, queue: String, run_at: String, worker: String): WorkerStatus = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], run_at = run_at.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerStatus]
    }
    
    @scala.inline
    implicit class WorkerStatusMutableBuilder[Self <: WorkerStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Args): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRun_at(value: String): Self = StObject.set(x, "run_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
}
