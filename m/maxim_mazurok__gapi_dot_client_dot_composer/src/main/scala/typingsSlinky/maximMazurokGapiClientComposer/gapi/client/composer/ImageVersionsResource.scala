package typingsSlinky.maximMazurokGapiClientComposer.gapi.client.composer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientComposer.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageVersionsResource extends StObject {
  
  /** List ImageVersions for provided location. */
  def list(): Request[ListImageVersionsResponse] = js.native
  def list(request: Fields): Request[ListImageVersionsResponse] = js.native
}
