package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tabCapture {
  
  type CaptureStatusChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* info */ typingsSlinky.chrome.chrome.tabCapture.CaptureInfo, scala.Unit]
  ]
}
