package typingsSlinky.jest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jest {
  
  type AndNot[T] = T with typingsSlinky.jest.anon.Not[T]
  
  type ArgsType[T] = js.Any
  
  type ConstructorArgsType[T] = js.Any
  
  type ConstructorPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends new (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  
  type CustomAsymmetricMatcher[TMatcher /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Function1[
    /* args */ typingsSlinky.jest.mod.jest.RemoveFirstFromTuple[typingsSlinky.jest.mod.jest.Parameters[TMatcher]], 
    typingsSlinky.jest.mod.jest.AsymmetricMatcher
  ]
  
  type CustomAsyncMatchers[TMatchers /* <: typingsSlinky.jest.mod.jest.ExpectExtendMap */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in jest.jest.jest.NonAsyncMatchers<TMatchers> ]: jest.jest.jest.CustomAsymmetricMatcher<TMatchers[K]>}
    */ typingsSlinky.jest.jestStrings.CustomAsyncMatchers with org.scalablytyped.runtime.TopLevel[TMatchers]
  
  // should be TMatcherReturn extends void|Promise<void> but getting dtslint error
  type CustomJestMatcher[TMatcher /* <: js.Function1[/* repeated */ js.Any, _] */, TMatcherReturn] = js.Function1[
    /* args */ typingsSlinky.jest.mod.jest.RemoveFirstFromTuple[typingsSlinky.jest.mod.jest.Parameters[TMatcher]], 
    TMatcherReturn
  ]
  
  type CustomMatcher = js.ThisFunction2[
    /* this */ typingsSlinky.jest.mod.jest.MatcherContext, 
    /* received */ js.Any, 
    /* repeated */ js.Any, 
    typingsSlinky.jest.mod.jest.CustomMatcherResult | js.Promise[typingsSlinky.jest.mod.jest.CustomMatcherResult]
  ]
  
  type EmptyFunction = js.Function0[scala.Unit]
  
  type EqualityTester = js.Function2[/* a */ js.Any, /* b */ js.Any, js.UndefOr[scala.Boolean]]
  
  type ExpectExtendMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jest.mod.jest.CustomMatcher]
  
  type ExtendedExpect[TMatchers /* <: typingsSlinky.jest.mod.jest.ExpectExtendMap */] = typingsSlinky.jest.mod.jest.ExpectProperties with typingsSlinky.jest.mod.jest.AndNot[typingsSlinky.jest.mod.jest.CustomAsyncMatchers[TMatchers]] with typingsSlinky.jest.mod.jest.ExtendedExpectFunction[TMatchers]
  
  // when have called expect.extend
  type ExtendedExpectFunction[TMatchers /* <: typingsSlinky.jest.mod.jest.ExpectExtendMap */] = js.Function1[
    /* actual */ js.Any, 
    typingsSlinky.jest.mod.jest.JestExtendedMatchers[TMatchers, js.Any]
  ]
  
  // should be TMatcherReturn extends void|Promise<void> but getting dtslint error
  // Use the `void` type for return types only. Otherwise, use `undefined`. See: https://github.com/Microsoft/dtslint/blob/master/docs/void-return.md
  // have added issue https://github.com/microsoft/dtslint/issues/256 - Cannot have type union containing void ( to be used as return type only
  type ExtendedMatchers[TMatchers /* <: typingsSlinky.jest.mod.jest.ExpectExtendMap */, TMatcherReturn, TActual] = (typingsSlinky.jest.mod.jest.Matchers[TMatcherReturn, TActual]) with typingsSlinky.jest.jestStrings.ExtendedMatchers with org.scalablytyped.runtime.TopLevel[TMatchers]
  
  type FunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  
  type JestExtendedMatchers[TMatchers /* <: typingsSlinky.jest.mod.jest.ExpectExtendMap */, TActual] = typingsSlinky.jest.mod.jest.JestMatchersShape[
    typingsSlinky.jest.mod.jest.ExtendedMatchers[TMatchers, scala.Unit, TActual], 
    typingsSlinky.jest.mod.jest.ExtendedMatchers[TMatchers, js.Promise[scala.Unit], TActual]
  ]
  
  type JestMatchersShape[TNonPromise /* <: js.Object */, TPromise /* <: js.Object */] = typingsSlinky.jest.anon.Rejects[TPromise] with typingsSlinky.jest.mod.jest.AndNot[TNonPromise]
  
  type Lifecycle = js.Function2[
    /* fn */ typingsSlinky.jest.mod.jest.ProvidesCallback, 
    /* timeout */ js.UndefOr[scala.Double], 
    js.Any
  ]
  
  type MatcherHintColor = js.Function1[/* arg */ java.lang.String, java.lang.String]
  
  /**
    * Wrap an object or a module with mock definitions
    *
    * @example
    *
    *  jest.mock("../api");
    *  import * as api from "../api";
    *
    *  const mockApi = api as jest.Mocked<typeof api>;
    *  api.MyApi.prototype.myApiMethod.mockImplementation(() => "test");
    */
  type Mocked[T] = typingsSlinky.jest.jestStrings.Mocked with org.scalablytyped.runtime.TopLevel[js.Any] with T
  
  /**
    * Wrap a class with mock definitions
    *
    * @example
    *
    *  import { MyClass } from "./library";
    *  jest.mock("./library");
    *
    *  const mockedMyClass = MyClass as jest.MockedClass<typeof MyClass>;
    *
    *  expect(mockedMyClass.mock.calls[0][0]).toBe(42); // Constructor calls
    *  expect(mockedMyClass.prototype.myMethod.mock.calls[0][0]).toBe(42); // Method calls
    */
  type MockedClass[T /* <: typingsSlinky.jest.mod.jest.Constructable */] = (typingsSlinky.jest.mod.jest.MockInstance[typingsSlinky.std.InstanceType[T], _]) with js.Object with T
  
  /**
    * Wrap a function with mock definitions
    *
    * @example
    *
    *  import { myFunction } from "./library";
    *  jest.mock("./library");
    *
    *  const mockMyFunction = myFunction as jest.MockedFunction<typeof myFunction>;
    *  expect(mockMyFunction.mock.calls[0][0]).toBe(42);
    */
  type MockedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = (typingsSlinky.jest.mod.jest.MockInstance[typingsSlinky.std.ReturnType[T], typingsSlinky.jest.mod.jest.ArgsType[T]]) with T
  
  type NonAsyncMatchers[TMatchers /* <: typingsSlinky.jest.mod.jest.ExpectExtendMap */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof TMatchers ]: std.ReturnType<TMatchers[K]> extends std.Promise<jest.jest.jest.CustomMatcherResult>? never : K}[keyof TMatchers] */ js.Any
  
  // see https://github.com/Microsoft/TypeScript/issues/25215
  type NonFunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with java.lang.String
  
  type NonPromiseMatchers[T /* <: typingsSlinky.jest.anon.JestMatchersShape */] = typingsSlinky.jest.mod.jest.Omit[
    T, 
    typingsSlinky.jest.jestStrings.resolves | typingsSlinky.jest.jestStrings.rejects | typingsSlinky.jest.jestStrings.not
  ]
  
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  
  type PrintLabel = js.Function1[/* string */ java.lang.String, java.lang.String]
  
  type PromiseMatchers[T /* <: typingsSlinky.jest.anon.JestMatchersShape */] = typingsSlinky.jest.mod.jest.Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: T['resolves'] */ js.Any, 
    typingsSlinky.jest.jestStrings.not
  ]
  
  type ProvidesCallback = js.Function1[/* cb */ typingsSlinky.jest.mod.jest.DoneCallback, js.Any]
  
  type RejectedValue[T] = js.Any
  
  type RemoveFirstFromTuple[T /* <: js.Array[_] */] = js.Array[js.Any]
  
  type ResolvedValue[T] = js.Any | T
  
  type SnapshotSerializerPlugin = typingsSlinky.prettyFormat.mod.Plugin
  
  /**
    * Represents a function that has been spied on.
    */
  type SpiedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = typingsSlinky.jest.mod.jest.SpyInstance[typingsSlinky.std.ReturnType[T], typingsSlinky.jest.mod.jest.ArgsType[T]]
  
  type SpyInstance[T, Y /* <: js.Array[_] */] = typingsSlinky.jest.mod.jest.MockInstance[T, Y]
  
  /**
    * Provides a way to add Jasmine-compatible matchers into your Jest context.
    */
  @scala.inline
  def addMatchers(matchers: typingsSlinky.jest.mod.jasmine.CustomMatcherFactories): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("addMatchers")(matchers.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Advances all timers by msToRun milliseconds. All pending "macro-tasks" that have been
    * queued via setTimeout() or setInterval(), and would be executed within this timeframe
    * will be executed.
    */
  @scala.inline
  def advanceTimersByTime(msToRun: scala.Double): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("advanceTimersByTime")(msToRun.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Advances all timers by the needed milliseconds so that only the next
    * timeouts/intervals will run. Optionally, you can provide steps, so it
    * will run steps amount of next timeouts/intervals.
    */
  @scala.inline
  def advanceTimersToNextTimer(): scala.Unit = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("advanceTimersToNextTimer")().asInstanceOf[scala.Unit]
  @scala.inline
  def advanceTimersToNextTimer(step: scala.Double): scala.Unit = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("advanceTimersToNextTimer")(step.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * Disables automatic mocking in the module loader.
    */
  @scala.inline
  def autoMockOff(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("autoMockOff")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Enables automatic mocking in the module loader.
    */
  @scala.inline
  def autoMockOn(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("autoMockOn")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Clears the mock.calls and mock.instances properties of all mocks.
    * Equivalent to calling .mockClear() on every mocked function.
    */
  @scala.inline
  def clearAllMocks(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("clearAllMocks")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Removes any pending timers from the timer system. If any timers have
    * been scheduled, they will be cleared and will never have the opportunity
    * to execute in the future.
    */
  @scala.inline
  def clearAllTimers(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("clearAllTimers")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Use the automatic mocking system to generate a mocked version of the given module.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  @scala.inline
  def createMockFromModule[T](moduleName: java.lang.String): T = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("createMockFromModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module, including all of the specificied module's dependencies.
    */
  @scala.inline
  def deepUnmock(moduleName: java.lang.String): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("deepUnmock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Disables automatic mocking in the module loader.
    */
  @scala.inline
  def disableAutomock(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("disableAutomock")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  @scala.inline
  def doMock(moduleName: java.lang.String): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("doMock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  @scala.inline
  def doMock(
    moduleName: java.lang.String,
    factory: js.UndefOr[scala.Nothing],
    options: typingsSlinky.jest.mod.jest.MockOptions
  ): typingsSlinky.jest.anon.Typeofjest = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("doMock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  @scala.inline
  def doMock(moduleName: java.lang.String, factory: js.Function0[_]): typingsSlinky.jest.anon.Typeofjest = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("doMock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  @scala.inline
  def doMock(
    moduleName: java.lang.String,
    factory: js.Function0[_],
    options: typingsSlinky.jest.mod.jest.MockOptions
  ): typingsSlinky.jest.anon.Typeofjest = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("doMock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module from require() (e.g. that it should always return the real module).
    */
  @scala.inline
  def dontMock(moduleName: java.lang.String): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("dontMock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Enables automatic mocking in the module loader.
    */
  @scala.inline
  def enableAutomock(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("enableAutomock")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  @scala.inline
  def fn(): typingsSlinky.jest.mod.jest.Mock_[_, _] = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("fn")().asInstanceOf[typingsSlinky.jest.mod.jest.Mock_[_, _]]
  @scala.inline
  def fn[T, Y /* <: js.Array[_] */](implementation: js.Function1[/* args */ Y, T]): typingsSlinky.jest.mod.jest.Mock_[T, Y] = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(implementation.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.mod.jest.Mock_[T, Y]]
  
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  @scala.inline
  def fn_TY_ArrayWildcard[T, Y /* <: js.Array[_] */](): typingsSlinky.jest.mod.jest.Mock_[T, Y] = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("fn")().asInstanceOf[typingsSlinky.jest.mod.jest.Mock_[T, Y]]
  
  /**
    * (renamed to `createMockFromModule` in Jest 26.0.0+)
    * Use the automatic mocking system to generate a mocked version of the given module.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  @scala.inline
  def genMockFromModule[T](moduleName: java.lang.String): T = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("genMockFromModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * When mocking time, Date.now() will also be mocked. If you for some
    * reason need access to the real current time, you can invoke this
    * function.
    *
    * > Note: This function is only available when using modern fake timers
    * > implementation
    */
  @scala.inline
  def getRealSystemTime(): scala.Double = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("getRealSystemTime")().asInstanceOf[scala.Double]
  
  /**
    * Returns the number of fake timers still left to run.
    */
  @scala.inline
  def getTimerCount(): scala.Double = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("getTimerCount")().asInstanceOf[scala.Double]
  
  /**
    * Returns whether the given function is a mock function.
    */
  @scala.inline
  def isMockFunction(fn: js.Any): /* is jest.jest.jest.Mock<any, any> */ scala.Boolean = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("isMockFunction")(fn.asInstanceOf[js.Any]).asInstanceOf[/* is jest.jest.jest.Mock<any, any> */ scala.Boolean]
  
  /**
    * Creates a sandbox registry for the modules that are loaded inside the callback function..
    * This is useful to isolate specific modules for every test so that local module state doesn't conflict between tests.
    */
  @scala.inline
  def isolateModules(fn: js.Function0[scala.Unit]): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("isolateModules")(fn.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  @scala.inline
  def mock(moduleName: java.lang.String): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("mock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  @scala.inline
  def mock(
    moduleName: java.lang.String,
    factory: js.UndefOr[scala.Nothing],
    options: typingsSlinky.jest.mod.jest.MockOptions
  ): typingsSlinky.jest.anon.Typeofjest = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("mock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  @scala.inline
  def mock(moduleName: java.lang.String, factory: js.Function0[_]): typingsSlinky.jest.anon.Typeofjest = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("mock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  @scala.inline
  def mock(
    moduleName: java.lang.String,
    factory: js.Function0[_],
    options: typingsSlinky.jest.mod.jest.MockOptions
  ): typingsSlinky.jest.anon.Typeofjest = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("mock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Returns the actual module instead of a mock, bypassing all checks on
    * whether the module should receive a mock implementation or not.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  @scala.inline
  def requireActual[TModule](moduleName: java.lang.String): TModule = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("requireActual")(moduleName.asInstanceOf[js.Any]).asInstanceOf[TModule]
  
  /**
    * Returns a mock module instead of the actual module, bypassing all checks
    * on whether the module should be required normally or not.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  @scala.inline
  def requireMock[TModule](moduleName: java.lang.String): TModule = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("requireMock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[TModule]
  
  /**
    * Resets the state of all mocks.
    * Equivalent to calling .mockReset() on every mocked function.
    */
  @scala.inline
  def resetAllMocks(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("resetAllMocks")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  @scala.inline
  def resetModuleRegistry(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("resetModuleRegistry")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  @scala.inline
  def resetModules(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("resetModules")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * available since Jest 21.1.0
    * Restores all mocks back to their original value.
    * Equivalent to calling .mockRestore on every mocked function.
    * Beware that jest.restoreAllMocks() only works when mock was created with
    * jest.spyOn; other mocks will require you to manually restore them.
    */
  @scala.inline
  def restoreAllMocks(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("restoreAllMocks")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Runs failed tests n-times until they pass or until the max number of retries is exhausted.
    * This only works with jest-circus!
    */
  @scala.inline
  def retryTimes(numRetries: scala.Double): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("retryTimes")(numRetries.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Exhausts tasks queued by setImmediate().
    */
  @scala.inline
  def runAllImmediates(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("runAllImmediates")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Exhausts the micro-task queue (usually interfaced in node via process.nextTick).
    */
  @scala.inline
  def runAllTicks(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("runAllTicks")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Exhausts the macro-task queue (i.e., all tasks queued by setTimeout() and setInterval()).
    */
  @scala.inline
  def runAllTimers(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("runAllTimers")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Executes only the macro-tasks that are currently pending (i.e., only the
    * tasks that have been queued by setTimeout() or setInterval() up to this point).
    * If any of the currently pending macro-tasks schedule new macro-tasks,
    * those new tasks will not be executed by this call.
    */
  @scala.inline
  def runOnlyPendingTimers(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("runOnlyPendingTimers")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * (renamed to `advanceTimersByTime` in Jest 21.3.0+) Executes only the macro
    * task queue (i.e. all tasks queued by setTimeout() or setInterval() and setImmediate()).
    */
  @scala.inline
  def runTimersToTime(msToRun: scala.Double): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("runTimersToTime")(msToRun.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Explicitly supplies the mock object that the module system should return
    * for the specified module.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  @scala.inline
  def setMock[T](moduleName: java.lang.String, moduleExports: T): typingsSlinky.jest.anon.Typeofjest = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("setMock")(moduleName.asInstanceOf[js.Any], moduleExports.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Set the current system time used by fake timers. Simulates a user
    * changing the system clock while your program is running. It affects the
    * current time but it does not in itself cause e.g. timers to fire; they
    * will fire exactly as they would have done without the call to
    * jest.setSystemTime().
    *
    * > Note: This function is only available when using modern fake timers
    * > implementation
    */
  @scala.inline
  def setSystemTime(): scala.Unit = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("setSystemTime")().asInstanceOf[scala.Unit]
  @scala.inline
  def setSystemTime(now: js.Date): scala.Unit = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("setSystemTime")(now.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def setSystemTime(now: scala.Double): scala.Unit = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("setSystemTime")(now.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * Set the default timeout interval for tests and before/after hooks in milliseconds.
    * Note: The default timeout interval is 5 seconds if this method is not called.
    */
  @scala.inline
  def setTimeout(timeout: scala.Double): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(timeout.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  @scala.inline
  def spyOn[T /* <: js.Object */, M /* <: typingsSlinky.jest.mod.jest.FunctionPropertyNames[typingsSlinky.std.Required[T]] */](`object`: T, method: M): typingsSlinky.jest.mod.jest.SpyInstance[
    typingsSlinky.std.ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    typingsSlinky.jest.mod.jest.ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.mod.jest.SpyInstance[
    typingsSlinky.std.ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    typingsSlinky.jest.mod.jest.ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ]]
  
  @scala.inline
  def spyOn_T_ObjectM_ConstructorPropertyNamesRequiredT[T /* <: js.Object */, M /* <: typingsSlinky.jest.mod.jest.ConstructorPropertyNames[typingsSlinky.std.Required[T]] */](`object`: T, method: M): typingsSlinky.jest.mod.jest.SpyInstance[
    typingsSlinky.std.InstanceType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    typingsSlinky.jest.mod.jest.ConstructorArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.mod.jest.SpyInstance[
    typingsSlinky.std.InstanceType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    typingsSlinky.jest.mod.jest.ConstructorArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ]]
  
  /**
    * Creates a mock function similar to jest.fn but also tracks calls to `object[methodName]`
    *
    * Note: By default, jest.spyOn also calls the spied method. This is different behavior from most
    * other test libraries.
    *
    * @example
    *
    * const video = require('./video');
    *
    * test('plays video', () => {
    *   const spy = jest.spyOn(video, 'play');
    *   const isPlaying = video.play();
    *
    *   expect(spy).toHaveBeenCalled();
    *   expect(isPlaying).toBe(true);
    *
    *   spy.mockReset();
    *   spy.mockRestore();
    * });
    */
  @scala.inline
  def spyOn_get[T /* <: js.Object */, M /* <: typingsSlinky.jest.mod.jest.NonFunctionPropertyNames[typingsSlinky.std.Required[T]] */](`object`: T, method: M, accessType: typingsSlinky.jest.jestStrings.get): typingsSlinky.jest.mod.jest.SpyInstance[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any, 
    js.Array[js.Any]
  ] = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any], accessType.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.mod.jest.SpyInstance[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any, 
    js.Array[js.Any]
  ]]
  
  @scala.inline
  def spyOn_set[T /* <: js.Object */, M /* <: typingsSlinky.jest.mod.jest.NonFunctionPropertyNames[typingsSlinky.std.Required[T]] */](`object`: T, method: M, accessType: typingsSlinky.jest.jestStrings.set): typingsSlinky.jest.mod.jest.SpyInstance[
    scala.Unit, 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = (typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any], accessType.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.mod.jest.SpyInstance[
    scala.Unit, 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ]]
  
  /**
    * Indicates that the module system should never return a mocked version of
    * the specified module from require() (e.g. that it should always return the real module).
    */
  @scala.inline
  def unmock(moduleName: java.lang.String): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("unmock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Instructs Jest to use fake versions of the standard timer functions.
    */
  @scala.inline
  def useFakeTimers(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("useFakeTimers")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  @scala.inline
  def useFakeTimers_legacy(implementation: typingsSlinky.jest.jestStrings.legacy): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("useFakeTimers")(implementation.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  @scala.inline
  def useFakeTimers_modern(implementation: typingsSlinky.jest.jestStrings.modern): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("useFakeTimers")(implementation.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
  
  /**
    * Instructs Jest to use the real versions of the standard timer functions.
    */
  @scala.inline
  def useRealTimers(): typingsSlinky.jest.anon.Typeofjest = typingsSlinky.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("useRealTimers")().asInstanceOf[typingsSlinky.jest.anon.Typeofjest]
}
