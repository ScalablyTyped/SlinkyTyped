package typingsSlinky.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object gcm {
  
  type IGCMDataReceive = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type IGCMDataSend = typingsSlinky.std.Record[
    typingsSlinky.std.Exclude[typingsSlinky.chromeApps.chrome.gcm.DisallowedKeys, java.lang.String], 
    js.Any
  ]
}
