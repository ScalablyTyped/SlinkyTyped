package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGames.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsResource extends StObject {
  
  /** Returns engagement and spend statistics in this application for the currently authenticated user. */
  def get(): Request[StatsResponse] = js.native
  def get(request: Oauthtoken): Request[StatsResponse] = js.native
}
