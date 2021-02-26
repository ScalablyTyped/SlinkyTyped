package typingsSlinky.pollyjsCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pollyjsAdapter.mod.default
import typingsSlinky.pollyjsCore.anon.Body
import typingsSlinky.pollyjsCore.anon.Dictkey
import typingsSlinky.pollyjsCore.anon.DisableSortingHarEntries
import typingsSlinky.pollyjsCore.anon.TypeofAdapter
import typingsSlinky.pollyjsCore.anon.TypeofPersister
import typingsSlinky.pollyjsCore.pollyjsCoreStrings.abort
import typingsSlinky.pollyjsCore.pollyjsCoreStrings.error
import typingsSlinky.pollyjsCore.pollyjsCoreStrings.request
import typingsSlinky.std.Map
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/core", "Polly")
  @js.native
  class Polly protected () extends StObject {
    def this(recordingName: String) = this()
    def this(recordingName: String, options: PollyConfig) = this()
    
    var adapters: Map[String, default] = js.native
    
    var config: PollyConfig = js.native
    
    def configure(config: PollyConfig): Unit = js.native
    
    def connectTo(name: String): Unit = js.native
    def connectTo(name: TypeofAdapter): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    def disconnectFrom(name: String): Unit = js.native
    def disconnectFrom(name: TypeofAdapter): Unit = js.native
    
    def flush(): js.Promise[Unit] = js.native
    
    var mode: MODE = js.native
    
    def passthrough(): Unit = js.native
    
    def pause(): Unit = js.native
    
    var persister: typingsSlinky.pollyjsPersister.mod.default | Null = js.native
    
    def play(): Unit = js.native
    
    def record(): Unit = js.native
    
    var recordingId: String = js.native
    
    var recordingName: String = js.native
    
    def replay(): Unit = js.native
    
    var server: PollyServer = js.native
    
    def stop(): js.Promise[Unit] = js.native
  }
  /* static members */
  object Polly {
    
    @JSImport("@pollyjs/core", "Polly")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pollyjs/core", "Polly.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    @JSImport("@pollyjs/core", "Polly.off")
    @js.native
    def off(event: PollyEvent, listener: PollyEventListener): Unit = js.native
    
    @JSImport("@pollyjs/core", "Polly.on")
    @js.native
    def on(event: PollyEvent, listener: PollyEventListener): Unit = js.native
    
    @JSImport("@pollyjs/core", "Polly.once")
    @js.native
    def once(event: PollyEvent, listener: PollyEventListener): Unit = js.native
    
    @JSImport("@pollyjs/core", "Polly.register")
    @js.native
    def register(Factory: TypeofAdapter): Unit = js.native
    @JSImport("@pollyjs/core", "Polly.register")
    @js.native
    def register(Factory: TypeofPersister): Unit = js.native
    
    @JSImport("@pollyjs/core", "Polly.unregister")
    @js.native
    def unregister(Factory: TypeofAdapter): Unit = js.native
    @JSImport("@pollyjs/core", "Polly.unregister")
    @js.native
    def unregister(Factory: TypeofPersister): Unit = js.native
  }
  
  @JSImport("@pollyjs/core", "PollyServer")
  @js.native
  class PollyServer () extends StObject {
    
    def any(): RouteHandler = js.native
    def any(routes: String): RouteHandler = js.native
    def any(routes: js.Array[String]): RouteHandler = js.native
    
    def delete(): RouteHandler = js.native
    def delete(routes: String): RouteHandler = js.native
    def delete(routes: js.Array[String]): RouteHandler = js.native
    
    def get(): RouteHandler = js.native
    def get(routes: String): RouteHandler = js.native
    def get(routes: js.Array[String]): RouteHandler = js.native
    
    def head(): RouteHandler = js.native
    def head(routes: String): RouteHandler = js.native
    def head(routes: js.Array[String]): RouteHandler = js.native
    
    def host(host: String, callback: js.Function0[Unit]): Unit = js.native
    
    def merge(): RouteHandler = js.native
    def merge(routes: String): RouteHandler = js.native
    def merge(routes: js.Array[String]): RouteHandler = js.native
    
    def namespace(path: String, callback: js.Function0[Unit]): Unit = js.native
    
    def options(): RouteHandler = js.native
    def options(routes: String): RouteHandler = js.native
    def options(routes: js.Array[String]): RouteHandler = js.native
    
    def patch(): RouteHandler = js.native
    def patch(routes: String): RouteHandler = js.native
    def patch(routes: js.Array[String]): RouteHandler = js.native
    
    def post(): RouteHandler = js.native
    def post(routes: String): RouteHandler = js.native
    def post(routes: js.Array[String]): RouteHandler = js.native
    
    def put(): RouteHandler = js.native
    def put(routes: String): RouteHandler = js.native
    def put(routes: js.Array[String]): RouteHandler = js.native
    
    def timeout(ms: Double): js.Promise[Unit] = js.native
  }
  
  @JSImport("@pollyjs/core", "RouteHandler")
  @js.native
  class RouteHandler () extends StObject {
    
    def configure(config: PollyConfig): RouteHandler = js.native
    
    def filter(callback: js.Function1[/* req */ Request, Boolean]): RouteHandler = js.native
    
    def intercept(fn: InterceptHandler): RouteHandler = js.native
    
    def off(event: AbortRouteEvent): RouteHandler = js.native
    def off(event: AbortRouteEvent, listener: AbortEventListener): RouteHandler = js.native
    def off(event: ErrorRouteEvent): RouteHandler = js.native
    def off(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
    def off(event: RecordingRouteEvent): RouteHandler = js.native
    def off(event: RecordingRouteEvent, listener: RecordingEventListener): RouteHandler = js.native
    def off(event: RequestRouteEvent): RouteHandler = js.native
    def off(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
    def off(event: ResponseRouteEvent): RouteHandler = js.native
    def off(event: ResponseRouteEvent, listener: ResponseEventListener): RouteHandler = js.native
    
    def on(event: AbortRouteEvent, listener: AbortEventListener): RouteHandler = js.native
    def on(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
    def on(event: RecordingRouteEvent, listener: RecordingEventListener): RouteHandler = js.native
    def on(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
    def on(event: ResponseRouteEvent, listener: ResponseEventListener): RouteHandler = js.native
    
    def once(event: AbortRouteEvent, listener: AbortEventListener): RouteHandler = js.native
    def once(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
    def once(event: RecordingRouteEvent, listener: RecordingEventListener): RouteHandler = js.native
    def once(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
    def once(event: ResponseRouteEvent, listener: ResponseEventListener): RouteHandler = js.native
    
    def passthrough(): RouteHandler = js.native
    def passthrough(value: Boolean): RouteHandler = js.native
    
    def recordingName(): RouteHandler = js.native
    def recordingName(recordingName: String): RouteHandler = js.native
    
    def times(): RouteHandler = js.native
    def times(n: Double): RouteHandler = js.native
  }
  
  object Timing {
    
    @JSImport("@pollyjs/core", "Timing.fixed")
    @js.native
    def fixed(ms: Double): js.Function0[js.Promise[Unit]] = js.native
    
    @JSImport("@pollyjs/core", "Timing.relative")
    @js.native
    def relative(ratio: Double): js.Function1[/* ms */ Double, js.Promise[Unit]] = js.native
  }
  
  object setupMocha {
    
    @JSImport("@pollyjs/core", "setupMocha")
    @js.native
    def apply(): Unit = js.native
    @JSImport("@pollyjs/core", "setupMocha")
    @js.native
    def apply(config: js.UndefOr[scala.Nothing], context: js.Any): Unit = js.native
    @JSImport("@pollyjs/core", "setupMocha")
    @js.native
    def apply(config: PollyConfig): Unit = js.native
    @JSImport("@pollyjs/core", "setupMocha")
    @js.native
    def apply(config: PollyConfig, context: js.Any): Unit = js.native
    
    @JSImport("@pollyjs/core", "setupMocha.afterEach")
    @js.native
    def afterEach(): Unit = js.native
    @JSImport("@pollyjs/core", "setupMocha.afterEach")
    @js.native
    def afterEach(context: js.Any): Unit = js.native
    
    @JSImport("@pollyjs/core", "setupMocha.beforeEach")
    @js.native
    def beforeEach(): Unit = js.native
    @JSImport("@pollyjs/core", "setupMocha.beforeEach")
    @js.native
    def beforeEach(config: js.UndefOr[scala.Nothing], context: js.Any): Unit = js.native
    @JSImport("@pollyjs/core", "setupMocha.beforeEach")
    @js.native
    def beforeEach(config: PollyConfig): Unit = js.native
    @JSImport("@pollyjs/core", "setupMocha.beforeEach")
    @js.native
    def beforeEach(config: PollyConfig, context: js.Any): Unit = js.native
  }
  
  object setupQunit {
    
    @JSImport("@pollyjs/core", "setupQunit")
    @js.native
    def apply(hooks: js.Any): Unit = js.native
    @JSImport("@pollyjs/core", "setupQunit")
    @js.native
    def apply(hooks: js.Any, config: PollyConfig): Unit = js.native
    
    @JSImport("@pollyjs/core", "setupQunit.afterEach")
    @js.native
    def afterEach(hooks: js.Any): Unit = js.native
    
    @JSImport("@pollyjs/core", "setupQunit.beforeEach")
    @js.native
    def beforeEach(hooks: js.Any): Unit = js.native
    @JSImport("@pollyjs/core", "setupQunit.beforeEach")
    @js.native
    def beforeEach(hooks: js.Any, config: PollyConfig): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.record
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.replay
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.intercept
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.passthrough
  */
  trait ACTION extends StObject
  object ACTION {
    
    @scala.inline
    def intercept: typingsSlinky.pollyjsCore.pollyjsCoreStrings.intercept = "intercept".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.intercept]
    
    @scala.inline
    def passthrough: typingsSlinky.pollyjsCore.pollyjsCoreStrings.passthrough = "passthrough".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.passthrough]
    
    @scala.inline
    def record: typingsSlinky.pollyjsCore.pollyjsCoreStrings.record = "record".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.record]
    
    @scala.inline
    def replay: typingsSlinky.pollyjsCore.pollyjsCoreStrings.replay = "replay".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.replay]
  }
  
  type AbortEventListener = js.Function2[/* req */ Request, /* event */ ListenerEvent, Unit | js.Promise[Unit]]
  
  type AbortRouteEvent = abort
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.record
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.warn
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.error
  */
  trait EXPIRY_STRATEGY extends StObject
  object EXPIRY_STRATEGY {
    
    @scala.inline
    def error: typingsSlinky.pollyjsCore.pollyjsCoreStrings.error = "error".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.error]
    
    @scala.inline
    def record: typingsSlinky.pollyjsCore.pollyjsCoreStrings.record = "record".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.record]
    
    @scala.inline
    def warn: typingsSlinky.pollyjsCore.pollyjsCoreStrings.warn = "warn".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.warn]
  }
  
  type ErrorEventListener = js.Function3[
    /* req */ Request, 
    /* error */ js.Any, 
    /* event */ ListenerEvent, 
    Unit | js.Promise[Unit]
  ]
  
  type ErrorRouteEvent = error
  
  @js.native
  trait HTTPBase extends StObject {
    
    var body: js.Any = js.native
    
    def getHeader(name: String): String | js.Array[String] | Null = js.native
    
    def hasHeader(name: String): Boolean = js.native
    
    var headers: Headers = js.native
    
    def json(body: js.Any): this.type = js.native
    
    def jsonBody(): js.Any = js.native
    
    def removeHeader(name: String): this.type = js.native
    
    def removeHeaders(headers: js.Array[String]): this.type = js.native
    
    def send(body: js.Any): this.type = js.native
    
    def setHeader(name: String): this.type = js.native
    def setHeader(name: String, value: String): this.type = js.native
    def setHeader(name: String, value: js.Array[String]): this.type = js.native
    
    def setHeaders(headers: Headers): this.type = js.native
    
    def `type`(contentType: String): this.type = js.native
  }
  
  type Headers = Record[String, String | js.Array[String]]
  
  type InterceptHandler = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* interceptor */ Interceptor, 
    Unit | js.Promise[Unit]
  ]
  
  @js.native
  trait Interceptor extends StObject {
    
    def abort(): Unit = js.native
    
    def passthrough(): Unit = js.native
  }
  object Interceptor {
    
    @scala.inline
    def apply(abort: () => Unit, passthrough: () => Unit): Interceptor = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), passthrough = js.Any.fromFunction0(passthrough))
      __obj.asInstanceOf[Interceptor]
    }
    
    @scala.inline
    implicit class InterceptorMutableBuilder[Self <: Interceptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPassthrough(value: () => Unit): Self = StObject.set(x, "passthrough", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ListenerEvent extends StObject {
    
    def stopPropagation(): Unit = js.native
    
    val `type`: String = js.native
  }
  object ListenerEvent {
    
    @scala.inline
    def apply(stopPropagation: () => Unit, `type`: String): ListenerEvent = {
      val __obj = js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerEvent]
    }
    
    @scala.inline
    implicit class ListenerEventMutableBuilder[Self <: ListenerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.record
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.replay
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.passthrough
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.stopped
  */
  trait MODE extends StObject
  object MODE {
    
    @scala.inline
    def passthrough: typingsSlinky.pollyjsCore.pollyjsCoreStrings.passthrough = "passthrough".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.passthrough]
    
    @scala.inline
    def record: typingsSlinky.pollyjsCore.pollyjsCoreStrings.record = "record".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.record]
    
    @scala.inline
    def replay: typingsSlinky.pollyjsCore.pollyjsCoreStrings.replay = "replay".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.replay]
    
    @scala.inline
    def stopped: typingsSlinky.pollyjsCore.pollyjsCoreStrings.stopped = "stopped".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.stopped]
  }
  
  type MatchBy[T, R] = js.Function2[/* input */ T, /* req */ Request, R]
  
  @js.native
  trait PollyConfig extends StObject {
    
    var adapterOptions: js.UndefOr[Dictkey] = js.native
    
    var adapters: js.UndefOr[js.Array[String | TypeofAdapter]] = js.native
    
    var expiresIn: js.UndefOr[String | Null] = js.native
    
    var expiryStrategy: js.UndefOr[EXPIRY_STRATEGY] = js.native
    
    var flushRequestsOnStop: js.UndefOr[Boolean] = js.native
    
    var logging: js.UndefOr[Boolean] = js.native
    
    var matchRequestsBy: js.UndefOr[Body] = js.native
    
    var mode: js.UndefOr[MODE] = js.native
    
    var persister: js.UndefOr[String | TypeofPersister] = js.native
    
    var persisterOptions: js.UndefOr[DisableSortingHarEntries] = js.native
    
    var recordFailedRequests: js.UndefOr[Boolean] = js.native
    
    var recordIfMissing: js.UndefOr[Boolean] = js.native
    
    var timing: js.UndefOr[
        (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]
      ] = js.native
  }
  object PollyConfig {
    
    @scala.inline
    def apply(): PollyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PollyConfig]
    }
    
    @scala.inline
    implicit class PollyConfigMutableBuilder[Self <: PollyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapterOptions(value: Dictkey): Self = StObject.set(x, "adapterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterOptionsUndefined: Self = StObject.set(x, "adapterOptions", js.undefined)
      
      @scala.inline
      def setAdapters(value: js.Array[String | TypeofAdapter]): Self = StObject.set(x, "adapters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdaptersUndefined: Self = StObject.set(x, "adapters", js.undefined)
      
      @scala.inline
      def setAdaptersVarargs(value: (String | TypeofAdapter)*): Self = StObject.set(x, "adapters", js.Array(value :_*))
      
      @scala.inline
      def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInNull: Self = StObject.set(x, "expiresIn", null)
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setExpiryStrategy(value: EXPIRY_STRATEGY): Self = StObject.set(x, "expiryStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryStrategyUndefined: Self = StObject.set(x, "expiryStrategy", js.undefined)
      
      @scala.inline
      def setFlushRequestsOnStop(value: Boolean): Self = StObject.set(x, "flushRequestsOnStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushRequestsOnStopUndefined: Self = StObject.set(x, "flushRequestsOnStop", js.undefined)
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setMatchRequestsBy(value: Body): Self = StObject.set(x, "matchRequestsBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchRequestsByUndefined: Self = StObject.set(x, "matchRequestsBy", js.undefined)
      
      @scala.inline
      def setMode(value: MODE): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPersister(value: String | TypeofPersister): Self = StObject.set(x, "persister", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersisterOptions(value: DisableSortingHarEntries): Self = StObject.set(x, "persisterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersisterOptionsUndefined: Self = StObject.set(x, "persisterOptions", js.undefined)
      
      @scala.inline
      def setPersisterUndefined: Self = StObject.set(x, "persister", js.undefined)
      
      @scala.inline
      def setRecordFailedRequests(value: Boolean): Self = StObject.set(x, "recordFailedRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordFailedRequestsUndefined: Self = StObject.set(x, "recordFailedRequests", js.undefined)
      
      @scala.inline
      def setRecordIfMissing(value: Boolean): Self = StObject.set(x, "recordIfMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIfMissingUndefined: Self = StObject.set(x, "recordIfMissing", js.undefined)
      
      @scala.inline
      def setTiming(value: (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingFunction0(value: () => js.Promise[Unit]): Self = StObject.set(x, "timing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTimingFunction1(value: /* ms */ Double => js.Promise[Unit]): Self = StObject.set(x, "timing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.create
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.stop
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.register
  */
  trait PollyEvent extends StObject
  object PollyEvent {
    
    @scala.inline
    def create: typingsSlinky.pollyjsCore.pollyjsCoreStrings.create = "create".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.create]
    
    @scala.inline
    def register: typingsSlinky.pollyjsCore.pollyjsCoreStrings.register = "register".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.register]
    
    @scala.inline
    def stop: typingsSlinky.pollyjsCore.pollyjsCoreStrings.stop = "stop".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.stop]
  }
  
  type PollyEventListener = js.Function1[/* poll */ Polly, Unit]
  
  type RecordingEventListener = js.Function3[
    /* req */ Request, 
    /* recording */ js.Any, 
    /* event */ ListenerEvent, 
    Unit | js.Promise[Unit]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforeReplay
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforePersist
  */
  trait RecordingRouteEvent extends StObject
  object RecordingRouteEvent {
    
    @scala.inline
    def beforePersist: typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforePersist = "beforePersist".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforePersist]
    
    @scala.inline
    def beforeReplay: typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforeReplay = "beforeReplay".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforeReplay]
  }
  
  @js.native
  trait Request extends HTTPBase {
    
    val absoluteUrl: String = js.native
    
    var action: ACTION | Null = js.native
    
    var didRespond: Boolean = js.native
    
    var hash: String = js.native
    
    val hostname: String = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var method: String = js.native
    
    var order: js.UndefOr[Double] = js.native
    
    val params: StringDictionary[String] = js.native
    
    val pathname: String = js.native
    
    val port: String = js.native
    
    val protocol: String = js.native
    
    var query: StringDictionary[String | js.Array[String]] = js.native
    
    var recordingName: String = js.native
    
    var responseTime: js.UndefOr[Double] = js.native
    
    var timestamp: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  
  type RequestEventListener = js.Function2[/* req */ Request, /* event */ ListenerEvent, Unit | js.Promise[Unit]]
  
  type RequestRouteEvent = request
  
  @js.native
  trait Response extends HTTPBase {
    
    def end(): this.type = js.native
    
    var isBinary: Boolean = js.native
    
    val ok: Boolean = js.native
    
    def sendStatus(status: Double): this.type = js.native
    
    def status(status: Double): this.type = js.native
    
    var statusCode: Double = js.native
    
    val statusText: String = js.native
  }
  
  type ResponseEventListener = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* event */ ListenerEvent, 
    Unit | js.Promise[Unit]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforeResponse
    - typingsSlinky.pollyjsCore.pollyjsCoreStrings.response
  */
  trait ResponseRouteEvent extends StObject
  object ResponseRouteEvent {
    
    @scala.inline
    def beforeResponse: typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforeResponse = "beforeResponse".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforeResponse]
    
    @scala.inline
    def response: typingsSlinky.pollyjsCore.pollyjsCoreStrings.response = "response".asInstanceOf[typingsSlinky.pollyjsCore.pollyjsCoreStrings.response]
  }
}
