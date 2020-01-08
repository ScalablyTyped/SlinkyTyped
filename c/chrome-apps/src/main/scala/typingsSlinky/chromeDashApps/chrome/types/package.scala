package typingsSlinky.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  import typingsSlinky.chromeDashApps.chrome.events.Event

  type ChromeSettingChangedEvent = Event[DetailsCallback]
  /**
    * @param details Details of the currently effective value.
    */
  type DetailsCallback = js.Function1[/* details */ ChromeSettingGetResultDetails, Unit]
}
