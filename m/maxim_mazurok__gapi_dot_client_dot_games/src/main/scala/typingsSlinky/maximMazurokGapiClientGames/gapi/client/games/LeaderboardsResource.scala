package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGames.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientGames.anon.LeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaderboardsResource extends js.Object {
  
  /** Retrieves the metadata of the leaderboard with the given ID. */
  def get(): Request[Leaderboard] = js.native
  def get(request: LeaderboardId): Request[Leaderboard] = js.native
  
  /** Lists all the leaderboard metadata for your application. */
  def list(): Request[LeaderboardListResponse] = js.native
  def list(request: Accesstoken): Request[LeaderboardListResponse] = js.native
}
