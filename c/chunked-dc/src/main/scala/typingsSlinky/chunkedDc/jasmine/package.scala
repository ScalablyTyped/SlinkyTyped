package typingsSlinky.chunkedDc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jasmine {
  
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean]
  
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typingsSlinky.chunkedDc.jasmine.CustomMatcherFactory]
  
  type CustomMatcherFactory = js.Function2[
    /* util */ typingsSlinky.chunkedDc.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typingsSlinky.chunkedDc.jasmine.CustomEqualityTester], 
    typingsSlinky.chunkedDc.jasmine.CustomMatcher
  ]
  
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[typingsSlinky.chunkedDc.jasmine.Spec], scala.Unit]
  
  type StringPrettyPrinter = typingsSlinky.chunkedDc.jasmine.PrettyPrinter
}
