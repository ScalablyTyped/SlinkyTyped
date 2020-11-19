package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.TargetingTemplate
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.TargetingTemplatesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingTemplatesCollection extends js.Object {
  
  // Gets one targeting template by ID.
  def get(profileId: String, id: String): TargetingTemplate = js.native
  
  // Inserts a new targeting template.
  def insert(resource: TargetingTemplate, profileId: String): TargetingTemplate = js.native
  
  // Retrieves a list of targeting templates, optionally filtered. This method supports paging.
  def list(profileId: String): TargetingTemplatesListResponse = js.native
  // Retrieves a list of targeting templates, optionally filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): TargetingTemplatesListResponse = js.native
  
  // Updates an existing targeting template. This method supports patch semantics.
  def patch(resource: TargetingTemplate, profileId: String, id: String): TargetingTemplate = js.native
  
  // Updates an existing targeting template.
  def update(resource: TargetingTemplate, profileId: String): TargetingTemplate = js.native
}
