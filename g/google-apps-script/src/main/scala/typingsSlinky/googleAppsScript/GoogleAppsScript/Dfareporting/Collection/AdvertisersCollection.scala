package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Advertiser
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AdvertisersListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertisersCollection extends js.Object {
  
  // Gets one advertiser by ID.
  def get(profileId: String, id: String): Advertiser = js.native
  
  // Inserts a new advertiser.
  def insert(resource: Advertiser, profileId: String): Advertiser = js.native
  
  // Retrieves a list of advertisers, possibly filtered. This method supports paging.
  def list(profileId: String): AdvertisersListResponse = js.native
  // Retrieves a list of advertisers, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): AdvertisersListResponse = js.native
  
  // Updates an existing advertiser. This method supports patch semantics.
  def patch(resource: Advertiser, profileId: String, id: String): Advertiser = js.native
  
  // Updates an existing advertiser.
  def update(resource: Advertiser, profileId: String): Advertiser = js.native
}
