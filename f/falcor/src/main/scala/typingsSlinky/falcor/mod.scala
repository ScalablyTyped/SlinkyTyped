package typingsSlinky.falcor

import typingsSlinky.falcorHttpDatasource.mod.XMlHttpSource
import typingsSlinky.falcorJsonGraph.mod.Atom_
import typingsSlinky.falcorJsonGraph.mod.Error_
import typingsSlinky.falcorJsonGraph.mod.JSONEnvelope
import typingsSlinky.falcorJsonGraph.mod.JSONGraph
import typingsSlinky.falcorJsonGraph.mod.JSONGraphEnvelope
import typingsSlinky.falcorJsonGraph.mod.Path
import typingsSlinky.falcorJsonGraph.mod.PathSet
import typingsSlinky.falcorJsonGraph.mod.PathValue_
import typingsSlinky.falcorJsonGraph.mod.Reference
import typingsSlinky.falcorJsonGraph.mod.Sentinel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("falcor", "DataSource")
  @js.native
  abstract class DataSource () extends StObject {
    
    /**
      * Invokes a function in the DataSource's JSONGraph object.
      */
    def call(functionPath: Path): Observable[JSONGraphEnvelope] = js.native
    def call(
      functionPath: Path,
      args: js.UndefOr[scala.Nothing],
      refSuffixes: js.UndefOr[scala.Nothing],
      thisPaths: js.Array[PathSet]
    ): Observable[JSONGraphEnvelope] = js.native
    def call(functionPath: Path, args: js.UndefOr[scala.Nothing], refSuffixes: js.Array[PathSet]): Observable[JSONGraphEnvelope] = js.native
    def call(
      functionPath: Path,
      args: js.UndefOr[scala.Nothing],
      refSuffixes: js.Array[PathSet],
      thisPaths: js.Array[PathSet]
    ): Observable[JSONGraphEnvelope] = js.native
    def call(functionPath: Path, args: js.Array[_]): Observable[JSONGraphEnvelope] = js.native
    def call(
      functionPath: Path,
      args: js.Array[_],
      refSuffixes: js.UndefOr[scala.Nothing],
      thisPaths: js.Array[PathSet]
    ): Observable[JSONGraphEnvelope] = js.native
    def call(functionPath: Path, args: js.Array[_], refSuffixes: js.Array[PathSet]): Observable[JSONGraphEnvelope] = js.native
    def call(
      functionPath: Path,
      args: js.Array[_],
      refSuffixes: js.Array[PathSet],
      thisPaths: js.Array[PathSet]
    ): Observable[JSONGraphEnvelope] = js.native
    
    /**
      * The get method retrieves values from the DataSource's associated JSONGraph object.
      */
    def get(pathSets: js.Array[PathSet]): Observable[JSONGraphEnvelope] = js.native
    
    /**
      * The set method accepts values to set in the DataSource's associated JSONGraph object.
      */
    def set(jsonGraphEnvelope: JSONGraphEnvelope): Observable[JSONGraphEnvelope] = js.native
  }
  
  /**
    * A HttpDataSource object is a {@link DataSource} can be used to retrieve data from a remote JSONGraph object using the browser's XMLHttpRequest.
    **/
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FalcorModel.DataSource * / any */ @JSImport("falcor", "HttpDataSource")
  @js.native
  class HttpDataSource protected () extends XMlHttpSource {
    def this(jsonGraphUrl: String) = this()
    def this(jsonGraphUrl: String, config: js.Any) = this()
  }
  
  @JSImport("falcor", "Model")
  @js.native
  class Model () extends StObject {
    def this(options: ModelOptions) = this()
    
    /**
      * Adapts a Model to the {@link DataSource} interface.
      */
    def asDataSource(): DataSource = js.native
    
    /**
      * Returns a clone of the {@link Model} that enables batching. Within the configured time period, paths for get operations are collected and sent to the {@link DataSource} in a batch.
      * Batching can be more efficient if the {@link DataSource} access the network, potentially reducing the number of HTTP requests to the server.
      */
    def batch(): Model = js.native
    def batch(schedulerOrDelay: Double): Model = js.native
    def batch(schedulerOrDelay: Scheduler): Model = js.native
    
    /**
      * Returns a clone of the {@link Model} that boxes values returning the wrapper ({@link Atom}, {@link Reference}, or {@link Error}), rather than the value inside it.
      * This allows any metadata attached to the wrapper to be inspected.
      */
    def boxValues(): Model = js.native
    
    /**
      * Invokes a function in the JSON Graph.
      */
    // NOTE: In http://netflix.github.io/falcor/doc/Model.html#call, it says that refPaths should be an PathSet[].
    // However, model implementation returns an error with setting refPaths as PathSet[] and it works with refPaths as PathSet.
    // So refPaths is defined as a PathSet in this .d.ts.
    def call(functionPath: String): ModelResponse[JSONEnvelope[_]] = js.native
    def call(
      functionPath: String,
      args: js.UndefOr[scala.Nothing],
      refPaths: js.UndefOr[scala.Nothing],
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[_]] = js.native
    def call(functionPath: String, args: js.UndefOr[scala.Nothing], refPaths: PathSet): ModelResponse[JSONEnvelope[_]] = js.native
    def call(
      functionPath: String,
      args: js.UndefOr[scala.Nothing],
      refPaths: PathSet,
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[_]] = js.native
    def call(functionPath: String, args: js.Array[_]): ModelResponse[JSONEnvelope[_]] = js.native
    def call(
      functionPath: String,
      args: js.Array[_],
      refPaths: js.UndefOr[scala.Nothing],
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[_]] = js.native
    def call(functionPath: String, args: js.Array[_], refPaths: PathSet): ModelResponse[JSONEnvelope[_]] = js.native
    def call(functionPath: String, args: js.Array[_], refPaths: PathSet, thisPaths: js.Array[PathSet]): ModelResponse[JSONEnvelope[_]] = js.native
    def call(functionPath: Path): ModelResponse[JSONEnvelope[_]] = js.native
    def call(
      functionPath: Path,
      args: js.UndefOr[scala.Nothing],
      refPaths: js.UndefOr[scala.Nothing],
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[_]] = js.native
    def call(functionPath: Path, args: js.UndefOr[scala.Nothing], refPaths: PathSet): ModelResponse[JSONEnvelope[_]] = js.native
    def call(
      functionPath: Path,
      args: js.UndefOr[scala.Nothing],
      refPaths: PathSet,
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[_]] = js.native
    def call(functionPath: Path, args: js.Array[_]): ModelResponse[JSONEnvelope[_]] = js.native
    def call(
      functionPath: Path,
      args: js.Array[_],
      refPaths: js.UndefOr[scala.Nothing],
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[_]] = js.native
    def call(functionPath: Path, args: js.Array[_], refPaths: PathSet): ModelResponse[JSONEnvelope[_]] = js.native
    def call(functionPath: Path, args: js.Array[_], refPaths: PathSet, thisPaths: js.Array[PathSet]): ModelResponse[JSONEnvelope[_]] = js.native
    @JSName("call")
    def call_T[T](functionPath: String): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](
      functionPath: String,
      args: js.UndefOr[scala.Nothing],
      refPaths: js.UndefOr[scala.Nothing],
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](functionPath: String, args: js.UndefOr[scala.Nothing], refPaths: PathSet): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](
      functionPath: String,
      args: js.UndefOr[scala.Nothing],
      refPaths: PathSet,
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](functionPath: String, args: js.Array[_]): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](
      functionPath: String,
      args: js.Array[_],
      refPaths: js.UndefOr[scala.Nothing],
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](functionPath: String, args: js.Array[_], refPaths: PathSet): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](functionPath: String, args: js.Array[_], refPaths: PathSet, thisPaths: js.Array[PathSet]): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](functionPath: Path): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](
      functionPath: Path,
      args: js.UndefOr[scala.Nothing],
      refPaths: js.UndefOr[scala.Nothing],
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](functionPath: Path, args: js.UndefOr[scala.Nothing], refPaths: PathSet): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](
      functionPath: Path,
      args: js.UndefOr[scala.Nothing],
      refPaths: PathSet,
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](functionPath: Path, args: js.Array[_]): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](
      functionPath: Path,
      args: js.Array[_],
      refPaths: js.UndefOr[scala.Nothing],
      thisPaths: js.Array[PathSet]
    ): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](functionPath: Path, args: js.Array[_], refPaths: PathSet): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("call")
    def call_T[T](functionPath: Path, args: js.Array[_], refPaths: PathSet, thisPaths: js.Array[PathSet]): ModelResponse[JSONEnvelope[T]] = js.native
    
    /**
      * Returns a new {@link Model} bound to a location within the {@link JSONGraph}.
      * The bound location is never a {@link Reference}: any {@link Reference}s encountered while resolving the bound {@link Path} are always replaced with the {@link Reference}s target value.
      * For subsequent operations on the {@link Model}, all paths will be evaluated relative to the bound path. Deref allows you to:
      * - Expose only a fragment of the {@link JSONGraph} to components, rather than the entire graph
      * - Hide the location of a {@link JSONGraph} fragment from components
      * - Optimize for executing multiple operations and path looksup at/below the same location in the {@link JSONGraph}
      */
    def deref(responseObject: js.Any): Model = js.native
    
    /**
      * The get method retrieves several {@link Path}s or {@link PathSet}s from a {@link Model}. The get method loads each value into a JSON object and returns in a ModelResponse.
      */
    def get(path: (String | PathSet)*): ModelResponse[JSONEnvelope[_]] = js.native
    
    /**
      * Get the local {@link JSONGraph} cache. This method can be a useful to store the state of the cache.
      */
    def getCache(path: PathSet*): JSONGraph = js.native
    
    /**
      * Returns the {@link Path} to the object within the JSON Graph that this Model references.
      */
    def getPath(): Path = js.native
    
    /**
      * Get data for a single {@link Path}.
      */
    def getValue(path: String): ModelResponse[_] = js.native
    def getValue(path: Path): ModelResponse[_] = js.native
    @JSName("getValue")
    def getValue_T[T](path: String): ModelResponse[T] = js.native
    @JSName("getValue")
    def getValue_T[T](path: Path): ModelResponse[T] = js.native
    
    /**
      * Retrieves a number which is incremented every single time a value is changed underneath the Model or the object at an optionally-provided Path beneath the Model.
      */
    def getVersion(): Double = js.native
    def getVersion(path: Path): Double = js.native
    
    @JSName("get")
    def get_T[T](path: (String | PathSet)*): ModelResponse[JSONEnvelope[T]] = js.native
    
    /**
      * The invalidate method synchronously removes several {@link Path}s or {@link PathSet}s from a {@link Model} cache.
      */
    def invalidate(path: PathSet*): Unit = js.native
    
    /**
      * The preload method retrieves several {@link Path}s or {@link PathSet}s from a {@link Model} and loads them into the Model cache.
      */
    def preload(path: PathSet*): Unit = js.native
    
    /**
      * Sets the value at one or more places in the JSONGraph model.
      * The set method accepts one or more {@link PathValue}s, each of which is a combination of a location in the document and the value to place there.
      * In addition to accepting  {@link PathValue}s, the set method also returns the values after the set operation is complete.
      */
    def set(args: PathValue_ *): ModelResponse[JSONEnvelope[_]] = js.native
    def set(jsonGraph: JSONGraph): ModelResponse[JSONEnvelope[_]] = js.native
    
    /**
      * Set the local cache to a {@link JSONGraph} fragment. This method can be a useful way of mocking a remote document, or restoring the local cache from a previously stored state.
      */
    def setCache(jsonGraph: JSONGraph): Unit = js.native
    
    /**
      * Set value for a single {@link Path}.
      */
    def setValue(path: String, value: js.Any): ModelResponse[_] = js.native
    def setValue(path: Path, value: js.Any): ModelResponse[_] = js.native
    @JSName("setValue")
    def setValue_T[T](path: String, value: js.Any): ModelResponse[T] = js.native
    @JSName("setValue")
    def setValue_T[T](path: Path, value: js.Any): ModelResponse[T] = js.native
    
    @JSName("set")
    def set_T[T](args: PathValue_ *): ModelResponse[JSONEnvelope[T]] = js.native
    @JSName("set")
    def set_T[T](jsonGraph: JSONGraph): ModelResponse[JSONEnvelope[T]] = js.native
    
    /**
      * Returns a clone of the {@link Model} that treats errors as values. Errors will be reported in the same callback used to report data.
      * Errors will appear as objects in responses, rather than being sent to the {@link Observable~onErrorCallback} callback of the {@link ModelResponse}.
      */
    def treatErrorsAsValues(): Model = js.native
    
    // FIXME what's a valid type for scheduler?
    /**
      * Returns a clone of the {@link Model} that disables batching. This is the default mode. Each get operation will be executed on the {@link DataSource} separately.
      */
    def unbatch(): Model = js.native
    
    /**
      * Returns a clone of the {@link Model} that unboxes values, returning the value inside of the wrapper ({@link Atom}, {@link Reference}, or {@link Error}), rather than the wrapper itself.
      * This is the default mode.
      */
    def unboxValues(): Model = js.native
    
    /**
      * Returns a clone of the {@link Model} that only uses the local {@link JSONGraph} and never uses a {@link DataSource} to retrieve missing paths.
      */
    def withoutDataSource(): Model = js.native
  }
  
  @JSImport("falcor", "ModelResponse")
  @js.native
  class ModelResponse[T] protected () extends Observable[T] {
    def this(observable: Observable[T]) = this()
    
    def progressively(): ModelResponse[T] = js.native
    
    def `then`(): Thenable[_] = js.native
    def `then`(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function1[/* error */ js.Any, Unit]): Thenable[_] = js.native
    def `then`(onFulfilled: js.Function1[/* value */ T, _ | Thenable[_]]): Thenable[_] = js.native
    def `then`(
      onFulfilled: js.Function1[/* value */ T, _ | Thenable[_]],
      onRejected: js.Function1[/* error */ js.Any, Unit]
    ): Thenable[_] = js.native
    @JSName("then")
    def then_U[U](): Thenable[U] = js.native
    @JSName("then")
    def then_U[U](onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function1[/* error */ js.Any, Unit]): Thenable[U] = js.native
    @JSName("then")
    def then_U[U](onFulfilled: js.Function1[/* value */ T, U | Thenable[U]]): Thenable[U] = js.native
    @JSName("then")
    def then_U[U](
      onFulfilled: js.Function1[/* value */ T, U | Thenable[U]],
      onRejected: js.Function1[/* error */ js.Any, Unit]
    ): Thenable[U] = js.native
  }
  
  @JSImport("falcor", "Observable")
  @js.native
  class Observable[T] () extends StObject {
    
    /**
      * The forEach method is a synonym for {@link Observable.prototype.subscribe} and triggers the execution of the Observable, causing the values within to be pushed to a callback.
      * An Observable is like a pipe of water that is closed.
      * When forEach is called, we open the valve and the values within are pushed at us.
      * These values can be received using either callbacks or an {@link Observer} object.
      */
    def forEach(): Subscription = js.native
    def forEach(
      onNext: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      onCompleted: ObservableOnCompletedCallback
    ): Subscription = js.native
    def forEach(onNext: js.UndefOr[scala.Nothing], onError: ObservableOnErrorCallback): Subscription = js.native
    def forEach(
      onNext: js.UndefOr[scala.Nothing],
      onError: ObservableOnErrorCallback,
      onCompleted: ObservableOnCompletedCallback
    ): Subscription = js.native
    def forEach(onNext: ObservableOnNextCallback[T]): Subscription = js.native
    def forEach(
      onNext: ObservableOnNextCallback[T],
      onError: js.UndefOr[scala.Nothing],
      onCompleted: ObservableOnCompletedCallback
    ): Subscription = js.native
    def forEach(onNext: ObservableOnNextCallback[T], onError: ObservableOnErrorCallback): Subscription = js.native
    def forEach(
      onNext: ObservableOnNextCallback[T],
      onError: ObservableOnErrorCallback,
      onCompleted: ObservableOnCompletedCallback
    ): Subscription = js.native
    
    /**
      * The subscribe method is a synonym for {@link Observable.prototype.forEach} and triggers the execution of the Observable, causing the values within to be pushed to a callback.
      * An Observable is like a pipe of water that is closed.
      * When forEach is called, we open the valve and the values within are pushed at us.  These values can be received using either callbacks or an {@link Observer} object.
      */
    def subscribe(): Subscription = js.native
    def subscribe(
      onNext: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      onCompleted: ObservableOnCompletedCallback
    ): Subscription = js.native
    def subscribe(onNext: js.UndefOr[scala.Nothing], onError: ObservableOnErrorCallback): Subscription = js.native
    def subscribe(
      onNext: js.UndefOr[scala.Nothing],
      onError: ObservableOnErrorCallback,
      onCompleted: ObservableOnCompletedCallback
    ): Subscription = js.native
    def subscribe(onNext: ObservableOnNextCallback[T]): Subscription = js.native
    def subscribe(
      onNext: ObservableOnNextCallback[T],
      onError: js.UndefOr[scala.Nothing],
      onCompleted: ObservableOnCompletedCallback
    ): Subscription = js.native
    def subscribe(onNext: ObservableOnNextCallback[T], onError: ObservableOnErrorCallback): Subscription = js.native
    def subscribe(
      onNext: ObservableOnNextCallback[T],
      onError: ObservableOnErrorCallback,
      onCompleted: ObservableOnCompletedCallback
    ): Subscription = js.native
  }
  
  @JSImport("falcor", "Subscription")
  @js.native
  class Subscription () extends StObject {
    
    /**
      * When this method is called on the Subscription, the Observable that created the Subscription will stop sending values to the callbacks passed when the Subscription was created.
      */
    def dispose(): Unit = js.native
  }
  
  @JSImport("falcor", "atom")
  @js.native
  def atom(value: js.Any): Atom_ = js.native
  @JSImport("falcor", "atom")
  @js.native
  def atom(value: js.Any, props: Sentinel): Atom_ = js.native
  
  @JSImport("falcor", "error")
  @js.native
  def error(errorValue: js.Any): Error_ = js.native
  @JSImport("falcor", "error")
  @js.native
  def error(errorValue: js.Any, props: Sentinel): Error_ = js.native
  
  @JSImport("falcor", "pathValue")
  @js.native
  def pathValue(path: String, value: js.Any): PathValue_ = js.native
  @JSImport("falcor", "pathValue")
  @js.native
  def pathValue(path: PathSet, value: js.Any): PathValue_ = js.native
  
  @JSImport("falcor", "ref")
  @js.native
  def ref(path: String): Reference = js.native
  @JSImport("falcor", "ref")
  @js.native
  def ref(path: String, props: Sentinel): Reference = js.native
  @JSImport("falcor", "ref")
  @js.native
  def ref(path: PathSet): Reference = js.native
  @JSImport("falcor", "ref")
  @js.native
  def ref(path: PathSet, props: Sentinel): Reference = js.native
  
  type ModelComparator = js.Function2[/* existingValue */ js.Any, /* newValue */ js.Any, Boolean]
  
  type ModelErrorSelector = js.Function1[/* jsonGraphError */ js.Any, js.Any]
  
  type ModelOnChange = js.Function0[Unit]
  
  @js.native
  trait ModelOptions extends StObject {
    
    var cache: js.UndefOr[JSONGraph] = js.native
    
    var collectRatio: js.UndefOr[Double] = js.native
    
    var comparator: js.UndefOr[ModelComparator] = js.native
    
    var errorSelector: js.UndefOr[ModelErrorSelector] = js.native
    
    var maxSize: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[ModelOnChange] = js.native
    
    var source: js.UndefOr[DataSource] = js.native
  }
  object ModelOptions {
    
    @scala.inline
    def apply(): ModelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelOptions]
    }
    
    @scala.inline
    implicit class ModelOptionsMutableBuilder[Self <: ModelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: JSONGraph): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCollectRatio(value: Double): Self = StObject.set(x, "collectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectRatioUndefined: Self = StObject.set(x, "collectRatio", js.undefined)
      
      @scala.inline
      def setComparator(value: (/* existingValue */ js.Any, /* newValue */ js.Any) => Boolean): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setErrorSelector(value: /* jsonGraphError */ js.Any => js.Any): Self = StObject.set(x, "errorSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorSelectorUndefined: Self = StObject.set(x, "errorSelector", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSource(value: DataSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type ObservableOnCompletedCallback = js.Function0[Unit]
  
  type ObservableOnErrorCallback = js.Function1[/* error */ Error_, Unit]
  
  type ObservableOnNextCallback[T] = js.Function1[/* value */ T, Unit]
  
  @js.native
  trait Scheduler extends StObject {
    
    def `catch`(handler: js.Function1[/* exception */ js.Any, Boolean]): Scheduler = js.native
    
    def catchException(handler: js.Function1[/* exception */ js.Any, Boolean]): Scheduler = js.native
  }
  object Scheduler {
    
    @scala.inline
    def apply(
      `catch`: js.Function1[/* exception */ js.Any, Boolean] => Scheduler,
      catchException: js.Function1[/* exception */ js.Any, Boolean] => Scheduler
    ): Scheduler = {
      val __obj = js.Dynamic.literal(catchException = js.Any.fromFunction1(catchException))
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.asInstanceOf[Scheduler]
    }
    
    @scala.inline
    implicit class SchedulerMutableBuilder[Self <: Scheduler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: js.Function1[/* exception */ js.Any, Boolean] => Scheduler): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCatchException(value: js.Function1[/* exception */ js.Any, Boolean] => Scheduler): Self = StObject.set(x, "catchException", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Thenable[T] extends StObject {
    
    def `then`[U](): Thenable[U] = js.native
    def `then`[U](
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function1[/* error */ js.Any, U | Thenable[U] | Unit]
    ): Thenable[U] = js.native
    def `then`[U](onFulfilled: js.Function1[/* value */ T, U | Thenable[U]]): Thenable[U] = js.native
    def `then`[U](
      onFulfilled: js.Function1[/* value */ T, U | Thenable[U]],
      onRejected: js.Function1[/* error */ js.Any, U | Thenable[U] | Unit]
    ): Thenable[U] = js.native
  }
}
