package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.CallbackFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait I18nLanguagesResource extends StObject {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[I18nLanguageListResponse] = js.native
  def list(request: CallbackFields): Request[I18nLanguageListResponse] = js.native
}
