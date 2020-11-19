package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OrderDocument
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.OrderDocumentsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderDocumentsCollection extends js.Object {
  
  // Gets one order document by ID.
  def get(profileId: String, projectId: String, id: String): OrderDocument = js.native
  
  // Retrieves a list of order documents, possibly filtered. This method supports paging.
  def list(profileId: String, projectId: String): OrderDocumentsListResponse = js.native
  // Retrieves a list of order documents, possibly filtered. This method supports paging.
  def list(profileId: String, projectId: String, optionalArgs: js.Object): OrderDocumentsListResponse = js.native
}
