package typingsSlinky.expect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AsymmetricMatcher = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type AsyncExpectationResult = js.Promise[typingsSlinky.expect.typesMod.SyncExpectationResult]
  
  type ExpectationResult = typingsSlinky.expect.typesMod.SyncExpectationResult | typingsSlinky.expect.typesMod.AsyncExpectationResult
  
  type ExpectedAssertionsErrors = js.Array[typingsSlinky.expect.anon.Actual]
  
  type MatchersObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.expect.typesMod.RawMatcherFn]
  
  type PromiseMatcherFn = js.Function1[/* actual */ js.Any, js.Promise[scala.Unit]]
  
  type Tester = js.Function2[/* a */ js.Any, /* b */ js.Any, js.UndefOr[scala.Boolean]]
  
  type ThrowingMatcherFn = js.Function1[/* actual */ js.Any, scala.Unit]
}
