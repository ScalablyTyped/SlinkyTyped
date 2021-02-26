package typingsSlinky.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsense.anon.FieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionsResource extends StObject {
  
  /** List the metadata for the dimensions available to this AdSense account. */
  def list(): Request[Metadata] = js.native
  def list(request: FieldsKey): Request[Metadata] = js.native
}
