package typingsSlinky.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAlertcenter.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientAlertcenter.anon.AlertId
import typingsSlinky.maximMazurokGapiClientAlertcenter.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedbackResource extends js.Object {
  
  /**
    * Creates new feedback for an alert. Attempting to create a feedback for a non-existent alert returns `NOT_FOUND` error. Attempting to create a feedback for an alert that is marked
    * for deletion returns `FAILED_PRECONDITION' error.
    */
  def create(request: Accesstoken): Request[AlertFeedback] = js.native
  def create(request: AlertId, body: AlertFeedback): Request[AlertFeedback] = js.native
  
  /** Lists all the feedback for an alert. Attempting to list feedbacks for a non-existent alert returns `NOT_FOUND` error. */
  def list(): Request[ListAlertFeedbackResponse] = js.native
  def list(request: Alt): Request[ListAlertFeedbackResponse] = js.native
}
