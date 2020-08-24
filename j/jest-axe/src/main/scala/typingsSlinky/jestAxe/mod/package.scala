package typingsSlinky.jestAxe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IToHaveNoViolations = js.Function1[
    /* results */ js.UndefOr[typingsSlinky.jestAxe.anon.PartialAxeResults], 
    typingsSlinky.jestAxe.mod.AssertionsResult
  ]
  type JestAxe = js.Function2[
    /* html */ org.scalajs.dom.raw.Element | java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.axeCore.mod.RunOptions], 
    js.Promise[typingsSlinky.axeCore.mod.AxeResults]
  ]
}
