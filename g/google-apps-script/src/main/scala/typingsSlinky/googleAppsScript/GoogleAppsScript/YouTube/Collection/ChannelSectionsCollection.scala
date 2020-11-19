package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSectionListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSectionsCollection extends js.Object {
  
  // Adds a channelSection for the authenticated user's channel.
  def insert(resource: ChannelSection, part: String): ChannelSection = js.native
  // Adds a channelSection for the authenticated user's channel.
  def insert(resource: ChannelSection, part: String, optionalArgs: js.Object): ChannelSection = js.native
  
  // Returns channelSection resources that match the API request criteria.
  def list(part: String): ChannelSectionListResponse = js.native
  // Returns channelSection resources that match the API request criteria.
  def list(part: String, optionalArgs: js.Object): ChannelSectionListResponse = js.native
  
  // Deletes a channelSection.
  def remove(id: String): Unit = js.native
  // Deletes a channelSection.
  def remove(id: String, optionalArgs: js.Object): Unit = js.native
  
  // Update a channelSection.
  def update(resource: ChannelSection, part: String): ChannelSection = js.native
  // Update a channelSection.
  def update(resource: ChannelSection, part: String, optionalArgs: js.Object): ChannelSection = js.native
}
