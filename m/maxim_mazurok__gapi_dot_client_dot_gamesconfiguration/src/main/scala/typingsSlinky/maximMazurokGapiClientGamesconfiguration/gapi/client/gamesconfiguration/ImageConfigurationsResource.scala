package typingsSlinky.maximMazurokGapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGamesconfiguration.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageConfigurationsResource extends js.Object {
  
  /** Uploads an image for a resource with the given ID and image type. */
  def upload(): Request[ImageConfiguration] = js.native
  def upload(request: Fields): Request[ImageConfiguration] = js.native
}
