package typingsSlinky.jestTypes

import typingsSlinky.jestTypes.anon.Column
import typingsSlinky.jestTypes.globalMod.TestFrameworkGlobals
import typingsSlinky.jestTypes.jestTypesStrings.describeBlock
import typingsSlinky.jestTypes.jestTypesStrings.hook_failure
import typingsSlinky.jestTypes.jestTypesStrings.hook_start
import typingsSlinky.jestTypes.jestTypesStrings.hook_success
import typingsSlinky.jestTypes.jestTypesStrings.include_test_location_in_result
import typingsSlinky.jestTypes.jestTypesStrings.run_describe_finish
import typingsSlinky.jestTypes.jestTypesStrings.run_describe_start
import typingsSlinky.jestTypes.jestTypesStrings.run_finish
import typingsSlinky.jestTypes.jestTypesStrings.run_start
import typingsSlinky.jestTypes.jestTypesStrings.setup
import typingsSlinky.jestTypes.jestTypesStrings.teardown
import typingsSlinky.jestTypes.jestTypesStrings.test
import typingsSlinky.jestTypes.jestTypesStrings.test_done
import typingsSlinky.jestTypes.jestTypesStrings.test_fn_failure
import typingsSlinky.jestTypes.jestTypesStrings.test_fn_start
import typingsSlinky.jestTypes.jestTypesStrings.test_fn_success
import typingsSlinky.jestTypes.jestTypesStrings.test_retry
import typingsSlinky.jestTypes.jestTypesStrings.test_skip
import typingsSlinky.jestTypes.jestTypesStrings.test_start
import typingsSlinky.jestTypes.jestTypesStrings.test_todo
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circusMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jestTypes.anon.Name
    - typingsSlinky.jestTypes.anon.`0`
    - typingsSlinky.jestTypes.anon.Hook
    - typingsSlinky.jestTypes.anon.DescribeBlock
    - typingsSlinky.jestTypes.anon.Test
    - typingsSlinky.jestTypes.anon.NameTest
    - typingsSlinky.jestTypes.anon.TestTestEntry
    - typingsSlinky.jestTypes.anon.ErrorName
    - typingsSlinky.jestTypes.anon.NameTestTestEntry
    - typingsSlinky.jestTypes.anon.`1`
    - typingsSlinky.jestTypes.anon.`2`
    - typingsSlinky.jestTypes.anon.`3`
    - typingsSlinky.jestTypes.anon.`4`
    - typingsSlinky.jestTypes.anon.DescribeBlockName
    - typingsSlinky.jestTypes.anon.DescribeBlockDescribeBlock
    - typingsSlinky.jestTypes.anon.`5`
    - typingsSlinky.jestTypes.anon.`6`
    - typingsSlinky.jestTypes.anon.`7`
  */
  trait AsyncEvent extends Event
  object AsyncEvent {
    
    @scala.inline
    def `0`(name: include_test_location_in_result): typingsSlinky.jestTypes.anon.`0` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.`0`]
    }
    
    @scala.inline
    def `1`(name: test_start, test: TestEntry): typingsSlinky.jestTypes.anon.`1` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.`1`]
    }
    
    @scala.inline
    def `2`(name: test_skip, test: TestEntry): typingsSlinky.jestTypes.anon.`2` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.`2`]
    }
    
    @scala.inline
    def `3`(name: test_todo, test: TestEntry): typingsSlinky.jestTypes.anon.`3` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.`3`]
    }
    
    @scala.inline
    def `4`(name: test_done, test: TestEntry): typingsSlinky.jestTypes.anon.`4` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.`4`]
    }
    
    @scala.inline
    def `5`(name: run_start): typingsSlinky.jestTypes.anon.`5` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.`5`]
    }
    
    @scala.inline
    def `6`(name: run_finish): typingsSlinky.jestTypes.anon.`6` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.`6`]
    }
    
    @scala.inline
    def `7`(name: teardown): typingsSlinky.jestTypes.anon.`7` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.`7`]
    }
    
    @scala.inline
    def DescribeBlock(hook: Hook, name: hook_success): typingsSlinky.jestTypes.anon.DescribeBlock = {
      val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.DescribeBlock]
    }
    
    @scala.inline
    def DescribeBlockDescribeBlock(describeBlock: DescribeBlock, name: run_describe_finish): typingsSlinky.jestTypes.anon.DescribeBlockDescribeBlock = {
      val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.DescribeBlockDescribeBlock]
    }
    
    @scala.inline
    def DescribeBlockName(describeBlock: DescribeBlock, name: run_describe_start): typingsSlinky.jestTypes.anon.DescribeBlockName = {
      val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.DescribeBlockName]
    }
    
    @scala.inline
    def ErrorName(error: Exception, name: test_fn_failure, test: TestEntry): typingsSlinky.jestTypes.anon.ErrorName = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.ErrorName]
    }
    
    @scala.inline
    def Hook(hook: typingsSlinky.jestTypes.circusMod.Hook, name: hook_start): typingsSlinky.jestTypes.anon.Hook = {
      val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.Hook]
    }
    
    @scala.inline
    def Name(name: setup, parentProcess: Process, runtimeGlobals: JestGlobals): typingsSlinky.jestTypes.anon.Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentProcess = parentProcess.asInstanceOf[js.Any], runtimeGlobals = runtimeGlobals.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.Name]
    }
    
    @scala.inline
    def NameTest(name: test_fn_start, test: TestEntry): typingsSlinky.jestTypes.anon.NameTest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.NameTest]
    }
    
    @scala.inline
    def NameTestTestEntry(name: test_retry, test: TestEntry): typingsSlinky.jestTypes.anon.NameTestTestEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.NameTestTestEntry]
    }
    
    @scala.inline
    def Test(error: String | Exception, hook: Hook, name: hook_failure): typingsSlinky.jestTypes.anon.Test = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.Test]
    }
    
    @scala.inline
    def TestTestEntry(name: test_fn_success, test: TestEntry): typingsSlinky.jestTypes.anon.TestTestEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jestTypes.anon.TestTestEntry]
    }
  }
  
  type AsyncFn = TestFn | HookFn
  
  type BlockFn = typingsSlinky.jestTypes.globalMod.BlockFn
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typingsSlinky.jestTypes.jestTypesStrings.skip
    - typingsSlinky.jestTypes.jestTypesStrings.only
    - typingsSlinky.jestTypes.jestTypesStrings.todo
  */
  type BlockMode = _BlockMode | Unit
  
  type BlockName = typingsSlinky.jestTypes.globalMod.BlockName
  
  @js.native
  trait DescribeBlock extends StObject {
    
    var children: js.Array[DescribeBlock | TestEntry] = js.native
    
    var hooks: js.Array[Hook] = js.native
    
    var mode: BlockMode = js.native
    
    var name: BlockName = js.native
    
    var parent: js.UndefOr[DescribeBlock] = js.native
    
    /** @deprecated Please get from `children` array instead */
    var tests: js.Array[TestEntry] = js.native
    
    var `type`: describeBlock = js.native
  }
  object DescribeBlock {
    
    @scala.inline
    def apply(
      children: js.Array[DescribeBlock | TestEntry],
      hooks: js.Array[Hook],
      mode: BlockMode,
      name: BlockName,
      tests: js.Array[TestEntry],
      `type`: describeBlock
    ): DescribeBlock = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeBlock]
    }
    
    @scala.inline
    implicit class DescribeBlockMutableBuilder[Self <: DescribeBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[DescribeBlock | TestEntry]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: (DescribeBlock | TestEntry)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setHooks(value: js.Array[Hook]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksVarargs(value: Hook*): Self = StObject.set(x, "hooks", js.Array(value :_*))
      
      @scala.inline
      def setMode(value: BlockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: BlockName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: DescribeBlock): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setTests(value: js.Array[TestEntry]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestsVarargs(value: TestEntry*): Self = StObject.set(x, "tests", js.Array(value :_*))
      
      @scala.inline
      def setType(value: describeBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type DoneFn = typingsSlinky.jestTypes.globalMod.DoneFn
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jestTypes.circusMod.SyncEvent
    - typingsSlinky.jestTypes.circusMod.AsyncEvent
  */
  trait Event extends StObject
  
  @js.native
  trait EventHandler extends StObject {
    
    def apply(event: AsyncEvent, state: State): Unit | js.Promise[Unit] = js.native
    def apply(event: SyncEvent, state: State): Unit = js.native
  }
  
  type Exception = js.Any
  
  type FormattedError = String
  
  @js.native
  trait GlobalErrorHandlers extends StObject {
    
    var uncaughtException: js.Array[js.Function1[/* exception */ Exception, Unit]] = js.native
    
    var unhandledRejection: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[_], Unit]] = js.native
  }
  object GlobalErrorHandlers {
    
    @scala.inline
    def apply(
      uncaughtException: js.Array[js.Function1[/* exception */ Exception, Unit]],
      unhandledRejection: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[_], Unit]]
    ): GlobalErrorHandlers = {
      val __obj = js.Dynamic.literal(uncaughtException = uncaughtException.asInstanceOf[js.Any], unhandledRejection = unhandledRejection.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalErrorHandlers]
    }
    
    @scala.inline
    implicit class GlobalErrorHandlersMutableBuilder[Self <: GlobalErrorHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUncaughtException(value: js.Array[js.Function1[/* exception */ Exception, Unit]]): Self = StObject.set(x, "uncaughtException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncaughtExceptionVarargs(value: (js.Function1[/* exception */ Exception, Unit])*): Self = StObject.set(x, "uncaughtException", js.Array(value :_*))
      
      @scala.inline
      def setUnhandledRejection(value: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[_], Unit]]): Self = StObject.set(x, "unhandledRejection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnhandledRejectionVarargs(value: (js.Function2[/* exception */ Exception, /* promise */ js.Promise[js.Any], Unit])*): Self = StObject.set(x, "unhandledRejection", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Hook extends StObject {
    
    var asyncError: js.Error = js.native
    
    def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
    def fn(done: typingsSlinky.jestTypes.globalMod.DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
    @JSName("fn")
    var fn_Original: HookFn = js.native
    
    var parent: DescribeBlock = js.native
    
    var timeout: js.UndefOr[Double | Null] = js.native
    
    var `type`: HookType = js.native
  }
  
  type HookFn = typingsSlinky.jestTypes.globalMod.HookFn
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jestTypes.jestTypesStrings.afterEach
    - typingsSlinky.jestTypes.jestTypesStrings.beforeEach
    - typingsSlinky.jestTypes.jestTypesStrings.afterAll
    - typingsSlinky.jestTypes.jestTypesStrings.beforeAll
  */
  trait HookType extends StObject
  object HookType {
    
    @scala.inline
    def afterAll: typingsSlinky.jestTypes.jestTypesStrings.afterAll = "afterAll".asInstanceOf[typingsSlinky.jestTypes.jestTypesStrings.afterAll]
    
    @scala.inline
    def afterEach: typingsSlinky.jestTypes.jestTypesStrings.afterEach = "afterEach".asInstanceOf[typingsSlinky.jestTypes.jestTypesStrings.afterEach]
    
    @scala.inline
    def beforeAll: typingsSlinky.jestTypes.jestTypesStrings.beforeAll = "beforeAll".asInstanceOf[typingsSlinky.jestTypes.jestTypesStrings.beforeAll]
    
    @scala.inline
    def beforeEach: typingsSlinky.jestTypes.jestTypesStrings.beforeEach = "beforeEach".asInstanceOf[typingsSlinky.jestTypes.jestTypesStrings.beforeEach]
  }
  
  @js.native
  trait JestGlobals extends TestFrameworkGlobals {
    
    var expect: js.Any = js.native
  }
  
  @js.native
  trait MatcherResults extends StObject {
    
    var actual: js.Any = js.native
    
    var expected: js.Any = js.native
    
    var name: String = js.native
    
    var pass: Boolean = js.native
  }
  object MatcherResults {
    
    @scala.inline
    def apply(actual: js.Any, expected: js.Any, name: String, pass: Boolean): MatcherResults = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatcherResults]
    }
    
    @scala.inline
    implicit class MatcherResultsMutableBuilder[Self <: MatcherResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  type Process = typingsSlinky.node.processMod.global.NodeJS.Process
  
  @js.native
  trait RunResult extends StObject {
    
    var testResults: TestResults = js.native
    
    var unhandledErrors: js.Array[FormattedError] = js.native
  }
  object RunResult {
    
    @scala.inline
    def apply(testResults: TestResults, unhandledErrors: js.Array[FormattedError]): RunResult = {
      val __obj = js.Dynamic.literal(testResults = testResults.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunResult]
    }
    
    @scala.inline
    implicit class RunResultMutableBuilder[Self <: RunResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTestResults(value: TestResults): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestResultsVarargs(value: TestResult*): Self = StObject.set(x, "testResults", js.Array(value :_*))
      
      @scala.inline
      def setUnhandledErrors(value: js.Array[FormattedError]): Self = StObject.set(x, "unhandledErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnhandledErrorsVarargs(value: FormattedError*): Self = StObject.set(x, "unhandledErrors", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jestTypes.jestTypesStrings.afterAll
    - typingsSlinky.jestTypes.jestTypesStrings.beforeAll
  */
  trait SharedHookType extends StObject
  object SharedHookType {
    
    @scala.inline
    def afterAll: typingsSlinky.jestTypes.jestTypesStrings.afterAll = "afterAll".asInstanceOf[typingsSlinky.jestTypes.jestTypesStrings.afterAll]
    
    @scala.inline
    def beforeAll: typingsSlinky.jestTypes.jestTypesStrings.beforeAll = "beforeAll".asInstanceOf[typingsSlinky.jestTypes.jestTypesStrings.beforeAll]
  }
  
  @js.native
  trait State extends StObject {
    
    var currentDescribeBlock: DescribeBlock = js.native
    
    var currentlyRunningTest: js.UndefOr[TestEntry | Null] = js.native
    
    var expand: js.UndefOr[Boolean] = js.native
    
    var hasFocusedTests: Boolean = js.native
    
    var hasStarted: Boolean = js.native
    
    var includeTestLocationInResult: Boolean = js.native
    
    var originalGlobalErrorHandlers: js.UndefOr[GlobalErrorHandlers] = js.native
    
    var parentProcess: Process | Null = js.native
    
    var rootDescribeBlock: DescribeBlock = js.native
    
    var testNamePattern: js.UndefOr[js.RegExp | Null] = js.native
    
    var testTimeout: Double = js.native
    
    var unhandledErrors: js.Array[Exception] = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      currentDescribeBlock: DescribeBlock,
      hasFocusedTests: Boolean,
      hasStarted: Boolean,
      includeTestLocationInResult: Boolean,
      rootDescribeBlock: DescribeBlock,
      testTimeout: Double,
      unhandledErrors: js.Array[Exception]
    ): State = {
      val __obj = js.Dynamic.literal(currentDescribeBlock = currentDescribeBlock.asInstanceOf[js.Any], hasFocusedTests = hasFocusedTests.asInstanceOf[js.Any], hasStarted = hasStarted.asInstanceOf[js.Any], includeTestLocationInResult = includeTestLocationInResult.asInstanceOf[js.Any], rootDescribeBlock = rootDescribeBlock.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentDescribeBlock(value: DescribeBlock): Self = StObject.set(x, "currentDescribeBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentlyRunningTest(value: TestEntry): Self = StObject.set(x, "currentlyRunningTest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentlyRunningTestNull: Self = StObject.set(x, "currentlyRunningTest", null)
      
      @scala.inline
      def setCurrentlyRunningTestUndefined: Self = StObject.set(x, "currentlyRunningTest", js.undefined)
      
      @scala.inline
      def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setHasFocusedTests(value: Boolean): Self = StObject.set(x, "hasFocusedTests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasStarted(value: Boolean): Self = StObject.set(x, "hasStarted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeTestLocationInResult(value: Boolean): Self = StObject.set(x, "includeTestLocationInResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalGlobalErrorHandlers(value: GlobalErrorHandlers): Self = StObject.set(x, "originalGlobalErrorHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalGlobalErrorHandlersUndefined: Self = StObject.set(x, "originalGlobalErrorHandlers", js.undefined)
      
      @scala.inline
      def setParentProcess(value: Process): Self = StObject.set(x, "parentProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentProcessNull: Self = StObject.set(x, "parentProcess", null)
      
      @scala.inline
      def setRootDescribeBlock(value: DescribeBlock): Self = StObject.set(x, "rootDescribeBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestNamePattern(value: js.RegExp): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestNamePatternNull: Self = StObject.set(x, "testNamePattern", null)
      
      @scala.inline
      def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
      
      @scala.inline
      def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnhandledErrors(value: js.Array[Exception]): Self = StObject.set(x, "unhandledErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnhandledErrorsVarargs(value: Exception*): Self = StObject.set(x, "unhandledErrors", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jestTypes.anon.AsyncError
    - typingsSlinky.jestTypes.anon.BlockName
    - typingsSlinky.jestTypes.anon.Fn
    - typingsSlinky.jestTypes.anon.Mode
    - typingsSlinky.jestTypes.anon.Error
  */
  trait SyncEvent extends Event
  
  type TestContext = Record[String, js.Any]
  
  @js.native
  trait TestEntry extends StObject {
    
    var asyncError: Exception = js.native
    
    var duration: js.UndefOr[Double | Null] = js.native
    
    var errors: js.Array[TestError] = js.native
    
    def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
    def fn(done: typingsSlinky.jestTypes.globalMod.DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
    @JSName("fn")
    var fn_Original: TestFn = js.native
    
    var invocations: Double = js.native
    
    var mode: TestMode = js.native
    
    var name: TestName = js.native
    
    var parent: DescribeBlock = js.native
    
    var startedAt: js.UndefOr[Double | Null] = js.native
    
    var status: js.UndefOr[TestStatus | Null] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var `type`: test = js.native
  }
  
  type TestError = Exception | (js.Tuple2[js.UndefOr[Exception], Exception])
  
  type TestFn = typingsSlinky.jestTypes.globalMod.TestFn
  
  type TestMode = BlockMode
  
  type TestName = typingsSlinky.jestTypes.globalMod.TestName
  
  @js.native
  trait TestResult extends StObject {
    
    var duration: js.UndefOr[Double | Null] = js.native
    
    var errors: js.Array[FormattedError] = js.native
    
    var errorsDetailed: js.Array[MatcherResults | _] = js.native
    
    var invocations: Double = js.native
    
    var location: js.UndefOr[Column | Null] = js.native
    
    var status: TestStatus = js.native
    
    var testPath: js.Array[TestName | BlockName] = js.native
  }
  object TestResult {
    
    @scala.inline
    def apply(
      errors: js.Array[FormattedError],
      errorsDetailed: js.Array[MatcherResults | _],
      invocations: Double,
      status: TestStatus,
      testPath: js.Array[TestName | BlockName]
    ): TestResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], errorsDetailed = errorsDetailed.asInstanceOf[js.Any], invocations = invocations.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestResult]
    }
    
    @scala.inline
    implicit class TestResultMutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setErrors(value: js.Array[FormattedError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsDetailed(value: js.Array[MatcherResults | _]): Self = StObject.set(x, "errorsDetailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsDetailedVarargs(value: (MatcherResults | js.Any)*): Self = StObject.set(x, "errorsDetailed", js.Array(value :_*))
      
      @scala.inline
      def setErrorsVarargs(value: FormattedError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setInvocations(value: Double): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Column): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setStatus(value: TestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestPath(value: js.Array[TestName | BlockName]): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestPathVarargs(value: (TestName | BlockName)*): Self = StObject.set(x, "testPath", js.Array(value :_*))
    }
  }
  
  type TestResults = js.Array[TestResult]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jestTypes.jestTypesStrings.skip
    - typingsSlinky.jestTypes.jestTypesStrings.done
    - typingsSlinky.jestTypes.jestTypesStrings.todo
  */
  trait TestStatus extends StObject
  object TestStatus {
    
    @scala.inline
    def done: typingsSlinky.jestTypes.jestTypesStrings.done = "done".asInstanceOf[typingsSlinky.jestTypes.jestTypesStrings.done]
    
    @scala.inline
    def skip: typingsSlinky.jestTypes.jestTypesStrings.skip = "skip".asInstanceOf[typingsSlinky.jestTypes.jestTypesStrings.skip]
    
    @scala.inline
    def todo: typingsSlinky.jestTypes.jestTypesStrings.todo = "todo".asInstanceOf[typingsSlinky.jestTypes.jestTypesStrings.todo]
  }
  
  trait _BlockMode extends StObject
}
