package typingsSlinky.gapiDotClientDotDataflow.gapi.client.dataflow

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertoken
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagesResource extends js.Object {
  /** Request the job status. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListJobMessagesResponse] = js.native
  /** Request the job status. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListJobMessagesResponse] = js.native
}

