package typingsSlinky.mocha.global

import typingsSlinky.mocha.Mocha
import typingsSlinky.mocha.Mocha.AsyncFunc
import typingsSlinky.mocha.Mocha.Func
import typingsSlinky.mocha.Mocha.HookFunction
import typingsSlinky.mocha.Mocha.MochaOptions
import typingsSlinky.mocha.Mocha.PendingTestFunction
import typingsSlinky.mocha.Mocha.RunnerConstants
import typingsSlinky.mocha.Mocha.Suite
import typingsSlinky.mocha.Mocha.SuiteConstants
import typingsSlinky.mocha.Mocha.SuiteFunction
import typingsSlinky.mocha.Mocha.Test
import typingsSlinky.mocha.Mocha.TestFunction
import typingsSlinky.mocha.Mocha.reporters.Base_.ColorMap
import typingsSlinky.mocha.Mocha.reporters.Base_.SymbolMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Mocha")
@js.native
class Mocha_ () extends Mocha {
  def this(options: MochaOptions) = this()
}
object Mocha_ {
  
  @JSGlobal("Mocha")
  @js.native
  val ^ : js.Any = js.native
  
  // #endregion Runnable untyped events
  /**
    * Test context
    *
    * @see https://mochajs.org/api/module-Context.html#~Context
    */
  @JSGlobal("Mocha.Context")
  @js.native
  class Context ()
    extends typingsSlinky.mocha.Mocha.Context
  
  // #endregion Runner untyped events
  /**
    * Initialize a new `Hook` with the given `title` and callback `fn`
    *
    * @see https://mochajs.org/api/Hook.html
    */
  @JSGlobal("Mocha.Hook")
  @js.native
  class Hook ()
    extends typingsSlinky.mocha.Mocha.Hook
  
  // #endregion Runnable "error" event
  // #region Runnable untyped events
  // #region Runnable "error" event
  /**
    * Initialize a new `Runnable` with the given `title` and callback `fn`.
    *
    * @see https://mochajs.org/api/Runnable.html
    */
  @JSGlobal("Mocha.Runnable")
  @js.native
  class Runnable protected ()
    extends typingsSlinky.mocha.Mocha.Runnable {
    def this(title: String) = this()
    def this(title: String, fn: AsyncFunc) = this()
    def this(title: String, fn: Func) = this()
  }
  
  // #endregion Runner "pending" event
  // #region Runner untyped events
  // #endregion Runner "fail" event
  // #region Runner "pending" event
  // #endregion Runner "pass" event
  // #region Runner "fail" event
  // #endregion Runner "hook end" event
  // #region Runner "pass" event
  // #endregion Runner "hook" event
  // #region Runner "hook end" event
  // #endregion Runner "test end" event
  // #region Runner "hook" event
  // #endregion Runner "test" event
  // #region Runner "test end" event
  // #endregion Runner "suite end" event
  // #region Runner "test" event
  // #endregion Runner "suite" event
  // #region Runner "suite end" event
  // #endregion Runner "end" event
  // #region Runner "suite" event
  // #endregion Runner "start" event
  // #region Runner "end" event
  // #endregion Runner "waiting" event
  // #region Runner "start" event
  // #region Runner "waiting" event
  /**
    * Initialize a `Runner` for the given `suite`.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html
    */
  @JSGlobal("Mocha.Runner")
  @js.native
  class Runner protected ()
    extends typingsSlinky.mocha.Mocha.Runner {
    def this(suite: Suite, delay: Boolean) = this()
  }
  object Runner {
    
    /* static member */
    @JSGlobal("Mocha.Runner.constants")
    @js.native
    val constants: RunnerConstants = js.native
    
    /**
      * Wrapper for setImmediate, process.nextTick, or browser polyfill.
      */
    /* static member */
    @JSGlobal("Mocha.Runner.immediately")
    @js.native
    def immediately(callback: js.Function): Unit = js.native
  }
  
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
  @JSGlobal("Mocha.Suite")
  @js.native
  class Suite_ protected () extends Suite {
    def this(title: String) = this()
    def this(title: String, parentContext: typingsSlinky.mocha.Mocha.Context) = this()
  }
  object Suite_ {
    
    /* static member */
    @JSGlobal("Mocha.Suite.constants")
    @js.native
    val constants: SuiteConstants = js.native
    
