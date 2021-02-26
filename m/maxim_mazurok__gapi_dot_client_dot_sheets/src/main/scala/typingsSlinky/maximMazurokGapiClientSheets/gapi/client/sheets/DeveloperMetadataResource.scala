package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import typingsSlinky.maximMazurokGapiClientSheets.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientSheets.anon.Alt
import typingsSlinky.maximMazurokGapiClientSheets.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperMetadataResource extends StObject {
  
  /** Returns the developer metadata with the specified ID. The caller must specify the spreadsheet ID and the developer metadata's unique metadataId. */
  def get(): typingsSlinky.gapiClient.gapi.client.Request[DeveloperMetadata] = js.native
  def get(request: Accesstoken): typingsSlinky.gapiClient.gapi.client.Request[DeveloperMetadata] = js.native
  
  /**
    * Returns all developer metadata matching the specified DataFilter. If the provided DataFilter represents a DeveloperMetadataLookup object, this will return all DeveloperMetadata
    * entries selected by it. If the DataFilter represents a location in a spreadsheet, this will return all developer metadata associated with locations intersecting that region.
    */
  def search(request: Alt): typingsSlinky.gapiClient.gapi.client.Request[SearchDeveloperMetadataResponse] = js.native
  def search(request: Callback, body: SearchDeveloperMetadataRequest): typingsSlinky.gapiClient.gapi.client.Request[SearchDeveloperMetadataResponse] = js.native
}
