package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.InventoryItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.InventoryItemsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryItemsCollection extends js.Object {
  
  // Gets one inventory item by ID.
  def get(profileId: String, projectId: String, id: String): InventoryItem = js.native
  
  // Retrieves a list of inventory items, possibly filtered. This method supports paging.
  def list(profileId: String, projectId: String): InventoryItemsListResponse = js.native
  // Retrieves a list of inventory items, possibly filtered. This method supports paging.
  def list(profileId: String, projectId: String, optionalArgs: js.Object): InventoryItemsListResponse = js.native
}
