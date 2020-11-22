package typingsSlinky.jest.mod

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
}
