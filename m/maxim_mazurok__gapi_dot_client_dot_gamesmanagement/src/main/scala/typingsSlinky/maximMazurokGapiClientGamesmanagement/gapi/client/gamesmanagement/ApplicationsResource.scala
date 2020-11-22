package typingsSlinky.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGamesmanagement.anon.ApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationsResource extends js.Object {
  
  /** Get the list of players hidden from the given application. This method is only available to user accounts for your developer console. */
  def listHidden(): Request[HiddenPlayerList] = js.native
  def listHidden(request: ApplicationId): Request[HiddenPlayerList] = js.native
}
