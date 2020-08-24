package typingsSlinky.rcSteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stepsMod {
  type ProgressDotRender = js.Function2[
    /* iconDot */ js.Any, 
    /* info */ typingsSlinky.rcSteps.anon.Index, 
    slinky.core.facade.ReactElement
  ]
  type StepIconRender = js.Function1[/* info */ typingsSlinky.rcSteps.anon.Description, slinky.core.facade.ReactElement]
}
