package typingsSlinky.jestDashJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typingsSlinky.expect.buildTypesMod.Expect
  import typingsSlinky.jestDashJasmine2.Anon_AddMatchers
  import typingsSlinky.jestDashJasmine2.buildTypesMod._Global_.NodeJS.Global

  type AsyncExpectationResult = js.Promise[SyncExpectationResult]
  type ExpectationResult = SyncExpectationResult | AsyncExpectationResult
  type Jasmine = Anon_AddMatchers with Expect with Global
  type RawMatcherFn = js.Function3[
    /* expected */ js.Any, 
    /* actual */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    ExpectationResult
  ]
}
