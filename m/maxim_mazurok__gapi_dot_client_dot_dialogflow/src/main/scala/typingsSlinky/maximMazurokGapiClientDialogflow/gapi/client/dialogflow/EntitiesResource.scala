package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.Alt
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.Callback
import typingsSlinky.maximMazurokGapiClientDialogflow.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitiesResource extends StObject {
  
  /** Creates multiple new entities in the specified entity type. Operation */
  def batchCreate(request: Accesstoken): Request[GoogleLongrunningOperation] = js.native
  def batchCreate(request: Alt, body: GoogleCloudDialogflowV2BatchCreateEntitiesRequest): Request[GoogleLongrunningOperation] = js.native
  
  def batchDelete(request: Alt, body: GoogleCloudDialogflowV2BatchDeleteEntitiesRequest): Request[GoogleLongrunningOperation] = js.native
  /** Deletes entities in the specified entity type. Operation */
  def batchDelete(request: Callback): Request[GoogleLongrunningOperation] = js.native
  
  def batchUpdate(request: Alt, body: GoogleCloudDialogflowV2BatchUpdateEntitiesRequest): Request[GoogleLongrunningOperation] = js.native
  /** Updates or creates multiple entities in the specified entity type. This method does not affect entities in the entity type that aren't explicitly specified in the request. Operation */
  def batchUpdate(request: Fields): Request[GoogleLongrunningOperation] = js.native
}
