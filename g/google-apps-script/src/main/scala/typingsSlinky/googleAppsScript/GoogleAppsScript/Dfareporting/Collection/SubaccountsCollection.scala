package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Subaccount
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.SubaccountsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubaccountsCollection extends js.Object {
  
  // Gets one subaccount by ID.
  def get(profileId: String, id: String): Subaccount = js.native
  
  // Inserts a new subaccount.
  def insert(resource: Subaccount, profileId: String): Subaccount = js.native
  
  // Gets a list of subaccounts, possibly filtered. This method supports paging.
  def list(profileId: String): SubaccountsListResponse = js.native
  // Gets a list of subaccounts, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): SubaccountsListResponse = js.native
  
  // Updates an existing subaccount. This method supports patch semantics.
  def patch(resource: Subaccount, profileId: String, id: String): Subaccount = js.native
  
  // Updates an existing subaccount.
  def update(resource: Subaccount, profileId: String): Subaccount = js.native
}
