package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AssetShareListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetSharesCollection extends js.Object {
  
  // This method either retrieves a list of asset shares the partner owns and that map to a specified asset view ID or it retrieves a list of asset views associated with a specified asset share ID owned by the partner.
  def list(assetId: String): AssetShareListResponse = js.native
  // This method either retrieves a list of asset shares the partner owns and that map to a specified asset view ID or it retrieves a list of asset views associated with a specified asset share ID owned by the partner.
  def list(assetId: String, optionalArgs: js.Object): AssetShareListResponse = js.native
}
