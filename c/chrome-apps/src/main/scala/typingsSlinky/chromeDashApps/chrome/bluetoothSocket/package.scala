package typingsSlinky.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bluetoothSocket {
  type OnAcceptErrorEvent = typingsSlinky.chromeDashApps.chrome.events.Event[js.Function1[/* info */ OnAcceptErrorEventData, Unit]]
  type OnAcceptEvent = typingsSlinky.chromeDashApps.chrome.events.Event[js.Function1[/* info */ OnAcceptInfoData, Unit]]
  type OnReceiveErrorEvent = typingsSlinky.chromeDashApps.chrome.events.Event[js.Function1[/* info */ OnReceiveErrorEventData, Unit]]
  type OnReceiveEvent = typingsSlinky.chromeDashApps.chrome.events.Event[js.Function1[/* info */ OnReceiveEventData, Unit]]
}
