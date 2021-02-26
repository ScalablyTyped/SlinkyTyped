package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.CallbackCssDomainId
import typingsSlinky.maximMazurokGapiClientContent.anon.CssDomainId
import typingsSlinky.maximMazurokGapiClientContent.anon.CssGroupId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssesResource extends StObject {
  
  /** Retrieves a single CSS domain by ID. */
  def get(): Request[Css] = js.native
  def get(request: CssDomainId): Request[Css] = js.native
  
  /** Lists CSS domains affiliated with a CSS group. */
  def list(): Request[ListCssesResponse] = js.native
  def list(request: CssGroupId): Request[ListCssesResponse] = js.native
  
  /** Updates labels that are assigned to a CSS domain by its CSS group. */
  def updatelabels(request: CallbackCssDomainId): Request[Css] = js.native
  def updatelabels(request: CssDomainId, body: LabelIds): Request[Css] = js.native
}
