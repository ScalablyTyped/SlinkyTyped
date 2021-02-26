package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformTypesResource extends StObject {
  
  /** Gets one platform type by ID. */
  def get(): Request[PlatformType] = js.native
  def get(request: Alt): Request[PlatformType] = js.native
  
  /** Retrieves a list of platform types. */
  def list(): Request[PlatformTypesListResponse] = js.native
  def list(request: Callback): Request[PlatformTypesListResponse] = js.native
}
