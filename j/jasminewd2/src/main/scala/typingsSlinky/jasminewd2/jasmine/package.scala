package typingsSlinky.jasminewd2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.jasmine.jasmine.CustomEqualityTester
  import typingsSlinky.jasmine.jasmine.MatchersUtil

  type AsyncCustomMatcherFactories = StringDictionary[AsyncCustomMatcherFactory]
  type AsyncCustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    AsyncCustomMatcher
  ]
}
