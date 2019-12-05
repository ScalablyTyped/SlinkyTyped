package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabCapture {
  import typingsSlinky.chrome.chrome.events.Event

  type CaptureStatusChangedEvent = Event[
    js.Function1[/* info */ typingsSlinky.chrome.chrome.tabCapture.CaptureInfo, Unit]
  ]
}
