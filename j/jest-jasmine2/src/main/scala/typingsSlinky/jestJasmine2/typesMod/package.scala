package typingsSlinky.jestJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AsyncExpectationResult = js.Promise[typingsSlinky.jestJasmine2.typesMod.SyncExpectationResult]
  type ExpectationResult = typingsSlinky.jestJasmine2.typesMod.SyncExpectationResult | typingsSlinky.jestJasmine2.typesMod.AsyncExpectationResult
  type RawMatcherFn = js.Function3[
    /* expected */ js.Any, 
    /* actual */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    typingsSlinky.jestJasmine2.typesMod.ExpectationResult
  ]
}
