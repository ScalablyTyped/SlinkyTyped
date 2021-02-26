package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.Alt
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.FieldsIntentView
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.IntentView
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.IntentViewKey
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.KeyLanguageCode
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.LanguageCodeName
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.Name
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.NameOauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentsResource extends StObject {
  
  def batchDelete(request: Alt, body: GoogleCloudDialogflowV2BatchDeleteIntentsRequest): Request[GoogleLongrunningOperation] = js.native
  /** Deletes intents in the specified agent. Operation */
  def batchDelete(request: CallbackFields): Request[GoogleLongrunningOperation] = js.native
  
  def batchUpdate(request: Alt, body: GoogleCloudDialogflowV2BatchUpdateIntentsRequest): Request[GoogleLongrunningOperation] = js.native
  /** Updates/Creates multiple intents in the specified agent. Operation */
  def batchUpdate(request: FieldsKey): Request[GoogleLongrunningOperation] = js.native
  
  def create(request: FieldsIntentView, body: GoogleCloudDialogflowV2Intent): Request[GoogleCloudDialogflowV2Intent] = js.native
  /** Creates an intent in the specified agent. */
  def create(request: IntentView): Request[GoogleCloudDialogflowV2Intent] = js.native
  
  /** Deletes the specified intent and its direct or indirect followup intents. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Retrieves the specified intent. */
  def get(): Request[GoogleCloudDialogflowV2Intent] = js.native
  def get(request: IntentViewKey): Request[GoogleCloudDialogflowV2Intent] = js.native
  
  /** Returns the list of all intents in the specified agent. */
  def list(): Request[GoogleCloudDialogflowV2ListIntentsResponse] = js.native
  def list(request: KeyLanguageCode): Request[GoogleCloudDialogflowV2ListIntentsResponse] = js.native
  
  /** Updates the specified intent. */
  def patch(request: LanguageCodeName): Request[GoogleCloudDialogflowV2Intent] = js.native
  def patch(request: NameOauthtoken, body: GoogleCloudDialogflowV2Intent): Request[GoogleCloudDialogflowV2Intent] = js.native
}
