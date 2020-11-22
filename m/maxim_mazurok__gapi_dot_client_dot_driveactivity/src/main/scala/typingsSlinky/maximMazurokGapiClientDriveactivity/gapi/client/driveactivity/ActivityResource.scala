package typingsSlinky.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDriveactivity.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientDriveactivity.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityResource extends js.Object {
  
  /** Query past activity in Google Drive. */
  def query(request: Accesstoken): Request[QueryDriveActivityResponse] = js.native
  def query(request: Alt, body: QueryDriveActivityRequest): Request[QueryDriveActivityResponse] = js.native
}
