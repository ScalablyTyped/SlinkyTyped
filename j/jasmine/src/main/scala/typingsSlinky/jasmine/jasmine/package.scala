package typingsSlinky.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  type PassedExpectation = typingsSlinky.jasmine.jasmine.CustomReportExpectation
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[typingsSlinky.jasmine.jasmine.Spec], scala.Unit]
  type SpyObj[T] = T with typingsSlinky.jasmine.jasmineStrings.SpyObj with org.scalablytyped.runtime.TopLevel[js.Any]
  type StringPrettyPrinter = typingsSlinky.jasmine.jasmine.PrettyPrinter
}
