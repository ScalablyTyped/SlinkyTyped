package typingsSlinky.jest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean]
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jest.mod.jasmine.CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ typingsSlinky.jest.mod.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typingsSlinky.jest.mod.jasmine.CustomEqualityTester], 
    typingsSlinky.jest.mod.jasmine.CustomMatcher
  ]
}