    /**
      * Create a new `Suite` with the given `title` and parent `Suite`. When a suite
      * with the same title is already present, that suite is returned to provide
      * nicer reporter and more flexible meta-testing.
      *
      * @see https://mochajs.org/api/mocha#.exports.create
      */
    /* static member */
    @JSGlobal("Mocha.Suite.create")
    @js.native
    def create(parent: Suite, title: String): Suite = js.native
  }
  
  /**
    * Initialize a new `Test` with the given `title` and callback `fn`.
    *
    * @see https://mochajs.org/api/Test.html
    */
  @JSGlobal("Mocha.Test")
  @js.native
  class Test_ () extends Test
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @JSGlobal("Mocha.after")
  @js.native
  def after: HookFunction = js.native
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @JSGlobal("Mocha.afterEach")
  @js.native
  def afterEach: HookFunction = js.native
  @scala.inline
  def afterEach_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def after_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("after")(x.asInstanceOf[js.Any])
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @JSGlobal("Mocha.before")
  @js.native
  def before: HookFunction = js.native
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @JSGlobal("Mocha.beforeEach")
  @js.native
  def beforeEach: HookFunction = js.native
  @scala.inline
  def beforeEach_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def before_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("before")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.describe")
  @js.native
  def describe: SuiteFunction = js.native
  @scala.inline
  def describe_=(x: SuiteFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  object interfaces {
    
    @JSGlobal("Mocha.interfaces.bdd")
    @js.native
    def bdd(suite: Suite): Unit = js.native
    
    @JSGlobal("Mocha.interfaces.exports")
    @js.native
    def exports(suite: Suite): Unit = js.native
    
    @JSGlobal("Mocha.interfaces.qunit")
    @js.native
    def qunit(suite: Suite): Unit = js.native
    
    @JSGlobal("Mocha.interfaces.tdd")
    @js.native
    def tdd(suite: Suite): Unit = js.native
  }
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.it")
  @js.native
  def it: TestFunction = js.native
  @scala.inline
  def it_=(x: TestFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("it")(x.asInstanceOf[js.Any])
  
  // #endregion Test interface augmentations
  object reporters {
    
    /**
      * Initialize a new `Base` reporter.
      *
      * All other reporters generally inherit from this reporter, providing stats such as test duration,
      * number of tests passed / failed, etc.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Base.html
      */
    @JSGlobal("Mocha.reporters.Base")
    @js.native
    class Base_ protected ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_ {
      def this(runner: typingsSlinky.mocha.Mocha.Runner) = this()
      def this(runner: typingsSlinky.mocha.Mocha.Runner, options: MochaOptions) = this()
    }
    object Base_ {
      
      @JSGlobal("Mocha.reporters.Base")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Color `str` with the given `type` (from `colors`)
        *
        * @see https://mochajs.org/api/module-base#.color
        */
      @JSGlobal("Mocha.reporters.Base.color")
      @js.native
      def color(`type`: String, str: String): String = js.native
      
      /**
        * Default color map
        *
        * @see https://mochajs.org/api/module-base#.colors
        */
      @JSGlobal("Mocha.reporters.Base.colors")
      @js.native
      val colors: ColorMap = js.native
      
      /**
        * ANSI TTY control sequences common among reporters.
        *
        * @see https://mochajs.org/api/module-base#.cursor
        */
      object cursor {
        
        /**
          * Clears the line and moves to the beginning of the line.
          */
        @JSGlobal("Mocha.reporters.Base.cursor.CR")
        @js.native
        def CR(): Unit = js.native
        
        /**
          * Moves to the beginning of the line
          */
        @JSGlobal("Mocha.reporters.Base.cursor.beginningOfLine")
        @js.native
        def beginningOfLine(): Unit = js.native
        
        /**
          * Deletes the current line
          */
        @JSGlobal("Mocha.reporters.Base.cursor.deleteLine")
        @js.native
        def deleteLine(): Unit = js.native
        
        /**
          * Hides the cursor
          */
        @JSGlobal("Mocha.reporters.Base.cursor.hide")
        @js.native
        def hide(): Unit = js.native
        
        /**
          * Shows the cursor
          */
        @JSGlobal("Mocha.reporters.Base.cursor.show")
        @js.native
        def show(): Unit = js.native
      }
      
      /**
        * Returns a diff between two strings with colored ANSI output.
        *
        * @see https://mochajs.org/api/module-base#.generateDiff
        */
      @JSGlobal("Mocha.reporters.Base.generateDiff")
      @js.native
      def generateDiff(actual: String, expected: String): String = js.native
      
      /**
        * Inline diffs instead of +/-
        *
        * @see https://mochajs.org/api/module-base#.inlineDiffs
        */
      @JSGlobal("Mocha.reporters.Base.inlineDiffs")
      @js.native
      def inlineDiffs: Boolean = js.native
      @scala.inline
      def inlineDiffs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineDiffs")(x.asInstanceOf[js.Any])
      
      /**
        * Output the given `failures` as a list.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
        */
      @JSGlobal("Mocha.reporters.Base.list")
      @js.native
      def list(failures: js.Array[Test]): Unit = js.native
      
      /**
        * Default symbol map
        *
        * @see https://mochajs.org/api/module-base#.symbols
        */
      @JSGlobal("Mocha.reporters.Base.symbols")
      @js.native
      val symbols: SymbolMap = js.native
      
      /**
        * Enables coloring by default
        *
        * @see https://mochajs.org/api/module-base#.useColors
        */
      @JSGlobal("Mocha.reporters.Base.useColors")
      @js.native
      def useColors: Boolean = js.native
      @scala.inline
      def useColors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useColors")(x.asInstanceOf[js.Any])
      
      /**
        * Expose terminal window size
        *
        * @see https://mochajs.org/api/module-base#.window
        */
      object window {
        
        @JSGlobal("Mocha.reporters.Base.window")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Mocha.reporters.Base.window.width")
        @js.native
        def width: Double = js.native
        @scala.inline
        def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Initialize a new `Doc` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Doc.html
      */
    @JSGlobal("Mocha.reporters.Doc")
    @js.native
    class Doc_ ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `Dot` matrix test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Dot.html
      */
    @JSGlobal("Mocha.reporters.Dot")
    @js.native
    class Dot_ ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `HTML` reporter.
      *
      * - _This reporter cannot be used on the console._
      *
      * @see https://mochajs.org/api/Mocha.reporters.HTML.html
      */
    @JSGlobal("Mocha.reporters.HTML")
    @js.native
    class HTML_ ()
      extends typingsSlinky.mocha.Mocha.reporters.HTML_
    
    /**
      * Initialize a new `JSONStream` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.JSONStream.html
      */
    @JSGlobal("Mocha.reporters.JSONStream")
    @js.native
    class JSONStream ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `JSON` reporter
      *
      * @see https://mochajs.org/api/Mocha.reporters.JSON.html
      */
    @JSGlobal("Mocha.reporters.JSON")
    @js.native
    class JSON_ ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `Landing` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Landing.html
      */
    @JSGlobal("Mocha.reporters.Landing")
    @js.native
    class Landing_ ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `List` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.List.html
      */
    @JSGlobal("Mocha.reporters.List")
    @js.native
    class List_ ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `Markdown` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Markdown.html
      */
    @JSGlobal("Mocha.reporters.Markdown")
    @js.native
    class Markdown_ ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `Min` minimal test reporter (best used with --watch).
      *
      * @see https://mochajs.org/api/Mocha.reporters.Min.html
      */
    @JSGlobal("Mocha.reporters.Min")
    @js.native
    class Min ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `NyanCat` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
      */
    @JSGlobal("Mocha.reporters.Nyan")
    @js.native
    class Nyan_ ()
      extends typingsSlinky.mocha.Mocha.reporters.Nyan_
    
    /**
      * Initialize a new `Progress` bar test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Progress.html
      */
    @JSGlobal("Mocha.reporters.Progress")
    @js.native
    class Progress_ protected ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_ {
      def this(runner: typingsSlinky.mocha.Mocha.Runner) = this()
      def this(
        runner: typingsSlinky.mocha.Mocha.Runner,
        options: typingsSlinky.mocha.Mocha.reporters.Progress_.MochaOptions
      ) = this()
    }
    
    /**
      * Initialize a new `Spec` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Spec.html
      */
    @JSGlobal("Mocha.reporters.Spec")
    @js.native
    class Spec_ ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `TAP` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.TAP.html
      */
    @JSGlobal("Mocha.reporters.TAP")
    @js.native
    class TAP_ ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `XUnit` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
      */
    @JSGlobal("Mocha.reporters.XUnit")
    @js.native
    class XUnit_ protected ()
      extends typingsSlinky.mocha.Mocha.reporters.XUnit_ {
      def this(runner: typingsSlinky.mocha.Mocha.Runner) = this()
      def this(
        runner: typingsSlinky.mocha.Mocha.Runner,
        options: typingsSlinky.mocha.Mocha.reporters.XUnit_.MochaOptions
      ) = this()
    }
    
    /**
      * Initialize a new `Base` reporter.
      *
      * All other reporters generally inherit from this reporter, providing stats such as test duration,
      * number of tests passed / failed, etc.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Base.html
      */
    /* was `typeof Base` */
    @JSGlobal("Mocha.reporters.base")
    @js.native
    class base protected ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_ {
      def this(runner: typingsSlinky.mocha.Mocha.Runner) = this()
      def this(runner: typingsSlinky.mocha.Mocha.Runner, options: MochaOptions) = this()
    }
    /* was `typeof Base` */
    object base {
      
      @JSGlobal("Mocha.reporters.base")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Color `str` with the given `type` (from `colors`)
        *
        * @see https://mochajs.org/api/module-base#.color
        */
      @JSGlobal("Mocha.reporters.base.color")
      @js.native
      def color(`type`: String, str: String): String = js.native
      
      /**
        * Default color map
        *
        * @see https://mochajs.org/api/module-base#.colors
        */
      @JSGlobal("Mocha.reporters.base.colors")
      @js.native
      val colors: ColorMap = js.native
      
      /**
        * ANSI TTY control sequences common among reporters.
        *
        * @see https://mochajs.org/api/module-base#.cursor
        */
      object cursor {
        
        /**
          * Clears the line and moves to the beginning of the line.
          */
        @JSGlobal("Mocha.reporters.base.cursor.CR")
        @js.native
        def CR(): Unit = js.native
        
        /**
          * Moves to the beginning of the line
          */
        @JSGlobal("Mocha.reporters.base.cursor.beginningOfLine")
        @js.native
        def beginningOfLine(): Unit = js.native
        
        /**
          * Deletes the current line
          */
        @JSGlobal("Mocha.reporters.base.cursor.deleteLine")
        @js.native
        def deleteLine(): Unit = js.native
        
        /**
          * Hides the cursor
          */
        @JSGlobal("Mocha.reporters.base.cursor.hide")
        @js.native
        def hide(): Unit = js.native
        
        /**
          * Shows the cursor
          */
        @JSGlobal("Mocha.reporters.base.cursor.show")
        @js.native
        def show(): Unit = js.native
      }
      
      /**
        * Returns a diff between two strings with colored ANSI output.
        *
        * @see https://mochajs.org/api/module-base#.generateDiff
        */
      @JSGlobal("Mocha.reporters.base.generateDiff")
      @js.native
      def generateDiff(actual: String, expected: String): String = js.native
      
      /**
        * Inline diffs instead of +/-
        *
        * @see https://mochajs.org/api/module-base#.inlineDiffs
        */
      @JSGlobal("Mocha.reporters.base.inlineDiffs")
      @js.native
      def inlineDiffs: Boolean = js.native
      @scala.inline
      def inlineDiffs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineDiffs")(x.asInstanceOf[js.Any])
      
      /**
        * Output the given `failures` as a list.
        *
        * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
        */
      @JSGlobal("Mocha.reporters.base.list")
      @js.native
      def list(failures: js.Array[Test]): Unit = js.native
      
      /**
        * Default symbol map
        *
        * @see https://mochajs.org/api/module-base#.symbols
        */
      @JSGlobal("Mocha.reporters.base.symbols")
      @js.native
      val symbols: SymbolMap = js.native
      
      /**
        * Enables coloring by default
        *
        * @see https://mochajs.org/api/module-base#.useColors
        */
      @JSGlobal("Mocha.reporters.base.useColors")
      @js.native
      def useColors: Boolean = js.native
      @scala.inline
      def useColors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useColors")(x.asInstanceOf[js.Any])
      
      /**
        * Expose terminal window size
        *
        * @see https://mochajs.org/api/module-base#.window
        */
      object window {
        
        @JSGlobal("Mocha.reporters.base.window")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Mocha.reporters.base.window.width")
        @js.native
        def width: Double = js.native
        @scala.inline
        def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Initialize a new `Doc` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Doc.html
      */
    /* was `typeof Doc` */
    @JSGlobal("Mocha.reporters.doc")
    @js.native
    class doc ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `Dot` matrix test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Dot.html
      */
    /* was `typeof Dot` */
    @JSGlobal("Mocha.reporters.dot")
    @js.native
    class dot ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `HTML` reporter.
      *
      * - _This reporter cannot be used on the console._
      *
      * @see https://mochajs.org/api/Mocha.reporters.HTML.html
      */
    /* was `typeof HTML` */
    @JSGlobal("Mocha.reporters.html")
    @js.native
    class html ()
      extends typingsSlinky.mocha.Mocha.reporters.HTML_
    
    /**
      * Initialize a new `JSON` reporter
      *
      * @see https://mochajs.org/api/Mocha.reporters.JSON.html
      */
    /* was `typeof JSON` */
    @JSGlobal("Mocha.reporters.json")
    @js.native
    class json ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `Landing` reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Landing.html
      */
    /* was `typeof Landing` */
    @JSGlobal("Mocha.reporters.landing")
    @js.native
    class landing ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `List` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.List.html
      */
    /* was `typeof List` */
    @JSGlobal("Mocha.reporters.list")
    @js.native
    class list ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `Markdown` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Markdown.html
      */
    /* was `typeof Markdown` */
    @JSGlobal("Mocha.reporters.markdown")
    @js.native
    class markdown ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `NyanCat` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
      */
    /* was `typeof Nyan` */
    @JSGlobal("Mocha.reporters.nyan")
    @js.native
    class nyan ()
      extends typingsSlinky.mocha.Mocha.reporters.Nyan_
    
    /**
      * Initialize a new `Progress` bar test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Progress.html
      */
    /* was `typeof Progress` */
    @JSGlobal("Mocha.reporters.progress")
    @js.native
    class progress protected ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_ {
      def this(runner: typingsSlinky.mocha.Mocha.Runner) = this()
      def this(
        runner: typingsSlinky.mocha.Mocha.Runner,
        options: typingsSlinky.mocha.Mocha.reporters.Progress_.MochaOptions
      ) = this()
    }
    /* was `typeof Progress` */
    object progress
    
    /**
      * Initialize a new `Spec` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Spec.html
      */
    /* was `typeof Spec` */
    @JSGlobal("Mocha.reporters.spec")
    @js.native
    class spec ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `TAP` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.TAP.html
      */
    /* was `typeof TAP` */
    @JSGlobal("Mocha.reporters.tap")
    @js.native
    class tap ()
      extends typingsSlinky.mocha.Mocha.reporters.Base_
    
    /**
      * Initialize a new `XUnit` test reporter.
      *
      * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
      */
    /* was `typeof XUnit` */
    @JSGlobal("Mocha.reporters.xunit")
    @js.native
    class xunit protected ()
      extends typingsSlinky.mocha.Mocha.reporters.XUnit_ {
      def this(runner: typingsSlinky.mocha.Mocha.Runner) = this()
      def this(
        runner: typingsSlinky.mocha.Mocha.Runner,
        options: typingsSlinky.mocha.Mocha.reporters.XUnit_.MochaOptions
      ) = this()
    }
    /* was `typeof XUnit` */
    object xunit
  }
  
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag --delay is passed into Mocha._
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  @JSGlobal("Mocha.run")
  @js.native
  def run(): Unit = js.native
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @JSGlobal("Mocha.setup")
  @js.native
  def setup: HookFunction = js.native
  @scala.inline
  def setup_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setup")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.suite")
  @js.native
  def suite: SuiteFunction = js.native
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @JSGlobal("Mocha.suiteSetup")
  @js.native
  def suiteSetup: HookFunction = js.native
  @scala.inline
  def suiteSetup_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suiteSetup")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @JSGlobal("Mocha.suiteTeardown")
  @js.native
  def suiteTeardown: HookFunction = js.native
  @scala.inline
  def suiteTeardown_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suiteTeardown")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def suite_=(x: SuiteFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suite")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @JSGlobal("Mocha.teardown")
  @js.native
  def teardown: HookFunction = js.native
  @scala.inline
  def teardown_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("teardown")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.test")
  @js.native
  def test: TestFunction = js.native
  @scala.inline
  def test_=(x: TestFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
  
  object utils {
    
    /**
      * Return a new Thing that has the keys in sorted order. Recursive.
      *
      * If the Thing...
      * - has already been seen, return string `'[Circular]'`
      * - is `undefined`, return string `'[undefined]'`
      * - is `null`, return value `null`
      * - is some other primitive, return the value
      * - is not a primitive or an `Array`, `Object`, or `Function`, return the value of the Thing's `toString()` method
      * - is a non-empty `Array`, `Object`, or `Function`, return the result of calling this function again.
      * - is an empty `Array`, `Object`, or `Function`, returns `'[]'`, `'{}'`, or `'[Function]'` respectively.
      *
      * @see https://mochajs.org/api/module-utils.html#.canonicalize
      */
    @JSGlobal("Mocha.utils.canonicalize")
    @js.native
    def canonicalize(value: js.Any, stack: js.Array[_], typeHint: String): js.Any = js.native
    
    /**
      * Strip the function definition from `str`, and re-indent for pre whitespace.
      *
      * @see https://mochajs.org/api/module-utils.html#.clean
      */
    @JSGlobal("Mocha.utils.clean")
    @js.native
    def clean(str: String): String = js.native
    
    /**
      * Generate an undefined error if `err` is not defined.
      *
      * @see https://mochajs.org/api/module-utils.html#.getError
      */
    @JSGlobal("Mocha.utils.getError")
    @js.native
    def getError(): js.Error = js.native
    @JSGlobal("Mocha.utils.getError")
    @js.native
    def getError(err: js.Error): js.Error = js.native
    
    /**
      * Highlight the given string of `js`.
      */
    @JSGlobal("Mocha.utils.highlight")
    @js.native
    def highlight(js_ : String): String = js.native
    
    /**
      * Lookup file names at the given `path`.
      *
      * @see https://mochajs.org/api/Mocha.utils.html#.exports.lookupFiles
      */
    @JSGlobal("Mocha.utils.lookupFiles")
    @js.native
    def lookupFiles(filepath: String): js.Array[String] = js.native
    @JSGlobal("Mocha.utils.lookupFiles")
    @js.native
    def lookupFiles(filepath: String, extensions: js.UndefOr[scala.Nothing], recursive: Boolean): js.Array[String] = js.native
    @JSGlobal("Mocha.utils.lookupFiles")
    @js.native
    def lookupFiles(filepath: String, extensions: js.Array[String]): js.Array[String] = js.native
    @JSGlobal("Mocha.utils.lookupFiles")
    @js.native
    def lookupFiles(filepath: String, extensions: js.Array[String], recursive: Boolean): js.Array[String] = js.native
    
    /**
      * Compute a slug from the given `str`.
      *
      * @see https://mochajs.org/api/module-utils.html#.slug
      */
    @JSGlobal("Mocha.utils.slug")
    @js.native
    def slug(str: String): String = js.native
    
    /**
      * When invoking this function you get a filter function that get the Error.stack as an
      * input, and return a prettify output. (i.e: strip Mocha and internal node functions from
      * stack trace).
      *
      * @see https://mochajs.org/api/module-utils.html#.stackTraceFilter
      */
    @JSGlobal("Mocha.utils.stackTraceFilter")
    @js.native
    def stackTraceFilter(): js.Function1[/* stack */ String, String] = js.native
    
    /**
      * Stringify `value`. Different behavior depending on type of value:
      *
      * - If `value` is undefined or null, return `'[undefined]'` or `'[null]'`, respectively.
      * - If `value` is not an object, function or array, return result of `value.toString()` wrapped in double-quotes.
      * - If `value` is an *empty* object, function, or array, returns `'{}'`, `'[Function]'`, or `'[]'` respectively.
      * - If `value` has properties, call canonicalize} on it, then return result of `JSON.stringify()`
      *
      * @see https://mochajs.org/api/module-utils.html#.stringify
      */
    @JSGlobal("Mocha.utils.stringify")
    @js.native
    def stringify(value: js.Any): String = js.native
    
    /**
      * Generate an undefined error with a message warning the user.
      *
      * @see https://mochajs.org/api/module-utils.html#.undefinedError
      */
    @JSGlobal("Mocha.utils.undefinedError")
    @js.native
    def undefinedError(): js.Error = js.native
    
    /**
      * Takes some variable and asks `Object.prototype.toString()` what it thinks it is.
      */
    @JSGlobal("Mocha.utils.type")
    @js.native
    def `type`(value: js.Any): String = js.native
  }
  
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSGlobal("Mocha.xit")
  @js.native
  def xit: PendingTestFunction = js.native
  @scala.inline
  def xit_=(x: PendingTestFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xit")(x.asInstanceOf[js.Any])
}
