package typingsSlinky.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  type ChromeSettingChangedEvent = typingsSlinky.chromeApps.chrome.events.Event[typingsSlinky.chromeApps.chrome.types.DetailsCallback]
  /**
    * @param details Details of the currently effective value.
    */
  type DetailsCallback = js.Function1[
    /* details */ typingsSlinky.chromeApps.chrome.types.ChromeSettingGetResultDetails, 
    scala.Unit
  ]
}
