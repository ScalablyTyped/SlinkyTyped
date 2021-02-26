package typingsSlinky.mochaSugarFree

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mocha.mod.Suite_
import typingsSlinky.mocha.mod.Test_
import typingsSlinky.mochaSugarFree.anon.Optionsasyncfalseundefine
import typingsSlinky.mochaSugarFree.anon.OptionsasynctruefnTestCas
import typingsSlinky.mochaSugarFree.anon.OptionsfnHookFuncundefine
import typingsSlinky.mochaSugarFree.anon.OptionsfnSuiteFuncundefin
import typingsSlinky.mochaSugarFree.anon.OptionstitlestringfnSuite
import typingsSlinky.mochaSugarFree.mochaSugarFreeBooleans.`false`
import typingsSlinky.mochaSugarFree.mochaSugarFreeBooleans.`true`
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.after
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.afterEach
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.bdd
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.before
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.beforeEach
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.qunit
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.tdd
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mocha-sugar-free", JSImport.Namespace)
  @js.native
  val ^ : AnyInterface = js.native
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Omit<mocha-sugar-free.mocha-sugar-free.BDD, 'detectedInterface'> & mocha-sugar-free.mocha-sugar-free.Omit<mocha-sugar-free.mocha-sugar-free.TDD, 'detectedInterface'> & mocha-sugar-free.mocha-sugar-free.Omit<mocha-sugar-free.mocha-sugar-free.QUnit, 'detectedInterface'> & mocha-sugar-free.mocha-sugar-free.BaseInterface */
  @js.native
  trait AnyInterface extends StObject {
    
    def after(): Unit = js.native
    def after(fn: HookFunc): Unit = js.native
    def after(options: OptionsfnHookFuncundefine): Unit = js.native
    def after(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    
    def afterEach(): Unit = js.native
    def afterEach(fn: HookFunc): Unit = js.native
    def afterEach(options: OptionsfnHookFuncundefine): Unit = js.native
    def afterEach(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    @JSName("afterEach")
    var afterEach_Original: HookFunction = js.native
    
    @JSName("after")
    var after_Original: HookFunction = js.native
    
    def before(): Unit = js.native
    def before(fn: HookFunc): Unit = js.native
    def before(options: OptionsfnHookFuncundefine): Unit = js.native
    def before(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    
    def beforeEach(): Unit = js.native
    def beforeEach(fn: HookFunc): Unit = js.native
    def beforeEach(options: OptionsfnHookFuncundefine): Unit = js.native
    def beforeEach(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    @JSName("beforeEach")
    var beforeEach_Original: HookFunction = js.native
    
    @JSName("before")
    var before_Original: HookFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    def context(options: OptionstitlestringfnSuite): Suite_ = js.native
    def context(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    def context(title: String): Suite_ = js.native
    def context(title: String, fn: SuiteFunc): Suite_ = js.native
    def context(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
    def context(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def context(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    @JSName("context")
    var context_Original: SuiteFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    def describe(options: OptionstitlestringfnSuite): Suite_ = js.native
    def describe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    def describe(title: String): Suite_ = js.native
    def describe(title: String, fn: SuiteFunc): Suite_ = js.native
    def describe(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
    def describe(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def describe(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    @JSName("describe")
    var describe_Original: SuiteFunction = js.native
    
    /**
      * The detected Mocha interface.
      *
      * @default "bdd"
      */
    var detectedInterface: bdd | tdd | qunit = js.native
    
    def it(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def it(options: Optionsasyncfalseundefine): Test_ = js.native
    def it(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def it(options: OptionsasynctruefnTestCas): Test_ = js.native
    def it(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def it(title: String): Test_ = js.native
    def it(title: String, fn: TestCase): Test_ = js.native
    def it(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def it(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def it(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def it(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    @JSName("it")
    var it_Original: TestFunction = js.native
    
    def run(): Unit = js.native
    @JSName("run")
    var run_Original: js.Function0[Unit] = js.native
    
    def setup(): Unit = js.native
    def setup(fn: HookFunc): Unit = js.native
    def setup(options: OptionsfnHookFuncundefine): Unit = js.native
    def setup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    @JSName("setup")
    var setup_Original: HookFunction = js.native
    
    def specify(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def specify(options: Optionsasyncfalseundefine): Test_ = js.native
    def specify(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def specify(options: OptionsasynctruefnTestCas): Test_ = js.native
    def specify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def specify(title: String): Test_ = js.native
    def specify(title: String, fn: TestCase): Test_ = js.native
    def specify(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def specify(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def specify(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def specify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    @JSName("specify")
    var specify_Original: TestFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    def suite(options: OptionstitlestringfnSuite): Suite_ = js.native
    def suite(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    def suite(title: String): Suite_ = js.native
    def suite(title: String, fn: SuiteFunc): Suite_ = js.native
    def suite(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
    def suite(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def suite(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    
    def suiteSetup(): Unit = js.native
    def suiteSetup(fn: HookFunc): Unit = js.native
    def suiteSetup(options: OptionsfnHookFuncundefine): Unit = js.native
    def suiteSetup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    @JSName("suiteSetup")
    var suiteSetup_Original: HookFunction = js.native
    
    def suiteTeardown(): Unit = js.native
    def suiteTeardown(fn: HookFunc): Unit = js.native
    def suiteTeardown(options: OptionsfnHookFuncundefine): Unit = js.native
    def suiteTeardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    @JSName("suiteTeardown")
    var suiteTeardown_Original: HookFunction = js.native
    
    @JSName("suite")
    var suite_Original: SuiteFunction = js.native
    
    def teardown(): Unit = js.native
    def teardown(fn: HookFunc): Unit = js.native
    def teardown(options: OptionsfnHookFuncundefine): Unit = js.native
    def teardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    @JSName("teardown")
    var teardown_Original: HookFunction = js.native
    
    def test(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def test(options: Optionsasyncfalseundefine): Test_ = js.native
    def test(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def test(options: OptionsasynctruefnTestCas): Test_ = js.native
    def test(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def test(title: String): Test_ = js.native
    def test(title: String, fn: TestCase): Test_ = js.native
    def test(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def test(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def test(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def test(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    @JSName("test")
    var test_Original: TestFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    def xcontext(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
    def xcontext(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
    def xcontext(title: String): Suite_ | Unit = js.native
    def xcontext(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
    def xcontext(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ | Unit = js.native
    def xcontext(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
    def xcontext(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
    @JSName("xcontext")
    var xcontext_Original: PendingSuiteFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    def xdescribe(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
    def xdescribe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
    def xdescribe(title: String): Suite_ | Unit = js.native
    def xdescribe(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
    def xdescribe(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ | Unit = js.native
    def xdescribe(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
    def xdescribe(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
    @JSName("xdescribe")
    var xdescribe_Original: PendingSuiteFunction = js.native
    
    def xit(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def xit(options: Optionsasyncfalseundefine): Test_ = js.native
    def xit(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def xit(options: OptionsasynctruefnTestCas): Test_ = js.native
    def xit(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def xit(title: String): Test_ = js.native
    def xit(title: String, fn: TestCase): Test_ = js.native
    def xit(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def xit(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def xit(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def xit(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    @JSName("xit")
    var xit_Original: PendingTestFunction = js.native
    
    def xspecify(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def xspecify(options: Optionsasyncfalseundefine): Test_ = js.native
    def xspecify(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def xspecify(options: OptionsasynctruefnTestCas): Test_ = js.native
    def xspecify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def xspecify(title: String): Test_ = js.native
    def xspecify(title: String, fn: TestCase): Test_ = js.native
    def xspecify(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def xspecify(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def xspecify(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def xspecify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    @JSName("xspecify")
    var xspecify_Original: PendingTestFunction = js.native
  }
  
  @js.native
  trait BDD extends BaseInterface {
    
    /**
      * [bdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def after(): Unit = js.native
    def after(fn: HookFunc): Unit = js.native
    /**
      * [bdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def after(options: OptionsfnHookFuncundefine): Unit = js.native
    def after(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    
    /**
      * [bdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def afterEach(): Unit = js.native
    def afterEach(fn: HookFunc): Unit = js.native
    /**
      * [bdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def afterEach(options: OptionsfnHookFuncundefine): Unit = js.native
    def afterEach(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    /**
      * [bdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    @JSName("afterEach")
    var afterEach_Original: HookFunction = js.native
    
    /**
      * [bdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    @JSName("after")
    var after_Original: HookFunction = js.native
    
    /**
      * [bdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def before(): Unit = js.native
    def before(fn: HookFunc): Unit = js.native
    /**
      * [bdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def before(options: OptionsfnHookFuncundefine): Unit = js.native
    def before(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    
    /**
      * [bdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def beforeEach(): Unit = js.native
    def beforeEach(fn: HookFunc): Unit = js.native
    /**
      * [bdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def beforeEach(options: OptionsfnHookFuncundefine): Unit = js.native
    def beforeEach(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    /**
      * [bdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    @JSName("beforeEach")
    var beforeEach_Original: HookFunction = js.native
    
    /**
      * [bdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    @JSName("before")
    var before_Original: HookFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def context(options: OptionstitlestringfnSuite): Suite_ = js.native
    def context(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def context(title: String): Suite_ = js.native
    def context(title: String, fn: SuiteFunc): Suite_ = js.native
    def context(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
    def context(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def context(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    @JSName("context")
    var context_Original: SuiteFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def describe(options: OptionstitlestringfnSuite): Suite_ = js.native
    def describe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def describe(title: String): Suite_ = js.native
    def describe(title: String, fn: SuiteFunc): Suite_ = js.native
    def describe(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
    def describe(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def describe(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    @JSName("describe")
    var describe_Original: SuiteFunction = js.native
    
    @JSName("detectedInterface")
    var detectedInterface_BDD: bdd = js.native
    
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(options: Optionsasyncfalseundefine): Test_ = js.native
    def it(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(options: OptionsasynctruefnTestCas): Test_ = js.native
    def it(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(title: String): Test_ = js.native
    def it(title: String, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def it(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def it(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    @JSName("it")
    var it_Original: TestFunction = js.native
    
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(options: Optionsasyncfalseundefine): Test_ = js.native
    def specify(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(options: OptionsasynctruefnTestCas): Test_ = js.native
    def specify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(title: String): Test_ = js.native
    def specify(title: String, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def specify(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def specify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    @JSName("specify")
    var specify_Original: TestFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    def xcontext(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
    def xcontext(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    def xcontext(title: String): Suite_ | Unit = js.native
    def xcontext(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
    def xcontext(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ | Unit = js.native
    def xcontext(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
    def xcontext(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    @JSName("xcontext")
    var xcontext_Original: PendingSuiteFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    def xdescribe(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
    def xdescribe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    def xdescribe(title: String): Suite_ | Unit = js.native
    def xdescribe(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
    def xdescribe(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ | Unit = js.native
    def xdescribe(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
    def xdescribe(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    @JSName("xdescribe")
    var xdescribe_Original: PendingSuiteFunction = js.native
    
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(options: Optionsasyncfalseundefine): Test_ = js.native
    def xit(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(options: OptionsasynctruefnTestCas): Test_ = js.native
    def xit(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(title: String): Test_ = js.native
    def xit(title: String, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def xit(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def xit(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    @JSName("xit")
    var xit_Original: PendingTestFunction = js.native
    
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(options: Optionsasyncfalseundefine): Test_ = js.native
    def xspecify(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(options: OptionsasynctruefnTestCas): Test_ = js.native
    def xspecify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(title: String): Test_ = js.native
    def xspecify(title: String, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def xspecify(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def xspecify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    @JSName("xspecify")
    var xspecify_Original: PendingTestFunction = js.native
  }
  
  // #region Test functions
  @js.native
  trait BaseInterface extends StObject {
    
    /**
      * The detected Mocha interface.
      *
      * @default "bdd"
      */
    var detectedInterface: bdd | tdd | qunit = js.native
    
    /**
      * Triggers root suite execution.
      *
      * - _Only available if flag `--delay` is passed to Mocha._
      *
      * @see https://mochajs.org/api/global.html#runWithSuite
      */
    def run(): Unit = js.native
  }
  object BaseInterface {
    
    @scala.inline
    def apply(detectedInterface: bdd | tdd | qunit, run: () => Unit): BaseInterface = {
      val __obj = js.Dynamic.literal(detectedInterface = detectedInterface.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[BaseInterface]
    }
    
    @scala.inline
    implicit class BaseInterfaceMutableBuilder[Self <: BaseInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectedInterface(value: bdd | tdd | qunit): Self = StObject.set(x, "detectedInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * [bdd, tdd, qunit]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    *
    * Indicates this suite should be executed exclusively.
    */
  @js.native
  trait ExclusiveSuiteFunction extends StObject {
    
    // tslint:disable-next-line: unified-signatures
    def apply(options: OptionstitlestringfnSuite): Suite_ = js.native
    def apply(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    def apply(title: String): Suite_ = js.native
    def apply(title: String, fn: SuiteFunc): Suite_ = js.native
    def apply(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
  }
  
  /**
    * [bdd, tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should be executed exclusively.
    */
  @js.native
  trait ExclusiveTestFunction extends StObject {
    
    def apply(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def apply(options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def apply(title: String): Test_ = js.native
    def apply(title: String, fn: TestCase): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  }
  
  @js.native
  trait HookContext extends StObject {
    
    var hook: before | after | beforeEach | afterEach = js.native
    
    var isHook: `true` = js.native
    
    var isSuite: `false` = js.native
    
    var isTest: `false` = js.native
  }
  object HookContext {
    
    @scala.inline
    def apply(hook: before | after | beforeEach | afterEach, isHook: `true`, isSuite: `false`, isTest: `false`): HookContext = {
      val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], isHook = isHook.asInstanceOf[js.Any], isSuite = isSuite.asInstanceOf[js.Any], isTest = isTest.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookContext]
    }
    
    @scala.inline
    implicit class HookContextMutableBuilder[Self <: HookContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHook(value: before | after | beforeEach | afterEach): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHook(value: `true`): Self = StObject.set(x, "isHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSuite(value: `false`): Self = StObject.set(x, "isSuite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTest(value: `false`): Self = StObject.set(x, "isTest", value.asInstanceOf[js.Any])
    }
  }
  
  type HookFunc = js.ThisFunction1[/* this */ js.UndefOr[scala.Nothing], /* context */ HookContext, Unit]
  
  // #endregion
  // #region Test function types
  /**
    * [bdd, tdd]
    *
    * Describe a "hook" to execute the given callback `fn`.
    *
    * The name of the function is used as the name of the hook.
    */
  @js.native
  trait HookFunction extends StObject {
    
    def apply(): Unit = js.native
    def apply(fn: HookFunc): Unit = js.native
    def apply(options: OptionsfnHookFuncundefine): Unit = js.native
    def apply(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  }
  
  /** Construct a type with the properties of T except for those in type K. */
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait Options
    extends /* option */ StringDictionary[js.Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.native
    
    /**
      * The test function.
      */
    var fn: js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc] = js.native
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.native
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.native
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      @scala.inline
      def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      @scala.inline
      def setFn(value: TestCase | TestCaseWithDone | SuiteFunc | HookFunc): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      @scala.inline
      def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      @scala.inline
      def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      @scala.inline
      def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
    * [bdd, tdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    *
    * Indicates this suite should not be executed.
    *
    * @returns [bdd] `Suite`
    * @returns [tdd] `void`
    */
  @js.native
  trait PendingSuiteFunction extends StObject {
    
    // tslint:disable-next-line: unified-signatures
    def apply(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
    def apply(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
    def apply(title: String): Suite_ | Unit = js.native
    def apply(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
    def apply(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ | Unit = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
  }
  
  /**
    * [bdd, tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  @js.native
  trait PendingTestFunction extends StObject {
    
    def apply(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def apply(options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def apply(title: String): Test_ = js.native
    def apply(title: String, fn: TestCase): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  }
  
  @js.native
  trait QUnit extends BaseInterface {
    
    @JSName("detectedInterface")
    var detectedInterface_QUnit: qunit = js.native
    
    // tslint:disable-next-line: unified-signatures
    def suite(options: OptionstitlestringfnSuite): Suite_ = js.native
    def suite(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    def suite(title: String): Suite_ = js.native
    def suite(title: String, fn: SuiteFunc): Suite_ = js.native
    def suite(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
    def suite(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def suite(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    @JSName("suite")
    var suite_Original: SuiteFunction = js.native
    
    def test(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def test(options: Optionsasyncfalseundefine): Test_ = js.native
    def test(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def test(options: OptionsasynctruefnTestCas): Test_ = js.native
    def test(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def test(title: String): Test_ = js.native
    def test(title: String, fn: TestCase): Test_ = js.native
    def test(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def test(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def test(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def test(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    @JSName("test")
    var test_Original: TestFunction = js.native
  }
  
  // #endregion
  // #region Test context
  @js.native
  trait SuiteContext extends StObject {
    
    var isHook: `false` = js.native
    
    var isSuite: `true` = js.native
    
    var isTest: `false` = js.native
  }
  object SuiteContext {
    
    @scala.inline
    def apply(isHook: `false`, isSuite: `true`, isTest: `false`): SuiteContext = {
      val __obj = js.Dynamic.literal(isHook = isHook.asInstanceOf[js.Any], isSuite = isSuite.asInstanceOf[js.Any], isTest = isTest.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuiteContext]
    }
    
    @scala.inline
    implicit class SuiteContextMutableBuilder[Self <: SuiteContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHook(value: `false`): Self = StObject.set(x, "isHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSuite(value: `true`): Self = StObject.set(x, "isSuite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTest(value: `false`): Self = StObject.set(x, "isTest", value.asInstanceOf[js.Any])
    }
  }
  
  type SuiteFunc = js.ThisFunction1[/* this */ js.UndefOr[scala.Nothing], /* context */ SuiteContext, Unit]
  
  /**
    * [bdd, tdd, qunit]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  @js.native
  trait SuiteFunction extends StObject {
    
    // tslint:disable-next-line: unified-signatures
    def apply(options: OptionstitlestringfnSuite): Suite_ = js.native
    def apply(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    def apply(title: String): Suite_ = js.native
    def apply(title: String, fn: SuiteFunc): Suite_ = js.native
    def apply(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this suite should be executed exclusively.
      */
    def only(options: OptionstitlestringfnSuite): Suite_ = js.native
    def only(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this suite should be executed exclusively.
      */
    def only(title: String): Suite_ = js.native
    def only(title: String, fn: SuiteFunc): Suite_ = js.native
    def only(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
    def only(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def only(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this suite should be executed exclusively.
      */
    @JSName("only")
    var only_Original: ExclusiveSuiteFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd, tdd]
      *
      * Indicates this suite should not be executed.
      */
    def skip(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
    def skip(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
    /**
      * [bdd, tdd]
      *
      * Indicates this suite should not be executed.
      */
    def skip(title: String): Suite_ | Unit = js.native
    def skip(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
    def skip(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ | Unit = js.native
    def skip(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
    def skip(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
    /**
      * [bdd, tdd]
      *
      * Indicates this suite should not be executed.
      */
    @JSName("skip")
    var skip_Original: PendingSuiteFunction = js.native
  }
  
  @js.native
  trait TDD extends BaseInterface {
    
    @JSName("detectedInterface")
    var detectedInterface_TDD: tdd = js.native
    
    /**
      * [tdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def setup(): Unit = js.native
    def setup(fn: HookFunc): Unit = js.native
    /**
      * [tdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def setup(options: OptionsfnHookFuncundefine): Unit = js.native
    def setup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    /**
      * [tdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    @JSName("setup")
    var setup_Original: HookFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [tdd, qunit]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def suite(options: OptionstitlestringfnSuite): Suite_ = js.native
    def suite(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    /**
      * [tdd, qunit]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def suite(title: String): Suite_ = js.native
    def suite(title: String, fn: SuiteFunc): Suite_ = js.native
    def suite(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
    def suite(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def suite(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    
    /**
      * [tdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def suiteSetup(): Unit = js.native
    def suiteSetup(fn: HookFunc): Unit = js.native
    /**
      * [tdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def suiteSetup(options: OptionsfnHookFuncundefine): Unit = js.native
    def suiteSetup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    /**
      * [tdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    @JSName("suiteSetup")
    var suiteSetup_Original: HookFunction = js.native
    
    /**
      * [tdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def suiteTeardown(): Unit = js.native
    def suiteTeardown(fn: HookFunc): Unit = js.native
    /**
      * [tdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def suiteTeardown(options: OptionsfnHookFuncundefine): Unit = js.native
    def suiteTeardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    /**
      * [tdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    @JSName("suiteTeardown")
    var suiteTeardown_Original: HookFunction = js.native
    
    /**
      * [tdd, qunit]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    @JSName("suite")
    var suite_Original: SuiteFunction = js.native
    
    /**
      * [tdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def teardown(): Unit = js.native
    def teardown(fn: HookFunc): Unit = js.native
    /**
      * [tdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def teardown(options: OptionsfnHookFuncundefine): Unit = js.native
    def teardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
    /**
      * [tdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    @JSName("teardown")
    var teardown_Original: HookFunction = js.native
    
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(options: Optionsasyncfalseundefine): Test_ = js.native
    def test(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(options: OptionsasynctruefnTestCas): Test_ = js.native
    def test(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(title: String): Test_ = js.native
    def test(title: String, fn: TestCase): Test_ = js.native
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def test(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def test(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    @JSName("test")
    var test_Original: TestFunction = js.native
  }
  
  type TestCase = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ TestContext, 
    Unit | js.Thenable[js.Any]
  ]
  
  type TestCaseWithDone = js.ThisFunction1[/* this */ js.UndefOr[scala.Nothing], /* context */ TestContextWithDone, Unit]
  
  @js.native
  trait TestContext extends TestContextBase {
    
    /**
      * Mark a test as completed.
      */
    var done: Null = js.native
  }
  
  @js.native
  trait TestContextBase extends StObject {
    
    /**
      * Get whether timeouts are enabled.
      */
    def enableTimeouts(): Boolean = js.native
    /**
      * Set whether timeouts are enabled.
      */
    def enableTimeouts(enabled: Boolean): this.type = js.native
    
    var isHook: `false` = js.native
    
    var isSuite: `false` = js.native
    
    var isTest: `true` = js.native
    
    /**
      * Mark a test as skipped.
      */
    def skip(): scala.Nothing = js.native
    
    /**
      * Get test slowness threshold.
      */
    def slow(): Double = js.native
    /**
      * Set test slowness threshold.
      */
    def slow(ms: String): this.type = js.native
    def slow(ms: Double): this.type = js.native
    
    /**
      * Get test timeout.
      */
    def timeout(): Double = js.native
    /**
      * Set test timeout.
      */
    def timeout(ms: String): this.type = js.native
    def timeout(ms: Double): this.type = js.native
  }
  
  @js.native
  trait TestContextWithDone extends TestContextBase {
    
    /**
      * Mark a test as completed.
      */
    def done(): Unit = js.native
    def done(err: js.Any): Unit = js.native
  }
  
  /**
    * [bdd, tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  @js.native
  trait TestFunction extends StObject {
    
    def apply(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def apply(options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def apply(title: String): Test_ = js.native
    def apply(title: String, fn: TestCase): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(options: Optionsasyncfalseundefine): Test_ = js.native
    def only(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(options: OptionsasynctruefnTestCas): Test_ = js.native
    def only(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(title: String): Test_ = js.native
    def only(title: String, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def only(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def only(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    @JSName("only")
    var only_Original: ExclusiveTestFunction = js.native
    
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(options: Optionsasyncfalseundefine): Test_ = js.native
    def skip(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(options: OptionsasynctruefnTestCas): Test_ = js.native
    def skip(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(title: String): Test_ = js.native
    def skip(title: String, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def skip(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def skip(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    @JSName("skip")
    var skip_Original: PendingTestFunction = js.native
  }
  
  type _To = AnyInterface
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AnyInterface = ^
}
