package typingsSlinky.gapiDotClientDotDataflow.gapi.client.dataflow

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotDataflow.Anon_Accesstoken
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugResource extends js.Object {
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: Anon_Accesstoken): Request[GetDebugConfigResponse] = js.native
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: Anon_AccesstokenAlt): Request[GetDebugConfigResponse] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: Anon_Accesstoken): Request[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: Anon_AccesstokenAlt): Request[js.Object] = js.native
}

