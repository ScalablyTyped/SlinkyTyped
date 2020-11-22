package typingsSlinky.mocha.Mocha

import typingsSlinky.mocha.NodeJS.EventEmitter
import typingsSlinky.mocha.mochaStrings.`post-require`
import typingsSlinky.mocha.mochaStrings.`pre-require`
import typingsSlinky.mocha.mochaStrings.afterAll
import typingsSlinky.mocha.mochaStrings.afterEach
import typingsSlinky.mocha.mochaStrings.beforeAll
import typingsSlinky.mocha.mochaStrings.beforeEach
import typingsSlinky.mocha.mochaStrings.require
import typingsSlinky.mocha.mochaStrings.run
import typingsSlinky.mocha.mochaStrings.suite
import typingsSlinky.mocha.mochaStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion Suite "post-require" event
// #region Suite untyped events
// #endregion Suite "require" event
// #region Suite "post-require" event
// #endregion Suite "pre-require" event
// #region Suite "require" event
// #endregion Suite "run" event
// #region Suite "pre-require" event
// #endregion Suite "test" event
// #region Suite "run" event
// #endregion Suite "suite" event
// #region Suite "test" event
// #endregion Suite "afterEach" event
// #region Suite "suite" event
// #endregion Suite "beforeEach" event
// #region Suite "afterEach" event
// #endregion Suite "afterAll" event
// #region Suite "beforeEach" event
// #endregion Suite "beforeAll" event
// #region Suite "afterAll" event
// #region Suite "beforeAll" event
/**
  * Initialize a new `Suite` with the given `title` and `ctx`.
  *
  * @see https://mochajs.org/api/Mocha.Suite.html
  */
@js.native
trait Suite extends EventEmitter {
  
  var _afterAll: js.Any = js.native
  
  var _afterEach: js.Any = js.native
  
  var _bail: js.Any = js.native
  
  var _beforeAll: js.Any = js.native
  
  var _beforeEach: js.Any = js.native
  
  /**
    * Generic hook-creator.
    */
  /* protected */ def _createHook(title: String): Hook = js.native
  /* protected */ def _createHook(title: String, fn: AsyncFunc): Hook = js.native
  /* protected */ def _createHook(title: String, fn: Func): Hook = js.native
  
  var _onlySuites: js.Any = js.native
  
  var _onlyTests: js.Any = js.native
  
  var _retries: js.Any = js.native
  
  var _slow: js.Any = js.native
  
