package typingsSlinky.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jasmine {
  
  type CustomAsyncMatcherFactories = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jasmine.jasmine.CustomAsyncMatcherFactory]
  
  type CustomAsyncMatcherFactory = js.Function2[
    /* util */ typingsSlinky.jasmine.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typingsSlinky.jasmine.jasmine.CustomEqualityTester], 
    typingsSlinky.jasmine.jasmine.CustomAsyncMatcher
  ]
  
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean | scala.Unit]
  
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jasmine.jasmine.CustomMatcherFactory]
  
  type CustomMatcherFactory = js.Function2[
    /* util */ typingsSlinky.jasmine.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typingsSlinky.jasmine.jasmine.CustomEqualityTester], 
    typingsSlinky.jasmine.jasmine.CustomMatcher
  ]
  
  type CustomObjectFormatter = js.Function1[/* value */ js.Any, js.UndefOr[java.lang.String]]
  
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsSlinky.jasmine.jasmine.ObjectContaining[T]
    - typingsSlinky.jasmine.jasmine.AsymmetricMatcher[js.Any]
    - typingsSlinky.jasmine.jasmine.Any
    - typingsSlinky.jasmine.jasmine.Spy[typingsSlinky.jasmine.jasmine.Func]
    - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    * / typingsSlinky.jasmine.jasmineStrings.Expected with org.scalablytyped.runtime.TopLevel[T]
  */
  type Expected[T] = typingsSlinky.jasmine.jasmine._Expected[T] | typingsSlinky.jasmine.jasmine.AsymmetricMatcher[js.Any] | typingsSlinky.jasmine.jasmine.Spy[typingsSlinky.jasmine.jasmine.Func] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    */ typingsSlinky.jasmine.jasmineStrings.Expected with org.scalablytyped.runtime.TopLevel[T]) | T
  
  type ExpectedRecursive[T] = T | typingsSlinky.jasmine.jasmine.ObjectContaining[T] | typingsSlinky.jasmine.jasmine.AsymmetricMatcher[js.Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jasmine.jasmine.ExpectedRecursive<T[K]> * / object | jasmine.jasmine.Any}
    */ typingsSlinky.jasmine.jasmineStrings.ExpectedRecursive with org.scalablytyped.runtime.TopLevel[js.Any])
  
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  
  type ImplementationCallback = (js.Function0[js.Thenable[js.Any] | scala.Unit]) | (js.Function1[/* done */ typingsSlinky.jasmine.DoneFn, scala.Unit])
  
  type MatchableArgs[Fn] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: any[K] | jasmine.jasmine.AsymmetricMatcher<any>}
    */ typingsSlinky.jasmine.jasmineStrings.MatchableArgs with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /**
    * It's like SpyObj, but doesn't verify argument/return types for functions.
    * Useful if TS cannot correctly infer type for complex objects.
    */
  type NonTypedSpyObj[T] = typingsSlinky.jasmine.jasmine.SpyObj[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends jasmine.jasmine.Func? jasmine.jasmine.Func : T[K]}
    */ typingsSlinky.jasmine.jasmineStrings.NonTypedSpyObj with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
  
  type PassedExpectation = typingsSlinky.jasmine.jasmine.CustomReportExpectation
  
  /**
    * Obtains the type that a promise-returning function can be rejected with.
    * This is so we can use .and.rejectWith() only for functions that return a promise.
    */
  type PromisedRejectType[Fn /* <: js.Function */] = js.Any
  
  /**
    * Obtains the promised type that a promise-returning function resolves to.
    */
  type PromisedReturnType[Fn /* <: typingsSlinky.jasmine.jasmine.Func */] = js.Any
  
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[typingsSlinky.jasmine.jasmine.Spec], scala.Unit]
  
  type SpyObj[T] = T with typingsSlinky.jasmine.jasmineStrings.SpyObj with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type SpyObjMethodNames[T] = (js.Array[/* keyof T */ java.lang.String]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends jasmine.jasmine.Func? std.ReturnType<T[P]> : any}
    */ typingsSlinky.jasmine.jasmineStrings.SpyObjMethodNames with org.scalablytyped.runtime.TopLevel[js.Any]) | org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type SpyObjPropertyNames[T] = (js.Array[/* keyof T */ java.lang.String]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsSlinky.jasmine.jasmineStrings.SpyObjPropertyNames with org.scalablytyped.runtime.TopLevel[T]) | org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type StringPrettyPrinter = typingsSlinky.jasmine.jasmine.PrettyPrinter
}
