package typingsSlinky.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object bluetoothSocket {
  
  type OnAcceptErrorEvent = typingsSlinky.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typingsSlinky.chromeApps.chrome.bluetoothSocket.OnAcceptErrorEventData, 
      scala.Unit
    ]
  ]
  
  type OnAcceptEvent = typingsSlinky.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typingsSlinky.chromeApps.chrome.bluetoothSocket.OnAcceptInfoData, 
      scala.Unit
    ]
  ]
  
  type OnReceiveErrorEvent = typingsSlinky.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typingsSlinky.chromeApps.chrome.bluetoothSocket.OnReceiveErrorEventData, 
      scala.Unit
    ]
  ]
  
  type OnReceiveEvent = typingsSlinky.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typingsSlinky.chromeApps.chrome.bluetoothSocket.OnReceiveEventData, 
      scala.Unit
    ]
  ]
}
