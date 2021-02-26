package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.networking.config.CaptivePorttalDetectedEvent
import typingsSlinky.chrome.chrome.networking.config.NetworkInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofconfig extends StObject {
  
  def finishAuthentication(GUID: String, result: String): Unit = js.native
  def finishAuthentication(GUID: String, result: String, callback: js.Function0[Unit]): Unit = js.native
  
  var onCaptivePortalDetected: CaptivePorttalDetectedEvent = js.native
  
  def setNetworkFilter(networks: js.Array[NetworkInfo], callback: js.Function0[Unit]): Unit = js.native
}
