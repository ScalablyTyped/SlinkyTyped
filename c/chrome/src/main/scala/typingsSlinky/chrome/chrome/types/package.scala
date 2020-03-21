package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  type ChromeSettingChangedEvent = typingsSlinky.chrome.chrome.events.Event[typingsSlinky.chrome.chrome.types.DetailsCallback]
  type DetailsCallback = js.Function1[
    /* details */ typingsSlinky.chrome.chrome.types.ChromeSettingGetResultDetails, 
    scala.Unit
  ]
}
