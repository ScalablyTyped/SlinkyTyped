package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Project
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ProjectsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsCollection extends js.Object {
  
  // Gets one project by ID.
  def get(profileId: String, id: String): Project = js.native
  
  // Retrieves a list of projects, possibly filtered. This method supports paging.
  def list(profileId: String): ProjectsListResponse = js.native
  // Retrieves a list of projects, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): ProjectsListResponse = js.native
}
