package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGames.anon.SnapshotName
import typingsSlinky.maximMazurokGapiClientGames.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotsExtendedResource extends StObject {
  
  /** Resolves any potential conflicts according to the resolution policy specified in the request and returns the snapshot head after the resolution. */
  def resolveSnapshotHead(request: SnapshotName): Request[ResolveSnapshotHeadResponse] = js.native
  def resolveSnapshotHead(request: Uploadprotocol, body: ResolveSnapshotHeadRequest): Request[ResolveSnapshotHeadResponse] = js.native
}
