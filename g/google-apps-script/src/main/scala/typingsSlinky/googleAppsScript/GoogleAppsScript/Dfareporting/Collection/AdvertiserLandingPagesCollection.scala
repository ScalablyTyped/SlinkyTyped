package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AdvertiserLandingPagesListResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.LandingPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserLandingPagesCollection extends js.Object {
  
  // Gets one landing page by ID.
  def get(profileId: String, id: String): LandingPage = js.native
  
  // Inserts a new landing page.
  def insert(resource: LandingPage, profileId: String): LandingPage = js.native
  
  // Retrieves a list of landing pages.
  def list(profileId: String): AdvertiserLandingPagesListResponse = js.native
  // Retrieves a list of landing pages.
  def list(profileId: String, optionalArgs: js.Object): AdvertiserLandingPagesListResponse = js.native
  
  // Updates an existing landing page. This method supports patch semantics.
  def patch(resource: LandingPage, profileId: String, id: String): LandingPage = js.native
  
  // Updates an existing landing page.
  def update(resource: LandingPage, profileId: String): LandingPage = js.native
}
