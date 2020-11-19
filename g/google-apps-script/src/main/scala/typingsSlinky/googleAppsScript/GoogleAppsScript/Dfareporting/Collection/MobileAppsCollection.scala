package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MobileApp
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MobileAppsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileAppsCollection extends js.Object {
  
  // Gets one mobile app by ID.
  def get(profileId: String, id: String): MobileApp = js.native
  
  // Retrieves list of available mobile apps.
  def list(profileId: String): MobileAppsListResponse = js.native
  // Retrieves list of available mobile apps.
  def list(profileId: String, optionalArgs: js.Object): MobileAppsListResponse = js.native
}
