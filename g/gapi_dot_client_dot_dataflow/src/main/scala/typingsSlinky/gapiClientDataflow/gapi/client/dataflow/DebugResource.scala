package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDataflow.anon.Accesstoken
import typingsSlinky.gapiClientDataflow.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugResource extends js.Object {
  
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: Accesstoken): Request[GetDebugConfigResponse] = js.native
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: Alt): Request[GetDebugConfigResponse] = js.native
  
  /** Send encoded debug capture data for component. */
  def sendCapture(request: Accesstoken): Request[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: Alt): Request[js.Object] = js.native
}
