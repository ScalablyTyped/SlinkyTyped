package typingsSlinky.jasmine

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jasmine.jasmine.ArrayContaining
import typingsSlinky.jasmine.jasmine.ArrayLikeMatchers
import typingsSlinky.jasmine.jasmine.AsymmetricMatcher
import typingsSlinky.jasmine.jasmine.AsyncMatchers
import typingsSlinky.jasmine.jasmine.Clock
import typingsSlinky.jasmine.jasmine.Constructor
import typingsSlinky.jasmine.jasmine.CustomAsyncMatcherFactories
import typingsSlinky.jasmine.jasmine.CustomEqualityTester
import typingsSlinky.jasmine.jasmine.CustomMatcherFactories
import typingsSlinky.jasmine.jasmine.CustomObjectFormatter
import typingsSlinky.jasmine.jasmine.Env
import typingsSlinky.jasmine.jasmine.Func
import typingsSlinky.jasmine.jasmine.FunctionMatchers
import typingsSlinky.jasmine.jasmine.HtmlReporter
import typingsSlinky.jasmine.jasmine.HtmlSpecFilter
import typingsSlinky.jasmine.jasmine.Matchers
import typingsSlinky.jasmine.jasmine.MatchersUtil
import typingsSlinky.jasmine.jasmine.NothingMatcher
import typingsSlinky.jasmine.jasmine.ObjectContaining
import typingsSlinky.jasmine.jasmine.Spy
import typingsSlinky.jasmine.jasmine.SpyAnd
import typingsSlinky.jasmine.jasmine.SpyObj
import typingsSlinky.jasmine.jasmine.SpyObjMethodNames
import typingsSlinky.jasmine.jasmine.SpyObjPropertyNames
import typingsSlinky.jasmine.jasmineStrings.get
import typingsSlinky.jasmine.jasmineStrings.objectContaining_
import typingsSlinky.jasmine.jasmineStrings.set
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Run some shared teardown once before all of the specs in the describe are run.
    * Note: Be careful, sharing the teardown from a afterAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
    * @param action Function that contains the code to teardown your specs.
    * @param timeout Custom timeout for an async afterAll
    */
  @JSGlobal("afterAll")
  @js.native
  def afterAll(action: typingsSlinky.jasmine.jasmine.ImplementationCallback): Unit = js.native
  @JSGlobal("afterAll")
  @js.native
  def afterAll(action: typingsSlinky.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  
  /**
    * Run some shared teardown after each of the specs in the describe in which it is called.
    * @param action Function that contains the code to teardown your specs.
    * @param timeout Custom timeout for an async afterEach.
    */
  @JSGlobal("afterEach")
  @js.native
  def afterEach(action: typingsSlinky.jasmine.jasmine.ImplementationCallback): Unit = js.native
  @JSGlobal("afterEach")
  @js.native
  def afterEach(action: typingsSlinky.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  
  /**
    * Run some shared setup once before all of the specs in the describe are run.
    * Note: Be careful, sharing the setup from a beforeAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
    * @param action Function that contains the code to setup your specs.
    * @param timeout Custom timeout for an async beforeAll.
    */
  @JSGlobal("beforeAll")
  @js.native
  def beforeAll(action: typingsSlinky.jasmine.jasmine.ImplementationCallback): Unit = js.native
  @JSGlobal("beforeAll")
  @js.native
  def beforeAll(action: typingsSlinky.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  
  /**
    * Run some shared setup before each of the specs in the describe in which it is called.
    * @param action Function that contains the code to setup your specs.
    * @param timeout Custom timeout for an async beforeEach.
    */
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach(action: typingsSlinky.jasmine.jasmine.ImplementationCallback): Unit = js.native
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach(action: typingsSlinky.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  
  /**
    * Create a group of specs (often called a suite).
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  @JSGlobal("describe")
  @js.native
  def describe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  
  /**
    * Create an expectation for a spec.
    */
  @JSGlobal("expect")
  @js.native
  def expect(): NothingMatcher = js.native
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual Actual computed value to test expectations against.
    */
  @JSGlobal("expect")
  @js.native
  def expect[T](actual: T): Matchers[T] = js.native
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual
    */
  @JSGlobal("expect")
  @js.native
  def expect[T](actual: ArrayLike[T]): ArrayLikeMatchers[T] = js.native
  @JSGlobal("expect")
  @js.native
  def expect[T /* <: Func */](spy: Spy[T]): FunctionMatchers[T] = js.native
  
  /**
    * Create an asynchronous expectation for a spec. Note that the matchers
    * that are provided by an asynchronous expectation all return promises
    * which must be either returned from the spec or waited for using `await`
    * in order for Jasmine to associate them with the correct spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual Actual computed value to test expectations against.
    */
  @JSGlobal("expectAsync")
  @js.native
  def expectAsync[T, U](actual: T): AsyncMatchers[T, U] = js.native
  @JSGlobal("expectAsync")
  @js.native
  def expectAsync[T, U](actual: js.Thenable[T]): AsyncMatchers[T, U] = js.native
  
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param spy
    */
  @JSGlobal("expect")
  @js.native
  def expect_T_Func_FunctionMatchers[T /* <: Func */](spy: T): FunctionMatchers[T] = js.native
  
  /**
    * Explicitly mark a spec as failed.
    * @param e Reason for the failure
    */
  @JSGlobal("fail")
  @js.native
  def fail(): Unit = js.native
  @JSGlobal("fail")
  @js.native
  def fail(e: js.Any): Unit = js.native
  
  /**
    * A focused `describe`. If suites or specs are focused, only those that are focused will be executed.
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  @JSGlobal("fdescribe")
  @js.native
  def fdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  
  /**
    * A focused `it`. If suites or specs are focused, only those that are focused will be executed.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String): Unit = js.native
  @JSGlobal("fit")
  @js.native
  def fit(
    expectation: String,
    assertion: js.UndefOr[typingsSlinky.jasmine.jasmine.ImplementationCallback],
    timeout: Double
  ): Unit = js.native
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String, assertion: typingsSlinky.jasmine.jasmine.ImplementationCallback): Unit = js.native
  
  /**
    * Define a single spec. A spec should contain one or more expectations that test the state of the code.
    * A spec whose expectations all succeed will be passing and a spec with any failures will fail.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  @JSGlobal("it")
  @js.native
  def it(expectation: String): Unit = js.native
  @JSGlobal("it")
  @js.native
  def it(
    expectation: String,
    assertion: js.UndefOr[typingsSlinky.jasmine.jasmine.ImplementationCallback],
    timeout: Double
  ): Unit = js.native
  @JSGlobal("it")
  @js.native
  def it(expectation: String, assertion: typingsSlinky.jasmine.jasmine.ImplementationCallback): Unit = js.native
  
  object jasmine {
    
    @JSGlobal("jasmine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default number of milliseconds Jasmine will wait for an asynchronous spec to complete.
      */
    @JSGlobal("jasmine.DEFAULT_TIMEOUT_INTERVAL")
    @js.native
    def DEFAULT_TIMEOUT_INTERVAL: Double = js.native
    @scala.inline
    def DEFAULT_TIMEOUT_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_TIMEOUT_INTERVAL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.DiffBuilder")
    @js.native
    def DiffBuilder(): typingsSlinky.jasmine.jasmine.DiffBuilder = js.native
    
    @JSGlobal("jasmine.HtmlReporter")
    @js.native
    def HtmlReporter: typingsSlinky.jasmine.jasmine.HtmlReporter = js.native
    @scala.inline
    def HtmlReporter_=(x: HtmlReporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HtmlReporter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.HtmlSpecFilter")
    @js.native
    def HtmlSpecFilter: typingsSlinky.jasmine.jasmine.HtmlSpecFilter = js.native
    @scala.inline
    def HtmlSpecFilter_=(x: HtmlSpecFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HtmlSpecFilter")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum number of array elements to display when pretty printing objects.
      * This will also limit the number of keys and values displayed for an object.
      * Elements past this number will be ellipised.
      */
    @JSGlobal("jasmine.MAX_PRETTY_PRINT_ARRAY_LENGTH")
    @js.native
    def MAX_PRETTY_PRINT_ARRAY_LENGTH: Double = js.native
    @scala.inline
    def MAX_PRETTY_PRINT_ARRAY_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_PRETTY_PRINT_ARRAY_LENGTH")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum number of charasters to display when pretty printing objects.
      * Characters past this number will be ellipised.
      */
    @JSGlobal("jasmine.MAX_PRETTY_PRINT_CHARS")
    @js.native
    def MAX_PRETTY_PRINT_CHARS: Double = js.native
    @scala.inline
    def MAX_PRETTY_PRINT_CHARS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_PRETTY_PRINT_CHARS")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum object depth the pretty printer will print to.
      * Set this to a lower value to speed up pretty printing if you have large objects.
      */
    @JSGlobal("jasmine.MAX_PRETTY_PRINT_DEPTH")
    @js.native
    def MAX_PRETTY_PRINT_DEPTH: Double = js.native
    @scala.inline
    def MAX_PRETTY_PRINT_DEPTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_PRETTY_PRINT_DEPTH")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.addAsyncMatchers")
    @js.native
    def addAsyncMatchers(matchers: CustomAsyncMatcherFactories): Unit = js.native
    
    @JSGlobal("jasmine.addCustomEqualityTester")
    @js.native
    def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
    
    /**
      * Add a custom object formatter for the current scope of specs.
      * Note: This is only callable from within a beforeEach, it, or beforeAll.
      * @since 3.6.0
      * @see https://jasmine.github.io/tutorials/custom_object_formatters
      */
    @JSGlobal("jasmine.addCustomObjectFormatter")
    @js.native
    def addCustomObjectFormatter(formatter: CustomObjectFormatter): Unit = js.native
    
    @JSGlobal("jasmine.addMatchers")
    @js.native
    def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
    
    @JSGlobal("jasmine.any")
    @js.native
    def any(aclass: js.Symbol): AsymmetricMatcher[_] = js.native
    /**
      * That will succeed if the actual value being compared is an instance of the specified class/constructor.
      */
    @JSGlobal("jasmine.any")
    @js.native
    def any(aclass: Constructor): AsymmetricMatcher[_] = js.native
    
    /**
      * That will succeed if the actual value being compared is not `null` and not `undefined`.
      */
    @JSGlobal("jasmine.anything")
    @js.native
    def anything(): AsymmetricMatcher[_] = js.native
    
    @JSGlobal("jasmine.arrayContaining")
    @js.native
    def arrayContaining[T](sample: typingsSlinky.jasmine.jasmine.ArrayLike[T]): ArrayContaining[T] = js.native
    
    @JSGlobal("jasmine.arrayWithExactContents")
    @js.native
    def arrayWithExactContents[T](sample: typingsSlinky.jasmine.jasmine.ArrayLike[T]): ArrayContaining[T] = js.native
    
    @JSGlobal("jasmine.clock")
    @js.native
    def clock(): Clock = js.native
    
    @JSGlobal("jasmine.createSpy")
    @js.native
    def createSpy[Fn /* <: Func */](): Spy[Fn] = js.native
    @JSGlobal("jasmine.createSpy")
    @js.native
    def createSpy[Fn /* <: Func */](name: js.UndefOr[scala.Nothing], originalFn: Fn): Spy[Fn] = js.native
    @JSGlobal("jasmine.createSpy")
    @js.native
    def createSpy[Fn /* <: Func */](name: String): Spy[Fn] = js.native
    @JSGlobal("jasmine.createSpy")
    @js.native
    def createSpy[Fn /* <: Func */](name: String, originalFn: Fn): Spy[Fn] = js.native
    
    @JSGlobal("jasmine.createSpyObj")
    @js.native
    def createSpyObj(baseName: String, methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]]): js.Any = js.native
    @JSGlobal("jasmine.createSpyObj")
    @js.native
    def createSpyObj(
      baseName: String,
      methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]],
      propertyNames: SpyObjPropertyNames[js.UndefOr[scala.Nothing]]
    ): js.Any = js.native
    @JSGlobal("jasmine.createSpyObj")
    @js.native
    def createSpyObj(methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]]): js.Any = js.native
    @JSGlobal("jasmine.createSpyObj")
    @js.native
    def createSpyObj(
      methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]],
      propertyNames: SpyObjPropertyNames[js.UndefOr[scala.Nothing]]
    ): js.Any = js.native
    @JSGlobal("jasmine.createSpyObj")
    @js.native
    def createSpyObj_T_SpyObj[T](baseName: String, methodNames: SpyObjMethodNames[T]): SpyObj[T] = js.native
    @JSGlobal("jasmine.createSpyObj")
    @js.native
    def createSpyObj_T_SpyObj[T](baseName: String, methodNames: SpyObjMethodNames[T], propertyNames: SpyObjPropertyNames[T]): SpyObj[T] = js.native
    @JSGlobal("jasmine.createSpyObj")
    @js.native
    def createSpyObj_T_SpyObj[T](methodNames: SpyObjMethodNames[T]): SpyObj[T] = js.native
    @JSGlobal("jasmine.createSpyObj")
    @js.native
    def createSpyObj_T_SpyObj[T](methodNames: SpyObjMethodNames[T], propertyNames: SpyObjPropertyNames[T]): SpyObj[T] = js.native
    
    /**
      * That will succeed if the actual value being compared is empty.
      * @since 3.1.0
      */
    @JSGlobal("jasmine.empty")
    @js.native
    def empty(): AsymmetricMatcher[_] = js.native
    
    object errors {
      
      @JSGlobal("jasmine.errors.ExpectationFailed")
      @js.native
      class ExpectationFailed ()
        extends typingsSlinky.jasmine.jasmine.errors.ExpectationFailed
    }
    
    /**
      * That will succeed if the actual value being compared is  `null`, `undefined`, `0`, `false` or anything falsey.
      * @since 3.1.0
      */
    @JSGlobal("jasmine.falsy")
    @js.native
    def falsy(): AsymmetricMatcher[_] = js.native
    
    @JSGlobal("jasmine.formatErrorMsg")
    @js.native
    def formatErrorMsg(domain: String, usage: String): js.Function1[/* msg */ String, String] = js.native
    
    @JSGlobal("jasmine.getEnv")
    @js.native
    def getEnv(): Env = js.native
    
    @JSGlobal("jasmine.matchersUtil")
    @js.native
    def matchersUtil: MatchersUtil = js.native
    @scala.inline
    def matchersUtil_=(x: MatchersUtil): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchersUtil")(x.asInstanceOf[js.Any])
    
    /**
      * That will succeed if the actual value being compared is not empty.
      * @since 3.1.0
      */
    @JSGlobal("jasmine.notEmpty")
    @js.native
    def notEmpty(): AsymmetricMatcher[_] = js.native
    
    @JSGlobal("jasmine.objectContaining")
    @js.native
    def objectContaining[T](
      sample: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? jasmine.jasmine.ExpectedRecursive<T[K]>}
      */ objectContaining_ with TopLevel[T]
    ): ObjectContaining[T] = js.native
    
    @JSGlobal("jasmine.pp")
    @js.native
    def pp(value: js.Any): String = js.native
    
    @JSGlobal("jasmine.setDefaultSpyStrategy")
    @js.native
    def setDefaultSpyStrategy[Fn /* <: Func */](and: SpyAnd[Fn]): Unit = js.native
    
    @JSGlobal("jasmine.stringMatching")
    @js.native
    def stringMatching(str: String): AsymmetricMatcher[String] = js.native
    @JSGlobal("jasmine.stringMatching")
    @js.native
    def stringMatching(str: js.RegExp): AsymmetricMatcher[String] = js.native
    
    /**
      * That will succeed if the actual value being compared is `true` or anything truthy.
      * @since 3.1.0
      */
    @JSGlobal("jasmine.truthy")
    @js.native
    def truthy(): AsymmetricMatcher[_] = js.native
  }
  
  /**
    * Mark a spec as pending, expectation results will be ignored.
    * If you call the function pending anywhere in the spec body, no matter the expectations, the spec will be marked pending.
    * @param reason Reason the spec is pending.
    */
  @JSGlobal("pending")
  @js.native
  def pending(): Unit = js.native
  @JSGlobal("pending")
  @js.native
  def pending(reason: String): Unit = js.native
  
  @JSGlobal("runs")
  @js.native
  def runs(asyncMethod: js.Function): Unit = js.native
  
  /**
    * Sets a user-defined property that will be provided to reporters as
    * part of the properties field of SpecResult.
    * @since 3.6.0
    */
  @JSGlobal("setSpecProperty")
  @js.native
  def setSpecProperty(key: String, value: js.Any): Unit = js.native
  
  /**
    * Sets a user-defined property that will be provided to reporters as
    * part of the properties field of SuiteResult.
    * @since 3.6.0
    */
  @JSGlobal("setSuiteProperty")
  @js.native
  def setSuiteProperty(key: String, value: js.Any): Unit = js.native
  
  /**
    * Install a spy onto an existing object.
    * @param object The object upon which to install the `Spy`.
    * @param method The name of the method to replace with a `Spy`.
    */
  @JSGlobal("spyOn")
  @js.native
  def spyOn[T, K /* <: /* keyof T */ String */](`object`: T, method: K): Spy[
    (js.Function1[/* args */ _, _]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any)
  ] = js.native
  
  /**
    * Installs spies on all writable and configurable properties of an object.
    * @param object The object upon which to install the `Spy`s.
    */
  @JSGlobal("spyOnAllFunctions")
  @js.native
  def spyOnAllFunctions[T](`object`: T): SpyObj[T] = js.native
  
  /**
    * Install a spy on a property installed with `Object.defineProperty` onto an existing object.
    * @param object The object upon which to install the `Spy`.
    * @param property The name of the property to replace with a `Spy`.
    * @param accessType The access type (get|set) of the property to `Spy` on.
    */
  @JSGlobal("spyOnProperty")
  @js.native
  def spyOnProperty[T](`object`: T, property: /* keyof T */ String): Spy[Func] = js.native
  @JSGlobal("spyOnProperty")
  @js.native
  def spyOnProperty_get[T](`object`: T, property: /* keyof T */ String, accessType: get): Spy[Func] = js.native
  @JSGlobal("spyOnProperty")
  @js.native
  def spyOnProperty_set[T](`object`: T, property: /* keyof T */ String, accessType: set): Spy[Func] = js.native
  
  @JSGlobal("waits")
  @js.native
  def waits(): Unit = js.native
  @JSGlobal("waits")
  @js.native
  def waits(timeout: Double): Unit = js.native
  
  @JSGlobal("waitsFor")
  @js.native
  def waitsFor(latchMethod: js.Function0[Boolean]): Unit = js.native
  @JSGlobal("waitsFor")
  @js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  @JSGlobal("waitsFor")
  @js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String): Unit = js.native
  @JSGlobal("waitsFor")
  @js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String, timeout: Double): Unit = js.native
  
  /**
    * A temporarily disabled `describe`. Specs within an xdescribe will be marked pending and not executed.
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  @JSGlobal("xdescribe")
  @js.native
  def xdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  
  /**
    * A temporarily disabled `it`. The spec will report as pending and will not be executed.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String): Unit = js.native
  @JSGlobal("xit")
  @js.native
  def xit(
    expectation: String,
    assertion: js.UndefOr[typingsSlinky.jasmine.jasmine.ImplementationCallback],
    timeout: Double
  ): Unit = js.native
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String, assertion: typingsSlinky.jasmine.jasmine.ImplementationCallback): Unit = js.native
}
