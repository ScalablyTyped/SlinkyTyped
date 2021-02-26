package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.InPlan
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.ProjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryItemsResource extends StObject {
  
  /** Gets one inventory item by ID. */
  def get(): Request[InventoryItem] = js.native
  def get(request: ProjectId): Request[InventoryItem] = js.native
  
  /** Retrieves a list of inventory items, possibly filtered. This method supports paging. */
  def list(): Request[InventoryItemsListResponse] = js.native
  def list(request: InPlan): Request[InventoryItemsListResponse] = js.native
}
