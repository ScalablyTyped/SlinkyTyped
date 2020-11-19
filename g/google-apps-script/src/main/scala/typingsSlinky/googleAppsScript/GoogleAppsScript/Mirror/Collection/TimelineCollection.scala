package typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection.Timeline.AttachmentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.TimelineItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.TimelineListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineCollection extends js.Object {
  
  var Attachments: js.UndefOr[AttachmentsCollection] = js.native
  
  // Gets a single timeline item by ID.
  def get(id: String): TimelineItem = js.native
  
  // Inserts a new item into the timeline.
  def insert(resource: TimelineItem): TimelineItem = js.native
  // Inserts a new item into the timeline.
  def insert(resource: TimelineItem, mediaData: js.Any): TimelineItem = js.native
  
  // Retrieves a list of timeline items for the authenticated user.
  def list(): TimelineListResponse = js.native
  // Retrieves a list of timeline items for the authenticated user.
  def list(optionalArgs: js.Object): TimelineListResponse = js.native
  
  // Updates a timeline item in place. This method supports patch semantics.
  def patch(resource: TimelineItem, id: String): TimelineItem = js.native
  
  // Deletes a timeline item.
  def remove(id: String): Unit = js.native
  
  // Updates a timeline item in place.
  def update(resource: TimelineItem, id: String): TimelineItem = js.native
  // Updates a timeline item in place.
  def update(resource: TimelineItem, id: String, mediaData: js.Any): TimelineItem = js.native
}
