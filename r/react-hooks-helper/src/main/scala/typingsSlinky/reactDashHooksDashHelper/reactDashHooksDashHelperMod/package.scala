package typingsSlinky.reactDashHooksDashHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHooksDashHelperMod {
  import org.scalajs.dom.raw.Event
  import org.scalajs.dom.raw.HTMLInputElement
  import slinky.core.SyntheticEvent
  import typingsSlinky.react.reactMod.ChangeEvent

  type SetForm = js.Function1[
    /* event */ (SyntheticEvent[Event, HTMLInputElement]) | ChangeEvent[HTMLInputElement] | FormTarget, 
    Unit
  ]
}
