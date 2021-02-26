package typingsSlinky.benchmark

import typingsSlinky.benchmark.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("benchmark", JSImport.Namespace)
  @js.native
  class ^ protected () extends Benchmark {
    def this(fn: String) = this()
    def this(fn: js.Function) = this()
    def this(options: Options_) = this()
    def this(fn: String, options: Options_) = this()
    def this(fn: js.Function, options: Options_) = this()
    def this(name: String, fn: String) = this()
    def this(name: String, fn: js.Function) = this()
    def this(name: String, fn: String, options: Options_) = this()
    def this(name: String, fn: js.Function, options: Options_) = this()
  }
  @JSImport("benchmark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("benchmark", "Deferred")
  @js.native
  class Deferred protected () extends StObject {
    def this(clone: Benchmark) = this()
    
    var benchmark: Benchmark = js.native
    
    var cycles: Double = js.native
    
    var elapsed: Double = js.native
    
    def resolve(): Unit = js.native
    
    var timeStamp: Double = js.native
  }
  
  @JSImport("benchmark", "Event")
  @js.native
  class Event protected () extends StObject {
    def this(`type`: String) = this()
    def this(`type`: js.Object) = this()
    
    var aborted: Boolean = js.native
    
    var cancelled: Boolean = js.native
    
    var currentTarget: js.Object = js.native
    
    var result: js.Any = js.native
    
    var target: Target = js.native
    
    var timeStamp: Double = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("benchmark", "Suite")
  @js.native
  class Suite () extends StObject {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], options: Options_) = this()
    def this(name: String, options: Options_) = this()
    
    def abort(): Suite = js.native
    
    var aborted: Boolean = js.native
    
    def add(fn: String): Suite = js.native
    def add(fn: String, options: Options_): Suite = js.native
    def add(fn: js.Function): Suite = js.native
    def add(fn: js.Function, options: Options_): Suite = js.native
    def add(name: String, fn: String): Suite = js.native
    def add(name: String, fn: String, options: Options_): Suite = js.native
    def add(name: String, fn: js.Function): Suite = js.native
    def add(name: String, fn: js.Function, options: Options_): Suite = js.native
    def add(options: Options_): Suite = js.native
    
    def clone(options: Options_): Suite = js.native
    
    def each(callback: js.Function): Suite = js.native
    
    def emit(`type`: String): js.Any = js.native
    def emit(`type`: js.Object): js.Any = js.native
    
    def filter(callback: String): Suite = js.native
    def filter(callback: js.Function): Suite = js.native
    
    def forEach(callback: js.Function): Suite = js.native
    
    def indexOf(value: js.Any): Double = js.native
    
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    var length: Double = js.native
    
    def listeners(`type`: String): js.Array[js.Function] = js.native
    
    def map(callback: String): js.Array[_] = js.native
    def map(callback: js.Function): js.Array[_] = js.native
    
    def off(): Suite = js.native
    def off(`type`: js.UndefOr[scala.Nothing], callback: js.Function): Suite = js.native
    def off(`type`: String): Suite = js.native
    def off(`type`: String, callback: js.Function): Suite = js.native
    def off(types: js.Array[String]): Suite = js.native
    
    def on(): Suite = js.native
    def on(`type`: js.UndefOr[scala.Nothing], callback: js.Function): Suite = js.native
    def on(`type`: String): Suite = js.native
    def on(`type`: String, callback: js.Function): Suite = js.native
    def on(types: js.Array[String]): Suite = js.native
    
    def pop(): js.Function = js.native
    
    def push(benchmark: Benchmark): Double = js.native
    
    def reduce[T](callback: js.Function, accumulator: T): T = js.native
    
    def reset(): Suite = js.native
    
    def reverse(): js.Array[_] = js.native
    
    def run(): Suite = js.native
    def run(options: Options_): Suite = js.native
    
    var running: Boolean = js.native
    
    def shift(): Benchmark = js.native
    
    def slice(start: Double, deleteCount: Double, values: js.Any*): js.Array[_] = js.native
    def slice(start: Double, end: Double): js.Array[_] = js.native
    
    def sort(compareFn: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): js.Array[_] = js.native
    
    def splice(start: Double): js.Array[_] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[_] = js.native
    
    def unshift(benchmark: Benchmark): Double = js.native
  }
  /* static members */
  object Suite {
    
    @JSImport("benchmark", "Suite")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("benchmark", "Suite.options")
    @js.native
    def options: Name = js.native
    @scala.inline
    def options_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("benchmark", "each")
  @js.native
  def each(obj: js.Array[_], callback: js.Function): Unit = js.native
  @JSImport("benchmark", "each")
  @js.native
  def each(obj: js.Array[_], callback: js.Function, thisArg: js.Any): Unit = js.native
  /* static member */
  @JSImport("benchmark", "each")
  @js.native
  def each(obj: js.Object, callback: js.Function): Unit = js.native
  @JSImport("benchmark", "each")
  @js.native
  def each(obj: js.Object, callback: js.Function, thisArg: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("benchmark", "filter")
  @js.native
  def filter[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _]): js.Array[T] = js.native
  @JSImport("benchmark", "filter")
  @js.native
  def filter[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _], thisArg: js.Any): js.Array[T] = js.native
  /* static member */
  @JSImport("benchmark", "filter")
  @js.native
  def filter[T](arr: js.Array[T], filter: String): js.Array[T] = js.native
  @JSImport("benchmark", "filter")
  @js.native
  def filter[T](arr: js.Array[T], filter: String, thisArg: js.Any): js.Array[T] = js.native
  
  /* static member */
  @JSImport("benchmark", "forEach")
  @js.native
  def forEach[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _]): Unit = js.native
  @JSImport("benchmark", "forEach")
  @js.native
  def forEach[T](arr: js.Array[T], callback: js.Function1[/* value */ T, _], thisArg: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("benchmark", "forOwn")
  @js.native
  def forOwn(obj: js.Object, callback: js.Function): Unit = js.native
  @JSImport("benchmark", "forOwn")
  @js.native
  def forOwn(obj: js.Object, callback: js.Function, thisArg: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("benchmark", "formatNumber")
  @js.native
  def formatNumber(num: Double): String = js.native
  
  @JSImport("benchmark", "has")
  @js.native
  def has(obj: js.Object, path: String): Boolean = js.native
  /* static member */
  @JSImport("benchmark", "has")
  @js.native
  def has(obj: js.Object, path: js.Array[_]): Boolean = js.native
  
  /* static member */
  @JSImport("benchmark", "indexOf")
  @js.native
  def indexOf[T](arr: js.Array[T], value: T): Double = js.native
  @JSImport("benchmark", "indexOf")
  @js.native
  def indexOf[T](arr: js.Array[T], value: T, fromIndex: Double): Double = js.native
  
  /* static member */
  @JSImport("benchmark", "invoke")
  @js.native
  def invoke(benches: js.Array[Benchmark], name: String, args: js.Any*): js.Array[_] = js.native
  @JSImport("benchmark", "invoke")
  @js.native
  def invoke(benches: js.Array[Benchmark], name: js.Object, args: js.Any*): js.Array[_] = js.native
  
  /* static member */
  @JSImport("benchmark", "join")
  @js.native
  def join(obj: js.Object): String = js.native
  @JSImport("benchmark", "join")
  @js.native
  def join(obj: js.Object, separator1: js.UndefOr[scala.Nothing], separator2: String): String = js.native
  @JSImport("benchmark", "join")
  @js.native
  def join(obj: js.Object, separator1: String): String = js.native
  @JSImport("benchmark", "join")
  @js.native
  def join(obj: js.Object, separator1: String, separator2: String): String = js.native
  
  /* static member */
  @JSImport("benchmark", "map")
  @js.native
  def map[T, K](arr: js.Array[T], callback: js.Function1[/* value */ T, K]): js.Array[K] = js.native
  @JSImport("benchmark", "map")
  @js.native
  def map[T, K](arr: js.Array[T], callback: js.Function1[/* value */ T, K], thisArg: js.Any): js.Array[K] = js.native
  
  /* static member */
  @JSImport("benchmark", "options")
  @js.native
  def options: Options_ = js.native
  @scala.inline
  def options_=(x: Options_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("benchmark", "platform")
  @js.native
  def platform: Platform_ = js.native
  @scala.inline
  def platform_=(x: Platform_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platform")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("benchmark", "reduce")
  @js.native
  def reduce[T, K](arr: js.Array[T], callback: js.Function2[/* accumulator */ K, /* value */ T, K]): K = js.native
  @JSImport("benchmark", "reduce")
  @js.native
  def reduce[T, K](arr: js.Array[T], callback: js.Function2[/* accumulator */ K, /* value */ T, K], thisArg: js.Any): K = js.native
  
  /* static member */
  @JSImport("benchmark", "runInContext")
  @js.native
  def runInContext(context: js.Object): js.Function = js.native
  
  /* static member */
  @JSImport("benchmark", "support")
  @js.native
  def support: Support_ = js.native
  @scala.inline
  def support_=(x: Support_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("support")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("benchmark", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Benchmark extends StObject {
    
    def abort(): Benchmark = js.native
    
    var aborted: Boolean = js.native
    
    def clone(options: Options_): Benchmark = js.native
    
    def compare(benchmark: Benchmark): Double = js.native
    
    var compiled: js.Function | String = js.native
    
    var count: Double = js.native
    
    var cycles: Double = js.native
    
    def emit(`type`: String): js.Any = js.native
    def emit(`type`: js.Object): js.Any = js.native
    
    var error: js.Error = js.native
    
    var fn: js.Function | String = js.native
    
    var hz: Double = js.native
    
    var id: Double = js.native
    
    def listeners(`type`: String): js.Array[js.Function] = js.native
    
    var name: String = js.native
    
    def off(): Benchmark = js.native
    def off(`type`: js.UndefOr[scala.Nothing], listener: js.Function): Benchmark = js.native
    def off(`type`: String): Benchmark = js.native
    def off(`type`: String, listener: js.Function): Benchmark = js.native
    def off(types: js.Array[String]): Benchmark = js.native
    
    def on(): Benchmark = js.native
    def on(`type`: js.UndefOr[scala.Nothing], listener: js.Function): Benchmark = js.native
    def on(`type`: String): Benchmark = js.native
    def on(`type`: String, listener: js.Function): Benchmark = js.native
    def on(types: js.Array[String]): Benchmark = js.native
    
    def reset(): Benchmark = js.native
    
    def run(): Benchmark = js.native
    def run(options: Options_): Benchmark = js.native
    
    var running: Boolean = js.native
    
    var setup: js.Function | String = js.native
    
    var stats: Stats = js.native
    
    var teardown: js.Function | String = js.native
    
    var times: Times = js.native
  }
  
  @js.native
  trait Options_ extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var defer: js.UndefOr[Boolean] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var fn: js.UndefOr[js.Function | String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var initCount: js.UndefOr[Double] = js.native
    
    var maxTime: js.UndefOr[Double] = js.native
    
    var minSamples: js.UndefOr[Double] = js.native
    
    var minTime: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onAbort: js.UndefOr[js.Function] = js.native
    
    var onComplete: js.UndefOr[js.Function] = js.native
    
    var onCycle: js.UndefOr[js.Function] = js.native
    
    var onError: js.UndefOr[js.Function] = js.native
    
    var onReset: js.UndefOr[js.Function] = js.native
    
    var onStart: js.UndefOr[js.Function] = js.native
    
    var queued: js.UndefOr[Boolean] = js.native
    
    var setup: js.UndefOr[js.Function | String] = js.native
    
    var teardown: js.UndefOr[js.Function | String] = js.native
  }
  object Options_ {
    
    @scala.inline
    def apply(): Options_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options_]
    }
    
    @scala.inline
    implicit class Options_MutableBuilder[Self <: Options_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setFn(value: js.Function | String): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInitCount(value: Double): Self = StObject.set(x, "initCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitCountUndefined: Self = StObject.set(x, "initCount", js.undefined)
      
      @scala.inline
      def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      @scala.inline
      def setMinSamples(value: Double): Self = StObject.set(x, "minSamples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSamplesUndefined: Self = StObject.set(x, "minSamples", js.undefined)
      
      @scala.inline
      def setMinTime(value: Double): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnAbort(value: js.Function): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnComplete(value: js.Function): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnCycle(value: js.Function): Self = StObject.set(x, "onCycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCycleUndefined: Self = StObject.set(x, "onCycle", js.undefined)
      
      @scala.inline
      def setOnError(value: js.Function): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnReset(value: js.Function): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnStart(value: js.Function): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setQueued(value: Boolean): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
      
      @scala.inline
      def setSetup(value: js.Function | String): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      @scala.inline
      def setTeardown(value: js.Function | String): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    }
  }
  
  @js.native
  trait Platform_ extends StObject {
    
    var description: String = js.native
    
    var layout: String = js.native
    
    var manufacturer: String = js.native
    
    var name: String = js.native
    
    var os: String = js.native
    
    var prerelease: String = js.native
    
    var product: String = js.native
    
    var version: String = js.native
  }
  object Platform_ {
    
    @scala.inline
    def apply(
      description: String,
      layout: String,
      manufacturer: String,
      name: String,
      os: String,
      prerelease: String,
      product: String,
      version: String
    ): Platform_ = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Platform_]
    }
    
    @scala.inline
    implicit class Platform_MutableBuilder[Self <: Platform_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stats extends StObject {
    
    var deviation: Double = js.native
    
    var mean: Double = js.native
    
    var moe: Double = js.native
    
    var rme: Double = js.native
    
    var sample: js.Array[_] = js.native
    
    var sem: Double = js.native
    
    var variance: Double = js.native
  }
  object Stats {
    
    @scala.inline
    def apply(
      deviation: Double,
      mean: Double,
      moe: Double,
      rme: Double,
      sample: js.Array[_],
      sem: Double,
      variance: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(deviation = deviation.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], moe = moe.asInstanceOf[js.Any], rme = rme.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any], sem = sem.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviation(value: Double): Self = StObject.set(x, "deviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoe(value: Double): Self = StObject.set(x, "moe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRme(value: Double): Self = StObject.set(x, "rme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSample(value: js.Array[_]): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleVarargs(value: js.Any*): Self = StObject.set(x, "sample", js.Array(value :_*))
      
      @scala.inline
      def setSem(value: Double): Self = StObject.set(x, "sem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Support_ extends StObject {
    
    var browser: Boolean = js.native
    
    var decompilation: Boolean = js.native
    
    var timeout: Boolean = js.native
  }
  object Support_ {
    
    @scala.inline
    def apply(browser: Boolean, decompilation: Boolean, timeout: Boolean): Support_ = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], decompilation = decompilation.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Support_]
    }
    
    @scala.inline
    implicit class Support_MutableBuilder[Self <: Support_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecompilation(value: Boolean): Self = StObject.set(x, "decompilation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Target extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var compiled: js.UndefOr[js.Function] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var cycles: js.UndefOr[Double] = js.native
    
    var defer: js.UndefOr[Boolean] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var fn: js.UndefOr[js.Function] = js.native
    
    var hz: js.UndefOr[Double] = js.native
    
    var id: Double = js.native
    
    var initCount: js.UndefOr[Double] = js.native
    
    var maxTime: js.UndefOr[Double] = js.native
    
    var minSamples: js.UndefOr[Double] = js.native
    
    var minTime: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var options: Options_ = js.native
    
    var running: Boolean = js.native
    
    var stats: js.UndefOr[Stats] = js.native
    
    var times: js.UndefOr[Times] = js.native
  }
  object Target {
    
    @scala.inline
    def apply(id: Double, options: Options_, running: Boolean): Target = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setCompiled(value: js.Function): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setCycles(value: Double): Self = StObject.set(x, "cycles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCyclesUndefined: Self = StObject.set(x, "cycles", js.undefined)
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setHz(value: Double): Self = StObject.set(x, "hz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHzUndefined: Self = StObject.set(x, "hz", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitCount(value: Double): Self = StObject.set(x, "initCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitCountUndefined: Self = StObject.set(x, "initCount", js.undefined)
      
      @scala.inline
      def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      @scala.inline
      def setMinSamples(value: Double): Self = StObject.set(x, "minSamples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSamplesUndefined: Self = StObject.set(x, "minSamples", js.undefined)
      
      @scala.inline
      def setMinTime(value: Double): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: Options_): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setTimes(value: Times): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
  
  @js.native
  trait Times extends StObject {
    
    var cycle: Double = js.native
    
    var elapsed: Double = js.native
    
    var period: Double = js.native
    
    var timeStamp: Double = js.native
  }
  object Times {
    
    @scala.inline
    def apply(cycle: Double, elapsed: Double, period: Double, timeStamp: Double): Times = {
      val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Times]
    }
    
    @scala.inline
    implicit class TimesMutableBuilder[Self <: Times] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCycle(value: Double): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    }
  }
}
