package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.DirectorySite
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.DirectorySitesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySitesCollection extends js.Object {
  // Gets one directory site by ID.
  def get(profileId: String, id: String): DirectorySite = js.native
  // Inserts a new directory site.
  def insert(resource: DirectorySite, profileId: String): DirectorySite = js.native
  // Retrieves a list of directory sites, possibly filtered. This method supports paging.
  def list(profileId: String): DirectorySitesListResponse = js.native
  // Retrieves a list of directory sites, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): DirectorySitesListResponse = js.native
}

