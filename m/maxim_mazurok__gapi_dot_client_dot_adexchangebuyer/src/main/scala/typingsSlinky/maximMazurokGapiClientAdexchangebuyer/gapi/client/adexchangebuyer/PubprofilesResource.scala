package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdexchangebuyer.anon.AccountId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubprofilesResource extends StObject {
  
  /** Gets the requested publisher profile(s) by publisher accountId. */
  def list(): Request[GetPublisherProfilesByAccountIdResponse] = js.native
  def list(request: AccountId): Request[GetPublisherProfilesByAccountIdResponse] = js.native
}
