package typingsSlinky.reactDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object testUtilsMod {
  type EventSimulator = js.Function2[
    /* element */ org.scalajs.dom.raw.Element | slinky.core.ReactComponentClass[js.Any], 
    /* eventData */ js.UndefOr[typingsSlinky.reactDom.testUtilsMod.SyntheticEventData], 
    scala.Unit
  ]
}
