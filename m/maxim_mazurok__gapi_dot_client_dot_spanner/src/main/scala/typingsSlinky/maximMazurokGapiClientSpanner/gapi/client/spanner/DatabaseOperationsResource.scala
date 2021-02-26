package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSpanner.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseOperationsResource extends StObject {
  
  /**
    * Lists database longrunning-operations. A database operation has a name of the form `projects//instances//databases//operations/`. The long-running operation metadata field type
    * `metadata.type_url` describes the type of the metadata. Operations returned include those that have completed/failed/canceled within the last 7 days, and pending operations.
    */
  def list(): Request[ListDatabaseOperationsResponse] = js.native
  def list(request: Callback): Request[ListDatabaseOperationsResponse] = js.native
}
