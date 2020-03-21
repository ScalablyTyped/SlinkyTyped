package typingsSlinky.naverWhale.whale.webNavigation

import typingsSlinky.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationEvent[T /* <: typingsSlinky.chrome.chrome.webNavigation.WebNavigationCallbackDetails */]
  extends Event[js.Function1[/* details */ T, Unit]] {
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filters: typingsSlinky.chrome.chrome.webNavigation.WebNavigationEventFilter
  ): Unit = js.native
}

