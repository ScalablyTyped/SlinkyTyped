package typingsSlinky.jestDashAxe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestDashAxeMod {
  import org.scalajs.dom.raw.Element
  import typingsSlinky.axeDashCore.axeDashCoreMod.AxeResults
  import typingsSlinky.std.Partial

  type IToHaveNoViolations = js.Function1[/* results */ js.UndefOr[Partial[AxeResults]], AssertionsResult]
  type JestAxe = js.Function2[
    /* html */ Element | String, 
    /* options */ js.UndefOr[AxeOptions], 
    js.Promise[AxeResults]
  ]
}