  var _timeout: js.Any = js.native
  
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_postrequire(
    event: `post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_prerequire(
    event: `pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_require(
    event: require,
    listener: js.Function3[/* module */ js.Any, /* file */ String, /* mocha */ typingsSlinky.mocha.Mocha, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_run(event: run, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  
  /**
    * Add a test `suite`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#addSuite
    */
  def addSuite(suite: Suite): this.type = js.native
  
  /**
    * Add a `test` to this suite.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#addTest
    */
  def addTest(test: Test): this.type = js.native
  
  /**
    * Run `fn(test[, done])` after running tests.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#afterAll
    */
  def afterAll(): this.type = js.native
  def afterAll(fn: AsyncFunc): this.type = js.native
  def afterAll(fn: Func): this.type = js.native
  /**
    * Run `fn(test[, done])` after running tests.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#afterAll
    */
  def afterAll(title: String): this.type = js.native
  def afterAll(title: String, fn: AsyncFunc): this.type = js.native
  def afterAll(title: String, fn: Func): this.type = js.native
  
  /**
    * Run `fn(test[, done])` after each test case.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#afterEach
    */
  def afterEach(): this.type = js.native
  def afterEach(fn: AsyncFunc): this.type = js.native
  def afterEach(fn: Func): this.type = js.native
  /**
    * Run `fn(test[, done])` after each test case.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#afterEach
    */
  def afterEach(title: String): this.type = js.native
  def afterEach(title: String, fn: AsyncFunc): this.type = js.native
  def afterEach(title: String, fn: Func): this.type = js.native
  
  /**
    * Get whether to bail after first error.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#bail
    */
  def bail(): Boolean = js.native
  /**
    * Set whether to bail after first error.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#bail
    */
  def bail(bail: Boolean): this.type = js.native
  
  /**
    * Run `fn(test[, done])` before running tests.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#beforeAll
    */
  def beforeAll(): this.type = js.native
  def beforeAll(fn: AsyncFunc): this.type = js.native
  def beforeAll(fn: Func): this.type = js.native
  /**
    * Run `fn(test[, done])` before running tests.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#beforeAll
    */
  def beforeAll(title: String): this.type = js.native
  def beforeAll(title: String, fn: AsyncFunc): this.type = js.native
  def beforeAll(title: String, fn: Func): this.type = js.native
  
  /**
    * Run `fn(test[, done])` before each test case.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#beforeEach
    */
  def beforeEach(): this.type = js.native
  def beforeEach(fn: AsyncFunc): this.type = js.native
  def beforeEach(fn: Func): this.type = js.native
  /**
    * Run `fn(test[, done])` before each test case.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#beforeEach
    */
  def beforeEach(title: String): this.type = js.native
  def beforeEach(title: String, fn: AsyncFunc): this.type = js.native
  def beforeEach(title: String, fn: Func): this.type = js.native
  
  var ctx: Context = js.native
  
  var delayed: Boolean = js.native
  
  /**
    * Cleans all references from this suite and all child suites.
    *
    * https://mochajs.org/api/suite#dispose
    */
  def dispose(): Unit = js.native
  
  /**
    * Iterates through each suite recursively to find all tests. Applies a
    * function in the format `fn(test)`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#eachTest
    */
  def eachTest(fn: js.Function1[/* test */ Test, Unit]): this.type = js.native
  
  def emit(name: String, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_afterAll(name: afterAll, hook: Hook): Boolean = js.native
  @JSName("emit")
  def emit_afterEach(name: afterEach, hook: Hook): Boolean = js.native
  @JSName("emit")
  def emit_beforeAll(name: beforeAll, hook: Hook): Boolean = js.native
  @JSName("emit")
  def emit_beforeEach(name: beforeEach, hook: Hook): Boolean = js.native
  @JSName("emit")
  def emit_postrequire(name: `post-require`, context: MochaGlobals, file: String, mocha: typingsSlinky.mocha.Mocha): Boolean = js.native
  @JSName("emit")
  def emit_prerequire(name: `pre-require`, context: MochaGlobals, file: String, mocha: typingsSlinky.mocha.Mocha): Boolean = js.native
  @JSName("emit")
  def emit_require(name: require, module: js.Any, file: String, mocha: typingsSlinky.mocha.Mocha): Boolean = js.native
  @JSName("emit")
  def emit_run(name: run): Boolean = js.native
  @JSName("emit")
  def emit_suite(name: suite, suite: Suite): Boolean = js.native
  @JSName("emit")
  def emit_test(name: test, test: Test): Boolean = js.native
  
  var file: js.UndefOr[String] = js.native
  
  /**
    * Return the full title generated by recursively concatenating the parent's
    * full title.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#.Suite#fullTitle
    */
  def fullTitle(): String = js.native
  
  /**
    * Check if this suite or its parent suite is marked as pending.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#isPending
    */
  def isPending(): Boolean = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("on")
  def on_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("on")
  def on_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("on")
  def on_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("on")
  def on_postrequire(
    event: `post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_prerequire(
    event: `pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_require(
    event: require,
    listener: js.Function3[/* module */ js.Any, /* file */ String, /* mocha */ typingsSlinky.mocha.Mocha, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_run(event: run, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("once")
  def once_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("once")
  def once_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("once")
  def once_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("once")
  def once_postrequire(
    event: `post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_prerequire(
    event: `pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_require(
    event: require,
    listener: js.Function3[/* module */ js.Any, /* file */ String, /* mocha */ typingsSlinky.mocha.Mocha, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_run(event: run, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
  @JSName("once")
  def once_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  
  var parent: js.UndefOr[Suite] = js.native
  
  var pending: Boolean = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_postrequire(
    event: `post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_prerequire(
    event: `pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_require(
    event: require,
    listener: js.Function3[/* module */ js.Any, /* file */ String, /* mocha */ typingsSlinky.mocha.Mocha, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_run(event: run, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_postrequire(
    event: `post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_prerequire(
    event: `pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_require(
    event: require,
    listener: js.Function3[/* module */ js.Any, /* file */ String, /* mocha */ typingsSlinky.mocha.Mocha, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_run(event: run, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_afterAll(event: afterAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_afterEach(event: afterEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_beforeAll(event: beforeAll, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_beforeEach(event: beforeEach, listener: js.Function1[/* hook */ Hook, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_postrequire(
    event: `post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_prerequire(
    event: `pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ String, 
      /* mocha */ typingsSlinky.mocha.Mocha, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_require(
    event: require,
    listener: js.Function3[/* module */ js.Any, /* file */ String, /* mocha */ typingsSlinky.mocha.Mocha, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_run(event: run, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_suite(event: suite, listener: js.Function1[/* suite */ this.type, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_test(event: test, listener: js.Function1[/* test */ Test, Unit]): this.type = js.native
  
  /**
    * Get number of times to retry a failed test.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#retries
    */
  def retries(): Double = js.native
  /**
    * Set number of times to retry a failed test.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#retries
    */
  def retries(n: String): this.type = js.native
  def retries(n: Double): this.type = js.native
  
  var root: Boolean = js.native
  
  /**
    * This will run the root suite if we happen to be running in delayed mode.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#run
    */
  def run(): Unit = js.native
  
  /**
    * Get slow `ms`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#slow
    */
  def slow(): Double = js.native
  /**
    * Set slow `ms` or short-hand such as "2s".
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#slow
    */
  def slow(ms: String): this.type = js.native
  def slow(ms: Double): this.type = js.native
  
  var suites: js.Array[Suite] = js.native
  
  var tests: js.Array[Test] = js.native
  
  /**
    * Get timeout `ms`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#timeout
    */
  def timeout(): Double = js.native
  /**
    * Set timeout `ms` or short-hand such as "2s".
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#timeout
    */
  def timeout(ms: String): this.type = js.native
  def timeout(ms: Double): this.type = js.native
  
  var title: String = js.native
  
  /**
    * Return the title path generated by recursively concatenating the parent's
    * title path.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#.Suite#titlePath
    */
  def titlePath(): js.Array[String] = js.native
  
  /**
    * Return the total number of tests.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#.Suite#total
    */
  def total(): Double = js.native
}
