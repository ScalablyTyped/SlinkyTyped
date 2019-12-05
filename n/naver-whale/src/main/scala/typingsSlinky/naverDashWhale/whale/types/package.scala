package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  import typingsSlinky.chrome.chrome.events.Event

  type ChromeSettingChangedEvent = Event[typingsSlinky.chrome.chrome.types.DetailsCallback]
  type DetailsCallback = js.Function1[
    /* details */ typingsSlinky.chrome.chrome.types.ChromeSettingGetResultDetails, 
    Unit
  ]
}
