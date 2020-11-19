package typingsSlinky.jestEnvironment.mod

import typingsSlinky.jestEnvironment.anon.Virtual
import typingsSlinky.jestEnvironment.jestEnvironmentStrings.legacy
import typingsSlinky.jestEnvironment.jestEnvironmentStrings.modern
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jest extends js.Object {
  
  /**
    * Provides a way to add Jasmine-compatible matchers into your Jest context.
    *
    * @deprecated Use `expect.extend` instead
    */
  def addMatchers(matchers: Record[String, _]): Unit = js.native
  
  /**
    * Advances all timers by msToRun milliseconds. All pending "macro-tasks"
    * that have been queued via setTimeout() or setInterval(), and would be
    * executed within this timeframe will be executed.
    */
  def advanceTimersByTime(msToRun: Double): Unit = js.native
  
  /**
    * Advances all timers by the needed milliseconds so that only the next timeouts/intervals will run.
    * Optionally, you can provide steps, so it will run steps amount of next timeouts/intervals.
    */
  def advanceTimersToNextTimer(): Unit = js.native
  def advanceTimersToNextTimer(steps: Double): Unit = js.native
  
  /**
    * Disables automatic mocking in the module loader.
    */
  def autoMockOff(): Jest = js.native
  
  /**
    * Enables automatic mocking in the module loader.
    */
  def autoMockOn(): Jest = js.native
  
  /**
    * Clears the mock.calls and mock.instances properties of all mocks.
    * Equivalent to calling .mockClear() on every mocked function.
    */
  def clearAllMocks(): Jest = js.native
  
  /**
    * Removes any pending timers from the timer system. If any timers have been
    * scheduled, they will be cleared and will never have the opportunity to
    * execute in the future.
    */
  def clearAllTimers(): Unit = js.native
  
  /**
    * Given the name of a module, use the automatic mocking system to generate a
    * mocked version of the module for you.
    *
    * This is useful when you want to create a manual mock that extends the
    * automatic mock's behavior.
    */
  def createMockFromModule(moduleName: String): js.Any = js.native
  
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module, including all of the specified module's
    * dependencies.
    */
  def deepUnmock(moduleName: String): Jest = js.native
  
  /**
    * Disables automatic mocking in the module loader.
    *
    * After this method is called, all `require()`s will return the real
    * versions of each module (rather than a mocked version).
    */
  def disableAutomock(): Jest = js.native
  
  /**
    * When using `babel-jest`, calls to mock will automatically be hoisted to
    * the top of the code block. Use this method if you want to explicitly avoid
    * this behavior.
    */
  def doMock(moduleName: String): Jest = js.native
  def doMock(moduleName: String, moduleFactory: js.Function0[_]): Jest = js.native
  
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module from require() (e.g. that it should always return
    * the real module).
    */
  def dontMock(moduleName: String): Jest = js.native
  
  /**
    * Enables automatic mocking in the module loader.
    */
  def enableAutomock(): Jest = js.native
  
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  var fn: JestMockFn = js.native
  
  /**
    * Given the name of a module, use the automatic mocking system to generate a
    * mocked version of the module for you.
    *
    * This is useful when you want to create a manual mock that extends the
    * automatic mock's behavior.
    *
    * @deprecated Use `jest.createMockFromModule()` instead
    */
  def genMockFromModule(moduleName: String): js.Any = js.native
  
  /**
    * When mocking time, `Date.now()` will also be mocked. If you for some reason need access to the real current time, you can invoke this function.
    *
    * > Note: This function is only available when using Lolex as fake timers implementation
    */
  def getRealSystemTime(): Double = js.native
  
  /**
    * Returns the number of fake timers still left to run.
    */
  def getTimerCount(): Double = js.native
  
  /**
    * Determines if the given function is a mocked function.
    */
  def isMockFunction(fn: js.Function): /* is std.ReturnType<@jest/environment.@jest/environment.JestMockFn> */ Boolean = js.native
  
  /**
    * `jest.isolateModules(fn)` goes a step further than `jest.resetModules()`
    * and creates a sandbox registry for the modules that are loaded inside
    * the callback function. This is useful to isolate specific modules for
    * every test so that local module state doesn't conflict between tests.
    */
  def isolateModules(fn: js.Function0[Unit]): Jest = js.native
  
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  def mock(moduleName: String): Jest = js.native
  def mock(moduleName: String, moduleFactory: js.UndefOr[scala.Nothing], options: Virtual): Jest = js.native
  def mock(moduleName: String, moduleFactory: js.Function0[_]): Jest = js.native
  def mock(moduleName: String, moduleFactory: js.Function0[_], options: Virtual): Jest = js.native
  
  /**
    * Returns the actual module instead of a mock, bypassing all checks on
    * whether the module should receive a mock implementation or not.
    *
    * @example
    ```
    jest.mock('../myModule', () => {
    // Require the original module to not be mocked...
    const originalModule = jest.requireActual(moduleName);
    return {
    __esModule: true, // Use it when dealing with esModules
    ...originalModule,
    getRandom: jest.fn().mockReturnValue(10),
    };
    });
    
    const getRandom = require('../myModule').getRandom;
    
    getRandom(); // Always returns 10
    ```
    */
  def requireActual(moduleName: String): js.Any = js.native
  
  /**
    * Returns a mock module instead of the actual module, bypassing all checks
    * on whether the module should be required normally or not.
    */
  def requireMock(moduleName: String): js.Any = js.native
  
  /**
    * Resets the state of all mocks.
    * Equivalent to calling .mockReset() on every mocked function.
    */
  def resetAllMocks(): Jest = js.native
  
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    *
    * @deprecated Use `jest.resetModules()`
    */
  def resetModuleRegistry(): Jest = js.native
  
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  def resetModules(): Jest = js.native
  
  /**
    * Restores all mocks back to their original value. Equivalent to calling
    * `.mockRestore` on every mocked function.
    *
    * Beware that jest.restoreAllMocks() only works when the mock was created with
    * jest.spyOn; other mocks will require you to manually restore them.
    */
  def restoreAllMocks(): Jest = js.native
  
  /**
    * Runs failed tests n-times until they pass or until the max number of
    * retries is exhausted. This only works with `jest-circus`!
    */
  def retryTimes(numRetries: Double): Jest = js.native
  
  /**
    * Exhausts tasks queued by setImmediate().
    *
    * > Note: This function is not available when using Lolex as fake timers implementation
    */
  def runAllImmediates(): Unit = js.native
  
  /**
    * Exhausts the micro-task queue (usually interfaced in node via
    * process.nextTick).
    */
  def runAllTicks(): Unit = js.native
  
  /**
    * Exhausts the macro-task queue (i.e., all tasks queued by setTimeout()
    * and setInterval()).
    */
  def runAllTimers(): Unit = js.native
  
  /**
    * Executes only the macro-tasks that are currently pending (i.e., only the
    * tasks that have been queued by setTimeout() or setInterval() up to this
    * point). If any of the currently pending macro-tasks schedule new
    * macro-tasks, those new tasks will not be executed by this call.
    */
  def runOnlyPendingTimers(): Unit = js.native
  
  /**
    * Executes only the macro task queue (i.e. all tasks queued by setTimeout()
    * or setInterval() and setImmediate()).
    *
    * @deprecated Use `jest.advanceTimersByTime()`
    */
  def runTimersToTime(msToRun: Double): Unit = js.native
  
  /**
    * Explicitly supplies the mock object that the module system should return
    * for the specified module.
    *
    * Note It is recommended to use `jest.mock()` instead. The `jest.mock`
    * API's second argument is a module factory instead of the expected
    * exported module object.
    */
  def setMock(moduleName: String, moduleExports: js.Any): Jest = js.native
  
  /**
    *  Set the current system time used by fake timers. Simulates a user changing the system clock while your program is running. It affects the current time but it does not in itself cause e.g. timers to fire; they will fire exactly as they would have done without the call to `jest.setSystemTime()`.
    *
    *  > Note: This function is only available when using Lolex as fake timers implementation
    */
  def setSystemTime(): Unit = js.native
  def setSystemTime(now: Double): Unit = js.native
  def setSystemTime(now: js.Date): Unit = js.native
  
  /**
    * Set the default timeout interval for tests and before/after hooks in
    * milliseconds.
    *
    * Note: The default timeout interval is 5 seconds if this method is not
    * called.
    */
  def setTimeout(timeout: Double): Jest = js.native
  
  /**
    * Creates a mock function similar to `jest.fn` but also tracks calls to
    * `object[methodName]`.
    *
    * Note: By default, jest.spyOn also calls the spied method. This is
    * different behavior from most other test libraries.
    */
  var spyOn: JestMockSpyOn = js.native
  
  /**
    * Indicates that the module system should never return a mocked version of
    * the specified module from require() (e.g. that it should always return the
    * real module).
    */
  def unmock(moduleName: String): Jest = js.native
  
  /**
    * Instructs Jest to use fake versions of the standard timer functions.
    */
  def useFakeTimers(): Jest = js.native
  @JSName("useFakeTimers")
  def useFakeTimers_legacy(implementation: legacy): Jest = js.native
  @JSName("useFakeTimers")
  def useFakeTimers_modern(implementation: modern): Jest = js.native
  
  /**
    * Instructs Jest to use the real versions of the standard timer functions.
    */
  def useRealTimers(): Jest = js.native
}
