package typingsSlinky.jasminewd2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  type AsyncCustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jasminewd2.jasmine.AsyncCustomMatcherFactory]
  type AsyncCustomMatcherFactory = js.Function2[
    /* util */ typingsSlinky.jasmine.jasmine.MatchersUtil_, 
    /* customEqualityTesters */ js.Array[typingsSlinky.jasmine.jasmine.CustomEqualityTester], 
    typingsSlinky.jasminewd2.jasmine.AsyncCustomMatcher
  ]
}
