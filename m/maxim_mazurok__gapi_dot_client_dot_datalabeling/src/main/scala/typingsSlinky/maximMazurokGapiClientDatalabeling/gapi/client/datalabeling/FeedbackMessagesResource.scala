package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Alt
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Callback
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Key
import typingsSlinky.maximMazurokGapiClientDatalabeling.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedbackMessagesResource extends StObject {
  
  def create(request: Alt, body: GoogleCloudDatalabelingV1beta1FeedbackMessage): Request[GoogleLongrunningOperation] = js.native
  /** Create a FeedbackMessage object. */
  def create(request: Key): Request[GoogleLongrunningOperation] = js.native
  
  /** Delete a FeedbackMessage. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Get a FeedbackMessage object. */
  def get(): Request[GoogleCloudDatalabelingV1beta1FeedbackMessage] = js.native
  def get(request: Callback): Request[GoogleCloudDatalabelingV1beta1FeedbackMessage] = js.native
  
  /** List FeedbackMessages with pagination. */
  def list(): Request[GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse] = js.native
  def list(request: Oauthtoken): Request[GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse] = js.native
}
