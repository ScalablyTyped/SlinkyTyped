package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Callback
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedbackThreadsResource extends StObject {
  
  /** Delete a FeedbackThread. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  var feedbackMessages: FeedbackMessagesResource = js.native
  
  /** Get a FeedbackThread object. */
  def get(): Request[GoogleCloudDatalabelingV1beta1FeedbackThread] = js.native
  def get(request: Callback): Request[GoogleCloudDatalabelingV1beta1FeedbackThread] = js.native
  
  /** List FeedbackThreads with pagination. */
  def list(): Request[GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse] = js.native
  def list(request: Oauthtoken): Request[GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse] = js.native
}
