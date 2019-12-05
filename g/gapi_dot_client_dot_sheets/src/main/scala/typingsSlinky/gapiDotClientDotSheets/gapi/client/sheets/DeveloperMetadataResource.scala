package typingsSlinky.gapiDotClientDotSheets.gapi.client.sheets

import typingsSlinky.gapiDotClientDotSheets.Anon_Accesstoken
import typingsSlinky.gapiDotClientDotSheets.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataResource extends js.Object {
  /**
    * Returns the developer metadata with the specified ID.
    * The caller must specify the spreadsheet ID and the developer metadata's
    * unique metadataId.
    */
  def get(request: Anon_Accesstoken): typingsSlinky.gapiDotClient.gapi.client.Request[DeveloperMetadata]
  /**
    * Returns all developer metadata matching the specified DataFilter.
    * If the provided DataFilter represents a DeveloperMetadataLookup object,
    * this will return all DeveloperMetadata entries selected by it. If the
    * DataFilter represents a location in a spreadsheet, this will return all
    * developer metadata associated with locations intersecting that region.
    */
  def search(request: Anon_AccesstokenAlt): typingsSlinky.gapiDotClient.gapi.client.Request[SearchDeveloperMetadataResponse]
}

object DeveloperMetadataResource {
  @scala.inline
  def apply(
    get: Anon_Accesstoken => typingsSlinky.gapiDotClient.gapi.client.Request[DeveloperMetadata],
    search: Anon_AccesstokenAlt => typingsSlinky.gapiDotClient.gapi.client.Request[SearchDeveloperMetadataResponse]
  ): DeveloperMetadataResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[DeveloperMetadataResource]
  }
}

