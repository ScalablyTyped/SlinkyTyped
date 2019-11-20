package typingsSlinky.reactDashDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object testDashUtilsMod {
  import org.scalajs.dom.raw.Element
  import slinky.core.ReactComponentClass

  type EventSimulator = js.Function2[
    /* element */ Element | ReactComponentClass[js.Any], 
    /* eventData */ js.UndefOr[SyntheticEventData], 
    Unit
  ]
}
