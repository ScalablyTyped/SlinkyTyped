package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AssetLabel
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AssetLabelListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetLabelsCollection extends js.Object {
  
  // Insert an asset label for an owner.
  def insert(resource: AssetLabel): AssetLabel = js.native
  // Insert an asset label for an owner.
  def insert(resource: AssetLabel, optionalArgs: js.Object): AssetLabel = js.native
  
  // Retrieves a list of all asset labels for an owner.
  def list(): AssetLabelListResponse = js.native
  // Retrieves a list of all asset labels for an owner.
  def list(optionalArgs: js.Object): AssetLabelListResponse = js.native
}
